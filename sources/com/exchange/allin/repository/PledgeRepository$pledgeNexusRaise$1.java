package com.exchange.allin.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.repository.PledgeRepository", m18559f = "PledgeRepository.kt", m18560l = {40}, m18561m = "pledgeNexusRaise")
final class PledgeRepository$pledgeNexusRaise$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35776a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PledgeRepository f35777b;

    /* JADX INFO: renamed from: c */
    public int f35778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PledgeRepository$pledgeNexusRaise$1(PledgeRepository pledgeRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35777b = pledgeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35776a = obj;
        this.f35778c |= Integer.MIN_VALUE;
        return this.f35777b.m13494g(0L, null, this);
    }
}
