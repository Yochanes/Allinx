package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IoScheduler extends Scheduler {

    /* JADX INFO: renamed from: d */
    public static final RxThreadFactory f51111d;

    /* JADX INFO: renamed from: f */
    public static final RxThreadFactory f51112f;

    /* JADX INFO: renamed from: j */
    public static final ThreadWorker f51115j;

    /* JADX INFO: renamed from: n */
    public static final boolean f51116n;

    /* JADX INFO: renamed from: o */
    public static final CachedWorkerPool f51117o;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f51118c;

    /* JADX INFO: renamed from: i */
    public static final TimeUnit f51114i = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: g */
    public static final long f51113g = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    /* JADX INFO: compiled from: Proguard */
    public static final class CachedWorkerPool implements Runnable {

        /* JADX INFO: renamed from: a */
        public final long f51119a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentLinkedQueue f51120b;

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f51121c;

        /* JADX INFO: renamed from: d */
        public final ScheduledExecutorService f51122d;

        /* JADX INFO: renamed from: f */
        public final ScheduledFuture f51123f;

        /* JADX INFO: renamed from: g */
        public final RxThreadFactory f51124g;

        public CachedWorkerPool(long j, TimeUnit timeUnit, RxThreadFactory rxThreadFactory) {
            CachedWorkerPool cachedWorkerPool;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f51119a = nanos;
            this.f51120b = new ConcurrentLinkedQueue();
            this.f51121c = new CompositeDisposable();
            this.f51124g = rxThreadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, IoScheduler.f51112f);
                cachedWorkerPool = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(cachedWorkerPool, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                cachedWorkerPool = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            cachedWorkerPool.f51122d = scheduledExecutorServiceNewScheduledThreadPool;
            cachedWorkerPool.f51123f = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<ThreadWorker> concurrentLinkedQueue = this.f51120b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (ThreadWorker threadWorker : concurrentLinkedQueue) {
                if (threadWorker.f51129c > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(threadWorker)) {
                    this.f51121c.mo17942a(threadWorker);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EventLoopWorker extends Scheduler.Worker implements Runnable {

        /* JADX INFO: renamed from: b */
        public final CachedWorkerPool f51126b;

        /* JADX INFO: renamed from: c */
        public final ThreadWorker f51127c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f51128d = new AtomicBoolean();

        /* JADX INFO: renamed from: a */
        public final CompositeDisposable f51125a = new CompositeDisposable();

        public EventLoopWorker(CachedWorkerPool cachedWorkerPool) {
            ThreadWorker threadWorker;
            ThreadWorker threadWorker2;
            this.f51126b = cachedWorkerPool;
            if (cachedWorkerPool.f51121c.f49374b) {
                threadWorker2 = IoScheduler.f51115j;
            } else {
                while (true) {
                    if (cachedWorkerPool.f51120b.isEmpty()) {
                        threadWorker = new ThreadWorker(cachedWorkerPool.f51124g);
                        cachedWorkerPool.f51121c.mo17943b(threadWorker);
                        break;
                    } else {
                        threadWorker = (ThreadWorker) cachedWorkerPool.f51120b.poll();
                        if (threadWorker != null) {
                            break;
                        }
                    }
                }
                threadWorker2 = threadWorker;
            }
            this.f51127c = threadWorker2;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17922c(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f51125a.f49374b ? EmptyDisposable.f49382a : this.f51127c.m18203e(runnable, j, timeUnit, this.f51125a);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f51128d.get();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f51128d.compareAndSet(false, true)) {
                this.f51125a.dispose();
                if (IoScheduler.f51116n) {
                    this.f51127c.m18203e(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                CachedWorkerPool cachedWorkerPool = this.f51126b;
                cachedWorkerPool.getClass();
                long jNanoTime = System.nanoTime() + cachedWorkerPool.f51119a;
                ThreadWorker threadWorker = this.f51127c;
                threadWorker.f51129c = jNanoTime;
                cachedWorkerPool.f51120b.offer(threadWorker);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            CachedWorkerPool cachedWorkerPool = this.f51126b;
            cachedWorkerPool.getClass();
            long jNanoTime = System.nanoTime() + cachedWorkerPool.f51119a;
            ThreadWorker threadWorker = this.f51127c;
            threadWorker.f51129c = jNanoTime;
            cachedWorkerPool.f51120b.offer(threadWorker);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ThreadWorker extends NewThreadWorker {

        /* JADX INFO: renamed from: c */
        public long f51129c;

        public ThreadWorker(RxThreadFactory rxThreadFactory) {
            super(rxThreadFactory);
            this.f51129c = 0L;
        }
    }

    static {
        ThreadWorker threadWorker = new ThreadWorker(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f51115j = threadWorker;
        threadWorker.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax, false);
        f51111d = rxThreadFactory;
        f51112f = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax, false);
        f51116n = Boolean.getBoolean("rx3.io-scheduled-release");
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(0L, null, rxThreadFactory);
        f51117o = cachedWorkerPool;
        cachedWorkerPool.f51121c.dispose();
        ScheduledFuture scheduledFuture = cachedWorkerPool.f51123f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool.f51122d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public IoScheduler() {
        AtomicReference atomicReference;
        RxThreadFactory rxThreadFactory = f51111d;
        CachedWorkerPool cachedWorkerPool = f51117o;
        this.f51118c = new AtomicReference(cachedWorkerPool);
        CachedWorkerPool cachedWorkerPool2 = new CachedWorkerPool(f51113g, f51114i, rxThreadFactory);
        do {
            atomicReference = this.f51118c;
            if (atomicReference.compareAndSet(cachedWorkerPool, cachedWorkerPool2)) {
                return;
            }
        } while (atomicReference.get() == cachedWorkerPool);
        cachedWorkerPool2.f51121c.dispose();
        ScheduledFuture scheduledFuture = cachedWorkerPool2.f51123f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool2.f51122d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo17920b() {
        return new EventLoopWorker((CachedWorkerPool) this.f51118c.get());
    }
}
