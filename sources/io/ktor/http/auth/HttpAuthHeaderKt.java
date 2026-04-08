package io.ktor.http.auth;

import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class HttpAuthHeaderKt {
    static {
        Regex regex = new Regex("[a-zA-Z0-9\\-._~+/]+=*");
        new Regex("\\S+");
        new Regex("\\s*,?\\s*(" + regex + ")\\s*=\\s*((\"((\\\\.)|[^\\\\\"])*\")|[^\\s,]*)\\s*,?\\s*");
        new Regex("\\\\.");
    }
}
