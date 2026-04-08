package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TrampolineScheduler extends Scheduler {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f49205b = 0;

    /* JADX INFO: compiled from: Proguard */
    public static final class SleepingRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f49206a;

        /* JADX INFO: renamed from: b */
        public final TrampolineWorker f49207b;

        /* JADX INFO: renamed from: c */
        public final long f49208c;

        public SleepingRunnable(Runnable runnable, TrampolineWorker trampolineWorker, long j) {
            this.f49206a = runnable;
            this.f49207b = trampolineWorker;
            this.f49208c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f49207b.f49216d) {
                return;
            }
            long jMo17597a = this.f49207b.mo17597a(TimeUnit.MILLISECONDS);
            long j = this.f49208c;
            if (j > jMo17597a) {
                try {
                    Thread.sleep(j - jMo17597a);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.m17911b(e);
                    return;
                }
            }
            if (this.f49207b.f49216d) {
                return;
            }
            this.f49206a.run();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimedRunnable implements Comparable<TimedRunnable> {

        /* JADX INFO: renamed from: a */
        public final Runnable f49209a;

        /* JADX INFO: renamed from: b */
        public final long f49210b;

        /* JADX INFO: renamed from: c */
        public final int f49211c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f49212d;

        public TimedRunnable(Runnable runnable, Long l, int i) {
            this.f49209a = runnable;
            this.f49210b = l.longValue();
            this.f49211c = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(TimedRunnable timedRunnable) {
            TimedRunnable timedRunnable2 = timedRunnable;
            long j = timedRunnable2.f49210b;
            long j2 = this.f49210b;
            int i = j2 < j ? -1 : j2 > j ? 1 : 0;
            if (i != 0) {
                return i;
            }
            int i2 = this.f49211c;
            int i3 = timedRunnable2.f49211c;
            if (i2 < i3) {
                return -1;
            }
            return i2 > i3 ? 1 : 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TrampolineWorker extends Scheduler.Worker implements Disposable {

        /* JADX INFO: renamed from: a */
        public final PriorityBlockingQueue f49213a = new PriorityBlockingQueue();

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f49214b = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f49215c = new AtomicInteger();

        /* JADX INFO: renamed from: d */
        public volatile boolean f49216d;

        /* JADX INFO: compiled from: Proguard */
        public final class AppendToQueueTask implements Runnable {

            /* JADX INFO: renamed from: a */
            public final TimedRunnable f49217a;

            public AppendToQueueTask(TimedRunnable timedRunnable) {
                this.f49217a = timedRunnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f49217a.f49212d = true;
                TrampolineWorker.this.f49213a.remove(this.f49217a);
            }
        }

        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo17598b(Runnable runnable) {
            return m17851e(runnable, mo17597a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17599c(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + mo17597a(TimeUnit.MILLISECONDS);
            return m17851e(new SleepingRunnable(runnable, this, millis), millis);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49216d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f49216d = true;
        }

        /* JADX INFO: renamed from: e */
        public final Disposable m17851e(Runnable runnable, long j) {
            boolean z2 = this.f49216d;
            EmptyDisposable emptyDisposable = EmptyDisposable.f47554a;
            if (!z2) {
                TimedRunnable timedRunnable = new TimedRunnable(runnable, Long.valueOf(j), this.f49215c.incrementAndGet());
                this.f49213a.add(timedRunnable);
                if (this.f49214b.getAndIncrement() != 0) {
                    return Disposables.m17608a(new AppendToQueueTask(timedRunnable));
                }
                int iAddAndGet = 1;
                while (!this.f49216d) {
                    TimedRunnable timedRunnable2 = (TimedRunnable) this.f49213a.poll();
                    if (timedRunnable2 == null) {
                        iAddAndGet = this.f49214b.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else if (!timedRunnable2.f49212d) {
                        timedRunnable2.f49209a.run();
                    }
                }
                this.f49213a.clear();
                return emptyDisposable;
            }
            return emptyDisposable;
        }
    }

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: a */
    public final Scheduler.Worker mo17594a() {
        return new TrampolineWorker();
    }

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: b */
    public final Disposable mo17595b(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.m17911b(e);
        }
        return EmptyDisposable.f47554a;
    }
}
