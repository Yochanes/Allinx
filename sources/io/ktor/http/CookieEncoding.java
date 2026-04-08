package io.ktor.http;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/CookieEncoding;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CookieEncoding {

    /* JADX INFO: renamed from: a */
    public static final CookieEncoding f45615a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ CookieEncoding[] f45616b;

    static {
        CookieEncoding cookieEncoding = new CookieEncoding("RAW", 0);
        f45615a = cookieEncoding;
        f45616b = new CookieEncoding[]{cookieEncoding, new CookieEncoding("DQUOTES", 1), new CookieEncoding("URI_ENCODING", 2), new CookieEncoding("BASE64_ENCODING", 3)};
    }

    public static CookieEncoding valueOf(String str) {
        return (CookieEncoding) Enum.valueOf(CookieEncoding.class, str);
    }

    public static CookieEncoding[] values() {
        return (CookieEncoding[]) f45616b.clone();
    }
}
