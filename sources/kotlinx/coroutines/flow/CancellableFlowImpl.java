package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/CancellableFlowImpl;", "T", "Lkotlinx/coroutines/flow/CancellableFlow;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class CancellableFlowImpl<T> implements CancellableFlow<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    final class C62592<T> implements FlowCollector {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FlowCollector f55671a;

        public C62592(FlowCollector flowCollector) {
            this.f55671a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
            if (continuation instanceof CancellableFlowImpl$collect$2$emit$1) {
                cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) continuation;
                int i = cancellableFlowImpl$collect$2$emit$1.f55674c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cancellableFlowImpl$collect$2$emit$1.f55674c = i - Integer.MIN_VALUE;
                } else {
                    cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, continuation);
                }
            }
            Object obj2 = cancellableFlowImpl$collect$2$emit$1.f55672a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = cancellableFlowImpl$collect$2$emit$1.f55674c;
            if (i2 == 0) {
                ResultKt.m18313b(obj2);
                JobKt.m20601d(cancellableFlowImpl$collect$2$emit$1.getF56402a());
                cancellableFlowImpl$collect$2$emit$1.f55674c = 1;
                if (this.f55671a.emit(obj, cancellableFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj2);
            }
            return Unit.f51459a;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        new C62592(flowCollector);
        throw null;
    }
}
