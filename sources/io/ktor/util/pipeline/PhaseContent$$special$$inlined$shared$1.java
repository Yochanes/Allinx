package io.ktor.util.pipeline;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0000"}, m18302d2 = {"io/ktor/utils/io/concurrent/SharedJvmKt$shared$1", "Lkotlin/properties/ReadWriteProperty;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class PhaseContent$$special$$inlined$shared$1 implements ReadWriteProperty<Object, List<Function3<? super PipelineContext<Object, Object>, Object, ? super Continuation<? super Unit>, ? extends Object>>> {

    /* JADX INFO: renamed from: a */
    public Object f46627a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f46628b;

    public PhaseContent$$special$$inlined$shared$1(List list) {
        this.f46628b = list;
        this.f46627a = list;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object thisRef, KProperty property) {
        Intrinsics.m18599g(thisRef, "thisRef");
        Intrinsics.m18599g(property, "property");
        return this.f46627a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object thisRef, KProperty property, Object obj) {
        Intrinsics.m18599g(thisRef, "thisRef");
        Intrinsics.m18599g(property, "property");
        this.f46627a = obj;
    }
}
