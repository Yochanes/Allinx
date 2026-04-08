package com.exchange.allin.p024ui.page.account.security.password;

import com.exchange.allin.p024ui.page.account.security.password.ModifyPasswordViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.password.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2957a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37887a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ModifyPasswordViewModel.UiAction f37888b;

    public /* synthetic */ C2957a(ModifyPasswordViewModel.UiAction uiAction, int i) {
        this.f37887a = i;
        this.f37888b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37887a) {
            case 0:
                return ModifyPasswordViewModel.ViewState.m13732a((ModifyPasswordViewModel.ViewState) obj, ((ModifyPasswordViewModel.UiAction.ChangeCurPassword) this.f37888b).f37871a, null, null, false, false, false, 62);
            case 1:
                return ModifyPasswordViewModel.ViewState.m13732a((ModifyPasswordViewModel.ViewState) obj, null, ((ModifyPasswordViewModel.UiAction.ChangeNewPassword) this.f37888b).f37872a, null, false, false, false, 61);
            default:
                return ModifyPasswordViewModel.ViewState.m13732a((ModifyPasswordViewModel.ViewState) obj, null, null, ((ModifyPasswordViewModel.UiAction.ChangeRePassword) this.f37888b).f37873a, false, false, false, 59);
        }
    }
}
