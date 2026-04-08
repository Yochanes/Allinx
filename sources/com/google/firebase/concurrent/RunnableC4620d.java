package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* JADX INFO: renamed from: com.google.firebase.concurrent.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4620d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DelegatingScheduledExecutorService f42768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f42769c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f42770d;

    public /* synthetic */ RunnableC4620d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.f42767a = i;
        this.f42768b = delegatingScheduledExecutorService;
        this.f42769c = runnable;
        this.f42770d = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42767a) {
            case 0:
                DelegatingScheduledExecutorService.m15134l(this.f42768b, this.f42769c, this.f42770d);
                break;
            case 1:
                DelegatingScheduledExecutorService.m15129f(this.f42768b, this.f42769c, this.f42770d);
                break;
            default:
                DelegatingScheduledExecutorService.m15132i(this.f42768b, this.f42769c, this.f42770d);
                break;
        }
    }
}
