package kotlinx.coroutines.flow;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 5, m18304mv = {2, 0, 0}, m18306xi = 48, m18307xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
final /* synthetic */ class FlowKt__EmittersKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m20768a(ThrowingCollector throwingCollector, Function3 function3, Throwable th, ContinuationImpl continuationImpl) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (continuationImpl instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuationImpl;
            int i = flowKt__EmittersKt$invokeSafely$1.f55821c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.f55821c = i - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuationImpl);
            }
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.f55820b;
        Object obj2 = CoroutineSingletons.f51584a;
        int i2 = flowKt__EmittersKt$invokeSafely$1.f55821c;
        try {
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                flowKt__EmittersKt$invokeSafely$1.f55819a = th;
                flowKt__EmittersKt$invokeSafely$1.f55821c = 1;
                if (function3.invoke(throwingCollector, th, flowKt__EmittersKt$invokeSafely$1) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = flowKt__EmittersKt$invokeSafely$1.f55819a;
                ResultKt.m18313b(obj);
            }
            return Unit.f51459a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                ExceptionsKt.m18297a(th2, th);
            }
            throw th2;
        }
    }
}
