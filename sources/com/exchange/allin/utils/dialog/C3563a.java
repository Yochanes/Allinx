package com.exchange.allin.utils.dialog;

import android.app.AlertDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.utils.dialog.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3563a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41639a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f41640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AlertDialog f41641c;

    public /* synthetic */ C3563a(Function0 function0, AlertDialog alertDialog, int i) {
        this.f41639a = i;
        this.f41640b = function0;
        this.f41641c = alertDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41639a) {
            case 0:
                this.f41640b.invoke();
                this.f41641c.dismiss();
                break;
            default:
                this.f41640b.invoke();
                this.f41641c.dismiss();
                break;
        }
        return Unit.f51459a;
    }
}
