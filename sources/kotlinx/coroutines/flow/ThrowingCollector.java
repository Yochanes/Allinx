package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/ThrowingCollector;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ThrowingCollector implements FlowCollector<Object> {

    /* JADX INFO: renamed from: a */
    public final Throwable f56196a;

    public ThrowingCollector(Throwable th) {
        this.f56196a = th;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        throw this.f56196a;
    }
}
