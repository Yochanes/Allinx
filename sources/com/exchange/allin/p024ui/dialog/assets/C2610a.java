package com.exchange.allin.p024ui.dialog.assets;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.assets.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2610a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f36214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BottomSheetDialog f36215c;

    public /* synthetic */ C2610a(Function0 function0, BottomSheetDialog bottomSheetDialog, int i) {
        this.f36213a = i;
        this.f36214b = function0;
        this.f36215c = bottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36213a) {
            case 0:
                this.f36214b.invoke();
                this.f36215c.dismiss();
                break;
            case 1:
                this.f36214b.invoke();
                this.f36215c.dismiss();
                break;
            case 2:
                this.f36214b.invoke();
                this.f36215c.dismiss();
                break;
            default:
                this.f36214b.invoke();
                this.f36215c.dismiss();
                break;
        }
        return Unit.f51459a;
    }
}
