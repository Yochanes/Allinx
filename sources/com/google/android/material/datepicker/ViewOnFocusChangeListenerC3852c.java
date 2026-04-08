package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC3852c implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EditText[] f42465a;

    public /* synthetic */ ViewOnFocusChangeListenerC3852c(EditText[] editTextArr) {
        this.f42465a = editTextArr;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        DateSelector.m14681C(this.f42465a, view, z2);
    }
}
