package io.ktor.client.features.observer;

import io.ktor.client.HttpClient;
import io.ktor.client.features.HttpClientFeature;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.util.AttributeKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/features/observer/ResponseObserver;", "", "Config", "Feature", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ResponseObserver {

    /* JADX INFO: renamed from: b */
    public static final AttributeKey f45413b = new AttributeKey("BodyInterceptor");

    /* JADX INFO: renamed from: a */
    public final Function2 f45414a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/features/observer/ResponseObserver$Config;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Config {

        /* JADX INFO: renamed from: a */
        public Function2 f45415a;
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/features/observer/ResponseObserver$Feature;", "Lio/ktor/client/features/HttpClientFeature;", "Lio/ktor/client/features/observer/ResponseObserver$Config;", "Lio/ktor/client/features/observer/ResponseObserver;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Feature implements HttpClientFeature<Config, ResponseObserver> {
        @Override // io.ktor.client.features.HttpClientFeature
        /* JADX INFO: renamed from: a */
        public final void mo16882a(Object obj, HttpClient scope) {
            ResponseObserver feature = (ResponseObserver) obj;
            Intrinsics.m18599g(feature, "feature");
            Intrinsics.m18599g(scope, "scope");
            scope.f44864i.m17220g(HttpReceivePipeline.f45532j, new ResponseObserver$Feature$install$1(scope, feature, null));
        }

        @Override // io.ktor.client.features.HttpClientFeature
        /* JADX INFO: renamed from: b */
        public final Object mo16883b(Function1 function1) {
            Config config = new Config();
            config.f45415a = new ResponseObserver$Config$responseHandler$1(2, null);
            function1.invoke(config);
            return new ResponseObserver(config.f45415a);
        }

        @Override // io.ktor.client.features.HttpClientFeature
        public final AttributeKey getKey() {
            return ResponseObserver.f45413b;
        }
    }

    public ResponseObserver(Function2 responseHandler) {
        Intrinsics.m18599g(responseHandler, "responseHandler");
        this.f45414a = responseHandler;
    }
}
