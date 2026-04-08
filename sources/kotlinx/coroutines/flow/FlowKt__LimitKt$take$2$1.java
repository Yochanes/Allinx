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
final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.IntRef f55911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowCollector f55912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f55913c;

    public FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, FlowCollector flowCollector, Object obj) {
        this.f55911a = intRef;
        this.f55912b = flowCollector;
        this.f55913c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) continuation;
            int i = flowKt__LimitKt$take$2$1$emit$1.f55916c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.f55916c = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
            }
        }
        Object obj2 = flowKt__LimitKt$take$2$1$emit$1.f55914a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__LimitKt$take$2$1$emit$1.f55916c;
        Unit unit = Unit.f51459a;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.m18313b(obj2);
                return unit;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj2);
            return unit;
        }
        ResultKt.m18313b(obj2);
        Ref.IntRef intRef = this.f55911a;
        int i3 = intRef.f51657a + 1;
        intRef.f51657a = i3;
        FlowCollector flowCollector = this.f55912b;
        if (i3 < 1) {
            flowKt__LimitKt$take$2$1$emit$1.f55916c = 1;
            return flowCollector.emit(obj, flowKt__LimitKt$take$2$1$emit$1) == coroutineSingletons ? coroutineSingletons : unit;
        }
        flowKt__LimitKt$take$2$1$emit$1.f55916c = 2;
        FlowKt__LimitKt.m20769a(flowCollector, obj, this.f55913c, flowKt__LimitKt$take$2$1$emit$1);
        return coroutineSingletons;
    }
}
