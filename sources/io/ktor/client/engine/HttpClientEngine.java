package io.ktor.client.engine;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestData;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8BX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m18302d2 = {"Lio/ktor/client/engine/HttpClientEngine;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/request/HttpRequestData;", "requestData", "", "checkExtensions", "(Lio/ktor/client/request/HttpRequestData;)V", "Lio/ktor/client/request/HttpResponseData;", "executeWithinCallContext", "(Lio/ktor/client/request/HttpRequestData;)Lio/ktor/client/request/HttpResponseData;", "", MetricTracker.Action.CLOSED, "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface HttpClientEngine extends CoroutineScope, Closeable {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object m16870a(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData, ContinuationImpl continuationImpl) {
            HttpClientEngine$executeWithinCallContext$1 httpClientEngine$executeWithinCallContext$1;
            if (continuationImpl instanceof HttpClientEngine$executeWithinCallContext$1) {
                httpClientEngine$executeWithinCallContext$1 = (HttpClientEngine$executeWithinCallContext$1) continuationImpl;
                int i = httpClientEngine$executeWithinCallContext$1.f44941b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    httpClientEngine$executeWithinCallContext$1.f44941b = i - Integer.MIN_VALUE;
                } else {
                    httpClientEngine$executeWithinCallContext$1 = new HttpClientEngine$executeWithinCallContext$1(httpClientEngine, continuationImpl);
                }
            }
            Object objMo2465z = httpClientEngine$executeWithinCallContext$1.f44940a;
            Object obj = CoroutineSingletons.f51584a;
            int i2 = httpClientEngine$executeWithinCallContext$1.f44941b;
            if (i2 == 0) {
                ResultKt.m18313b(objMo2465z);
                JobImpl jobImpl = httpRequestData.f45487f;
                httpClientEngine$executeWithinCallContext$1.f44943d = httpClientEngine;
                httpClientEngine$executeWithinCallContext$1.f44944f = httpRequestData;
                httpClientEngine$executeWithinCallContext$1.f44941b = 1;
                JobImpl jobImpl2 = new JobImpl(jobImpl);
                objMo2465z = httpClientEngine.getF44860c().mo2465z(jobImpl2).mo2465z(HttpClientEngineKt.f44959a);
                Job job = (Job) httpClientEngine$executeWithinCallContext$1.getF56402a().mo2464u(Job.Key.f55324a);
                if (job != null) {
                    jobImpl2.mo17055w0(new UtilsKt$attachToUserJob$2(job.mo17050L(true, true, new UtilsKt$attachToUserJob$cleanupHandler$1(jobImpl2))));
                }
                if (objMo2465z != obj) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(objMo2465z);
                return objMo2465z;
            }
            httpRequestData = httpClientEngine$executeWithinCallContext$1.f44944f;
            httpClientEngine = httpClientEngine$executeWithinCallContext$1.f44943d;
            ResultKt.m18313b(objMo2465z);
            CoroutineContext makeShared = (CoroutineContext) objMo2465z;
            Intrinsics.m18599g(makeShared, "$this$makeShared");
            Deferred deferredM20505a = BuildersKt.m20505a(httpClientEngine, makeShared.mo2465z(new KtorCallContextElement(makeShared)), new HttpClientEngine$executeWithinCallContext$2(httpClientEngine, httpRequestData, null), 2);
            httpClientEngine$executeWithinCallContext$1.f44943d = null;
            httpClientEngine$executeWithinCallContext$1.f44944f = null;
            httpClientEngine$executeWithinCallContext$1.f44941b = 2;
            Object objMo20547V = deferredM20505a.mo20547V(httpClientEngine$executeWithinCallContext$1);
            return objMo20547V == obj ? obj : objMo20547V;
        }
    }

    /* JADX INFO: renamed from: B */
    Object mo16867B(HttpRequestData httpRequestData, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: K */
    Set getF44970d();

    /* JADX INFO: renamed from: Q0 */
    void mo16869Q0(HttpClient httpClient);
}
