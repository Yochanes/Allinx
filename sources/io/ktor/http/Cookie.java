package io.ktor.http;

import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/Cookie;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class Cookie {

    /* JADX INFO: renamed from: a */
    public final String f45590a;

    /* JADX INFO: renamed from: b */
    public final String f45591b;

    /* JADX INFO: renamed from: c */
    public final CookieEncoding f45592c;

    /* JADX INFO: renamed from: d */
    public final int f45593d;

    /* JADX INFO: renamed from: e */
    public final GMTDate f45594e;

    /* JADX INFO: renamed from: f */
    public final String f45595f;

    /* JADX INFO: renamed from: g */
    public final String f45596g;

    /* JADX INFO: renamed from: h */
    public final boolean f45597h;

    /* JADX INFO: renamed from: i */
    public final boolean f45598i;

    /* JADX INFO: renamed from: j */
    public final Map f45599j;

    public Cookie(String name, String value, CookieEncoding cookieEncoding, int i, GMTDate gMTDate, String str, String str2, boolean z2, boolean z3, Map map) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(value, "value");
        this.f45590a = name;
        this.f45591b = value;
        this.f45592c = cookieEncoding;
        this.f45593d = i;
        this.f45594e = gMTDate;
        this.f45595f = str;
        this.f45596g = str2;
        this.f45597h = z2;
        this.f45598i = z3;
        this.f45599j = map;
    }

    /* JADX INFO: renamed from: a */
    public static Cookie m16950a(Cookie cookie, String str, String str2, int i) {
        CookieEncoding cookieEncoding = cookie.f45592c;
        if ((i & 32) != 0) {
            str = cookie.f45595f;
        }
        String str3 = str;
        if ((i & 64) != 0) {
            str2 = cookie.f45596g;
        }
        Map map = cookie.f45599j;
        String name = cookie.f45590a;
        Intrinsics.m18599g(name, "name");
        String value = cookie.f45591b;
        Intrinsics.m18599g(value, "value");
        return new Cookie(name, value, cookieEncoding, cookie.f45593d, cookie.f45594e, str3, str2, cookie.f45597h, cookie.f45598i, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return Intrinsics.m18594b(this.f45590a, cookie.f45590a) && Intrinsics.m18594b(this.f45591b, cookie.f45591b) && Intrinsics.m18594b(this.f45592c, cookie.f45592c) && this.f45593d == cookie.f45593d && Intrinsics.m18594b(this.f45594e, cookie.f45594e) && Intrinsics.m18594b(this.f45595f, cookie.f45595f) && Intrinsics.m18594b(this.f45596g, cookie.f45596g) && this.f45597h == cookie.f45597h && this.f45598i == cookie.f45598i && Intrinsics.m18594b(this.f45599j, cookie.f45599j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        String str = this.f45590a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f45591b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        CookieEncoding cookieEncoding = this.f45592c;
        int iHashCode3 = (((iHashCode2 + (cookieEncoding != null ? cookieEncoding.hashCode() : 0)) * 31) + this.f45593d) * 31;
        GMTDate gMTDate = this.f45594e;
        int iHashCode4 = (iHashCode3 + (gMTDate != null ? gMTDate.hashCode() : 0)) * 31;
        String str3 = this.f45595f;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f45596g;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z2 = this.f45597h;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i = (iHashCode6 + r3) * 31;
        boolean z3 = this.f45598i;
        int i2 = (i + (z3 ? 1 : z3)) * 31;
        Map map = this.f45599j;
        return i2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Cookie(name=" + this.f45590a + ", value=" + this.f45591b + ", encoding=" + this.f45592c + ", maxAge=" + this.f45593d + ", expires=" + this.f45594e + ", domain=" + this.f45595f + ", path=" + this.f45596g + ", secure=" + this.f45597h + ", httpOnly=" + this.f45598i + ", extensions=" + this.f45599j + ")";
    }
}
