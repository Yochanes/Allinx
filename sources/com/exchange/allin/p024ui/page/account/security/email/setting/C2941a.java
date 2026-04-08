package com.exchange.allin.p024ui.page.account.security.email.setting;

import com.exchange.allin.p024ui.page.account.security.email.setting.EmailSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.email.setting.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2941a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EmailSettingViewModel f37746b;

    public /* synthetic */ C2941a(EmailSettingViewModel emailSettingViewModel, int i) {
        this.f37745a = i;
        this.f37746b = emailSettingViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f37745a) {
            case 0:
                Intrinsics.m18599g(it, "it");
                this.f37746b.m13719f(new EmailSettingViewModel.UiAction.ChangeEmail(it));
                break;
            case 1:
                Intrinsics.m18599g(it, "it");
                if (it.length() <= 6 || it.length() == 0) {
                    this.f37746b.m13719f(new EmailSettingViewModel.UiAction.ChangeEmailCode(it));
                }
                break;
            default:
                Intrinsics.m18599g(it, "it");
                if (it.length() <= 6 || it.length() == 0) {
                    this.f37746b.m13719f(new EmailSettingViewModel.UiAction.ChangePhoneCode(it));
                }
                break;
        }
        return Unit.f51459a;
    }
}
