package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TestScheduler extends Scheduler {

    /* JADX INFO: compiled from: Proguard */
    public final class TestWorker extends Scheduler.Worker {

        /* JADX INFO: renamed from: a */
        public volatile boolean f51362a;

        /* JADX INFO: compiled from: Proguard */
        public final class QueueRemove implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public TestWorker() {
        }

        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: a */
        public final long mo17597a(TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            TestScheduler.this.getClass();
            return timeUnit2.convert(0L, TimeUnit.NANOSECONDS);
        }

        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo17598b(Runnable runnable) {
            if (this.f51362a) {
                return EmptyDisposable.f47554a;
            }
            TestScheduler.this.getClass();
            throw null;
        }

        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17599c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f51362a) {
                return EmptyDisposable.f47554a;
            }
            TestScheduler.this.getClass();
            timeUnit.toNanos(j);
            TestScheduler.this.getClass();
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f51362a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f51362a = true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimedRunnable implements Comparable<TimedRunnable> {
        @Override // java.lang.Comparable
        public final int compareTo(TimedRunnable timedRunnable) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: a */
    public final Scheduler.Worker mo17594a() {
        return new TestWorker();
    }
}
