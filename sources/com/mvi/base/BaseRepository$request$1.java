package com.mvi.base;

import com.mvi.net.response.BaseResponse;
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
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m18302d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/mvi/net/response/BaseResponse;"}, m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.mvi.base.BaseRepository$request$1", m18559f = "BaseRepository.kt", m18560l = {15, 15}, m18561m = "invokeSuspend")
final class BaseRepository$request$1 extends SuspendLambda implements Function2<FlowCollector<? super BaseResponse<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f43361a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f43362b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseRepository$request$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f43361a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f43362b = (FlowCollector) this.f43362b;
            this.f43361a = 1;
            throw null;
        }
        if (i == 1) {
            FlowCollector flowCollector = (FlowCollector) this.f43362b;
            ResultKt.m18313b(obj);
            this.f43362b = null;
            this.f43361a = 2;
            if (flowCollector.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        return Unit.f51459a;
    }
}
