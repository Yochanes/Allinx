package com.google.firebase.messaging;

/* JADX INFO: renamed from: com.google.firebase.messaging.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4744g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42844a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirebaseMessaging f42845b;

    public /* synthetic */ RunnableC4744g(FirebaseMessaging firebaseMessaging, int i) {
        this.f42844a = i;
        this.f42845b = firebaseMessaging;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42844a) {
            case 0:
                FirebaseMessaging.m15232c(this.f42845b);
                break;
            default:
                FirebaseMessaging.m15238i(this.f42845b);
                break;
        }
    }
}
