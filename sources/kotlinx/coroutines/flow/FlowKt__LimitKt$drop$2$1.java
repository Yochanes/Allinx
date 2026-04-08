package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final class FlowKt__LimitKt$drop$2$1<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.IntRef f55887a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f55888b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FlowCollector f55889c;

    public FlowKt__LimitKt$drop$2$1(Ref.IntRef intRef, int i, FlowCollector flowCollector) {
        this.f55887a = intRef;
        this.f55888b = i;
        this.f55889c = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) continuation;
            int i = flowKt__LimitKt$drop$2$1$emit$1.f55892c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.f55892c = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
            }
        }
        Object obj2 = flowKt__LimitKt$drop$2$1$emit$1.f55890a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__LimitKt$drop$2$1$emit$1.f55892c;
        Unit unit = Unit.f51459a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj2);
            return unit;
        }
        ResultKt.m18313b(obj2);
        Ref.IntRef intRef = this.f55887a;
        int i3 = intRef.f51657a;
        if (i3 >= this.f55888b) {
            flowKt__LimitKt$drop$2$1$emit$1.f55892c = 1;
            return this.f55889c.emit(obj, flowKt__LimitKt$drop$2$1$emit$1) == coroutineSingletons ? coroutineSingletons : unit;
        }
        intRef.f51657a = i3 + 1;
        return unit;
    }
}
