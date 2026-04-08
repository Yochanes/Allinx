package com.exchange.allin.p024ui.page.assets.withdraw.detail;

import com.exchange.allin.p024ui.page.assets.withdraw.detail.AssetsWithdrawDetailViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.withdraw.detail.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3085f implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38717a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsWithdrawDetailViewModel.UiAction f38718b;

    public /* synthetic */ C3085f(AssetsWithdrawDetailViewModel.UiAction uiAction, int i) {
        this.f38717a = i;
        this.f38718b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38717a) {
            case 0:
                return AssetsWithdrawDetailViewModel.ViewState.m13814a((AssetsWithdrawDetailViewModel.ViewState) obj, null, ((AssetsWithdrawDetailViewModel.UiAction.ChangeNetworkIndex) this.f38718b).f38689a, null, "", "", "", 5);
            case 1:
                return AssetsWithdrawDetailViewModel.ViewState.m13814a((AssetsWithdrawDetailViewModel.ViewState) obj, null, 0, null, ((AssetsWithdrawDetailViewModel.UiAction.ChangeAddress) this.f38718b).f38687a, null, "", 23);
            default:
                return AssetsWithdrawDetailViewModel.ViewState.m13814a((AssetsWithdrawDetailViewModel.ViewState) obj, null, 0, null, null, ((AssetsWithdrawDetailViewModel.UiAction.ChangeAmount) this.f38718b).f38688a, null, 47);
        }
    }
}
