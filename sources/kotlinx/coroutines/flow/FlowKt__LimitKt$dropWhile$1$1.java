package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f55895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowCollector f55896b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SuspendLambda f55897c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef booleanRef, FlowCollector flowCollector, Function2 function2) {
        this.f55895a = booleanRef;
        this.f55896b = flowCollector;
        this.f55897c = (SuspendLambda) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            int i = flowKt__LimitKt$dropWhile$1$1$emit$1.f55902f;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f55902f = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
            }
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.f55900c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.f55902f;
        Unit unit = Unit.f51459a;
        if (i2 == 0) {
            ResultKt.m18313b(objInvoke);
            if (this.f55895a.f51655a) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f55902f = 1;
                if (this.f55896b.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) != coroutineSingletons) {
                    return unit;
                }
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f55898a = this;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f55899b = obj;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f55902f = 2;
                objInvoke = this.f55897c.invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                if (objInvoke != coroutineSingletons) {
                    flowKt__LimitKt$dropWhile$1$1 = this;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.m18313b(objInvoke);
            return unit;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objInvoke);
            return unit;
        }
        obj = flowKt__LimitKt$dropWhile$1$1$emit$1.f55899b;
        flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.f55898a;
        ResultKt.m18313b(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            flowKt__LimitKt$dropWhile$1$1.f55895a.f51655a = true;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f55898a = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f55899b = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f55902f = 3;
            if (flowKt__LimitKt$dropWhile$1$1.f55896b.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
