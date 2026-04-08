package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: com.google.android.material.textfield.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4024f implements AutoCompleteTextView.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DropdownMenuEndIconDelegate f42516a;

    public /* synthetic */ C4024f(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.f42516a = dropdownMenuEndIconDelegate;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        DropdownMenuEndIconDelegate.m14743f(this.f42516a);
    }
}
