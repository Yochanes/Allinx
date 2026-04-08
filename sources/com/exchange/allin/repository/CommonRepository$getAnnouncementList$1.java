package com.exchange.allin.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.repository.CommonRepository", m18559f = "CommonRepository.kt", m18560l = {52}, m18561m = "getAnnouncementList")
final class CommonRepository$getAnnouncementList$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CommonRepository f35497b;

    /* JADX INFO: renamed from: c */
    public int f35498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRepository$getAnnouncementList$1(CommonRepository commonRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35497b = commonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35496a = obj;
        this.f35498c |= Integer.MIN_VALUE;
        return this.f35497b.m13424a(0, 0, this);
    }
}
