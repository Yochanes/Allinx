package io.ktor.http;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class CookieUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m16954a(char c2) {
        if (c2 == '\t') {
            return true;
        }
        if (' ' <= c2 && '/' >= c2) {
            return true;
        }
        if (';' <= c2 && '@' >= c2) {
            return true;
        }
        if ('[' > c2 || '`' < c2) {
            return '{' <= c2 && '~' >= c2;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m16955b(char c2) {
        return '0' <= c2 && '9' >= c2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m16956c(char c2) {
        if (c2 >= 0 && '\b' >= c2) {
            return true;
        }
        if ('\n' <= c2 && 31 >= c2) {
            return true;
        }
        if (('0' <= c2 && '9' >= c2) || c2 == ':') {
            return true;
        }
        if ('a' <= c2 && 'z' >= c2) {
            return true;
        }
        if ('A' > c2 || 'Z' < c2) {
            return 127 <= c2 && 255 >= c2;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m16957d(char c2) {
        if (c2 < 0 || '/' < c2) {
            return 'J' <= c2 && 255 >= c2;
        }
        return true;
    }
}
