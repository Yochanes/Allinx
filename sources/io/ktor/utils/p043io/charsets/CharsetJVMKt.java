package io.ktor.utils.p043io.charsets;

import io.ktor.utils.p043io.bits.Memory;
import io.ktor.utils.p043io.core.BufferSharedState;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\n\u0010\u0003\"\u00020\u00022\u00020\u0002*\n\u0010\u0005\"\u00020\u00042\u00020\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, m18302d2 = {"Ljava/nio/charset/Charset;", "Charset", "Ljava/nio/charset/CharsetDecoder;", "CharsetDecoder", "Ljava/nio/charset/CharsetEncoder;", "CharsetEncoder", "Lkotlin/text/Charsets;", "Charsets", "ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class CharsetJVMKt {

    /* JADX INFO: renamed from: a */
    public static final CharBuffer f47325a;

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer f47326b;

    static {
        CharBuffer charBufferAllocate = CharBuffer.allocate(0);
        Intrinsics.m18596d(charBufferAllocate);
        f47325a = charBufferAllocate;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        Intrinsics.m18596d(byteBufferAllocate);
        f47326b = byteBufferAllocate;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m17413a(CharsetEncoder charsetEncoder, ChunkBuffer chunkBuffer) throws EOFException {
        BufferSharedState bufferSharedState = chunkBuffer.f47348a;
        int i = bufferSharedState.f47353b;
        int i2 = bufferSharedState.f47355d - i;
        ByteBuffer byteBufferM17408c = Memory.m17408c(chunkBuffer.f47350c, i, i2);
        CoderResult result = charsetEncoder.encode(f47325a, byteBufferM17408c, true);
        Intrinsics.m18598f(result, "result");
        if (result.isMalformed() || result.isUnmappable()) {
            m17417e(result);
        }
        boolean zIsUnderflow = result.isUnderflow();
        if (byteBufferM17408c.limit() != i2) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        chunkBuffer.m17459a(byteBufferM17408c.position());
        return zIsUnderflow;
    }

    /* JADX INFO: renamed from: b */
    public static final int m17414b(CharsetEncoder charsetEncoder, CharSequence input, int i, int i2, ChunkBuffer chunkBuffer) throws EOFException {
        Intrinsics.m18599g(input, "input");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i, i2);
        int iRemaining = charBufferWrap.remaining();
        BufferSharedState bufferSharedState = chunkBuffer.f47348a;
        int i3 = bufferSharedState.f47353b;
        int i4 = bufferSharedState.f47355d - i3;
        ByteBuffer byteBufferM17408c = Memory.m17408c(chunkBuffer.f47350c, i3, i4);
        CoderResult result = charsetEncoder.encode(charBufferWrap, byteBufferM17408c, false);
        Intrinsics.m18598f(result, "result");
        if (result.isMalformed() || result.isUnmappable()) {
            m17417e(result);
        }
        if (byteBufferM17408c.limit() != i4) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        chunkBuffer.m17459a(byteBufferM17408c.position());
        return iRemaining - charBufferWrap.remaining();
    }

    /* JADX INFO: renamed from: c */
    public static final byte[] m17415c(CharsetEncoder charsetEncoder, String input, int i) {
        Intrinsics.m18599g(input, "input");
        if (i == input.length()) {
            byte[] bytes = input.getBytes(charsetEncoder.charset());
            Intrinsics.m18598f(bytes, "(input as java.lang.String).getBytes(charset())");
            return bytes;
        }
        String strSubstring = input.substring(0, i);
        Intrinsics.m18598f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        Intrinsics.m18598f(bytes2, "(input.substring(fromInd…ring).getBytes(charset())");
        return bytes2;
    }

    /* JADX INFO: renamed from: d */
    public static final String m17416d(Charset name) {
        Intrinsics.m18599g(name, "$this$name");
        String strName = name.name();
        Intrinsics.m18598f(strName, "name()");
        return strName;
    }

    /* JADX INFO: renamed from: e */
    public static final void m17417e(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new MalformedInputException(message);
        }
    }
}
