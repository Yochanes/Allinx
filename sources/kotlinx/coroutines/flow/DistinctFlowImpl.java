package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", "T", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class DistinctFlowImpl<T> implements Flow<T> {

    /* JADX INFO: renamed from: a */
    public final Flow f55679a;

    /* JADX INFO: renamed from: b */
    public final Function2 f55680b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    final class C62602<T> implements FlowCollector {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.ObjectRef f55682b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FlowCollector f55683c;

        public C62602(Ref.ObjectRef objectRef, FlowCollector flowCollector) {
            this.f55682b = objectRef;
            this.f55683c = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
                int i = distinctFlowImpl$collect$2$emit$1.f55686c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.f55686c = i - Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
                }
            }
            Object obj2 = distinctFlowImpl$collect$2$emit$1.f55684a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = distinctFlowImpl$collect$2$emit$1.f55686c;
            Unit unit = Unit.f51459a;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj2);
                return unit;
            }
            ResultKt.m18313b(obj2);
            DistinctFlowImpl distinctFlowImpl = DistinctFlowImpl.this;
            distinctFlowImpl.getClass();
            Ref.ObjectRef objectRef = this.f55682b;
            Object obj3 = objectRef.f51659a;
            if (obj3 == NullSurrogateKt.f56293a || !((Boolean) distinctFlowImpl.f55680b.invoke(obj3, obj)).booleanValue()) {
                objectRef.f51659a = obj;
                distinctFlowImpl$collect$2$emit$1.f55686c = 1;
                if (this.f55683c.emit(obj, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
    }

    public DistinctFlowImpl(Function2 function2, Flow flow) {
        this.f55679a = flow;
        this.f55680b = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f51659a = NullSurrogateKt.f56293a;
        Object objCollect = this.f55679a.collect(new C62602(objectRef, flowCollector), continuation);
        return objCollect == CoroutineSingletons.f51584a ? objCollect : Unit.f51459a;
    }
}
