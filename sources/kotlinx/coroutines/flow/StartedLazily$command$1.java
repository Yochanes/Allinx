package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.StartedLazily$command$1", m18559f = "SharingStarted.kt", m18560l = {151}, m18561m = "invokeSuspend")
final class StartedLazily$command$1 extends SuspendLambda implements Function2<FlowCollector<? super SharingCommand>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f56157a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f56158b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ StateFlow f56159c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    final class C63231<T> implements FlowCollector {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.BooleanRef f56160a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FlowCollector f56161b;

        public C63231(Ref.BooleanRef booleanRef, FlowCollector flowCollector) {
            this.f56160a = booleanRef;
            this.f56161b = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m20801a(int i, Continuation continuation) {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (continuation instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) continuation;
                int i2 = startedLazily$command$1$1$emit$1.f56164c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.f56164c = i2 - Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
                }
            }
            Object obj = startedLazily$command$1$1$emit$1.f56162a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i3 = startedLazily$command$1$1$emit$1.f56164c;
            Unit unit = Unit.f51459a;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj);
                return unit;
            }
            ResultKt.m18313b(obj);
            if (i > 0) {
                Ref.BooleanRef booleanRef = this.f56160a;
                if (!booleanRef.f51655a) {
                    booleanRef.f51655a = true;
                    SharingCommand sharingCommand = SharingCommand.f56146a;
                    startedLazily$command$1$1$emit$1.f56164c = 1;
                    if (this.f56161b.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return unit;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m20801a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(StateFlow stateFlow, Continuation continuation) {
        super(2, continuation);
        this.f56159c = stateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.f56159c, continuation);
        startedLazily$command$1.f56158b = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((StartedLazily$command$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
        return CoroutineSingletons.f51584a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f56157a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            C63231 c63231 = new C63231(new Ref.BooleanRef(), (FlowCollector) this.f56158b);
            this.f56157a = 1;
            if (this.f56159c.collect(c63231, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
