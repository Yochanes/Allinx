package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TestScheduler extends Scheduler {

    /* JADX INFO: compiled from: Proguard */
    public final class TestWorker extends Scheduler.Worker {

        /* JADX INFO: renamed from: a */
        public volatile boolean f51299a;

        /* JADX INFO: compiled from: Proguard */
        public final class QueueRemove extends AtomicReference<TimedRunnable> implements Disposable {
            @Override // io.reactivex.rxjava3.disposables.Disposable
            /* JADX INFO: renamed from: d */
            public final boolean mo12353d() {
                return get() == null;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                if (getAndSet(null) != null) {
                    throw null;
                }
            }
        }

        public TestWorker() {
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: a */
        public final long mo17937a(TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            TestScheduler.this.getClass();
            return timeUnit2.convert(0L, TimeUnit.NANOSECONDS);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo17938b(Runnable runnable) {
            if (this.f51299a) {
                return EmptyDisposable.f49382a;
            }
            TestScheduler.this.getClass();
            TestScheduler.this.getClass();
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17922c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f51299a) {
                return EmptyDisposable.f49382a;
            }
            TestScheduler.this.getClass();
            TestScheduler.this.getClass();
            timeUnit.toNanos(j);
            TestScheduler.this.getClass();
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f51299a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f51299a = true;
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

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo17920b() {
        return new TestWorker();
    }
}
