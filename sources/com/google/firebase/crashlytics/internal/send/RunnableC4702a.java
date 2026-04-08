package com.google.firebase.crashlytics.internal.send;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.send.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4702a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReportQueue f42808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CountDownLatch f42809b;

    public /* synthetic */ RunnableC4702a(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        this.f42808a = reportQueue;
        this.f42809b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReportQueue.m15203b(this.f42808a, this.f42809b);
    }
}
