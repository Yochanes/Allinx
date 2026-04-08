package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask futureTask = AbstractDirectTask.f51074d;
        this.f51078c = Thread.currentThread();
        try {
            try {
                this.f51076a.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.f51078c = null;
            }
        } catch (Throwable th) {
            RxJavaPlugins.m18275b(th);
            throw th;
        }
    }
}
