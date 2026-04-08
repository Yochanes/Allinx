package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.concurrent.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4622f implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DelegatingScheduledExecutorService f42777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f42778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f42779c;

    public /* synthetic */ CallableC4622f(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, DelegatingScheduledFuture.Completer completer) {
        this.f42777a = delegatingScheduledExecutorService;
        this.f42778b = callable;
        this.f42779c = completer;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return DelegatingScheduledExecutorService.m15130g(this.f42777a, this.f42778b, this.f42779c);
    }
}
