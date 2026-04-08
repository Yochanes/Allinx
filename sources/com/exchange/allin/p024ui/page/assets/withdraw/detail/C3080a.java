package com.exchange.allin.p024ui.page.assets.withdraw.detail;

import androidx.compose.p013ui.focus.FocusState;
import com.exchange.allin.p024ui.page.assets.withdraw.detail.AssetsWithdrawDetailViewModel;
import com.exchange.allin.utils.ext.StringExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.withdraw.detail.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3080a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsWithdrawDetailViewModel f38705b;

    public /* synthetic */ C3080a(AssetsWithdrawDetailViewModel assetsWithdrawDetailViewModel, int i) {
        this.f38704a = i;
        this.f38705b = assetsWithdrawDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38704a) {
            case 0:
                String str = (String) obj;
                Intrinsics.m18596d(str);
                this.f38705b.m13813f(new AssetsWithdrawDetailViewModel.UiAction.ChangeAddress(str));
                break;
            case 1:
                FocusState it = (FocusState) obj;
                Intrinsics.m18599g(it, "it");
                if (!it.mo5010b()) {
                    this.f38705b.m13813f(AssetsWithdrawDetailViewModel.UiAction.VerifyWithdrawAddress.f38693a);
                }
                break;
            case 2:
                String it2 = (String) obj;
                Intrinsics.m18599g(it2, "it");
                this.f38705b.m13813f(new AssetsWithdrawDetailViewModel.UiAction.ChangeAddress(it2));
                break;
            case 3:
                String it3 = (String) obj;
                Intrinsics.m18599g(it3, "it");
                if (StringExtKt.m14221j(it3, false) || it3.length() == 0) {
                    this.f38705b.m13813f(new AssetsWithdrawDetailViewModel.UiAction.ChangeAmount(it3));
                }
                break;
            case 4:
                this.f38705b.m13813f(new AssetsWithdrawDetailViewModel.UiAction.ChangeNetworkIndex(((Integer) obj).intValue()));
                break;
            default:
                String it4 = (String) obj;
                Intrinsics.m18599g(it4, "it");
                this.f38705b.m13813f(new AssetsWithdrawDetailViewModel.UiAction.ChangeAddress(it4));
                break;
        }
        return Unit.f51459a;
    }
}
