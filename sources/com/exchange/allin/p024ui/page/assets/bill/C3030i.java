package com.exchange.allin.p024ui.page.assets.bill;

import com.exchange.allin.p024ui.page.assets.bill.AssetsBillViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.bill.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3030i implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsBillViewModel.UiAction f38351b;

    public /* synthetic */ C3030i(AssetsBillViewModel.UiAction uiAction, int i) {
        this.f38350a = i;
        this.f38351b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38350a) {
            case 0:
                return AssetsBillViewModel.ViewState.m13764a((AssetsBillViewModel.ViewState) obj, ((AssetsBillViewModel.UiAction.ChangeType) this.f38351b).f38236b, null, null, null, null, null, null, 4063);
            case 1:
                return AssetsBillViewModel.ViewState.m13764a((AssetsBillViewModel.ViewState) obj, null, ((AssetsBillViewModel.UiAction.ChangeType) this.f38351b).f38236b, null, null, null, null, null, 4031);
            case 2:
                return AssetsBillViewModel.ViewState.m13764a((AssetsBillViewModel.ViewState) obj, null, null, (String) ((AssetsBillViewModel.UiAction.ChangeType) this.f38351b).f38236b.f51427b, null, null, null, null, 3967);
            case 3:
                return AssetsBillViewModel.ViewState.m13764a((AssetsBillViewModel.ViewState) obj, null, null, null, ((AssetsBillViewModel.UiAction.ChangeType) this.f38351b).f38236b, null, null, null, 3839);
            case 4:
                return AssetsBillViewModel.ViewState.m13764a((AssetsBillViewModel.ViewState) obj, null, null, null, null, (String) ((AssetsBillViewModel.UiAction.ChangeType) this.f38351b).f38236b.f51427b, null, null, 3583);
            case 5:
                return AssetsBillViewModel.ViewState.m13764a((AssetsBillViewModel.ViewState) obj, null, null, null, null, null, ((AssetsBillViewModel.UiAction.ChangeCoin) this.f38351b).f38233a, null, 3071);
            default:
                return AssetsBillViewModel.ViewState.m13764a((AssetsBillViewModel.ViewState) obj, null, null, null, null, null, null, ((AssetsBillViewModel.UiAction.ChangeDate) this.f38351b).f38234a, 2047);
        }
    }
}
