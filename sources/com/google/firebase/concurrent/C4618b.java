package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.concurrent.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4618b implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42759a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DelegatingScheduledExecutorService f42760b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f42761c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TimeUnit f42762d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f42763e;

    public /* synthetic */ C4618b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f42759a = i;
        this.f42760b = delegatingScheduledExecutorService;
        this.f42763e = obj;
        this.f42761c = j;
        this.f42762d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f42759a) {
            case 0:
                return DelegatingScheduledExecutorService.m15135m(this.f42760b, (Runnable) this.f42763e, this.f42761c, this.f42762d, completer);
            default:
                return DelegatingScheduledExecutorService.m15124a(this.f42760b, (Callable) this.f42763e, this.f42761c, this.f42762d, completer);
        }
    }
}
