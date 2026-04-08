package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/CallbackFlowBuilder;", "T", "Lkotlinx/coroutines/flow/ChannelFlowBuilder;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class CallbackFlowBuilder<T> extends ChannelFlowBuilder<T> {

    /* JADX INFO: renamed from: f */
    public final SuspendLambda f55666f;

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackFlowBuilder(Function2 function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(function2, coroutineContext, i, bufferOverflow);
        this.f55666f = (SuspendLambda) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo20734f(ProducerScope producerScope, Continuation continuation) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        if (continuation instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) continuation;
            int i = callbackFlowBuilder$collectTo$1.f55670d;
            if ((i & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.f55670d = i - Integer.MIN_VALUE;
            } else {
                callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = callbackFlowBuilder$collectTo$1.f55668b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = callbackFlowBuilder$collectTo$1.f55670d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            callbackFlowBuilder$collectTo$1.f55667a = producerScope;
            callbackFlowBuilder$collectTo$1.f55670d = 1;
            if (super.mo20734f(producerScope, callbackFlowBuilder$collectTo$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            producerScope = callbackFlowBuilder$collectTo$1.f55667a;
            ResultKt.m18313b(obj);
        }
        if (producerScope.mo11411F()) {
            return Unit.f51459a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    /* JADX INFO: renamed from: i */
    public final ChannelFlow mo20735i(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f55666f, coroutineContext, i, bufferOverflow);
    }
}
