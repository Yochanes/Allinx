package com.mvi.base;

import com.google.firebase.messaging.Constants;
import com.mvi.net.response.BaseResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, m18302d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/mvi/net/response/BaseResponse;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, ""}, m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.mvi.base.BaseRepository$requestList$3", m18559f = "BaseRepository.kt", m18560l = {}, m18561m = "invokeSuspend")
final class BaseRepository$requestList$3 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends BaseResponse<Object>>>, Throwable, Continuation<? super Unit>, Object> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BaseRepository$requestList$3 baseRepository$requestList$3 = new BaseRepository$requestList$3(3, (Continuation) obj3);
        Unit unit = Unit.f51459a;
        baseRepository$requestList$3.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }
}
