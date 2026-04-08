package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class NewThreadWorker extends Scheduler.Worker implements Disposable {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f49179a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f49180b;

    public NewThreadWorker(RxThreadFactory rxThreadFactory) {
        boolean z2 = SchedulerPoolFactory.f49189a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, rxThreadFactory);
        if (SchedulerPoolFactory.f49189a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            SchedulerPoolFactory.f49192d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f49179a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // io.reactivex.Scheduler.Worker
    /* JADX INFO: renamed from: b */
    public final Disposable mo17598b(Runnable runnable) {
        return mo17599c(runnable, 0L, null);
    }

    @Override // io.reactivex.Scheduler.Worker
    /* JADX INFO: renamed from: c */
    public final Disposable mo17599c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f49180b ? EmptyDisposable.f47554a : m17849e(runnable, j, timeUnit, null);
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this.f49180b;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f49180b) {
            return;
        }
        this.f49180b = true;
        this.f49179a.shutdownNow();
    }

    /* JADX INFO: renamed from: e */
    public final ScheduledRunnable m17849e(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, disposableContainer);
        if (disposableContainer == null || disposableContainer.mo17605b(scheduledRunnable)) {
            ScheduledExecutorService scheduledExecutorService = this.f49179a;
            try {
                scheduledRunnable.m17850a(j <= 0 ? scheduledExecutorService.submit((Callable) scheduledRunnable) : scheduledExecutorService.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                if (disposableContainer != null) {
                    disposableContainer.mo17604a(scheduledRunnable);
                }
                RxJavaPlugins.m17911b(e);
            }
        }
        return scheduledRunnable;
    }
}
