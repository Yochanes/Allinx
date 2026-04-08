package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/flow/MutableSharedFlow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SubclassOptInRequired
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    /* JADX INFO: renamed from: e */
    void mo20772e();

    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(Object obj, Continuation continuation);

    /* JADX INFO: renamed from: g */
    boolean mo20773g(Object obj);

    /* JADX INFO: renamed from: h */
    StateFlow m20774h();
}
