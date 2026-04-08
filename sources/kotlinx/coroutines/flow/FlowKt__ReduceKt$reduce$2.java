package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final class FlowKt__ReduceKt$reduce$2<T> implements FlowCollector {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
        if (continuation instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
            flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) continuation;
            int i = flowKt__ReduceKt$reduce$2$emit$1.f56004c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$2$emit$1.f56004c = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
            }
        }
        Object obj2 = flowKt__ReduceKt$reduce$2$emit$1.f56002a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__ReduceKt$reduce$2$emit$1.f56004c;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj2);
        throw null;
    }
}
