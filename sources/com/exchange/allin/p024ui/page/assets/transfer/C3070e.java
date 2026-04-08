package com.exchange.allin.p024ui.page.assets.transfer;

import com.exchange.allin.p024ui.page.assets.transfer.AssetsTransferViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.transfer.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3070e implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsTransferViewModel.UiAction f38598b;

    public /* synthetic */ C3070e(AssetsTransferViewModel.UiAction uiAction, int i) {
        this.f38597a = i;
        this.f38598b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38597a) {
            case 0:
                return AssetsTransferViewModel.ViewState.m13803a((AssetsTransferViewModel.ViewState) obj, null, ((AssetsTransferViewModel.UiAction.ChangeCoinName) this.f38598b).f38567a, "", 0.0f, false, 25);
            default:
                return AssetsTransferViewModel.ViewState.m13803a((AssetsTransferViewModel.ViewState) obj, null, null, ((AssetsTransferViewModel.UiAction.ChangeAmount) this.f38598b).f38566a, 0.0f, false, 27);
        }
    }
}
