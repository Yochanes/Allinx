package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
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

    /* JADX INFO: renamed from: c */
    public static final RxThreadFactory f49160c;

    /* JADX INFO: renamed from: d */
    public static final RxThreadFactory f49161d;

    /* JADX INFO: renamed from: f */
    public static final TimeUnit f49162f = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: g */
    public static final ThreadWorker f49163g;

    /* JADX INFO: renamed from: i */
    public static final CachedWorkerPool f49164i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f49165b;

    /* JADX INFO: compiled from: Proguard */
    public static final class CachedWorkerPool implements Runnable {

        /* JADX INFO: renamed from: a */
        public final long f49166a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentLinkedQueue f49167b;

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f49168c;

        /* JADX INFO: renamed from: d */
        public final ScheduledExecutorService f49169d;

        /* JADX INFO: renamed from: f */
        public final ScheduledFuture f49170f;

        /* JADX INFO: renamed from: g */
        public final RxThreadFactory f49171g;

        public CachedWorkerPool(long j, TimeUnit timeUnit, RxThreadFactory rxThreadFactory) {
            CachedWorkerPool cachedWorkerPool;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f49166a = nanos;
            this.f49167b = new ConcurrentLinkedQueue();
            this.f49168c = new CompositeDisposable();
            this.f49171g = rxThreadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, IoScheduler.f49161d);
                cachedWorkerPool = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(cachedWorkerPool, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                cachedWorkerPool = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            cachedWorkerPool.f49169d = scheduledExecutorServiceNewScheduledThreadPool;
            cachedWorkerPool.f49170f = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<ThreadWorker> concurrentLinkedQueue = this.f49167b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (ThreadWorker threadWorker : concurrentLinkedQueue) {
                if (threadWorker.f49176c > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(threadWorker)) {
                    this.f49168c.mo17604a(threadWorker);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EventLoopWorker extends Scheduler.Worker {

        /* JADX INFO: renamed from: b */
        public final CachedWorkerPool f49173b;

        /* JADX INFO: renamed from: c */
        public final ThreadWorker f49174c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f49175d = new AtomicBoolean();

        /* JADX INFO: renamed from: a */
        public final CompositeDisposable f49172a = new CompositeDisposable();

        public EventLoopWorker(CachedWorkerPool cachedWorkerPool) {
            ThreadWorker threadWorker;
            ThreadWorker threadWorker2;
            this.f49173b = cachedWorkerPool;
            if (cachedWorkerPool.f49168c.f47546b) {
                threadWorker2 = IoScheduler.f49163g;
            } else {
                while (true) {
                    if (cachedWorkerPool.f49167b.isEmpty()) {
                        threadWorker = new ThreadWorker(cachedWorkerPool.f49171g);
                        cachedWorkerPool.f49168c.mo17605b(threadWorker);
                        break;
                    } else {
                        threadWorker = (ThreadWorker) cachedWorkerPool.f49167b.poll();
                        if (threadWorker != null) {
                            break;
                        }
                    }
                }
                threadWorker2 = threadWorker;
            }
            this.f49174c = threadWorker2;
        }

        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17599c(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f49172a.f47546b ? EmptyDisposable.f47554a : this.f49174c.m17849e(runnable, j, timeUnit, this.f49172a);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49175d.get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f49175d.compareAndSet(false, true)) {
                this.f49172a.dispose();
                CachedWorkerPool cachedWorkerPool = this.f49173b;
                cachedWorkerPool.getClass();
                long jNanoTime = System.nanoTime() + cachedWorkerPool.f49166a;
                ThreadWorker threadWorker = this.f49174c;
                threadWorker.f49176c = jNanoTime;
                cachedWorkerPool.f49167b.offer(threadWorker);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ThreadWorker extends NewThreadWorker {

        /* JADX INFO: renamed from: c */
        public long f49176c;

        public ThreadWorker(RxThreadFactory rxThreadFactory) {
            super(rxThreadFactory);
            this.f49176c = 0L;
        }
    }

    static {
        ThreadWorker threadWorker = new ThreadWorker(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f49163g = threadWorker;
        threadWorker.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax, false);
        f49160c = rxThreadFactory;
        f49161d = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax, false);
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(0L, null, rxThreadFactory);
        f49164i = cachedWorkerPool;
        cachedWorkerPool.f49168c.dispose();
        ScheduledFuture scheduledFuture = cachedWorkerPool.f49170f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool.f49169d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public IoScheduler() {
        AtomicReference atomicReference;
        RxThreadFactory rxThreadFactory = f49160c;
        CachedWorkerPool cachedWorkerPool = f49164i;
        this.f49165b = new AtomicReference(cachedWorkerPool);
        CachedWorkerPool cachedWorkerPool2 = new CachedWorkerPool(60L, f49162f, rxThreadFactory);
        do {
            atomicReference = this.f49165b;
            if (atomicReference.compareAndSet(cachedWorkerPool, cachedWorkerPool2)) {
                return;
            }
        } while (atomicReference.get() == cachedWorkerPool);
        cachedWorkerPool2.f49168c.dispose();
        ScheduledFuture scheduledFuture = cachedWorkerPool2.f49170f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool2.f49169d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: a */
    public final Scheduler.Worker mo17594a() {
        return new EventLoopWorker((CachedWorkerPool) this.f49165b.get());
    }
}
