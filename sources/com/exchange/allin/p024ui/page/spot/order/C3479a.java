package com.exchange.allin.p024ui.page.spot.order;

import com.exchange.allin.p024ui.page.spot.order.SpotOrderViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.spot.order.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3479a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SpotOrderViewModel f40826b;

    public /* synthetic */ C3479a(SpotOrderViewModel spotOrderViewModel, int i) {
        this.f40825a = i;
        this.f40826b = spotOrderViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f40825a) {
            case 0:
                Intrinsics.m18596d(it);
                this.f40826b.m14067f(new SpotOrderViewModel.UiAction.ChangePair(it));
                break;
            case 1:
                Intrinsics.m18599g(it, "it");
                this.f40826b.m14067f(new SpotOrderViewModel.UiAction.ChangeSide(it));
                break;
            default:
                Intrinsics.m18599g(it, "it");
                this.f40826b.m14067f(new SpotOrderViewModel.UiAction.ChangeDate(it));
                break;
        }
        return Unit.f51459a;
    }
}
