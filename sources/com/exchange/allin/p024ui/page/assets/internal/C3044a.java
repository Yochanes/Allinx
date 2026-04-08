package com.exchange.allin.p024ui.page.assets.internal;

import com.exchange.allin.p024ui.page.assets.internal.AssetsInternalWithdrawViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.internal.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3044a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsInternalWithdrawViewModel f38454b;

    public /* synthetic */ C3044a(AssetsInternalWithdrawViewModel assetsInternalWithdrawViewModel, int i) {
        this.f38453a = i;
        this.f38454b = assetsInternalWithdrawViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38453a) {
            case 0:
                this.f38454b.m13792f(new AssetsInternalWithdrawViewModel.UiAction.ChangeAccountType(0));
                break;
            case 1:
                this.f38454b.m13792f(new AssetsInternalWithdrawViewModel.UiAction.ChangeAccountType(1));
                break;
            default:
                this.f38454b.m13792f(new AssetsInternalWithdrawViewModel.UiAction.ChangeAccountType(2));
                break;
        }
        return Unit.f51459a;
    }
}
