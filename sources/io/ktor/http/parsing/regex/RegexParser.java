package io.ktor.http.parsing.regex;

import io.ktor.http.parsing.Parser;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/parsing/regex/RegexParser;", "Lio/ktor/http/parsing/Parser;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class RegexParser implements Parser {

    /* JADX INFO: renamed from: a */
    public final Regex f45950a;

    public RegexParser(Regex regex, LinkedHashMap linkedHashMap) {
        this.f45950a = regex;
    }
}
