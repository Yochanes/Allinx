package com.exchange.allin.p024ui.page.assets.internal;

import com.exchange.allin.data.Country;
import com.exchange.allin.p024ui.page.assets.internal.AssetsInternalWithdrawViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.internal.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3045b implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsInternalWithdrawViewModel f38456b;

    public /* synthetic */ C3045b(AssetsInternalWithdrawViewModel assetsInternalWithdrawViewModel, int i) {
        this.f38455a = i;
        this.f38456b = assetsInternalWithdrawViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38455a) {
            case 0:
                String it = (String) obj;
                Intrinsics.m18599g(it, "it");
                this.f38456b.m13792f(new AssetsInternalWithdrawViewModel.UiAction.ChangeAccount(it));
                break;
            default:
                Country it2 = (Country) obj;
                Intrinsics.m18599g(it2, "it");
                this.f38456b.m13792f(new AssetsInternalWithdrawViewModel.UiAction.ChangeCountry(it2));
                break;
        }
        return Unit.f51459a;
    }
}
