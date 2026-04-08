package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.schedulers.NewThreadWorker;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Scheduler {

    /* JADX INFO: renamed from: a */
    public static final long f47536a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: compiled from: Proguard */
    public static final class DisposeTask implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* JADX INFO: renamed from: a */
        public final Runnable f47537a;

        /* JADX INFO: renamed from: b */
        public final Worker f47538b;

        /* JADX INFO: renamed from: c */
        public Thread f47539c;

        public DisposeTask(Runnable runnable, Worker worker) {
            this.f47537a = runnable;
            this.f47538b = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47538b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f47539c == Thread.currentThread()) {
                Worker worker = this.f47538b;
                if (worker instanceof NewThreadWorker) {
                    NewThreadWorker newThreadWorker = (NewThreadWorker) worker;
                    if (newThreadWorker.f49180b) {
                        return;
                    }
                    newThreadWorker.f49180b = true;
                    newThreadWorker.f49179a.shutdown();
                    return;
                }
            }
            this.f47538b.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f47539c = Thread.currentThread();
            try {
                this.f47537a.run();
            } finally {
                dispose();
                this.f47539c = null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PeriodicDirectTask implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* JADX INFO: renamed from: a */
        public volatile boolean f47540a;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47540a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47540a = true;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f47540a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Worker implements Disposable {

        /* JADX INFO: compiled from: Proguard */
        public final class PeriodicTask implements Runnable, SchedulerRunnableIntrospection {

            /* JADX INFO: renamed from: a */
            public long f47541a;

            /* JADX INFO: renamed from: b */
            public long f47542b;

            /* JADX INFO: renamed from: c */
            public long f47543c;

            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: a */
        public long mo17597a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: b */
        public Disposable mo17598b(Runnable runnable) {
            return mo17599c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: c */
        public abstract Disposable mo17599c(Runnable runnable, long j, TimeUnit timeUnit);
    }

    /* JADX INFO: renamed from: a */
    public abstract Worker mo17594a();

    /* JADX INFO: renamed from: b */
    public Disposable mo17595b(Runnable runnable, long j, TimeUnit timeUnit) {
        Worker workerMo17594a = mo17594a();
        DisposeTask disposeTask = new DisposeTask(runnable, workerMo17594a);
        workerMo17594a.mo17599c(disposeTask, j, timeUnit);
        return disposeTask;
    }
}
