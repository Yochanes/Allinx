package com.exchange.allin.p024ui.page.account.login;

import android.text.TextUtils;
import com.exchange.allin.data.Country;
import com.exchange.allin.p024ui.page.account.login.LoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.login.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2875a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoginViewModel f37385b;

    public /* synthetic */ C2875a(LoginViewModel loginViewModel, int i) {
        this.f37384a = i;
        this.f37385b = loginViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37384a) {
            case 0:
                String it = (String) obj;
                Intrinsics.m18599g(it, "it");
                this.f37385b.m13663f(new LoginViewModel.UiAction.ChangeAccount(it));
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.m18599g(it2, "it");
                this.f37385b.m13663f(new LoginViewModel.UiAction.ChangePassword(it2));
                break;
            case 2:
                String it3 = (String) obj;
                Intrinsics.m18599g(it3, "it");
                if (TextUtils.isDigitsOnly(it3) || it3.length() == 0) {
                    this.f37385b.m13663f(new LoginViewModel.UiAction.ChangeAccount(it3));
                }
                break;
            case 3:
                String it4 = (String) obj;
                Intrinsics.m18599g(it4, "it");
                this.f37385b.m13663f(new LoginViewModel.UiAction.ChangePassword(it4));
                break;
            default:
                Country it5 = (Country) obj;
                Intrinsics.m18599g(it5, "it");
                this.f37385b.m13663f(new LoginViewModel.UiAction.ChangeCountry(it5));
                break;
        }
        return Unit.f51459a;
    }
}
