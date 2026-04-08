package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.textfield.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC4020b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EndIconDelegate f42510b;

    public /* synthetic */ ViewOnFocusChangeListenerC4020b(EndIconDelegate endIconDelegate, int i) {
        this.f42509a = i;
        this.f42510b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f42509a) {
            case 0:
                ClearTextEndIconDelegate.m14734b((ClearTextEndIconDelegate) this.f42510b, view, z2);
                break;
            default:
                DropdownMenuEndIconDelegate.m14741d((DropdownMenuEndIconDelegate) this.f42510b, view, z2);
                break;
        }
    }
}
