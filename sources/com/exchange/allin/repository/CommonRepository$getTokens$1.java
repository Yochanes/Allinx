package com.exchange.allin.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.repository.CommonRepository", m18559f = "CommonRepository.kt", m18560l = {38}, m18561m = "getTokens")
final class CommonRepository$getTokens$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CommonRepository f35512b;

    /* JADX INFO: renamed from: c */
    public int f35513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRepository$getTokens$1(CommonRepository commonRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35512b = commonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35511a = obj;
        this.f35513c |= Integer.MIN_VALUE;
        return this.f35512b.m13429f(this);
    }
}
