package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.concurrent.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4621e implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DelegatingScheduledExecutorService f42772b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f42773c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f42774d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f42775e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TimeUnit f42776f;

    public /* synthetic */ C4621e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f42771a = i;
        this.f42772b = delegatingScheduledExecutorService;
        this.f42773c = runnable;
        this.f42774d = j;
        this.f42775e = j2;
        this.f42776f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f42771a) {
            case 0:
                return DelegatingScheduledExecutorService.m15126c(this.f42772b, this.f42773c, this.f42774d, this.f42775e, this.f42776f, completer);
            default:
                return DelegatingScheduledExecutorService.m15125b(this.f42772b, this.f42773c, this.f42774d, this.f42775e, this.f42776f, completer);
        }
    }
}
