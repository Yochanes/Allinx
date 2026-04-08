package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleScheduler extends Scheduler {

    /* JADX INFO: renamed from: c */
    public static final RxThreadFactory f49199c;

    /* JADX INFO: renamed from: d */
    public static final ScheduledExecutorService f49200d;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f49201b;

    /* JADX INFO: compiled from: Proguard */
    public static final class ScheduledWorker extends Scheduler.Worker {

        /* JADX INFO: renamed from: a */
        public final ScheduledExecutorService f49202a;

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f49203b = new CompositeDisposable();

        /* JADX INFO: renamed from: c */
        public volatile boolean f49204c;

        public ScheduledWorker(ScheduledExecutorService scheduledExecutorService) {
            this.f49202a = scheduledExecutorService;
        }

        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17599c(Runnable runnable, long j, TimeUnit timeUnit) {
            boolean z2 = this.f49204c;
            EmptyDisposable emptyDisposable = EmptyDisposable.f47554a;
            if (z2) {
                return emptyDisposable;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.f49203b);
            this.f49203b.mo17605b(scheduledRunnable);
            try {
                scheduledRunnable.m17850a(j <= 0 ? this.f49202a.submit((Callable) scheduledRunnable) : this.f49202a.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                RxJavaPlugins.m17911b(e);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49204c;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f49204c) {
                return;
            }
            this.f49204c = true;
            this.f49203b.dispose();
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f49200d = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f49199c = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        AtomicReference atomicReference = new AtomicReference();
        this.f49201b = atomicReference;
        boolean z2 = SchedulerPoolFactory.f49189a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f49199c);
        if (SchedulerPoolFactory.f49189a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            SchedulerPoolFactory.f49192d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: a */
    public final Scheduler.Worker mo17594a() {
        return new ScheduledWorker((ScheduledExecutorService) this.f49201b.get());
    }

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: b */
    public final Disposable mo17595b(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        AtomicReference atomicReference = this.f49201b;
        try {
            scheduledDirectTask.m17847a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(scheduledDirectTask) : ((ScheduledExecutorService) atomicReference.get()).schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.m17911b(e);
            return EmptyDisposable.f47554a;
        }
    }
}
