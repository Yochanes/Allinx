package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements FlowCollector {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 flowKt__EmittersKt$unsafeTransform$1$1$emit$1;
        if (continuation instanceof FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) {
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = (FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) continuation;
            int i = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f55852c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f55852c = i - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, continuation);
            }
        }
        Object obj2 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f55850a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f55852c;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f55852c = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj2);
        return Unit.f51459a;
    }
}
