package io.ktor.client;

import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0000"}, m18302d2 = {"io/ktor/utils/io/concurrent/SharedJvmKt$shared$1", "Lkotlin/properties/ReadWriteProperty;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpClientConfig$$special$$inlined$shared$1 implements ReadWriteProperty<Object, Function1<HttpClientEngineConfig, ? extends Unit>> {

    /* JADX INFO: renamed from: a */
    public Object f44887a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44888b;

    public HttpClientConfig$$special$$inlined$shared$1() {
        HttpClientConfig$engineConfig$2 httpClientConfig$engineConfig$2 = HttpClientConfig$engineConfig$2.f44893a;
        this.f44888b = httpClientConfig$engineConfig$2;
        this.f44887a = httpClientConfig$engineConfig$2;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object thisRef, KProperty property) {
        Intrinsics.m18599g(thisRef, "thisRef");
        Intrinsics.m18599g(property, "property");
        return this.f44887a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj, KProperty property, Object obj2) {
        Intrinsics.m18599g(property, "property");
        this.f44887a = obj2;
    }
}
