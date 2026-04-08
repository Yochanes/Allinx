package com.exchange.allin.p024ui.page.account.forget;

import com.exchange.allin.p024ui.page.account.forget.ForgetPasswordViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.forget.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2843f implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ForgetPasswordViewModel.UiAction f37133b;

    public /* synthetic */ C2843f(ForgetPasswordViewModel.UiAction uiAction, int i) {
        this.f37132a = i;
        this.f37133b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37132a) {
            case 0:
                return ForgetPasswordViewModel.ViewState.m13647a((ForgetPasswordViewModel.ViewState) obj, ((ForgetPasswordViewModel.UiAction.ToggleLoginMode) this.f37133b).f37104a, null, "", null, false, 26);
            case 1:
                return ForgetPasswordViewModel.ViewState.m13647a((ForgetPasswordViewModel.ViewState) obj, false, ((ForgetPasswordViewModel.UiAction.ChangeCountry) this.f37133b).f37101a, null, null, false, 29);
            default:
                return ForgetPasswordViewModel.ViewState.m13647a((ForgetPasswordViewModel.ViewState) obj, false, null, ((ForgetPasswordViewModel.UiAction.ChangeAccount) this.f37133b).f37100a, null, false, 27);
        }
    }
}
