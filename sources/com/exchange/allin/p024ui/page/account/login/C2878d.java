package com.exchange.allin.p024ui.page.account.login;

import com.exchange.allin.p024ui.page.account.login.LoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.login.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2878d implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoginViewModel f37396b;

    public /* synthetic */ C2878d(LoginViewModel loginViewModel, int i) {
        this.f37395a = i;
        this.f37396b = loginViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37395a) {
            case 0:
                this.f37396b.m13663f(LoginViewModel.UiAction.ToggleHidePassword.f37363a);
                break;
            default:
                this.f37396b.m13663f(LoginViewModel.UiAction.ToggleHidePassword.f37363a);
                break;
        }
        return Unit.f51459a;
    }
}
