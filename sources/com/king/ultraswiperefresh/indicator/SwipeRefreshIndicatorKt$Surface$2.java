package com.king.ultraswiperefresh.indicator;

import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.king.ultraswiperefresh.indicator.SwipeRefreshIndicatorKt$Surface$2", m18559f = "SwipeRefreshIndicator.kt", m18560l = {}, m18561m = "invokeSuspend")
final class SwipeRefreshIndicatorKt$Surface$2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwipeRefreshIndicatorKt$Surface$2(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SwipeRefreshIndicatorKt$Surface$2 swipeRefreshIndicatorKt$Surface$2 = (SwipeRefreshIndicatorKt$Surface$2) create((PointerInputScope) obj, (Continuation) obj2);
        Unit unit = Unit.f51459a;
        swipeRefreshIndicatorKt$Surface$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }
}
