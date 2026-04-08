package com.exchange.allin.p024ui.page.pledge.history;

import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.pledge.history.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3419c implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40386a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LazyPagingItems f40387b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LazyPagingItems f40388c;

    public /* synthetic */ C3419c(int i, LazyPagingItems lazyPagingItems, LazyPagingItems lazyPagingItems2) {
        this.f40386a = i;
        this.f40387b = lazyPagingItems;
        this.f40388c = lazyPagingItems2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f40386a;
        if (i == 0) {
            this.f40387b.m11426d();
        } else if (i == 1) {
            this.f40388c.m11426d();
        }
        return Unit.f51459a;
    }
}
