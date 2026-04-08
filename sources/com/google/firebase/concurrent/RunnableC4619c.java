package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* JADX INFO: renamed from: com.google.firebase.concurrent.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4619c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f42765b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f42766c;

    public /* synthetic */ RunnableC4619c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.f42764a = i;
        this.f42765b = runnable;
        this.f42766c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f42764a) {
            case 0:
                DelegatingScheduledExecutorService.m15131h(this.f42765b, this.f42766c);
                break;
            case 1:
                DelegatingScheduledExecutorService.m15133k(this.f42765b, this.f42766c);
                break;
            default:
                DelegatingScheduledExecutorService.m15128e(this.f42765b, this.f42766c);
                break;
        }
    }
}
