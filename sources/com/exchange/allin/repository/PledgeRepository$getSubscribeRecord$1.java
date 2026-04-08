package com.exchange.allin.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.repository.PledgeRepository", m18559f = "PledgeRepository.kt", m18560l = {57}, m18561m = "getSubscribeRecord")
final class PledgeRepository$getSubscribeRecord$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35770a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PledgeRepository f35771b;

    /* JADX INFO: renamed from: c */
    public int f35772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PledgeRepository$getSubscribeRecord$1(PledgeRepository pledgeRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35771b = pledgeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35770a = obj;
        this.f35772c |= Integer.MIN_VALUE;
        return this.f35771b.m13492d(null, null, this);
    }
}
