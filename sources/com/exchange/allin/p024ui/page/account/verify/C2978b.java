package com.exchange.allin.p024ui.page.account.verify;

import com.exchange.allin.p024ui.page.account.verify.VerifyCodeViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.verify.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2978b implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VerifyCodeViewModel.UiAction f38048b;

    public /* synthetic */ C2978b(VerifyCodeViewModel.UiAction uiAction, int i) {
        this.f38047a = i;
        this.f38048b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38047a) {
            case 0:
                return VerifyCodeViewModel.ViewState.m13749a((VerifyCodeViewModel.ViewState) obj, ((VerifyCodeViewModel.UiAction.InitData) this.f38048b).f38025a, null, null, false, false, 30);
            default:
                return VerifyCodeViewModel.ViewState.m13749a((VerifyCodeViewModel.ViewState) obj, null, ((VerifyCodeViewModel.UiAction.ChangeCode) this.f38048b).f38023a, null, false, false, 21);
        }
    }
}
