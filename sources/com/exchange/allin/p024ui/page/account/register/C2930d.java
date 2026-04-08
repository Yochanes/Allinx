package com.exchange.allin.p024ui.page.account.register;

import com.exchange.allin.p024ui.page.account.register.RegisterViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.register.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2930d implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RegisterViewModel.UiAction f37684b;

    public /* synthetic */ C2930d(RegisterViewModel.UiAction uiAction, int i) {
        this.f37683a = i;
        this.f37684b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37683a) {
            case 0:
                return RegisterViewModel.ViewState.m13695a((RegisterViewModel.ViewState) obj, ((RegisterViewModel.UiAction.ToggleRegisterMode) this.f37684b).f37660a, null, "", "", null, false, false, null, false, 498);
            case 1:
                return RegisterViewModel.ViewState.m13695a((RegisterViewModel.ViewState) obj, false, ((RegisterViewModel.UiAction.ChangeCountry) this.f37684b).f37653a, null, null, null, false, false, null, false, 509);
            case 2:
                return RegisterViewModel.ViewState.m13695a((RegisterViewModel.ViewState) obj, false, null, ((RegisterViewModel.UiAction.ChangeAccount) this.f37684b).f37652a, null, null, false, false, null, false, 507);
            case 3:
                return RegisterViewModel.ViewState.m13695a((RegisterViewModel.ViewState) obj, false, null, null, ((RegisterViewModel.UiAction.ChangePassword) this.f37684b).f37655a, null, false, false, null, false, 503);
            default:
                return RegisterViewModel.ViewState.m13695a((RegisterViewModel.ViewState) obj, false, null, null, null, ((RegisterViewModel.UiAction.ChangeInviteCode) this.f37684b).f37654a, false, false, null, false, 495);
        }
    }
}
