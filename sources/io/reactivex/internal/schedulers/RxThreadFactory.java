package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f49181a;

    /* JADX INFO: renamed from: b */
    public final int f49182b;

    /* JADX INFO: renamed from: c */
    public final boolean f49183c;

    /* JADX INFO: compiled from: Proguard */
    public static final class RxCustomThread extends Thread implements NonBlockingThread {
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f49181a + '-' + incrementAndGet();
        Thread rxCustomThread = this.f49183c ? new RxCustomThread(runnable, str) : new Thread(runnable, str);
        rxCustomThread.setPriority(this.f49182b);
        rxCustomThread.setDaemon(true);
        return rxCustomThread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return AbstractC0000a.m19p(new StringBuilder("RxThreadFactory["), this.f49181a, "]");
    }

    public RxThreadFactory(String str, int i, boolean z2) {
        this.f49181a = str;
        this.f49182b = i;
        this.f49183c = z2;
    }
}
