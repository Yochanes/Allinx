package com.exchange.allin.p024ui.page.account.register;

import com.exchange.allin.p024ui.page.account.register.RegisterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.register.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2928b implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RegisterViewModel f37682b;

    public /* synthetic */ C2928b(RegisterViewModel registerViewModel, int i) {
        this.f37681a = i;
        this.f37682b = registerViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37681a) {
            case 0:
                this.f37682b.m13694f(RegisterViewModel.UiAction.ToggleHidePassword.f37659a);
                break;
            default:
                this.f37682b.m13694f(RegisterViewModel.UiAction.ToggleHidePassword.f37659a);
                break;
        }
        return Unit.f51459a;
    }
}
