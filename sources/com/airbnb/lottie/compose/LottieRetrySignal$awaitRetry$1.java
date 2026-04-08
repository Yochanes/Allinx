package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.airbnb.lottie.compose.LottieRetrySignal", m18559f = "LottieRetrySignal.kt", m18560l = {45}, m18561m = "awaitRetry")
final class LottieRetrySignal$awaitRetry$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34425a;

    /* JADX INFO: renamed from: b */
    public int f34426b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34425a = obj;
        this.f34426b |= Integer.MIN_VALUE;
        throw null;
    }
}
