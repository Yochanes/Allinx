package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable, SchedulerRunnableIntrospection {

    /* JADX INFO: renamed from: d */
    public static final FutureTask f51074d;

    /* JADX INFO: renamed from: f */
    public static final FutureTask f51075f;

    /* JADX INFO: renamed from: a */
    public final Runnable f51076a;

    /* JADX INFO: renamed from: b */
    public final boolean f51077b = true;

    /* JADX INFO: renamed from: c */
    public Thread f51078c;

    static {
        Runnable runnable = Functions.f49388b;
        f51074d = new FutureTask(runnable, null);
        f51075f = new FutureTask(runnable, null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.f51076a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final void m18201a(Future future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f51074d) {
                return;
            }
            if (future2 == f51075f) {
                if (this.f51078c == Thread.currentThread()) {
                    future.cancel(false);
                    return;
                } else {
                    future.cancel(this.f51077b);
                    return;
                }
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        Future<?> future = get();
        return future == f51074d || future == f51075f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        FutureTask futureTask;
        Future<?> future = get();
        if (future == f51074d || future == (futureTask = f51075f) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.f51078c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f51077b);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        String str;
        Future<?> future = get();
        if (future == f51074d) {
            str = "Finished";
        } else if (future == f51075f) {
            str = "Disposed";
        } else if (this.f51078c != null) {
            str = "Running on " + this.f51078c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
