package com.exchange.allin.p024ui.page.account.security.verify;

import com.exchange.allin.p024ui.page.account.security.verify.SecurityVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.verify.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2973b implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SecurityVerifyViewModel f38005b;

    public /* synthetic */ C2973b(SecurityVerifyViewModel securityVerifyViewModel, int i) {
        this.f38004a = i;
        this.f38005b = securityVerifyViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38004a) {
            case 0:
                this.f38005b.m13744f(SecurityVerifyViewModel.UiAction.Submit.f37979a);
                break;
            case 1:
                this.f38005b.m13744f(SecurityVerifyViewModel.UiAction.GetCurCode.f37976a);
                break;
            case 2:
                this.f38005b.m13744f(SecurityVerifyViewModel.UiAction.GetCurCode.f37976a);
                break;
            case 3:
                this.f38005b.m13744f(SecurityVerifyViewModel.UiAction.GetCurCode.f37976a);
                break;
            case 4:
                this.f38005b.m13744f(SecurityVerifyViewModel.UiAction.GetCurCode.f37976a);
                break;
            case 5:
                this.f38005b.m13744f(SecurityVerifyViewModel.UiAction.GetNewCode.f37977a);
                break;
            default:
                this.f38005b.m13744f(SecurityVerifyViewModel.UiAction.GetCurCode.f37976a);
                break;
        }
        return Unit.f51459a;
    }
}
