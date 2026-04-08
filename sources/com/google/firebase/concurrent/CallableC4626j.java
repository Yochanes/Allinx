package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.concurrent.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4626j implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42784a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f42785b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42786c;

    public /* synthetic */ CallableC4626j(Runnable runnable, Object obj, int i) {
        this.f42784a = i;
        this.f42785b = runnable;
        this.f42786c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f42784a) {
            case 0:
                return LimitedConcurrencyExecutorService.m15145b(this.f42785b, this.f42786c);
            default:
                return PausableExecutorServiceImpl.m15148b(this.f42785b, this.f42786c);
        }
    }
}
