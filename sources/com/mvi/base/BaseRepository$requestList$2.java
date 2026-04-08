package com.mvi.base;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.mvi.net.response.BaseResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n"}, m18302d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/mvi/net/response/BaseResponse;", "<unused var>", "", MTPushConstants.Geofence.KEY_COUNT, ""}, m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.mvi.base.BaseRepository$requestList$2", m18559f = "BaseRepository.kt", m18560l = {}, m18561m = "invokeSuspend")
final class BaseRepository$requestList$2 extends SuspendLambda implements Function4<FlowCollector<? super List<? extends BaseResponse<Object>>>, Throwable, Long, Continuation<? super Boolean>, Object> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        throw null;
    }
}
