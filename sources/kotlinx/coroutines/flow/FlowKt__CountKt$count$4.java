package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final class FlowKt__CountKt$count$4<T> implements FlowCollector {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
        if (continuation instanceof FlowKt__CountKt$count$4$emit$1) {
            flowKt__CountKt$count$4$emit$1 = (FlowKt__CountKt$count$4$emit$1) continuation;
            int i = flowKt__CountKt$count$4$emit$1.f55765d;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$4$emit$1.f55765d = i - Integer.MIN_VALUE;
            } else {
                flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, continuation);
            }
        }
        Object obj2 = flowKt__CountKt$count$4$emit$1.f55763b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__CountKt$count$4$emit$1.f55765d;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            flowKt__CountKt$count$4$emit$1.f55762a = this;
            flowKt__CountKt$count$4$emit$1.f55765d = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FlowKt__CountKt$count$4 flowKt__CountKt$count$4 = (FlowKt__CountKt$count$4) flowKt__CountKt$count$4$emit$1.f55762a;
        ResultKt.m18313b(obj2);
        if (!((Boolean) obj2).booleanValue()) {
            return Unit.f51459a;
        }
        flowKt__CountKt$count$4.getClass();
        throw null;
    }
}
