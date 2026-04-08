package com.exchange.allin.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.repository.PledgeRepository", m18559f = "PledgeRepository.kt", m18560l = {29}, m18561m = "pledgeNexus")
final class PledgeRepository$pledgeNexus$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35773a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PledgeRepository f35774b;

    /* JADX INFO: renamed from: c */
    public int f35775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PledgeRepository$pledgeNexus$1(PledgeRepository pledgeRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35774b = pledgeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35773a = obj;
        this.f35775c |= Integer.MIN_VALUE;
        return this.f35774b.m13493f(0L, null, this);
    }
}
