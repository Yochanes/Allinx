package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final class FlowKt__MergeKt$flattenConcat$1$1<T> implements FlowCollector {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20770a(Flow flow, Continuation continuation) {
        FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        if (continuation instanceof FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (FlowKt__MergeKt$flattenConcat$1$1$emit$1) continuation;
            int i = flowKt__MergeKt$flattenConcat$1$1$emit$1.f55945c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.f55945c = i - Integer.MIN_VALUE;
            } else {
                flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, continuation);
            }
        }
        Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.f55943a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.f55945c;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            flowKt__MergeKt$flattenConcat$1$1$emit$1.f55945c = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        m20770a((Flow) obj, continuation);
        return Unit.f51459a;
    }
}
