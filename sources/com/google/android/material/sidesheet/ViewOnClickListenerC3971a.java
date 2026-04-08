package com.google.android.material.sidesheet;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3971a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SheetDialog f42496a;

    public /* synthetic */ ViewOnClickListenerC3971a(SheetDialog sheetDialog) {
        this.f42496a = sheetDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SheetDialog.m14714b(this.f42496a, view);
    }
}
