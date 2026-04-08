package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m18302d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m18559f = "FlowLiveData.kt", m18560l = {105, 106, 108}, m18561m = "invokeSuspend")
final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m18559f = "FlowLiveData.kt", m18560l = {}, m18561m = "invokeSuspend")
    final class C17021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
            ResultKt.m18313b(obj);
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m18559f = "FlowLiveData.kt", m18560l = {}, m18561m = "invokeSuspend")
    final class C17032 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            C17032 c17032 = (C17032) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f51459a;
            c17032.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            ResultKt.m18313b(obj);
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
        throw null;
    }
}
