package com.exchange.allin.p024ui.page.account.identity;

import com.exchange.allin.p024ui.page.account.identity.IdentityVerificationViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.identity.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2870d implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityVerificationViewModel.UiAction f37319b;

    public /* synthetic */ C2870d(IdentityVerificationViewModel.UiAction uiAction, int i) {
        this.f37318a = i;
        this.f37319b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37318a) {
            case 0:
                return IdentityVerificationViewModel.ViewState.m13654a((IdentityVerificationViewModel.ViewState) obj, ((IdentityVerificationViewModel.UiAction.ChangeType) this.f37319b).f37222a, null, null, null, null, 30);
            case 1:
                return IdentityVerificationViewModel.ViewState.m13654a((IdentityVerificationViewModel.ViewState) obj, null, ((IdentityVerificationViewModel.UiAction.ChangeCountry) this.f37319b).f37219a, null, null, null, 29);
            case 2:
                return IdentityVerificationViewModel.ViewState.m13654a((IdentityVerificationViewModel.ViewState) obj, null, null, ((IdentityVerificationViewModel.UiAction.ChangeName) this.f37319b).f37221a, null, null, 27);
            default:
                return IdentityVerificationViewModel.ViewState.m13654a((IdentityVerificationViewModel.ViewState) obj, null, null, null, ((IdentityVerificationViewModel.UiAction.ChangeIdNumber) this.f37319b).f37220a, null, 23);
        }
    }
}
