package com.exchange.allin.repository;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.repository.CommonRepository", m18559f = "CommonRepository.kt", m18560l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m18561m = "getCurrencyRate")
final class CommonRepository$getCurrencyRate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35505a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CommonRepository f35506b;

    /* JADX INFO: renamed from: c */
    public int f35507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRepository$getCurrencyRate$1(CommonRepository commonRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35506b = commonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35505a = obj;
        this.f35507c |= Integer.MIN_VALUE;
        return this.f35506b.m13427d(this);
    }
}
