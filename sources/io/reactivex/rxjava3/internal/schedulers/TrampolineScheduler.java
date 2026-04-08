package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TrampolineScheduler extends Scheduler {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f51153c = 0;

    /* JADX INFO: compiled from: Proguard */
    public static final class SleepingRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f51154a;

        /* JADX INFO: renamed from: b */
        public final TrampolineWorker f51155b;

        /* JADX INFO: renamed from: c */
        public final long f51156c;

        public SleepingRunnable(Runnable runnable, TrampolineWorker trampolineWorker, long j) {
            this.f51154a = runnable;
            this.f51155b = trampolineWorker;
            this.f51156c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f51155b.f51164d) {
                return;
            }
            TrampolineWorker trampolineWorker = this.f51155b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            trampolineWorker.getClass();
            long jM17935a = Scheduler.m17935a(timeUnit);
            long j = this.f51156c;
            if (j > jM17935a) {
                try {
                    Thread.sleep(j - jM17935a);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.m18275b(e);
                    return;
                }
            }
            if (this.f51155b.f51164d) {
                return;
            }
            this.f51154a.run();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimedRunnable implements Comparable<TimedRunnable> {

        /* JADX INFO: renamed from: a */
        public final Runnable f51157a;

        /* JADX INFO: renamed from: b */
        public final long f51158b;

        /* JADX INFO: renamed from: c */
        public final int f51159c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f51160d;

        public TimedRunnable(Runnable runnable, Long l, int i) {
            this.f51157a = runnable;
            this.f51158b = l.longValue();
            this.f51159c = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(TimedRunnable timedRunnable) {
            TimedRunnable timedRunnable2 = timedRunnable;
            int iCompare = Long.compare(this.f51158b, timedRunnable2.f51158b);
            return iCompare == 0 ? Integer.compare(this.f51159c, timedRunnable2.f51159c) : iCompare;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TrampolineWorker extends Scheduler.Worker implements Disposable {

        /* JADX INFO: renamed from: a */
        public final PriorityBlockingQueue f51161a = new PriorityBlockingQueue();

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f51162b = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f51163c = new AtomicInteger();

        /* JADX INFO: renamed from: d */
        public volatile boolean f51164d;

        /* JADX INFO: compiled from: Proguard */
        public final class AppendToQueueTask implements Runnable {

            /* JADX INFO: renamed from: a */
            public final TimedRunnable f51165a;

            public AppendToQueueTask(TimedRunnable timedRunnable) {
                this.f51165a = timedRunnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f51165a.f51160d = true;
                TrampolineWorker.this.f51161a.remove(this.f51165a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo17938b(Runnable runnable) {
            return m18205e(runnable, Scheduler.m17935a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17922c(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + Scheduler.m17935a(TimeUnit.MILLISECONDS);
            return m18205e(new SleepingRunnable(runnable, this, millis), millis);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f51164d;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f51164d = true;
        }

        /* JADX INFO: renamed from: e */
        public final Disposable m18205e(Runnable runnable, long j) {
            boolean z2 = this.f51164d;
            EmptyDisposable emptyDisposable = EmptyDisposable.f49382a;
            if (!z2) {
                TimedRunnable timedRunnable = new TimedRunnable(runnable, Long.valueOf(j), this.f51163c.incrementAndGet());
                this.f51161a.add(timedRunnable);
                if (this.f51162b.getAndIncrement() != 0) {
                    return Disposable.m17946k(new AppendToQueueTask(timedRunnable));
                }
                int iAddAndGet = 1;
                while (!this.f51164d) {
                    TimedRunnable timedRunnable2 = (TimedRunnable) this.f51161a.poll();
                    if (timedRunnable2 == null) {
                        iAddAndGet = this.f51162b.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else if (!timedRunnable2.f51160d) {
                        timedRunnable2.f51157a.run();
                    }
                }
                this.f51161a.clear();
                return emptyDisposable;
            }
            return emptyDisposable;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo17920b() {
        return new TrampolineWorker();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: c */
    public final Disposable mo17936c(Runnable runnable) {
        runnable.run();
        return EmptyDisposable.f49382a;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: e */
    public final Disposable mo17921e(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.m18275b(e);
        }
        return EmptyDisposable.f49382a;
    }
}
