package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable, SchedulerRunnableIntrospection {

    /* JADX INFO: renamed from: c */
    public static final FutureTask f49125c;

    /* JADX INFO: renamed from: d */
    public static final FutureTask f49126d;

    /* JADX INFO: renamed from: a */
    public final Runnable f49127a;

    /* JADX INFO: renamed from: b */
    public Thread f49128b;

    static {
        Runnable runnable = Functions.f47560b;
        f49125c = new FutureTask(runnable, null);
        f49126d = new FutureTask(runnable, null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.f49127a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final void m17847a(Future future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f49125c) {
                return;
            }
            if (future2 == f49126d) {
                future.cancel(this.f49128b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        Future<?> future = get();
        return future == f49125c || future == f49126d;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        FutureTask futureTask;
        Future<?> future = get();
        if (future == f49125c || future == (futureTask = f49126d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f49128b != Thread.currentThread());
    }
}
