package com.exchange.allin.p024ui.page.account.security.phone.setting;

import com.exchange.allin.p024ui.page.account.security.phone.setting.PhoneSettingViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.phone.setting.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2969c implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PhoneSettingViewModel.UiAction f37957b;

    public /* synthetic */ C2969c(PhoneSettingViewModel.UiAction uiAction, int i) {
        this.f37956a = i;
        this.f37957b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37956a) {
            case 0:
                return PhoneSettingViewModel.ViewState.m13739a((PhoneSettingViewModel.ViewState) obj, ((PhoneSettingViewModel.UiAction.ChangeCountry) this.f37957b).f37924a, null, null, null, null, null, null, false, 254);
            case 1:
                return PhoneSettingViewModel.ViewState.m13739a((PhoneSettingViewModel.ViewState) obj, null, ((PhoneSettingViewModel.UiAction.ChangePhone) this.f37957b).f37926a, null, null, null, null, null, false, 253);
            case 2:
                return PhoneSettingViewModel.ViewState.m13739a((PhoneSettingViewModel.ViewState) obj, null, null, ((PhoneSettingViewModel.UiAction.ChangePhoneCode) this.f37957b).f37927a, null, null, null, null, false, 251);
            default:
                return PhoneSettingViewModel.ViewState.m13739a((PhoneSettingViewModel.ViewState) obj, null, null, null, null, ((PhoneSettingViewModel.UiAction.ChangeEmailCode) this.f37957b).f37925a, null, null, false, 239);
        }
    }
}
