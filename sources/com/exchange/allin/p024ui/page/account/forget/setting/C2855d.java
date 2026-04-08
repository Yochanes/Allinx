package com.exchange.allin.p024ui.page.account.forget.setting;

import com.exchange.allin.p024ui.page.account.forget.setting.ForgetPasswordSettingViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.forget.setting.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2855d implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ForgetPasswordSettingViewModel.UiAction f37210b;

    public /* synthetic */ C2855d(ForgetPasswordSettingViewModel.UiAction uiAction, int i) {
        this.f37209a = i;
        this.f37210b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37209a) {
            case 0:
                return ForgetPasswordSettingViewModel.ViewState.m13651a((ForgetPasswordSettingViewModel.ViewState) obj, ((ForgetPasswordSettingViewModel.UiAction.InitData) this.f37210b).f37182a, null, null, false, false, false, 62);
            case 1:
                return ForgetPasswordSettingViewModel.ViewState.m13651a((ForgetPasswordSettingViewModel.ViewState) obj, null, ((ForgetPasswordSettingViewModel.UiAction.ChangePassword) this.f37210b).f37180a, null, false, false, false, 61);
            default:
                return ForgetPasswordSettingViewModel.ViewState.m13651a((ForgetPasswordSettingViewModel.ViewState) obj, null, null, ((ForgetPasswordSettingViewModel.UiAction.ChangeRePassword) this.f37210b).f37181a, false, false, false, 59);
        }
    }
}
