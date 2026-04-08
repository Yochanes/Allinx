package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 implements FlowCollector<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f56008a;

    public FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1(Ref.ObjectRef objectRef) {
        this.f56008a = objectRef;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Ref.ObjectRef objectRef = this.f56008a;
        Object obj2 = objectRef.f51659a;
        Symbol symbol = NullSurrogateKt.f56293a;
        if (obj2 == symbol) {
            objectRef.f51659a = obj;
            return Unit.f51459a;
        }
        objectRef.f51659a = symbol;
        throw new AbortFlowException(this);
    }
}
