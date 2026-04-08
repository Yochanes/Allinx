package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.concurrent.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4625i implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f42783b;

    public /* synthetic */ CallableC4625i(Runnable runnable, int i) {
        this.f42782a = i;
        this.f42783b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f42782a) {
            case 0:
                return LimitedConcurrencyExecutorService.m15146c(this.f42783b);
            default:
                return PausableExecutorServiceImpl.m15147a(this.f42783b);
        }
    }
}
