package io.ktor.client.features;

import androidx.compose.animation.AbstractC0455a;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.AttributeKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/features/HttpTimeout;", "", "Feature", "HttpTimeoutCapabilityConfiguration", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpTimeout {

    /* JADX INFO: renamed from: a */
    public final Long f45290a;

    /* JADX INFO: renamed from: b */
    public final Long f45291b;

    /* JADX INFO: renamed from: c */
    public final Long f45292c;

    /* JADX INFO: renamed from: e */
    public static final Feature f45289e = new Feature();

    /* JADX INFO: renamed from: d */
    public static final AttributeKey f45288d = new AttributeKey("TimeoutFeature");

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/ktor/client/features/HttpTimeout$Feature;", "Lio/ktor/client/features/HttpClientFeature;", "Lio/ktor/client/features/HttpTimeout$HttpTimeoutCapabilityConfiguration;", "Lio/ktor/client/features/HttpTimeout;", "Lio/ktor/client/engine/HttpClientEngineCapability;", "", "INFINITE_TIMEOUT_MS", "J", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Feature implements HttpClientFeature<HttpTimeoutCapabilityConfiguration, HttpTimeout>, HttpClientEngineCapability<HttpTimeoutCapabilityConfiguration> {
        @Override // io.ktor.client.features.HttpClientFeature
        /* JADX INFO: renamed from: a */
        public final void mo16882a(Object obj, HttpClient scope) {
            HttpTimeout feature = (HttpTimeout) obj;
            Intrinsics.m18599g(feature, "feature");
            Intrinsics.m18599g(scope, "scope");
            scope.f44861d.m17220g(HttpRequestPipeline.f45490h, new HttpTimeout$Feature$install$1(feature, scope, null));
        }

        @Override // io.ktor.client.features.HttpClientFeature
        /* JADX INFO: renamed from: b */
        public final Object mo16883b(Function1 function1) {
            HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = new HttpTimeoutCapabilityConfiguration();
            function1.invoke(httpTimeoutCapabilityConfiguration);
            return new HttpTimeout(httpTimeoutCapabilityConfiguration.m16898c(), httpTimeoutCapabilityConfiguration.m16897b(), httpTimeoutCapabilityConfiguration.m16899d());
        }

        @Override // io.ktor.client.features.HttpClientFeature
        public final AttributeKey getKey() {
            return HttpTimeout.f45288d;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/features/HttpTimeout$HttpTimeoutCapabilityConfiguration;", "", "Companion", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class HttpTimeoutCapabilityConfiguration {

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ KProperty[] f45302d;

        /* JADX INFO: renamed from: a */
        public final C5894x51f68df4 f45303a;

        /* JADX INFO: renamed from: b */
        public final C5895x51f68df5 f45304b;

        /* JADX INFO: renamed from: c */
        public final C5896x51f68df6 f45305c;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/features/HttpTimeout$HttpTimeoutCapabilityConfiguration$Companion;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final class Companion {
        }

        static {
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(HttpTimeoutCapabilityConfiguration.class, "_requestTimeoutMillis", "get_requestTimeoutMillis()Ljava/lang/Long;", 0);
            ReflectionFactory reflectionFactory = Reflection.f51660a;
            f45302d = new KProperty[]{reflectionFactory.mo18615e(mutablePropertyReference1Impl), AbstractC0455a.m2247v(HttpTimeoutCapabilityConfiguration.class, "_connectTimeoutMillis", "get_connectTimeoutMillis()Ljava/lang/Long;", 0, reflectionFactory), AbstractC0455a.m2247v(HttpTimeoutCapabilityConfiguration.class, "_socketTimeoutMillis", "get_socketTimeoutMillis()Ljava/lang/Long;", 0, reflectionFactory)};
        }

        public HttpTimeoutCapabilityConfiguration() {
            C5894x51f68df4 c5894x51f68df4 = new C5894x51f68df4();
            c5894x51f68df4.f45306a = 0L;
            this.f45303a = c5894x51f68df4;
            C5895x51f68df5 c5895x51f68df5 = new C5895x51f68df5();
            c5895x51f68df5.f45307a = 0L;
            this.f45304b = c5895x51f68df5;
            C5896x51f68df6 c5896x51f68df6 = new C5896x51f68df6();
            c5896x51f68df6.f45308a = 0L;
            this.f45305c = c5896x51f68df6;
            KProperty[] kPropertyArr = f45302d;
            KProperty property = kPropertyArr[0];
            Intrinsics.m18599g(property, "property");
            c5894x51f68df4.f45306a = null;
            KProperty property2 = kPropertyArr[1];
            Intrinsics.m18599g(property2, "property");
            c5895x51f68df5.f45307a = null;
            KProperty property3 = kPropertyArr[2];
            Intrinsics.m18599g(property3, "property");
            c5896x51f68df6.f45308a = null;
        }

        /* JADX INFO: renamed from: a */
        public static void m16896a(Long l) {
            if (l != null && l.longValue() <= 0) {
                throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
            }
        }

        /* JADX INFO: renamed from: b */
        public final Long m16897b() {
            return (Long) this.f45304b.getValue(this, f45302d[1]);
        }

        /* JADX INFO: renamed from: c */
        public final Long m16898c() {
            return (Long) this.f45303a.getValue(this, f45302d[0]);
        }

        /* JADX INFO: renamed from: d */
        public final Long m16899d() {
            return (Long) this.f45305c.getValue(this, f45302d[2]);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            ReflectionFactory reflectionFactory = Reflection.f51660a;
            if (!reflectionFactory.mo18612b(HttpTimeoutCapabilityConfiguration.class).equals(reflectionFactory.mo18612b(obj.getClass()))) {
                return false;
            }
            HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeoutCapabilityConfiguration) obj;
            return Intrinsics.m18594b(m16898c(), httpTimeoutCapabilityConfiguration.m16898c()) && Intrinsics.m18594b(m16897b(), httpTimeoutCapabilityConfiguration.m16897b()) && Intrinsics.m18594b(m16899d(), httpTimeoutCapabilityConfiguration.m16899d());
        }

        public final int hashCode() {
            Long lM16898c = m16898c();
            int iHashCode = (lM16898c != null ? lM16898c.hashCode() : 0) * 31;
            Long lM16897b = m16897b();
            int iHashCode2 = (iHashCode + (lM16897b != null ? lM16897b.hashCode() : 0)) * 31;
            Long lM16899d = m16899d();
            return iHashCode2 + (lM16899d != null ? lM16899d.hashCode() : 0);
        }
    }

    public HttpTimeout(Long l, Long l2, Long l3) {
        this.f45290a = l;
        this.f45291b = l2;
        this.f45292c = l3;
    }
}
