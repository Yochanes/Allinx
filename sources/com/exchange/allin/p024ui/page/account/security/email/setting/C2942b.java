package com.exchange.allin.p024ui.page.account.security.email.setting;

import com.exchange.allin.p024ui.page.account.security.email.setting.EmailSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.email.setting.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2942b implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EmailSettingViewModel f37748b;

    public /* synthetic */ C2942b(EmailSettingViewModel emailSettingViewModel, int i) {
        this.f37747a = i;
        this.f37748b = emailSettingViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37747a) {
            case 0:
                this.f37748b.m13719f(EmailSettingViewModel.UiAction.SendEmailCode.f37724a);
                break;
            case 1:
                this.f37748b.m13719f(EmailSettingViewModel.UiAction.SendPhoneCode.f37725a);
                break;
            default:
                this.f37748b.m13719f(EmailSettingViewModel.UiAction.Submit.f37726a);
                break;
        }
        return Unit.f51459a;
    }
}
