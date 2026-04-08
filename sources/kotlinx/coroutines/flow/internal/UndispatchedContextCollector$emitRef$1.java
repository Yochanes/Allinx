package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m18302d2 = {"<anonymous>", "", "T", "it"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m18559f = "ChannelFlow.kt", m18560l = {208}, m18561m = "invokeSuspend")
final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f56310a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f56311b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FlowCollector f56312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f56312c = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.f56312c, continuation);
        undispatchedContextCollector$emitRef$1.f56311b = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UndispatchedContextCollector$emitRef$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f56310a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            Object obj2 = this.f56311b;
            this.f56310a = 1;
            if (this.f56312c.emit(obj2, this) == coroutineSingletons) {
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
