package com.exchange.allin.p024ui.page.account.security.google.verify;

import com.exchange.allin.p024ui.page.account.security.google.verify.GoogleAuthVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.google.verify.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2953a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GoogleAuthVerifyViewModel f37819b;

    public /* synthetic */ C2953a(GoogleAuthVerifyViewModel googleAuthVerifyViewModel, int i) {
        this.f37818a = i;
        this.f37819b = googleAuthVerifyViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37818a) {
            case 0:
                this.f37819b.m13727f(GoogleAuthVerifyViewModel.UiAction.SendCode.f37804a);
                break;
            default:
                this.f37819b.m13727f(GoogleAuthVerifyViewModel.UiAction.Submit.f37805a);
                break;
        }
        return Unit.f51459a;
    }
}
