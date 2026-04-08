package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.common.util.concurrent.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC4573a implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Service f42705b;

    public /* synthetic */ ExecutorC4573a(Service service, int i) {
        this.f42704a = i;
        this.f42705b = service;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f42704a) {
            case 0:
                AbstractExecutionThreadService.m15068a((AbstractExecutionThreadService) this.f42705b, runnable);
                break;
            default:
                AbstractIdleService.m15071a((AbstractIdleService) this.f42705b, runnable);
                break;
        }
    }
}
