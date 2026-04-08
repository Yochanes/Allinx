package com.exchange.allin.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.repository.MiniFuturesRepository", m18559f = "MiniFuturesRepository.kt", m18560l = {307}, m18561m = "doCloseLimitPosition")
final class MiniFuturesRepository$doCloseLimitPosition$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35684a;

    /* JADX INFO: renamed from: b */
    public int f35685b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35684a = obj;
        this.f35685b |= Integer.MIN_VALUE;
        throw null;
    }
}
