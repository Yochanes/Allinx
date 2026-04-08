package com.exchange.allin.p024ui.page.account.security.phone.setting;

import com.exchange.allin.data.Country;
import com.exchange.allin.p024ui.page.account.security.phone.setting.PhoneSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.phone.setting.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2967a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37952a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PhoneSettingViewModel f37953b;

    public /* synthetic */ C2967a(PhoneSettingViewModel phoneSettingViewModel, int i) {
        this.f37952a = i;
        this.f37953b = phoneSettingViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37952a) {
            case 0:
                String it = (String) obj;
                Intrinsics.m18599g(it, "it");
                this.f37953b.m13738f(new PhoneSettingViewModel.UiAction.ChangePhone(it));
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.m18599g(it2, "it");
                if (it2.length() <= 6 || it2.length() == 0) {
                    this.f37953b.m13738f(new PhoneSettingViewModel.UiAction.ChangePhoneCode(it2));
                }
                break;
            case 2:
                String it3 = (String) obj;
                Intrinsics.m18599g(it3, "it");
                if (it3.length() <= 6 || it3.length() == 0) {
                    this.f37953b.m13738f(new PhoneSettingViewModel.UiAction.ChangeEmailCode(it3));
                }
                break;
            default:
                Country it4 = (Country) obj;
                Intrinsics.m18599g(it4, "it");
                this.f37953b.m13738f(new PhoneSettingViewModel.UiAction.ChangeCountry(it4));
                break;
        }
        return Unit.f51459a;
    }
}
