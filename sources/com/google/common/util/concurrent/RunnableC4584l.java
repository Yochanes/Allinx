package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ExecutionSequencer;

/* JADX INFO: renamed from: com.google.common.util.concurrent.l */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4584l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TrustedListenableFutureTask f42726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SettableFuture f42727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ListenableFuture f42728c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ListenableFuture f42729d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ExecutionSequencer.TaskNonReentrantExecutor f42730f;

    public /* synthetic */ RunnableC4584l(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ExecutionSequencer.TaskNonReentrantExecutor taskNonReentrantExecutor) {
        this.f42726a = trustedListenableFutureTask;
        this.f42727b = settableFuture;
        this.f42728c = listenableFuture;
        this.f42729d = listenableFuture2;
        this.f42730f = taskNonReentrantExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutionSequencer.TaskNonReentrantExecutor taskNonReentrantExecutor = this.f42730f;
        ExecutionSequencer.m15085a(this.f42726a, this.f42727b, this.f42728c, this.f42729d, taskNonReentrantExecutor);
    }
}
