package com.google.firebase.sessions;

import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.FirebaseSessions;

/* JADX INFO: renamed from: com.google.firebase.sessions.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4769a implements FirebaseAppLifecycleListener {
    @Override // com.google.firebase.FirebaseAppLifecycleListener
    public final void onDeleted(String str, FirebaseOptions firebaseOptions) {
        FirebaseSessions.C47591.m15261a(str, firebaseOptions);
    }
}
