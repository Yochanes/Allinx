package com.exchange.allin.p024ui.page.spot.order;

import com.exchange.allin.p024ui.page.spot.order.SpotOrderViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.spot.order.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3488e implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SpotOrderViewModel.UiAction f40863b;

    public /* synthetic */ C3488e(SpotOrderViewModel.UiAction uiAction, int i) {
        this.f40862a = i;
        this.f40863b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SpotOrderViewModel.ViewState viewState = (SpotOrderViewModel.ViewState) obj;
        switch (this.f40862a) {
            case 0:
                return SpotOrderViewModel.ViewState.m14068a(viewState, ((SpotOrderViewModel.UiAction.ChangePair) this.f40863b).f40810a, null, null, 6);
            case 1:
                return SpotOrderViewModel.ViewState.m14068a(viewState, null, ((SpotOrderViewModel.UiAction.ChangeSide) this.f40863b).f40811a, null, 5);
            default:
                return SpotOrderViewModel.ViewState.m14068a(viewState, null, null, ((SpotOrderViewModel.UiAction.ChangeDate) this.f40863b).f40809a, 3);
        }
    }
}
