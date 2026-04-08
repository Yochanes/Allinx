package com.exchange.allin.p024ui.page.home;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.ui.page.home.HomeViewModel", m18559f = "HomeViewModel.kt", m18560l = {45}, m18561m = "getBanners")
final class HomeViewModel$getBanners$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public HomeViewModel f39890a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f39891b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ HomeViewModel f39892c;

    /* JADX INFO: renamed from: d */
    public int f39893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getBanners$1(HomeViewModel homeViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39892c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39891b = obj;
        this.f39893d |= Integer.MIN_VALUE;
        return HomeViewModel.m13937g(this.f39892c, this);
    }
}
