package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class NewThreadWorker extends Scheduler.Worker implements Disposable {

    /* JADX INFO: renamed from: a */
    public final ScheduledThreadPoolExecutor f51132a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f51133b;

    public NewThreadWorker(RxThreadFactory rxThreadFactory) {
        boolean z2 = SchedulerPoolFactory.f51142a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, rxThreadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(SchedulerPoolFactory.f51142a);
        this.f51132a = scheduledThreadPoolExecutor;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler.Worker
    /* JADX INFO: renamed from: b */
    public final Disposable mo17938b(Runnable runnable) {
        return mo17922c(runnable, 0L, null);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler.Worker
    /* JADX INFO: renamed from: c */
    public final Disposable mo17922c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f51133b ? EmptyDisposable.f49382a : m18203e(runnable, j, timeUnit, null);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f51133b;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f51133b) {
            return;
        }
        this.f51133b = true;
        this.f51132a.shutdownNow();
    }

    /* JADX INFO: renamed from: e */
    public final ScheduledRunnable m18203e(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, disposableContainer);
        if (disposableContainer == null || disposableContainer.mo17943b(scheduledRunnable)) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f51132a;
            try {
                scheduledRunnable.m18204a(j <= 0 ? scheduledThreadPoolExecutor.submit((Callable) scheduledRunnable) : scheduledThreadPoolExecutor.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                if (disposableContainer != null) {
                    disposableContainer.mo17942a(scheduledRunnable);
                }
                RxJavaPlugins.m18275b(e);
            }
        }
        return scheduledRunnable;
    }
}
