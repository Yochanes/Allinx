package com.exchange.allin.p024ui.dialog.trades.futures;

import com.exchange.allin.p024ui.page.futures.C3178h;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.futures.n */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2732n implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3178h f36587b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BottomSheetDialog f36588c;

    public /* synthetic */ C2732n(C3178h c3178h, BottomSheetDialog bottomSheetDialog, int i) {
        this.f36586a = i;
        this.f36587b = c3178h;
        this.f36588c = bottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36586a) {
            case 0:
                this.f36587b.invoke(1);
                this.f36588c.dismiss();
                break;
            case 1:
                this.f36587b.invoke(2);
                this.f36588c.dismiss();
                break;
            default:
                this.f36587b.invoke(3);
                this.f36588c.dismiss();
                break;
        }
        return Unit.f51459a;
    }
}
