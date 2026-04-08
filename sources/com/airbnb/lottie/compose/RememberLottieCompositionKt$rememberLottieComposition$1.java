package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", m18559f = "rememberLottieComposition.kt", m18560l = {}, m18561m = "invokeSuspend")
final class RememberLottieCompositionKt$rememberLottieComposition$1 extends SuspendLambda implements Function3<Integer, Throwable, Continuation<? super Boolean>, Object> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        new RememberLottieCompositionKt$rememberLottieComposition$1(3, (Continuation) obj3).invokeSuspend(Unit.f51459a);
        return Boolean.FALSE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        return Boolean.FALSE;
    }
}
