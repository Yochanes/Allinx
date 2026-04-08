package io.ktor.client;

import androidx.compose.animation.AbstractC0455a;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.features.HttpClientFeature;
import io.ktor.util.PlatformUtils;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@HttpClientDsl
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpClientConfig<T extends HttpClientEngineConfig> {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty[] f44878i;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f44879a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f44880b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f44881c;

    /* JADX INFO: renamed from: d */
    public final HttpClientConfig$$special$$inlined$shared$1 f44882d;

    /* JADX INFO: renamed from: e */
    public final HttpClientConfig$$special$$inlined$shared$2 f44883e;

    /* JADX INFO: renamed from: f */
    public final HttpClientConfig$$special$$inlined$shared$3 f44884f;

    /* JADX INFO: renamed from: g */
    public final HttpClientConfig$$special$$inlined$shared$4 f44885g;

    /* JADX INFO: renamed from: h */
    public final HttpClientConfig$$special$$inlined$shared$5 f44886h;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(HttpClientConfig.class, "engineConfig", "getEngineConfig$ktor_client_core()Lkotlin/jvm/functions/Function1;", 0);
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        f44878i = new KProperty[]{reflectionFactory.mo18615e(mutablePropertyReference1Impl), AbstractC0455a.m2247v(HttpClientConfig.class, "followRedirects", "getFollowRedirects()Z", 0, reflectionFactory), AbstractC0455a.m2247v(HttpClientConfig.class, "useDefaultTransformers", "getUseDefaultTransformers()Z", 0, reflectionFactory), AbstractC0455a.m2247v(HttpClientConfig.class, "expectSuccess", "getExpectSuccess()Z", 0, reflectionFactory), AbstractC0455a.m2247v(HttpClientConfig.class, "developmentMode", "getDevelopmentMode()Z", 0, reflectionFactory)};
    }

    public HttpClientConfig() {
        boolean z2 = PlatformUtils.f46487a;
        this.f44879a = new LinkedHashMap();
        this.f44880b = new LinkedHashMap();
        this.f44881c = new LinkedHashMap();
        this.f44882d = new HttpClientConfig$$special$$inlined$shared$1();
        Boolean bool = Boolean.TRUE;
        HttpClientConfig$$special$$inlined$shared$2 httpClientConfig$$special$$inlined$shared$2 = new HttpClientConfig$$special$$inlined$shared$2();
        httpClientConfig$$special$$inlined$shared$2.f44889a = bool;
        this.f44883e = httpClientConfig$$special$$inlined$shared$2;
        HttpClientConfig$$special$$inlined$shared$3 httpClientConfig$$special$$inlined$shared$3 = new HttpClientConfig$$special$$inlined$shared$3();
        httpClientConfig$$special$$inlined$shared$3.f44890a = bool;
        this.f44884f = httpClientConfig$$special$$inlined$shared$3;
        HttpClientConfig$$special$$inlined$shared$4 httpClientConfig$$special$$inlined$shared$4 = new HttpClientConfig$$special$$inlined$shared$4();
        httpClientConfig$$special$$inlined$shared$4.f44891a = bool;
        this.f44885g = httpClientConfig$$special$$inlined$shared$4;
        Boolean boolValueOf = Boolean.valueOf(PlatformUtils.f46487a);
        HttpClientConfig$$special$$inlined$shared$5 httpClientConfig$$special$$inlined$shared$5 = new HttpClientConfig$$special$$inlined$shared$5();
        httpClientConfig$$special$$inlined$shared$5.f44892a = boolValueOf;
        this.f44886h = httpClientConfig$$special$$inlined$shared$5;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m16842c(HttpClientConfig httpClientConfig, HttpClientFeature httpClientFeature) {
        httpClientConfig.m16844b(httpClientFeature, HttpClientConfig$install$1.f44894a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16843a() {
        return ((Boolean) this.f44886h.getValue(this, f44878i[4])).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m16844b(HttpClientFeature feature, Function1 function1) {
        Intrinsics.m18599g(feature, "feature");
        LinkedHashMap linkedHashMap = this.f44880b;
        linkedHashMap.put(feature.getKey(), new HttpClientConfig$install$2((Function1) linkedHashMap.get(feature.getKey()), function1));
        LinkedHashMap linkedHashMap2 = this.f44879a;
        if (linkedHashMap2.containsKey(feature.getKey())) {
            return;
        }
        linkedHashMap2.put(feature.getKey(), new HttpClientConfig$install$3(feature));
    }
}
