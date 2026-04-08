package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m18559f = "Delay.kt", m18560l = {204}, m18561m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f55781a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55782b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Flow f55783c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    final class C62711<T> implements FlowCollector {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ProducerScope f55784a;

        public C62711(ProducerScope producerScope) {
            this.f55784a = producerScope;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
            if (continuation instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) continuation;
                int i = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f55787c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f55787c = i - Integer.MIN_VALUE;
                } else {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, continuation);
                }
            }
            Object obj2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f55785a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f55787c;
            if (i2 == 0) {
                ResultKt.m18313b(obj2);
                if (obj == null) {
                    obj = NullSurrogateKt.f56293a;
                }
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f55787c = 1;
                if (this.f55784a.mo11415w(obj, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.f55783c = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.f55783c, continuation);
        flowKt__DelayKt$debounceInternal$1$values$1.f55782b = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f55781a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            C62711 c62711 = new C62711((ProducerScope) this.f55782b);
            this.f55781a = 1;
            if (this.f55783c.collect(c62711, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        return Unit.f51459a;
    }
}
