package io.ktor.client.features.websocket;

import io.ktor.client.HttpClient;
import io.ktor.client.features.HttpClientFeature;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.cio.websocket.WebSocketExtensionsConfig;
import io.ktor.util.AttributeKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/features/websocket/WebSockets;", "", "Config", "Feature", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class WebSockets {

    /* JADX INFO: renamed from: a */
    public final long f45451a;

    /* JADX INFO: renamed from: b */
    public final long f45452b;

    /* JADX INFO: renamed from: c */
    public final WebSocketExtensionsConfig f45453c;

    /* JADX INFO: renamed from: e */
    public static final Feature f45450e = new Feature();

    /* JADX INFO: renamed from: d */
    public static final AttributeKey f45449d = new AttributeKey("Websocket");

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/features/websocket/WebSockets$Config;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Config {

        /* JADX INFO: renamed from: a */
        public final WebSocketExtensionsConfig f45454a = new WebSocketExtensionsConfig();

        /* JADX INFO: renamed from: b */
        public final long f45455b = -1;

        /* JADX INFO: renamed from: c */
        public final long f45456c = Integer.MAX_VALUE;
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/features/websocket/WebSockets$Feature;", "Lio/ktor/client/features/HttpClientFeature;", "Lio/ktor/client/features/websocket/WebSockets$Config;", "Lio/ktor/client/features/websocket/WebSockets;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Feature implements HttpClientFeature<Config, WebSockets> {
        @Override // io.ktor.client.features.HttpClientFeature
        /* JADX INFO: renamed from: a */
        public final void mo16882a(Object obj, HttpClient scope) {
            WebSockets feature = (WebSockets) obj;
            Intrinsics.m18599g(feature, "feature");
            Intrinsics.m18599g(scope, "scope");
            boolean zContains = scope.f44867o.getF44970d().contains(WebSocketExtensionsCapability.f45448a);
            scope.f44861d.m17220g(HttpRequestPipeline.f45493k, new WebSockets$Feature$install$1(feature, null, zContains));
            scope.f44862f.m17220g(HttpResponsePipeline.f45538j, new WebSockets$Feature$install$2(feature, null, zContains));
        }

        @Override // io.ktor.client.features.HttpClientFeature
        /* JADX INFO: renamed from: b */
        public final Object mo16883b(Function1 function1) {
            Config config = new Config();
            function1.invoke(config);
            return new WebSockets(config.f45455b, config.f45456c, config.f45454a);
        }

        @Override // io.ktor.client.features.HttpClientFeature
        public final AttributeKey getKey() {
            return WebSockets.f45449d;
        }
    }

    public WebSockets(long j, long j2, WebSocketExtensionsConfig extensionsConfig) {
        Intrinsics.m18599g(extensionsConfig, "extensionsConfig");
        this.f45451a = j;
        this.f45452b = j2;
        this.f45453c = extensionsConfig;
    }
}
