package io.ktor.client.features.cache;

import io.ktor.client.HttpClient;
import io.ktor.client.call.SavedHttpCall;
import io.ktor.client.call.SavedHttpRequest;
import io.ktor.client.call.SavedHttpResponse;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HeadersImpl;
import io.ktor.util.KtorExperimentalAPI;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@KtorExperimentalAPI
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/features/cache/HttpCacheEntry;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpCacheEntry {

    /* JADX INFO: renamed from: a */
    public final HeadersImpl f45335a;

    /* JADX INFO: renamed from: b */
    public final GMTDate f45336b;

    /* JADX INFO: renamed from: c */
    public final Map f45337c;

    /* JADX INFO: renamed from: d */
    public final HttpResponse f45338d;

    /* JADX INFO: renamed from: e */
    public final byte[] f45339e;

    public HttpCacheEntry(GMTDate expires, Map varyKeys, HttpResponse httpResponse, byte[] bArr) {
        Intrinsics.m18599g(expires, "expires");
        Intrinsics.m18599g(varyKeys, "varyKeys");
        this.f45336b = expires;
        this.f45337c = varyKeys;
        this.f45338d = httpResponse;
        this.f45339e = bArr;
        Headers.Companion companion = Headers.f45656a;
        HeadersBuilder headersBuilder = new HeadersBuilder();
        headersBuilder.m17176b(httpResponse.getF44933f());
        this.f45335a = headersBuilder.m16967h();
    }

    /* JADX INFO: renamed from: a */
    public final HttpResponse m16902a() {
        HttpResponse httpResponse = this.f45338d;
        HttpClient httpClientM16847b = httpResponse.mo16858b().m16847b();
        if (httpClientM16847b == null) {
            throw new IllegalStateException("Failed to save response in cache in different thread.");
        }
        SavedHttpCall savedHttpCall = new SavedHttpCall(httpClientM16847b);
        savedHttpCall.f44909c = new SavedHttpResponse(savedHttpCall, this.f45339e, httpResponse);
        savedHttpCall.f44908b = new SavedHttpRequest(savedHttpCall, httpResponse.mo16858b().m16848c());
        return savedHttpCall.m16849d();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HttpCacheEntry)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Intrinsics.m18594b(this.f45337c, ((HttpCacheEntry) obj).f45337c);
    }

    public final int hashCode() {
        return this.f45337c.hashCode();
    }
}
