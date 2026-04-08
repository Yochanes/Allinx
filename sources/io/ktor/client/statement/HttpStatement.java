package io.ktor.client.statement;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.HttpClientEngineCapabilityKt;
import io.ktor.client.features.HttpClientFeature;
import io.ktor.client.features.HttpClientFeatureKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.utils.p043io.ByteReadChannel;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/statement/HttpStatement;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpStatement {

    /* JADX INFO: renamed from: a */
    public final HttpRequestBuilder f45542a;

    /* JADX INFO: renamed from: b */
    public final HttpClient f45543b;

    public HttpStatement(HttpRequestBuilder httpRequestBuilder, HttpClient client) {
        Set setKeySet;
        Intrinsics.m18599g(client, "client");
        this.f45542a = httpRequestBuilder;
        this.f45543b = client;
        Map map = (Map) httpRequestBuilder.f45480f.mo17157d(HttpClientEngineCapabilityKt.f44957a);
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<HttpClientFeature> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof HttpClientFeature) {
                arrayList.add(obj);
            }
        }
        for (HttpClientFeature httpClientFeature : arrayList) {
            if (HttpClientFeatureKt.m16889a(this.f45543b, httpClientFeature) == null) {
                throw new IllegalArgumentException(("Consider installing " + httpClientFeature + " feature because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m16931a(HttpResponse httpResponse, ContinuationImpl continuationImpl) {
        HttpStatement$cleanup$1 httpStatement$cleanup$1;
        if (continuationImpl instanceof HttpStatement$cleanup$1) {
            httpStatement$cleanup$1 = (HttpStatement$cleanup$1) continuationImpl;
            int i = httpStatement$cleanup$1.f45545b;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpStatement$cleanup$1.f45545b = i - Integer.MIN_VALUE;
            } else {
                httpStatement$cleanup$1 = new HttpStatement$cleanup$1(this, continuationImpl);
            }
        }
        Object obj = httpStatement$cleanup$1.f45544a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = httpStatement$cleanup$1.f45545b;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            CoroutineContext.Element elementMo2464u = httpResponse.getF44860c().mo2464u(Job.Key.f55324a);
            Intrinsics.m18596d(elementMo2464u);
            CompletableJob completableJob = (CompletableJob) elementMo2464u;
            completableJob.mo20549a();
            try {
                ByteReadChannel cancel = httpResponse.mo16859c();
                Intrinsics.m18599g(cancel, "$this$cancel");
                cancel.mo17317m(null);
            } catch (Throwable unused) {
            }
            httpStatement$cleanup$1.f45547d = completableJob;
            httpStatement$cleanup$1.f45545b = 1;
            if (completableJob.mo17049H(httpStatement$cleanup$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        return Unit.f51459a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m16932b(ContinuationImpl continuationImpl) {
        return m16933c(new HttpStatement$execute$3(2, null), continuationImpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(1:(2:14|15)(2:16|42))(2:17|18))(5:19|43|20|34|(1:41)(1:37)))(1:24))(3:25|(1:28)|41)|29|45|30|(3:33|34|(0))|41) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m16933c(Function2 function2, ContinuationImpl continuationImpl) throws Throwable {
        HttpStatement$execute$1 httpStatement$execute$1;
        HttpStatement httpStatement;
        HttpResponse httpResponse;
        HttpResponse httpResponse2;
        if (continuationImpl instanceof HttpStatement$execute$1) {
            httpStatement$execute$1 = (HttpStatement$execute$1) continuationImpl;
            int i = httpStatement$execute$1.f45549b;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpStatement$execute$1.f45549b = i - Integer.MIN_VALUE;
            } else {
                httpStatement$execute$1 = new HttpStatement$execute$1(this, continuationImpl);
            }
        }
        Object objM16934d = httpStatement$execute$1.f45548a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = httpStatement$execute$1.f45549b;
        if (i2 == 0) {
            ResultKt.m18313b(objM16934d);
            httpStatement$execute$1.f45551d = this;
            httpStatement$execute$1.f45552f = function2;
            httpStatement$execute$1.f45549b = 1;
            objM16934d = m16934d(httpStatement$execute$1);
            if (objM16934d != coroutineSingletons) {
                httpStatement = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    Object obj = httpStatement$execute$1.f45551d;
                    ResultKt.m18313b(objM16934d);
                    return obj;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th = (Throwable) httpStatement$execute$1.f45551d;
                ResultKt.m18313b(objM16934d);
                throw th;
            }
            httpResponse2 = (HttpResponse) httpStatement$execute$1.f45552f;
            httpStatement = (HttpStatement) httpStatement$execute$1.f45551d;
            try {
                ResultKt.m18313b(objM16934d);
                httpStatement$execute$1.f45551d = objM16934d;
                httpStatement$execute$1.f45552f = null;
                httpStatement$execute$1.f45549b = 3;
            } catch (Throwable th2) {
                httpResponse = httpResponse2;
                th = th2;
                httpStatement$execute$1.f45551d = th;
                httpStatement$execute$1.f45552f = null;
                httpStatement$execute$1.f45549b = 4;
                if (httpStatement.m16931a(httpResponse, httpStatement$execute$1) == coroutineSingletons) {
                    throw th;
                }
            }
            return httpStatement.m16931a(httpResponse2, httpStatement$execute$1) != coroutineSingletons ? coroutineSingletons : objM16934d;
        }
        function2 = (Function2) httpStatement$execute$1.f45552f;
        httpStatement = (HttpStatement) httpStatement$execute$1.f45551d;
        ResultKt.m18313b(objM16934d);
        httpResponse = (HttpResponse) objM16934d;
        httpStatement$execute$1.f45551d = httpStatement;
        httpStatement$execute$1.f45552f = httpResponse;
        httpStatement$execute$1.f45549b = 2;
        Object objInvoke = function2.invoke(httpResponse, httpStatement$execute$1);
        if (objInvoke != coroutineSingletons) {
            objM16934d = objInvoke;
            httpResponse2 = httpResponse;
            httpStatement$execute$1.f45551d = objM16934d;
            httpStatement$execute$1.f45552f = null;
            httpStatement$execute$1.f45549b = 3;
            if (httpStatement.m16931a(httpResponse2, httpStatement$execute$1) != coroutineSingletons) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m16934d(ContinuationImpl continuationImpl) {
        HttpStatement$executeUnsafe$1 httpStatement$executeUnsafe$1;
        if (continuationImpl instanceof HttpStatement$executeUnsafe$1) {
            httpStatement$executeUnsafe$1 = (HttpStatement$executeUnsafe$1) continuationImpl;
            int i = httpStatement$executeUnsafe$1.f45556b;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpStatement$executeUnsafe$1.f45556b = i - Integer.MIN_VALUE;
            } else {
                httpStatement$executeUnsafe$1 = new HttpStatement$executeUnsafe$1(this, continuationImpl);
            }
        }
        Object objM16841a = httpStatement$executeUnsafe$1.f45555a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = httpStatement$executeUnsafe$1.f45556b;
        if (i2 == 0) {
            ResultKt.m18313b(objM16841a);
            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
            httpRequestBuilder.m16924c(this.f45542a);
            httpStatement$executeUnsafe$1.f45556b = 1;
            objM16841a = this.f45543b.m16841a(httpRequestBuilder, httpStatement$executeUnsafe$1);
            if (objM16841a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM16841a);
        }
        return ((HttpClientCall) objM16841a).m16849d();
    }

    public final String toString() {
        return "HttpStatement[" + this.f45542a.f45475a.m16983b() + ']';
    }
}
