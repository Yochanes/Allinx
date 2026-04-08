package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.f51078c = Thread.currentThread();
        try {
            this.f51076a.run();
            this.f51078c = null;
        } catch (Throwable th) {
            dispose();
            this.f51078c = null;
            RxJavaPlugins.m18275b(th);
            throw th;
        }
    }
}
