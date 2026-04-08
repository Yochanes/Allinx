package com.exchange.allin.repository;

import com.engagelab.privates.common.observer.MTObservable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.repository.PledgeRepository", m18559f = "PledgeRepository.kt", m18560l = {MTObservable.WHAT_OBSERVER}, m18561m = "getReleaseRecord")
final class PledgeRepository$getReleaseRecord$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PledgeRepository f35768b;

    /* JADX INFO: renamed from: c */
    public int f35769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PledgeRepository$getReleaseRecord$1(PledgeRepository pledgeRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35768b = pledgeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35767a = obj;
        this.f35769c |= Integer.MIN_VALUE;
        return this.f35768b.m13491c(null, null, 0, null, null, this);
    }
}
