package com.exchange.allin.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.repository.CommonRepository", m18559f = "CommonRepository.kt", m18560l = {45}, m18561m = "getBanners")
final class CommonRepository$getBanners$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CommonRepository f35500b;

    /* JADX INFO: renamed from: c */
    public int f35501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRepository$getBanners$1(CommonRepository commonRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35500b = commonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35499a = obj;
        this.f35501c |= Integer.MIN_VALUE;
        return this.f35500b.m13425b(this);
    }
}
