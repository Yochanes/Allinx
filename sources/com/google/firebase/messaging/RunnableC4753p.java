package com.google.firebase.messaging;

import com.google.firebase.messaging.WithinAppServiceConnection;

/* JADX INFO: renamed from: com.google.firebase.messaging.p */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4753p implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42863b;

    public /* synthetic */ RunnableC4753p(Object obj, int i) {
        this.f42862a = i;
        this.f42863b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42862a) {
            case 0:
                SharedPreferencesQueue.m15252a((SharedPreferencesQueue) this.f42863b);
                break;
            default:
                WithinAppServiceConnection.BindRequest.m15257b((WithinAppServiceConnection.BindRequest) this.f42863b);
                break;
        }
    }
}
