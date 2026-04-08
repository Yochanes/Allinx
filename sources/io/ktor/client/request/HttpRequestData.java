package io.ktor.client.request;

import io.ktor.client.engine.HttpClientEngineCapabilityKt;
import io.ktor.client.features.HttpTimeout;
import io.ktor.http.HeadersImpl;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/request/HttpRequestData;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpRequestData {

    /* JADX INFO: renamed from: a */
    public final Set f45482a;

    /* JADX INFO: renamed from: b */
    public final Url f45483b;

    /* JADX INFO: renamed from: c */
    public final HttpMethod f45484c;

    /* JADX INFO: renamed from: d */
    public final HeadersImpl f45485d;

    /* JADX INFO: renamed from: e */
    public final OutgoingContent f45486e;

    /* JADX INFO: renamed from: f */
    public final JobImpl f45487f;

    /* JADX INFO: renamed from: g */
    public final Attributes f45488g;

    public HttpRequestData(Url url, HttpMethod method, HeadersImpl headersImpl, OutgoingContent outgoingContent, JobImpl executionContext, Attributes attributes) {
        Set setKeySet;
        Intrinsics.m18599g(method, "method");
        Intrinsics.m18599g(executionContext, "executionContext");
        Intrinsics.m18599g(attributes, "attributes");
        this.f45483b = url;
        this.f45484c = method;
        this.f45485d = headersImpl;
        this.f45486e = outgoingContent;
        this.f45487f = executionContext;
        this.f45488g = attributes;
        Map map = (Map) attributes.mo17157d(HttpClientEngineCapabilityKt.f44957a);
        this.f45482a = (map == null || (setKeySet = map.keySet()) == null) ? EmptySet.f51498a : setKeySet;
    }

    /* JADX INFO: renamed from: a */
    public final Object m16925a() {
        HttpTimeout.Feature feature = HttpTimeout.f45289e;
        Map map = (Map) this.f45488g.mo17157d(HttpClientEngineCapabilityKt.f44957a);
        if (map != null) {
            return map.get(feature);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f45483b + ", method=" + this.f45484c + ')';
    }
}
