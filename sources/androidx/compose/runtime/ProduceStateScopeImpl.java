package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/ProduceStateScopeImpl;", "T", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/compose/runtime/MutableState;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f16437a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f16438b;

    public ProduceStateScopeImpl(MutableState mutableState, CoroutineContext coroutineContext) {
        this.f16437a = coroutineContext;
        this.f16438b = mutableState;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF16437a() {
        return this.f16437a;
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getF20325a() {
        return this.f16438b.getF20325a();
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(Object obj) {
        this.f16438b.setValue(obj);
    }
}
