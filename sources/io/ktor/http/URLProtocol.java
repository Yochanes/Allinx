package io.ktor.http;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/URLProtocol;", "", "Companion", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class URLProtocol {

    /* JADX INFO: renamed from: c */
    public static final URLProtocol f45703c;

    /* JADX INFO: renamed from: d */
    public static final URLProtocol f45704d;

    /* JADX INFO: renamed from: e */
    public static final URLProtocol f45705e;

    /* JADX INFO: renamed from: f */
    public static final LinkedHashMap f45706f;

    /* JADX INFO: renamed from: a */
    public final String f45707a;

    /* JADX INFO: renamed from: b */
    public final int f45708b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/URLProtocol$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        URLProtocol uRLProtocol = new URLProtocol("http", 80);
        f45703c = uRLProtocol;
        URLProtocol uRLProtocol2 = new URLProtocol("https", 443);
        URLProtocol uRLProtocol3 = new URLProtocol("ws", 80);
        f45704d = uRLProtocol3;
        URLProtocol uRLProtocol4 = new URLProtocol("wss", 443);
        f45705e = uRLProtocol4;
        List listM18414O = CollectionsKt.m18414O(uRLProtocol, uRLProtocol2, uRLProtocol3, uRLProtocol4, new URLProtocol("socks", 1080));
        int iM18484g = MapsKt.m18484g(CollectionsKt.m18452r(listM18414O, 10));
        if (iM18484g < 16) {
            iM18484g = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM18484g);
        for (Object obj : listM18414O) {
            linkedHashMap.put(((URLProtocol) obj).f45707a, obj);
        }
        f45706f = linkedHashMap;
    }

    public URLProtocol(String str, int i) {
        this.f45707a = str;
        this.f45708b = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URLProtocol)) {
            return false;
        }
        URLProtocol uRLProtocol = (URLProtocol) obj;
        return this.f45707a.equals(uRLProtocol.f45707a) && this.f45708b == uRLProtocol.f45708b;
    }

    public final int hashCode() {
        return (this.f45707a.hashCode() * 31) + this.f45708b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.f45707a);
        sb.append(", defaultPort=");
        return AbstractC0000a.m11h(this.f45708b, ")", sb);
    }
}
