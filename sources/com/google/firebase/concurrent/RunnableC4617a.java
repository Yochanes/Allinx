package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.concurrent.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4617a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42756a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42757b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42758c;

    public /* synthetic */ RunnableC4617a(int i, Object obj, Object obj2) {
        this.f42756a = i;
        this.f42757b = obj;
        this.f42758c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42756a) {
            case 0:
                CustomThreadFactory.m15123a((CustomThreadFactory) this.f42757b, (Runnable) this.f42758c);
                break;
            case 1:
                DelegatingScheduledExecutorService.m15127d((Callable) this.f42757b, (DelegatingScheduledFuture.Completer) this.f42758c);
                break;
            default:
                LimitedConcurrencyExecutor.m15144a((LimitedConcurrencyExecutor) this.f42757b, (Runnable) this.f42758c);
                break;
        }
    }
}
