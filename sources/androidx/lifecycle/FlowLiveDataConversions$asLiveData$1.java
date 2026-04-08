package androidx.lifecycle;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m18302d2 = {"<anonymous>", "", "T", "Landroidx/lifecycle/LiveDataScope;"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m18559f = "FlowLiveData.kt", m18560l = {78}, m18561m = "invokeSuspend")
final class FlowLiveDataConversions$asLiveData$1 extends SuspendLambda implements Function2<LiveDataScope<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f24875a;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    final class C17041<T> implements FlowCollector {
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f24875a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f24875a = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }
}
