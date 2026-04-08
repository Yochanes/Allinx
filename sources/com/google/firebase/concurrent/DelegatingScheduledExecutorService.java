package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class DelegatingScheduledExecutorService implements ScheduledExecutorService {
    private final ExecutorService delegate;
    private final ScheduledExecutorService scheduler;

    public DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.delegate = executorService;
        this.scheduler = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ScheduledFuture m15124a(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, long j, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.lambda$schedule$5(callable, j, timeUnit, completer);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ScheduledFuture m15125b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$11(runnable, j, j2, timeUnit, completer);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ScheduledFuture m15126c(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.lambda$scheduleAtFixedRate$8(runnable, j, j2, timeUnit, completer);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m15127d(Callable callable, DelegatingScheduledFuture.Completer completer) {
        lambda$schedule$3(callable, completer);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15128e(Runnable runnable, DelegatingScheduledFuture.Completer completer) throws Exception {
        lambda$scheduleAtFixedRate$6(runnable, completer);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15129f(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        delegatingScheduledExecutorService.lambda$scheduleAtFixedRate$7(runnable, completer);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Future m15130g(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.lambda$schedule$4(callable, completer);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m15131h(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        lambda$scheduleWithFixedDelay$9(runnable, completer);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15132i(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        delegatingScheduledExecutorService.lambda$schedule$1(runnable, completer);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m15133k(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        lambda$schedule$0(runnable, completer);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m15134l(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        delegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$10(runnable, completer);
    }

    private static /* synthetic */ void lambda$schedule$0(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    private /* synthetic */ void lambda$schedule$1(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new RunnableC4619c(runnable, completer, 1));
    }

    private /* synthetic */ ScheduledFuture lambda$schedule$2(Runnable runnable, long j, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new RunnableC4620d(this, runnable, completer, 2), j, timeUnit);
    }

    private static /* synthetic */ void lambda$schedule$3(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    private /* synthetic */ Future lambda$schedule$4(Callable callable, DelegatingScheduledFuture.Completer completer) {
        return this.delegate.submit(new RunnableC4617a(1, callable, completer));
    }

    private /* synthetic */ ScheduledFuture lambda$schedule$5(Callable callable, long j, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new CallableC4622f(this, callable, completer), j, timeUnit);
    }

    private static /* synthetic */ void lambda$scheduleAtFixedRate$6(Runnable runnable, DelegatingScheduledFuture.Completer completer) throws Exception {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
            throw e;
        }
    }

    private /* synthetic */ void lambda$scheduleAtFixedRate$7(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new RunnableC4619c(runnable, completer, 2));
    }

    private /* synthetic */ ScheduledFuture lambda$scheduleAtFixedRate$8(Runnable runnable, long j, long j2, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleAtFixedRate(new RunnableC4620d(this, runnable, completer, 1), j, j2, timeUnit);
    }

    private /* synthetic */ void lambda$scheduleWithFixedDelay$10(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new RunnableC4619c(runnable, completer, 0));
    }

    private /* synthetic */ ScheduledFuture lambda$scheduleWithFixedDelay$11(Runnable runnable, long j, long j2, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleWithFixedDelay(new RunnableC4620d(this, runnable, completer, 0), j, j2, timeUnit);
    }

    private static /* synthetic */ void lambda$scheduleWithFixedDelay$9(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ScheduledFuture m15135m(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.lambda$schedule$2(runnable, j, timeUnit, completer);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new C4618b(this, runnable, j, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new C4621e(this, runnable, j, j2, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new C4621e(this, runnable, j, j2, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.delegate.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.delegate.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new C4618b(this, callable, j, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.delegate.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.delegate.submit(runnable);
    }
}
