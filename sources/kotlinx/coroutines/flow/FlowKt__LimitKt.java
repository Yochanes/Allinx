package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 5, m18304mv = {2, 0, 0}, m18306xi = 48, m18307xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
final /* synthetic */ class FlowKt__LimitKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20769a(FlowCollector flowCollector, Object obj, Object obj2, ContinuationImpl continuationImpl) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (continuationImpl instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuationImpl;
            int i = flowKt__LimitKt$emitAbort$1.f55905c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.f55905c = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
            }
        }
        Object obj3 = flowKt__LimitKt$emitAbort$1.f55904b;
        Object obj4 = CoroutineSingletons.f51584a;
        int i2 = flowKt__LimitKt$emitAbort$1.f55905c;
        if (i2 == 0) {
            ResultKt.m18313b(obj3);
            flowKt__LimitKt$emitAbort$1.f55903a = obj2;
            flowKt__LimitKt$emitAbort$1.f55905c = 1;
            if (flowCollector.emit(obj, flowKt__LimitKt$emitAbort$1) == obj4) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = flowKt__LimitKt$emitAbort$1.f55903a;
            ResultKt.m18313b(obj3);
        }
        throw new AbortFlowException(obj2);
    }
}
