package com.google.android.material.snackbar;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.snackbar.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4000b implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Snackbar f42504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View.OnClickListener f42505b;

    public /* synthetic */ ViewOnClickListenerC4000b(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f42504a = snackbar;
        this.f42505b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Snackbar.m14720a(this.f42504a, this.f42505b, view);
    }
}
