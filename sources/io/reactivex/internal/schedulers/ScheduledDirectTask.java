package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask futureTask = AbstractDirectTask.f49125c;
        this.f49128b = Thread.currentThread();
        try {
            this.f49127a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f49128b = null;
        }
    }
}
