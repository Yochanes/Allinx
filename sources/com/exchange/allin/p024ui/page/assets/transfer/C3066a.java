package com.exchange.allin.p024ui.page.assets.transfer;

import com.exchange.allin.p024ui.page.assets.transfer.AssetsTransferViewModel;
import com.exchange.allin.utils.ext.StringExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.transfer.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3066a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AssetsTransferViewModel f38581b;

    public /* synthetic */ C3066a(AssetsTransferViewModel assetsTransferViewModel, int i) {
        this.f38580a = i;
        this.f38581b = assetsTransferViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f38580a) {
            case 0:
                Intrinsics.m18596d(it);
                this.f38581b.m13802f(new AssetsTransferViewModel.UiAction.ChangeCoinName(it));
                break;
            case 1:
                Intrinsics.m18599g(it, "it");
                if (StringExtKt.m14221j(it, false) || it.length() == 0) {
                    this.f38581b.m13802f(new AssetsTransferViewModel.UiAction.ChangeAmount(it));
                }
                break;
            case 2:
                Intrinsics.m18599g(it, "it");
                this.f38581b.m13802f(new AssetsTransferViewModel.UiAction.ChangeTransferType(it));
                break;
            default:
                Intrinsics.m18599g(it, "it");
                this.f38581b.m13802f(new AssetsTransferViewModel.UiAction.ChangeTransferType(it));
                break;
        }
        return Unit.f51459a;
    }
}
