package com.exchange.allin.p024ui.page.account.identity.confirm;

import com.exchange.allin.p024ui.page.account.identity.confirm.IdentityVerificationConfirmViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.identity.confirm.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2868g implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37314a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityVerificationConfirmViewModel.UiAction f37315b;

    public /* synthetic */ C2868g(IdentityVerificationConfirmViewModel.UiAction uiAction, int i) {
        this.f37314a = i;
        this.f37315b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37314a) {
            case 0:
                return IdentityVerificationConfirmViewModel.ViewState.m13657a((IdentityVerificationConfirmViewModel.ViewState) obj, ((IdentityVerificationConfirmViewModel.UiAction.ChangeFrontPhotoPath) this.f37315b).f37260a, null, false, false, 14);
            default:
                return IdentityVerificationConfirmViewModel.ViewState.m13657a((IdentityVerificationConfirmViewModel.ViewState) obj, null, ((IdentityVerificationConfirmViewModel.UiAction.ChangeHandPhotoPath) this.f37315b).f37261a, false, false, 13);
        }
    }
}
