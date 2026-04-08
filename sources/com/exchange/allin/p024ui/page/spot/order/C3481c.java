package com.exchange.allin.p024ui.page.spot.order;

import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.spot.order.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3481c implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LazyPagingItems f40832b;

    public /* synthetic */ C3481c(LazyPagingItems lazyPagingItems, int i) {
        this.f40831a = i;
        this.f40832b = lazyPagingItems;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40831a) {
            case 0:
                this.f40832b.m11426d();
                break;
            default:
                this.f40832b.m11426d();
                break;
        }
        return Unit.f51459a;
    }
}
