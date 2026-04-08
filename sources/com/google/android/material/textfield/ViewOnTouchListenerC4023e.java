package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.textfield.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnTouchListenerC4023e implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DropdownMenuEndIconDelegate f42515a;

    public /* synthetic */ ViewOnTouchListenerC4023e(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.f42515a = dropdownMenuEndIconDelegate;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return DropdownMenuEndIconDelegate.m14742e(this.f42515a, view, motionEvent);
    }
}
