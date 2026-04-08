package io.ktor.client.call;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.utils.p043io.concurrent.SharedJvmKt;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExceptionsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lkotlinx/coroutines/CoroutineScope;", "Companion", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public class HttpClientCall implements CoroutineScope {

    /* JADX INFO: renamed from: a */
    public final ReadOnlyProperty f44907a;

    /* JADX INFO: renamed from: b */
    public HttpRequest f44908b;

    /* JADX INFO: renamed from: c */
    public HttpResponse f44909c;
    private volatile /* synthetic */ int received;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty[] f44903d = {Reflection.f51660a.mo18618h(new PropertyReference1Impl(HttpClientCall.class, "client", "getClient()Lio/ktor/client/HttpClient;", 0))};

    /* JADX INFO: renamed from: i */
    public static final Companion f44906i = new Companion();

    /* JADX INFO: renamed from: g */
    public static final AttributeKey f44905g = new AttributeKey("CustomResponse");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44904f = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, MetricTracker.Action.RECEIVED);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/call/HttpClientCall$Companion;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public HttpClientCall(HttpClient client) {
        Intrinsics.m18599g(client, "client");
        this.received = 0;
        this.f44907a = SharedJvmKt.m17426a(client);
    }

    /* JADX INFO: renamed from: a */
    public boolean getF44923n() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final HttpClient m16847b() {
        return (HttpClient) this.f44907a.getValue(this, f44903d[0]);
    }

    /* JADX INFO: renamed from: c */
    public final HttpRequest m16848c() {
        HttpRequest httpRequest = this.f44908b;
        if (httpRequest != null) {
            return httpRequest;
        }
        Intrinsics.m18606n("request");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final HttpResponse m16849d() {
        HttpResponse httpResponse = this.f44909c;
        if (httpResponse != null) {
            return httpResponse;
        }
        Intrinsics.m18606n("response");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public Object mo16850f(Continuation continuation) {
        HttpResponse httpResponse = this.f44909c;
        if (httpResponse != null) {
            return httpResponse.mo16859c();
        }
        Intrinsics.m18606n("response");
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF46617f() {
        HttpResponse httpResponse = this.f44909c;
        if (httpResponse != null) {
            return httpResponse.getF46617f();
        }
        Intrinsics.m18606n("response");
        throw null;
    }

    /* JADX INFO: renamed from: h0 */
    public final Attributes m16851h0() {
        HttpRequest httpRequest = this.f44908b;
        if (httpRequest != null) {
            return httpRequest.mo16856h0();
        }
        Intrinsics.m18606n("request");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        if (r11 == r2) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #2 {all -> 0x0049, blocks: (B:20:0x0045, B:51:0x00a5, B:53:0x00b0, B:71:0x00fe, B:72:0x0118), top: B:90:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:57:0x00c0, B:59:0x00d8, B:61:0x00ea, B:62:0x00ed, B:63:0x00ee, B:64:0x00f1), top: B:89:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe A[Catch: all -> 0x0049, TRY_ENTER, TryCatch #2 {all -> 0x0049, blocks: (B:20:0x0045, B:51:0x00a5, B:53:0x00b0, B:71:0x00fe, B:72:0x0118), top: B:90:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m16852i(TypeInfo typeInfo, ContinuationImpl continuationImpl) {
        HttpClientCall$receive$1 httpClientCall$receive$1;
        HttpClientCall httpClientCall;
        HttpClientCall httpClientCall2;
        HttpClient httpClientM16847b;
        Object instanceOf;
        KClass type;
        if (continuationImpl instanceof HttpClientCall$receive$1) {
            httpClientCall$receive$1 = (HttpClientCall$receive$1) continuationImpl;
            int i = httpClientCall$receive$1.f44911b;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpClientCall$receive$1.f44911b = i - Integer.MIN_VALUE;
            } else {
                httpClientCall$receive$1 = new HttpClientCall$receive$1(this, continuationImpl);
            }
        }
        Object objMo17157d = httpClientCall$receive$1.f44910a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = httpClientCall$receive$1.f44911b;
        if (i2 != 0) {
            if (i2 == 1) {
                typeInfo = httpClientCall$receive$1.f44914f;
                httpClientCall2 = httpClientCall$receive$1.f44913d;
                try {
                    ResultKt.m18313b(objMo17157d);
                    HttpResponseContainer httpResponseContainer = new HttpResponseContainer(typeInfo, objMo17157d);
                    httpClientM16847b = httpClientCall2.m16847b();
                    if (httpClientM16847b != null) {
                        throw new IllegalStateException(("Failed to receive call(" + httpClientCall2 + ") in different native thread.").toString());
                    }
                    HttpResponsePipeline httpResponsePipeline = httpClientM16847b.f44862f;
                    httpClientCall$receive$1.f44913d = httpClientCall2;
                    httpClientCall$receive$1.f44914f = typeInfo;
                    httpClientCall$receive$1.f44911b = 2;
                    objMo17157d = httpResponsePipeline.m17215a(httpClientCall2, httpResponseContainer, httpClientCall$receive$1);
                    if (objMo17157d != coroutineSingletons) {
                        httpClientCall = httpClientCall2;
                        instanceOf = ((HttpResponseContainer) objMo17157d).f45535b;
                        type = typeInfo.f44937a;
                        Intrinsics.m18599g(instanceOf, "$this$instanceOf");
                        Intrinsics.m18599g(type, "type");
                        if (!JvmClassMappingKt.m18572b(type).isInstance(instanceOf)) {
                        }
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    th = th;
                    httpClientCall = httpClientCall2;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                typeInfo = httpClientCall$receive$1.f44914f;
                httpClientCall = httpClientCall$receive$1.f44913d;
                try {
                    ResultKt.m18313b(objMo17157d);
                    instanceOf = ((HttpResponseContainer) objMo17157d).f45535b;
                    type = typeInfo.f44937a;
                    Intrinsics.m18599g(instanceOf, "$this$instanceOf");
                    Intrinsics.m18599g(type, "type");
                    if (!JvmClassMappingKt.m18572b(type).isInstance(instanceOf)) {
                        HttpResponse httpResponse = httpClientCall.f44909c;
                        if (httpResponse != null) {
                            HttpResponseKt.m16930a(httpResponse);
                            return instanceOf;
                        }
                        Intrinsics.m18606n("response");
                        throw null;
                    }
                    KClass kClassMo18612b = Reflection.f51660a.mo18612b(instanceOf.getClass());
                    KClass kClass = typeInfo.f44937a;
                    HttpResponse httpResponse2 = httpClientCall.f44909c;
                    if (httpResponse2 != null) {
                        throw new NoTransformationFoundException(httpResponse2, kClassMo18612b, kClass);
                    }
                    Intrinsics.m18606n("response");
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            try {
                HttpResponse httpResponse3 = httpClientCall.f44909c;
                if (httpResponse3 == null) {
                    Intrinsics.m18606n("response");
                    throw null;
                }
                CoroutineScopeKt.m20562c(httpResponse3, ExceptionsKt.m20592a("Receive failed", th));
                throw th;
            } catch (Throwable th3) {
                HttpResponse httpResponse4 = httpClientCall.f44909c;
                if (httpResponse4 == null) {
                    Intrinsics.m18606n("response");
                    throw null;
                }
                HttpResponseKt.m16930a(httpResponse4);
                throw th3;
            }
        }
        ResultKt.m18313b(objMo17157d);
        try {
            HttpResponse httpResponse5 = this.f44909c;
            if (httpResponse5 == null) {
                Intrinsics.m18606n("response");
                throw null;
            }
            KClass type2 = typeInfo.f44937a;
            Intrinsics.m18599g(type2, "type");
            if (JvmClassMappingKt.m18572b(type2).isInstance(httpResponse5)) {
                HttpResponse httpResponse6 = this.f44909c;
                if (httpResponse6 != null) {
                    HttpResponseKt.m16930a(httpResponse6);
                    return httpResponse6;
                }
                Intrinsics.m18606n("response");
                throw null;
            }
            if (!getF44923n() && !f44904f.compareAndSet(this, 0, 1)) {
                throw new DoubleReceiveException(this);
            }
            objMo17157d = m16851h0().mo17157d(f44905g);
            if (objMo17157d == null) {
                httpClientCall$receive$1.f44913d = this;
                httpClientCall$receive$1.f44914f = typeInfo;
                httpClientCall$receive$1.f44911b = 1;
                objMo17157d = mo16850f(httpClientCall$receive$1);
            }
            httpClientCall2 = this;
            HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfo, objMo17157d);
            httpClientM16847b = httpClientCall2.m16847b();
            if (httpClientM16847b != null) {
            }
        } catch (Throwable th4) {
            th = th4;
            httpClientCall = this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpClientCall[");
        HttpRequest httpRequest = this.f44908b;
        if (httpRequest == null) {
            Intrinsics.m18606n("request");
            throw null;
        }
        sb.append(httpRequest.mo16854M());
        sb.append(", ");
        HttpResponse httpResponse = this.f44909c;
        if (httpResponse == null) {
            Intrinsics.m18606n("response");
            throw null;
        }
        sb.append(httpResponse.mo16862i());
        sb.append(']');
        return sb.toString();
    }
}
