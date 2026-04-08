package com.exchange.allin.p024ui.page.assets.internal;

import com.exchange.allin.p024ui.page.assets.internal.AssetsInternalWithdrawViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.internal.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3047d implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsInternalWithdrawViewModel.UiAction f38462b;

    public /* synthetic */ C3047d(AssetsInternalWithdrawViewModel.UiAction uiAction, int i) {
        this.f38461a = i;
        this.f38462b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38461a) {
            case 0:
                return AssetsInternalWithdrawViewModel.ViewState.m13793a((AssetsInternalWithdrawViewModel.ViewState) obj, ((AssetsInternalWithdrawViewModel.UiAction.ChangeAccountType) this.f38462b).f38441a, null, null, "", null, 22);
            case 1:
                return AssetsInternalWithdrawViewModel.ViewState.m13793a((AssetsInternalWithdrawViewModel.ViewState) obj, 0, null, null, ((AssetsInternalWithdrawViewModel.UiAction.ChangeAccount) this.f38462b).f38440a, null, 23);
            case 2:
                return AssetsInternalWithdrawViewModel.ViewState.m13793a((AssetsInternalWithdrawViewModel.ViewState) obj, 0, null, null, null, ((AssetsInternalWithdrawViewModel.UiAction.ChangeAmount) this.f38462b).f38442a, 15);
            default:
                return AssetsInternalWithdrawViewModel.ViewState.m13793a((AssetsInternalWithdrawViewModel.ViewState) obj, 0, null, ((AssetsInternalWithdrawViewModel.UiAction.ChangeCountry) this.f38462b).f38443a, null, null, 27);
        }
    }
}
