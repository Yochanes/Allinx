package io.ktor.client.features;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.AttributeKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/features/UserAgent;", "", "Config", "Feature", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class UserAgent {

    /* JADX INFO: renamed from: b */
    public static final AttributeKey f45313b = new AttributeKey("UserAgent");

    /* JADX INFO: renamed from: a */
    public final String f45314a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/features/UserAgent$Config;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Config {

        /* JADX INFO: renamed from: a */
        public String f45315a;
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/features/UserAgent$Feature;", "Lio/ktor/client/features/HttpClientFeature;", "Lio/ktor/client/features/UserAgent$Config;", "Lio/ktor/client/features/UserAgent;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Feature implements HttpClientFeature<Config, UserAgent> {
        @Override // io.ktor.client.features.HttpClientFeature
        /* JADX INFO: renamed from: a */
        public final void mo16882a(Object obj, HttpClient scope) {
            UserAgent feature = (UserAgent) obj;
            Intrinsics.m18599g(feature, "feature");
            Intrinsics.m18599g(scope, "scope");
            scope.f44861d.m17220g(HttpRequestPipeline.f45491i, new UserAgent$Feature$install$1(feature, null));
        }

        @Override // io.ktor.client.features.HttpClientFeature
        /* JADX INFO: renamed from: b */
        public final Object mo16883b(Function1 function1) {
            Config config = new Config();
            config.f45315a = "Ktor http-client";
            function1.invoke(config);
            return new UserAgent(config.f45315a);
        }

        @Override // io.ktor.client.features.HttpClientFeature
        public final AttributeKey getKey() {
            return UserAgent.f45313b;
        }
    }

    public UserAgent(String agent) {
        Intrinsics.m18599g(agent, "agent");
        this.f45314a = agent;
    }
}
