package io.ktor.client.features;

import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-client-core"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class HttpRedirectKt {

    /* JADX INFO: renamed from: a */
    public static final Set f45256a;

    static {
        HttpMethod httpMethod = HttpMethod.f45662b;
        f45256a = ArraysKt.m18372h0(new HttpMethod[]{HttpMethod.f45662b, HttpMethod.f45663c});
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m16894a(HttpStatusCode httpStatusCode) {
        int i = httpStatusCode.f45681a;
        return i == HttpStatusCode.f45673e.f45681a || i == HttpStatusCode.f45674f.f45681a || i == HttpStatusCode.f45677i.f45681a || i == HttpStatusCode.f45678j.f45681a || i == HttpStatusCode.f45675g.f45681a;
    }
}
