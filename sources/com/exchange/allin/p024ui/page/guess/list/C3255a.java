package com.exchange.allin.p024ui.page.guess.list;

import androidx.compose.runtime.MutableState;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.guess.list.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3255a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39798a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f39799b;

    public /* synthetic */ C3255a(Object obj, int i) {
        this.f39798a = i;
        this.f39799b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39798a) {
            case 0:
                break;
            case 1:
                ((MutableState) this.f39799b).setValue(Boolean.valueOf(!((Boolean) r0.getF20325a()).booleanValue()));
                break;
            default:
                ((LazyPagingItems) this.f39799b).m11426d();
                break;
        }
        return Unit.f51459a;
    }
}
