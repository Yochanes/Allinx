package com.exchange.allin.p024ui.page.account.login;

import com.exchange.allin.p024ui.page.account.login.LoginViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.login.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2879e implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoginViewModel.UiAction f37398b;

    public /* synthetic */ C2879e(LoginViewModel.UiAction uiAction, int i) {
        this.f37397a = i;
        this.f37398b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37397a) {
            case 0:
                return LoginViewModel.ViewState.m13664a((LoginViewModel.ViewState) obj, ((LoginViewModel.UiAction.ToggleLoginMode) this.f37398b).f37364a, null, "", "", false, null, false, 114);
            case 1:
                return LoginViewModel.ViewState.m13664a((LoginViewModel.ViewState) obj, false, ((LoginViewModel.UiAction.ChangeCountry) this.f37398b).f37359a, null, null, false, null, false, 125);
            case 2:
                return LoginViewModel.ViewState.m13664a((LoginViewModel.ViewState) obj, false, null, ((LoginViewModel.UiAction.ChangeAccount) this.f37398b).f37358a, null, false, null, false, 123);
            default:
                return LoginViewModel.ViewState.m13664a((LoginViewModel.ViewState) obj, false, null, null, ((LoginViewModel.UiAction.ChangePassword) this.f37398b).f37360a, false, null, false, 119);
        }
    }
}
