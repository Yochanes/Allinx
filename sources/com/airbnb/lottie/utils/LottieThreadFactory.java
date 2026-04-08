package com.airbnb.lottie.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LottieThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f34864d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final ThreadGroup f34865a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f34866b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public final String f34867c;

    public LottieThreadFactory() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f34865a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f34867c = "lottie-" + f34864d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f34865a, runnable, this.f34867c + this.f34866b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
