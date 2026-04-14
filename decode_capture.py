#!/usr/bin/env python3
"""Decode intercepted HTTP traffic stored with base64 `raw` fields in JSON.

Features:
- robust parsing of possibly truncated JSON arrays
- base64 decode of request/response `raw`
- HTTP header/body split
- transparent decompression for gzip/deflate/brotli/zstd
- JSON output with readable headers and body text
"""

from __future__ import annotations

import argparse
import base64
import binascii
import json
import re
import zlib
from pathlib import Path
from typing import Any


_WHITESPACE = re.compile(r"\s*")


def parse_possibly_truncated_json_array(text: str) -> tuple[list[dict[str, Any]], bool]:
    """Parse a JSON array that may be missing the final closing bracket.

    Returns (items, is_truncated).
    """
    decoder = json.JSONDecoder()
    i = _WHITESPACE.match(text, 0).end()
    if i >= len(text) or text[i] != "[":
        raise ValueError("Expected JSON array starting with '['")
    i += 1

    items: list[dict[str, Any]] = []
    truncated = False

    while True:
        i = _WHITESPACE.match(text, i).end()
        if i >= len(text):
            truncated = True
            break

        if text[i] == "]":
            i += 1
            break

        try:
            obj, j = decoder.raw_decode(text, i)
        except json.JSONDecodeError:
            truncated = True
            break

        if not isinstance(obj, dict):
            raise ValueError(f"Array element at index {len(items)} is not an object")

        items.append(obj)
        i = _WHITESPACE.match(text, j).end()

        if i >= len(text):
            truncated = True
            break

        if text[i] == ",":
            i += 1
            continue
        if text[i] == "]":
            i += 1
            break

        truncated = True
        break

    return items, truncated


def _decode_base64(value: str) -> bytes:
    cleaned = "".join(value.split())
    missing_padding = (-len(cleaned)) % 4
    if missing_padding:
        cleaned += "=" * missing_padding
    return base64.b64decode(cleaned, validate=False)


def _decompress_if_needed(data: bytes, encoding: str) -> tuple[bytes, str]:
    enc = (encoding or "").strip().lower()
    if not enc or enc == "identity":
        return data, "identity"

    if enc == "gzip":
        return zlib.decompress(data, zlib.MAX_WBITS | 16), "gzip"
    if enc == "deflate":
        try:
            return zlib.decompress(data), "deflate"
        except zlib.error:
            return zlib.decompress(data, -zlib.MAX_WBITS), "deflate(raw)"
    if enc == "br":
        import brotli  # type: ignore

        return brotli.decompress(data), "brotli"
    if enc == "zstd":
        import zstandard as zstd  # type: ignore

        dctx = zstd.ZstdDecompressor()
        return dctx.decompress(data), "zstd"

    return data, f"unsupported:{enc}"


def _parse_headers(header_blob: bytes) -> tuple[str, dict[str, str]]:
    text = header_blob.decode("iso-8859-1", errors="replace")
    lines = text.split("\r\n")
    start_line = lines[0] if lines else ""
    headers: dict[str, str] = {}
    for line in lines[1:]:
        if not line or ":" not in line:
            continue
        key, value = line.split(":", 1)
        headers[key.strip().lower()] = value.strip()
    return start_line, headers


def decode_http_message(raw_b64: str) -> dict[str, Any]:
    out: dict[str, Any] = {
        "base64_valid": True,
        "raw_size": 0,
        "start_line": None,
        "headers": {},
        "content_encoding": None,
        "decompressed_with": None,
        "body_size": 0,
        "body_text": None,
        "body_base64": None,
        "error": None,
    }

    try:
        raw_bytes = _decode_base64(raw_b64)
    except (binascii.Error, ValueError) as exc:
        out["base64_valid"] = False
        out["error"] = f"base64 decode failed: {exc}"
        return out

    out["raw_size"] = len(raw_bytes)

    sep = raw_bytes.find(b"\r\n\r\n")
    if sep == -1:
        out["body_base64"] = base64.b64encode(raw_bytes).decode("ascii")
        try:
            out["body_text"] = raw_bytes.decode("utf-8")
        except UnicodeDecodeError:
            out["body_text"] = raw_bytes.decode("utf-8", errors="replace")
        return out

    header_blob = raw_bytes[:sep]
    body = raw_bytes[sep + 4 :]

    start_line, headers = _parse_headers(header_blob)
    out["start_line"] = start_line
    out["headers"] = headers

    content_encoding = headers.get("content-encoding", "")
    out["content_encoding"] = content_encoding or None

    decoded_body = body
    decompressed_with = "identity"
    if body:
        try:
            decoded_body, decompressed_with = _decompress_if_needed(body, content_encoding)
        except Exception as exc:  # keep payload even if decompression fails
            out["error"] = f"decompression failed ({content_encoding}): {exc}"
            decoded_body = body
            decompressed_with = "failed"

    out["decompressed_with"] = decompressed_with
    out["body_size"] = len(decoded_body)

    out["body_base64"] = base64.b64encode(decoded_body).decode("ascii")
    out["body_text"] = decoded_body.decode("utf-8", errors="replace")
    return out


def transform_record(record: dict[str, Any]) -> dict[str, Any]:
    result = {k: v for k, v in record.items() if k != "raw" and k != "response"}

    if "raw" in record:
        result["request_decoded"] = decode_http_message(str(record["raw"]))

    response = record.get("response")
    if isinstance(response, dict):
        response_copy = {k: v for k, v in response.items() if k != "raw"}
        if "raw" in response:
            response_copy["decoded"] = decode_http_message(str(response["raw"]))
        result["response"] = response_copy

    return result


def main() -> None:
    parser = argparse.ArgumentParser(description="Decode base64 HTTP records from capture JSON")
    parser.add_argument("input", type=Path, help="Path to source JSON file")
    parser.add_argument("-o", "--output", type=Path, default=Path("decoded_output.json"), help="Path for decoded JSON")
    args = parser.parse_args()

    raw_text = args.input.read_text(encoding="utf-8", errors="replace")
    records, truncated = parse_possibly_truncated_json_array(raw_text)

    decoded = [transform_record(r) for r in records]
    output_payload = {
        "records_parsed": len(records),
        "source_truncated": truncated,
        "records": decoded,
    }

    args.output.write_text(json.dumps(output_payload, ensure_ascii=False, indent=2), encoding="utf-8")

    print(f"Parsed records: {len(records)}")
    print(f"Input appears truncated: {truncated}")
    print(f"Decoded file written to: {args.output}")


if __name__ == "__main__":
    main()
