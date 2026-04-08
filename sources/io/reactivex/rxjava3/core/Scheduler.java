package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.schedulers.NewThreadWorker;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Scheduler {

    /* JADX INFO: renamed from: a */
    public static final boolean f49364a = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b */
    public static final long f49365b;

    /* JADX INFO: compiled from: Proguard */
    public static final class DisposeTask implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* JADX INFO: renamed from: a */
        public final Runnable f49366a;

        /* JADX INFO: renamed from: b */
        public final Worker f49367b;

        /* JADX INFO: renamed from: c */
        public Thread f49368c;

        public DisposeTask(Runnable runnable, Worker worker) {
            this.f49366a = runnable;
            this.f49367b = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49367b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f49368c == Thread.currentThread()) {
                Worker worker = this.f49367b;
                if (worker instanceof NewThreadWorker) {
                    NewThreadWorker newThreadWorker = (NewThreadWorker) worker;
                    if (newThreadWorker.f51133b) {
                        return;
                    }
                    newThreadWorker.f51133b = true;
                    newThreadWorker.f51132a.shutdown();
                    return;
                }
            }
            this.f49367b.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f49368c = Thread.currentThread();
            try {
                this.f49366a.run();
            } finally {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PeriodicDirectTask implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* JADX INFO: renamed from: a */
        public volatile boolean f49369a;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49369a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49369a = true;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f49369a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                dispose();
                RxJavaPlugins.m18275b(th);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Worker implements Disposable {

        /* JADX INFO: compiled from: Proguard */
        public final class PeriodicTask implements Runnable, SchedulerRunnableIntrospection {

            /* JADX INFO: renamed from: a */
            public long f49370a;

            /* JADX INFO: renamed from: b */
            public long f49371b;

            /* JADX INFO: renamed from: c */
            public long f49372c;

            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: a */
        public long mo17937a(TimeUnit timeUnit) {
            return Scheduler.m17935a(TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: b */
        public Disposable mo17938b(Runnable runnable) {
            return mo17922c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: c */
        public abstract Disposable mo17922c(Runnable runnable, long j, TimeUnit timeUnit);
    }

    static {
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        f49365b = "seconds".equalsIgnoreCase(property) ? TimeUnit.SECONDS.toNanos(jLongValue) : "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
    }

    /* JADX INFO: renamed from: a */
    public static long m17935a(TimeUnit timeUnit) {
        return !f49364a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: b */
    public abstract Worker mo17920b();

    /* JADX INFO: renamed from: c */
    public Disposable mo17936c(Runnable runnable) {
        return mo17921e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: e */
    public Disposable mo17921e(Runnable runnable, long j, TimeUnit timeUnit) {
        Worker workerMo17920b = mo17920b();
        DisposeTask disposeTask = new DisposeTask(runnable, workerMo17920b);
        workerMo17920b.mo17922c(disposeTask, j, timeUnit);
        return disposeTask;
    }
}
