package com.google.android.material.textfield;

import androidx.core.view.accessibility.AccessibilityManagerCompat;

/* JADX INFO: renamed from: com.google.android.material.textfield.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4025g implements AccessibilityManagerCompat.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DropdownMenuEndIconDelegate f42517a;

    public /* synthetic */ C4025g(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.f42517a = dropdownMenuEndIconDelegate;
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        DropdownMenuEndIconDelegate.m14739b(this.f42517a, z2);
    }
}
