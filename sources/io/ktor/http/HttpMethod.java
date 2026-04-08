package io.ktor.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/HttpMethod;", "", "Companion", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class HttpMethod {

    /* JADX INFO: renamed from: b */
    public static final HttpMethod f45662b;

    /* JADX INFO: renamed from: c */
    public static final HttpMethod f45663c;

    /* JADX INFO: renamed from: d */
    public static final List f45664d;

    /* JADX INFO: renamed from: a */
    public final String f45665a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/HttpMethod$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        HttpMethod httpMethod = new HttpMethod("GET");
        f45662b = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod("POST");
        HttpMethod httpMethod3 = new HttpMethod("PUT");
        HttpMethod httpMethod4 = new HttpMethod("PATCH");
        HttpMethod httpMethod5 = new HttpMethod("DELETE");
        HttpMethod httpMethod6 = new HttpMethod("HEAD");
        f45663c = httpMethod6;
        f45664d = CollectionsKt.m18414O(httpMethod, httpMethod2, httpMethod3, httpMethod4, httpMethod5, httpMethod6, new HttpMethod("OPTIONS"));
    }

    public HttpMethod(String value) {
        Intrinsics.m18599g(value, "value");
        this.f45665a = value;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HttpMethod) && Intrinsics.m18594b(this.f45665a, ((HttpMethod) obj).f45665a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f45665a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC0000a.m19p(new StringBuilder("HttpMethod(value="), this.f45665a, ")");
    }
}
