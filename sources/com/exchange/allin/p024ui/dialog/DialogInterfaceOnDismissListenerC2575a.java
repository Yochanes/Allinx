package com.exchange.allin.p024ui.dialog;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC2575a implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f36128a;

    public /* synthetic */ DialogInterfaceOnDismissListenerC2575a(Function0 function0) {
        this.f36128a = function0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = IModalBottomSheetMenuDialog.f36123a;
        this.f36128a.invoke();
    }
}
