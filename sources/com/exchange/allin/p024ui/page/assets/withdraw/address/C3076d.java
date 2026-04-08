package com.exchange.allin.p024ui.page.assets.withdraw.address;

import com.exchange.allin.data.AssetWithdrawAddress;
import com.exchange.allin.p024ui.page.assets.withdraw.address.AssetsWithdrawAddressViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.withdraw.address.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3076d implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsWithdrawAddressViewModel.UiAction f38646b;

    public /* synthetic */ C3076d(AssetsWithdrawAddressViewModel.UiAction uiAction, int i) {
        this.f38645a = i;
        this.f38646b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.f38645a) {
            case 0:
                AssetsWithdrawAddressViewModel.ViewState viewState = (AssetsWithdrawAddressViewModel.ViewState) obj;
                AssetWithdrawAddress assetWithdrawAddress = viewState.f38627a;
                if (assetWithdrawAddress == null) {
                    assetWithdrawAddress = ((AssetsWithdrawAddressViewModel.UiAction.InitData) this.f38646b).f38623a;
                }
                return AssetsWithdrawAddressViewModel.ViewState.m13808a(viewState, assetWithdrawAddress, null, false, 6);
            case 1:
                AssetsWithdrawAddressViewModel.ViewState viewState2 = (AssetsWithdrawAddressViewModel.ViewState) obj;
                AssetWithdrawAddress assetWithdrawAddress2 = viewState2.f38627a;
                return AssetsWithdrawAddressViewModel.ViewState.m13808a(viewState2, assetWithdrawAddress2 != null ? AssetWithdrawAddress.copy$default(assetWithdrawAddress2, 0L, ((AssetsWithdrawAddressViewModel.UiAction.ChangeCoin) this.f38646b).f38620a, "", "", null, 0, 0L, 0L, 241, null) : null, "", false, 4);
            case 2:
                AssetsWithdrawAddressViewModel.ViewState viewState3 = (AssetsWithdrawAddressViewModel.ViewState) obj;
                AssetWithdrawAddress assetWithdrawAddress3 = viewState3.f38627a;
                return AssetsWithdrawAddressViewModel.ViewState.m13808a(viewState3, assetWithdrawAddress3 != null ? AssetWithdrawAddress.copy$default(assetWithdrawAddress3, 0L, null, null, ((AssetsWithdrawAddressViewModel.UiAction.ChangeAddress) this.f38646b).f38619a, null, 0, 0L, 0L, 247, null) : null, "", false, 4);
            case 3:
                AssetsWithdrawAddressViewModel.ViewState viewState4 = (AssetsWithdrawAddressViewModel.ViewState) obj;
                AssetWithdrawAddress assetWithdrawAddress4 = viewState4.f38627a;
                return AssetsWithdrawAddressViewModel.ViewState.m13808a(viewState4, assetWithdrawAddress4 != null ? AssetWithdrawAddress.copy$default(assetWithdrawAddress4, 0L, null, ((AssetsWithdrawAddressViewModel.UiAction.ChangeNetwork) this.f38646b).f38621a, "", null, 0, 0L, 0L, 243, null) : null, null, false, 6);
            default:
                AssetsWithdrawAddressViewModel.ViewState viewState5 = (AssetsWithdrawAddressViewModel.ViewState) obj;
                AssetWithdrawAddress assetWithdrawAddress5 = viewState5.f38627a;
                AssetWithdrawAddress assetWithdrawAddressCopy$default = null;
                if (assetWithdrawAddress5 != null) {
                    str = null;
                    assetWithdrawAddressCopy$default = AssetWithdrawAddress.copy$default(assetWithdrawAddress5, 0L, null, null, null, ((AssetsWithdrawAddressViewModel.UiAction.ChangeRemark) this.f38646b).f38622a, 0, 0L, 0L, 239, null);
                } else {
                    str = null;
                }
                return AssetsWithdrawAddressViewModel.ViewState.m13808a(viewState5, assetWithdrawAddressCopy$default, str, false, 6);
        }
    }
}
