package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.f49128b = Thread.currentThread();
        try {
            this.f49127a.run();
            this.f49128b = null;
        } catch (Throwable th) {
            this.f49128b = null;
            lazySet(AbstractDirectTask.f49125c);
            RxJavaPlugins.m17911b(th);
        }
    }
}
