package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 176)
public final class FlowKt__LimitKt$collectWhile$collector$1 implements FlowCollector<Object> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) continuation;
            int i = flowKt__LimitKt$collectWhile$collector$1$emit$1.f55884d;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.f55884d = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
            }
        }
        Object obj2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f55882b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f55884d;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            flowKt__LimitKt$collectWhile$collector$1$emit$1.f55881a = this;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.f55884d = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f55881a;
        ResultKt.m18313b(obj2);
        if (((Boolean) obj2).booleanValue()) {
            return Unit.f51459a;
        }
        throw new AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
    }
}
