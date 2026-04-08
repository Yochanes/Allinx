package com.exchange.allin.p024ui.page.account.security.email.setting;

import com.exchange.allin.p024ui.page.account.security.email.setting.EmailSettingViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.email.setting.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2944d implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EmailSettingViewModel.UiAction f37752b;

    public /* synthetic */ C2944d(EmailSettingViewModel.UiAction uiAction, int i) {
        this.f37751a = i;
        this.f37752b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37751a) {
            case 0:
                return EmailSettingViewModel.ViewState.m13720a((EmailSettingViewModel.ViewState) obj, ((EmailSettingViewModel.UiAction.ChangeEmail) this.f37752b).f37721a, null, null, null, null, false, 62);
            case 1:
                return EmailSettingViewModel.ViewState.m13720a((EmailSettingViewModel.ViewState) obj, null, ((EmailSettingViewModel.UiAction.ChangeEmailCode) this.f37752b).f37722a, null, null, null, false, 61);
            default:
                return EmailSettingViewModel.ViewState.m13720a((EmailSettingViewModel.ViewState) obj, null, null, null, ((EmailSettingViewModel.UiAction.ChangePhoneCode) this.f37752b).f37723a, null, false, 55);
        }
    }
}
