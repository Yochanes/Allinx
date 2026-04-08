package com.exchange.allin.p024ui.page.futures.history;

import com.exchange.allin.p024ui.page.futures.history.FuturesHistoryViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.futures.history.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3199e implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FuturesHistoryViewModel.UiAction f39464b;

    public /* synthetic */ C3199e(FuturesHistoryViewModel.UiAction uiAction, int i) {
        this.f39463a = i;
        this.f39464b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39463a) {
            case 0:
                return FuturesHistoryViewModel.ViewState.m13897a((FuturesHistoryViewModel.ViewState) obj, null, ((FuturesHistoryViewModel.UiAction.ChangeContract) this.f39464b).f39417a, null, null, null, 239);
            case 1:
                return FuturesHistoryViewModel.ViewState.m13897a((FuturesHistoryViewModel.ViewState) obj, null, null, ((FuturesHistoryViewModel.UiAction.ChangeType) this.f39464b).f39419b, null, null, 223);
            case 2:
                return FuturesHistoryViewModel.ViewState.m13897a((FuturesHistoryViewModel.ViewState) obj, null, null, null, ((FuturesHistoryViewModel.UiAction.ChangeType) this.f39464b).f39419b, null, 191);
            default:
                return FuturesHistoryViewModel.ViewState.m13897a((FuturesHistoryViewModel.ViewState) obj, null, null, null, null, ((FuturesHistoryViewModel.UiAction.ChangeType) this.f39464b).f39419b, 127);
        }
    }
}
