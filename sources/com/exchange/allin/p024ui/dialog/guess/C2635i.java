package com.exchange.allin.p024ui.dialog.guess;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.guess.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2635i implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36314b;

    public /* synthetic */ C2635i(Object obj, int i) {
        this.f36313a = i;
        this.f36314b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36313a) {
            case 0:
                ((Function0) this.f36314b).invoke();
                break;
            default:
                ((BottomSheetDialog) this.f36314b).dismiss();
                break;
        }
        return Unit.f51459a;
    }
}
