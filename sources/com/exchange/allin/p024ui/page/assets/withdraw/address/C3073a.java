package com.exchange.allin.p024ui.page.assets.withdraw.address;

import androidx.compose.p013ui.focus.FocusState;
import com.exchange.allin.p024ui.page.assets.withdraw.address.AssetsWithdrawAddressViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.withdraw.address.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3073a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsWithdrawAddressViewModel f38639b;

    public /* synthetic */ C3073a(AssetsWithdrawAddressViewModel assetsWithdrawAddressViewModel, int i) {
        this.f38638a = i;
        this.f38639b = assetsWithdrawAddressViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38638a) {
            case 0:
                String str = (String) obj;
                Intrinsics.m18596d(str);
                this.f38639b.m13807f(new AssetsWithdrawAddressViewModel.UiAction.ChangeCoin(str));
                break;
            case 1:
                String str2 = (String) obj;
                Intrinsics.m18596d(str2);
                this.f38639b.m13807f(new AssetsWithdrawAddressViewModel.UiAction.ChangeAddress(str2));
                break;
            case 2:
                FocusState it = (FocusState) obj;
                Intrinsics.m18599g(it, "it");
                if (!it.mo5010b()) {
                    this.f38639b.m13807f(AssetsWithdrawAddressViewModel.UiAction.VerifyWithdrawAddress.f38625a);
                }
                break;
            case 3:
                String it2 = (String) obj;
                Intrinsics.m18599g(it2, "it");
                this.f38639b.m13807f(new AssetsWithdrawAddressViewModel.UiAction.ChangeAddress(it2));
                break;
            default:
                String it3 = (String) obj;
                Intrinsics.m18599g(it3, "it");
                this.f38639b.m13807f(new AssetsWithdrawAddressViewModel.UiAction.ChangeRemark(it3));
                break;
        }
        return Unit.f51459a;
    }
}
