package io.ktor.client.request;

import io.ktor.http.HeadersImpl;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/request/HttpResponseData;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpResponseData {

    /* JADX INFO: renamed from: a */
    public final GMTDate f45496a;

    /* JADX INFO: renamed from: b */
    public final HttpStatusCode f45497b;

    /* JADX INFO: renamed from: c */
    public final GMTDate f45498c;

    /* JADX INFO: renamed from: d */
    public final HeadersImpl f45499d;

    /* JADX INFO: renamed from: e */
    public final HttpProtocolVersion f45500e;

    /* JADX INFO: renamed from: f */
    public final Object f45501f;

    /* JADX INFO: renamed from: g */
    public final CoroutineContext f45502g;

    public HttpResponseData(HttpStatusCode httpStatusCode, GMTDate requestTime, HeadersImpl headersImpl, HttpProtocolVersion version, Object body, CoroutineContext callContext) {
        Intrinsics.m18599g(requestTime, "requestTime");
        Intrinsics.m18599g(version, "version");
        Intrinsics.m18599g(body, "body");
        Intrinsics.m18599g(callContext, "callContext");
        this.f45497b = httpStatusCode;
        this.f45498c = requestTime;
        this.f45499d = headersImpl;
        this.f45500e = version;
        this.f45501f = body;
        this.f45502g = callContext;
        this.f45496a = DateJvmKt.m17197b();
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.f45497b + ')';
    }
}
