package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/internal/NopCollector;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NopCollector implements FlowCollector<Object> {

    /* JADX INFO: renamed from: a */
    public static final NopCollector f56292a = new NopCollector();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        return Unit.f51459a;
    }
}
