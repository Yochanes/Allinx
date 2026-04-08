package com.google.firebase;

import com.google.firebase.FirebaseApp;

/* JADX INFO: renamed from: com.google.firebase.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4601b implements FirebaseApp.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseApp f42741a;

    public /* synthetic */ C4601b(FirebaseApp firebaseApp) {
        this.f42741a = firebaseApp;
    }

    @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z2) {
        FirebaseApp.m15098a(this.f42741a, z2);
    }
}
