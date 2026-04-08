package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/Url;", "", "Companion", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class Url {

    /* JADX INFO: renamed from: a */
    public final URLProtocol f45709a;

    /* JADX INFO: renamed from: b */
    public final String f45710b;

    /* JADX INFO: renamed from: c */
    public final int f45711c;

    /* JADX INFO: renamed from: d */
    public final String f45712d;

    /* JADX INFO: renamed from: e */
    public final ParametersImpl f45713e;

    /* JADX INFO: renamed from: f */
    public final String f45714f;

    /* JADX INFO: renamed from: g */
    public final String f45715g;

    /* JADX INFO: renamed from: h */
    public final String f45716h;

    /* JADX INFO: renamed from: i */
    public final boolean f45717i;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/Url$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public Url(URLProtocol protocol, String host, int i, String encodedPath, ParametersImpl parametersImpl, String fragment, String str, String str2, boolean z2) {
        Intrinsics.m18599g(protocol, "protocol");
        Intrinsics.m18599g(host, "host");
        Intrinsics.m18599g(encodedPath, "encodedPath");
        Intrinsics.m18599g(fragment, "fragment");
        this.f45709a = protocol;
        this.f45710b = host;
        this.f45711c = i;
        this.f45712d = encodedPath;
        this.f45713e = parametersImpl;
        this.f45714f = fragment;
        this.f45715g = str;
        this.f45716h = str2;
        this.f45717i = z2;
        if ((1 > i || 65536 < i) && i != 0) {
            throw new IllegalArgumentException("port must be between 1 and 65536, or 0 if not set");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m16995a() {
        int i = this.f45711c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.f45709a.f45708b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Url)) {
            return false;
        }
        Url url = (Url) obj;
        return Intrinsics.m18594b(this.f45709a, url.f45709a) && Intrinsics.m18594b(this.f45710b, url.f45710b) && this.f45711c == url.f45711c && Intrinsics.m18594b(this.f45712d, url.f45712d) && this.f45713e.equals(url.f45713e) && Intrinsics.m18594b(this.f45714f, url.f45714f) && Intrinsics.m18594b(this.f45715g, url.f45715g) && Intrinsics.m18594b(this.f45716h, url.f45716h) && this.f45717i == url.f45717i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        URLProtocol uRLProtocol = this.f45709a;
        int iHashCode = (uRLProtocol != null ? uRLProtocol.hashCode() : 0) * 31;
        String str = this.f45710b;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f45711c) * 31;
        String str2 = this.f45712d;
        int iHashCode3 = (this.f45713e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        String str3 = this.f45714f;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f45715g;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f45716h;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z2 = this.f45717i;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        return iHashCode6 + r0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        URLProtocol uRLProtocol = this.f45709a;
        sb.append(uRLProtocol.f45707a);
        String str = uRLProtocol.f45707a;
        int iHashCode = str.hashCode();
        String str2 = this.f45710b;
        if (iHashCode != -1081572750) {
            if (iHashCode == 3143036 && str.equals("file")) {
                sb.append((CharSequence) "://");
                sb.append((CharSequence) str2);
                sb.append((CharSequence) this.f45712d);
            } else {
                sb.append("://");
                sb.append(URLBuilderKt.m16987c(this));
                sb.append(URLUtilsKt.m16992a(this));
                String str3 = this.f45714f;
                if (str3.length() > 0) {
                    sb.append('#');
                    sb.append(str3);
                }
            }
        } else if (str.equals("mailto")) {
            String str4 = this.f45715g;
            if (str4 == null) {
                throw new IllegalStateException("User can't be empty.");
            }
            sb.append((CharSequence) ":");
            sb.append((CharSequence) CodecsKt.m16944f(str4, false));
            sb.append('@');
            sb.append((CharSequence) str2);
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
