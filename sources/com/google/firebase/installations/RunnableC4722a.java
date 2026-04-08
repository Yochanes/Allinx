package com.google.firebase.installations;

/* JADX INFO: renamed from: com.google.firebase.installations.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4722a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirebaseInstallations f42822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f42823c;

    public /* synthetic */ RunnableC4722a(FirebaseInstallations firebaseInstallations, boolean z2, int i) {
        this.f42821a = i;
        this.f42822b = firebaseInstallations;
        this.f42823c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42821a) {
            case 0:
                FirebaseInstallations.m15219c(this.f42822b, this.f42823c);
                break;
            default:
                FirebaseInstallations.m15218b(this.f42822b, this.f42823c);
                break;
        }
    }
}
