package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.common.util.concurrent.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4582j implements AsyncCallable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListeningExecutorService f42723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f42724b;

    public /* synthetic */ C4582j(ListeningExecutorService listeningExecutorService, Callable callable) {
        this.f42723a = listeningExecutorService;
        this.f42724b = callable;
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public final ListenableFuture call() {
        return Callables.m15080b(this.f42723a, this.f42724b);
    }
}
