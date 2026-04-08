package com.google.android.material.sidesheet;

import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3973c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SideSheetBehavior.StateSettlingTracker f42501a;

    public /* synthetic */ RunnableC3973c(SideSheetBehavior.StateSettlingTracker stateSettlingTracker) {
        this.f42501a = stateSettlingTracker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SideSheetBehavior.StateSettlingTracker.m14718a(this.f42501a);
    }
}
