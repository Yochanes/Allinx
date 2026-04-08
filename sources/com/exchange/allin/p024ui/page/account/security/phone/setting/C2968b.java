package com.exchange.allin.p024ui.page.account.security.phone.setting;

import com.exchange.allin.p024ui.page.account.security.phone.setting.PhoneSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.phone.setting.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2968b implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37954a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PhoneSettingViewModel f37955b;

    public /* synthetic */ C2968b(PhoneSettingViewModel phoneSettingViewModel, int i) {
        this.f37954a = i;
        this.f37955b = phoneSettingViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37954a) {
            case 0:
                this.f37955b.m13738f(PhoneSettingViewModel.UiAction.SendPhoneCode.f37930a);
                break;
            case 1:
                this.f37955b.m13738f(PhoneSettingViewModel.UiAction.SendEmailCode.f37929a);
                break;
            default:
                this.f37955b.m13738f(PhoneSettingViewModel.UiAction.Submit.f37931a);
                break;
        }
        return Unit.f51459a;
    }
}
