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
final class FlowKt__ErrorsKt$catchImpl$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FlowCollector f55863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f55864b;

    public FlowKt__ErrorsKt$catchImpl$2(FlowCollector flowCollector, Ref.ObjectRef objectRef) {
        this.f55863a = flowCollector;
        this.f55864b = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        FlowKt__ErrorsKt$catchImpl$2<T> flowKt__ErrorsKt$catchImpl$2;
        if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
            int i = flowKt__ErrorsKt$catchImpl$2$emit$1.f55868d;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$2$emit$1.f55868d = i - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
            }
        }
        Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.f55866b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.f55868d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ErrorsKt$catchImpl$2 = (FlowKt__ErrorsKt$catchImpl$2) flowKt__ErrorsKt$catchImpl$2$emit$1.f55865a;
            try {
                ResultKt.m18313b(obj2);
                return Unit.f51459a;
            } catch (Throwable th) {
                th = th;
                flowKt__ErrorsKt$catchImpl$2.f55864b.f51659a = th;
                throw th;
            }
        }
        ResultKt.m18313b(obj2);
        try {
            FlowCollector flowCollector = this.f55863a;
            flowKt__ErrorsKt$catchImpl$2$emit$1.f55865a = this;
            flowKt__ErrorsKt$catchImpl$2$emit$1.f55868d = 1;
            if (flowCollector.emit(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return Unit.f51459a;
        } catch (Throwable th2) {
            th = th2;
            flowKt__ErrorsKt$catchImpl$2 = this;
            flowKt__ErrorsKt$catchImpl$2.f55864b.f51659a = th;
            throw th;
        }
    }
}
