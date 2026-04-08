package androidx.paging;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/ConflatedEventBus;", "", "T", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ConflatedEventBus<T> {

    /* JADX INFO: renamed from: a */
    public final MutableStateFlow f30602a;

    /* JADX INFO: renamed from: b */
    public final ConflatedEventBus$special$$inlined$mapNotNull$1 f30603b;

    public ConflatedEventBus() {
        MutableStateFlow mutableStateFlowM20803a = StateFlowKt.m20803a(new Pair(Integer.MIN_VALUE, null));
        this.f30602a = mutableStateFlowM20803a;
        this.f30603b = new ConflatedEventBus$special$$inlined$mapNotNull$1(mutableStateFlowM20803a);
    }

    /* JADX INFO: renamed from: a */
    public final void m11326a(Object obj) {
        MutableStateFlow mutableStateFlow = this.f30602a;
        mutableStateFlow.setValue(new Pair(Integer.valueOf(((Number) ((Pair) mutableStateFlow.getValue()).f51426a).intValue() + 1), obj));
    }
}
