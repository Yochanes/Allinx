package com.exchange.allin.p024ui.page.assets.bill;

import com.exchange.allin.p024ui.page.assets.bill.AssetsBillViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.bill.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3019d implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsBillViewModel f38283b;

    public /* synthetic */ C3019d(AssetsBillViewModel assetsBillViewModel, int i) {
        this.f38282a = i;
        this.f38283b = assetsBillViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f38282a) {
            case 0:
                Intrinsics.m18599g(it, "it");
                this.f38283b.m13763f(new AssetsBillViewModel.UiAction.ChangeDate(it));
                break;
            case 1:
                Intrinsics.m18599g(it, "it");
                this.f38283b.m13763f(new AssetsBillViewModel.UiAction.ChangeDate(it));
                break;
            case 2:
                Intrinsics.m18599g(it, "it");
                this.f38283b.m13763f(new AssetsBillViewModel.UiAction.ChangeDate(it));
                break;
            case 3:
                Intrinsics.m18599g(it, "it");
                this.f38283b.m13763f(new AssetsBillViewModel.UiAction.ChangeCoin(it));
                break;
            case 4:
                Intrinsics.m18599g(it, "it");
                this.f38283b.m13763f(new AssetsBillViewModel.UiAction.ChangeCoin(it));
                break;
            case 5:
                Intrinsics.m18599g(it, "it");
                this.f38283b.m13763f(new AssetsBillViewModel.UiAction.ChangeCoin(it));
                break;
            case 6:
                Intrinsics.m18599g(it, "it");
                this.f38283b.m13763f(new AssetsBillViewModel.UiAction.ChangeDate(it));
                break;
            case 7:
                Intrinsics.m18599g(it, "it");
                this.f38283b.m13763f(new AssetsBillViewModel.UiAction.ChangeDate(it));
                break;
            default:
                Intrinsics.m18599g(it, "it");
                this.f38283b.m13763f(new AssetsBillViewModel.UiAction.ChangeDate(it));
                break;
        }
        return Unit.f51459a;
    }
}
