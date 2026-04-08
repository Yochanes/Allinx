package io.ktor.client.request;

import com.google.firebase.sessions.settings.RemoteSettings;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.HttpClientEngineCapabilityKt;
import io.ktor.client.utils.EmptyContent;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLUtilsKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.StringValuesKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "Companion", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpRequestBuilder implements HttpMessageBuilder {

    /* JADX INFO: renamed from: a */
    public final URLBuilder f45475a = new URLBuilder();

    /* JADX INFO: renamed from: b */
    public HttpMethod f45476b = HttpMethod.f45662b;

    /* JADX INFO: renamed from: c */
    public final HeadersBuilder f45477c = new HeadersBuilder();

    /* JADX INFO: renamed from: d */
    public Object f45478d = EmptyContent.f45569a;

    /* JADX INFO: renamed from: e */
    public JobImpl f45479e = (JobImpl) SupervisorKt.m20644b();

    /* JADX INFO: renamed from: f */
    public final Attributes f45480f = AttributesJvmKt.m17161a();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/request/HttpRequestBuilder$Companion;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    @Override // io.ktor.http.HttpMessageBuilder
    /* JADX INFO: renamed from: a, reason: from getter */
    public final HeadersBuilder getF45477c() {
        return this.f45477c;
    }

    /* JADX INFO: renamed from: b */
    public final void m16923b(HttpClientEngineCapability httpClientEngineCapability, Object obj) {
        ((Map) this.f45480f.mo17158e(HttpClientEngineCapabilityKt.f44957a, HttpRequestBuilder$setCapability$capabilities$1.f45481a)).put(httpClientEngineCapability, obj);
    }

    /* JADX INFO: renamed from: c */
    public final void m16924c(HttpRequestBuilder builder) {
        Intrinsics.m18599g(builder, "builder");
        JobImpl value = builder.f45479e;
        Intrinsics.m18599g(value, "value");
        this.f45479e = value;
        this.f45476b = builder.f45476b;
        this.f45478d = builder.f45478d;
        URLBuilder uRLBuilder = builder.f45475a;
        URLBuilder uRLBuilder2 = this.f45475a;
        URLUtilsKt.m16994c(uRLBuilder2, uRLBuilder);
        String str = StringsKt.m20448x(uRLBuilder2.f45698f) ? RemoteSettings.FORWARD_SLASH_STRING : uRLBuilder2.f45698f;
        Intrinsics.m18599g(str, "<set-?>");
        uRLBuilder2.f45698f = str;
        StringValuesKt.m17180a(this.f45477c, builder.f45477c);
        Attributes attributes = builder.f45480f;
        for (AttributeKey attributeKey : attributes.mo17154a()) {
            Attributes attributes2 = this.f45480f;
            if (attributeKey == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            }
            attributes2.mo17159f(attributeKey, attributes.mo17156c(attributeKey));
        }
    }
}
