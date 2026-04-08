package io.reactivex.internal.schedulers;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public class SchedulerWhen extends Scheduler implements Disposable {

    /* JADX INFO: renamed from: b */
    public static final Disposable f49195b = new SubscribedDisposable();

    /* JADX INFO: compiled from: Proguard */
    public static final class CreateWorkerFunction implements Function<ScheduledAction, Completable> {

        /* JADX INFO: compiled from: Proguard */
        public final class WorkerCompletable extends Completable {

            /* JADX INFO: renamed from: a */
            public final ScheduledAction f49196a;

            public WorkerCompletable(CreateWorkerFunction createWorkerFunction, ScheduledAction scheduledAction) {
                this.f49196a = scheduledAction;
            }

            @Override // io.reactivex.Completable
            /* JADX INFO: renamed from: b */
            public final void mo17579b(CompletableObserver completableObserver) {
                completableObserver.mo17580c(this.f49196a);
                throw null;
            }
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return new WorkerCompletable(this, (ScheduledAction) obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class DelayedAction extends ScheduledAction {

        /* JADX INFO: renamed from: a */
        public final Runnable f49197a;

        public DelayedAction(Runnable runnable, long j, TimeUnit timeUnit) {
            this.f49197a = runnable;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ImmediateAction extends ScheduledAction {

        /* JADX INFO: renamed from: a */
        public final Runnable f49198a;

        public ImmediateAction(Runnable runnable) {
            this.f49198a = runnable;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class OnCompletedAction implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class QueueWorker extends Scheduler.Worker {
        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo17598b(Runnable runnable) {
            new ImmediateAction(runnable);
            throw null;
        }

        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17599c(Runnable runnable, long j, TimeUnit timeUnit) {
            new DelayedAction(runnable, j, timeUnit);
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ScheduledAction extends AtomicReference<Disposable> implements Disposable {
        public ScheduledAction() {
            super(SchedulerWhen.f49195b);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get().mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable;
            Disposable disposable2 = SchedulerWhen.f49195b;
            EmptyDisposable emptyDisposable = EmptyDisposable.f47554a;
            do {
                disposable = get();
                Disposable disposable3 = SchedulerWhen.f49195b;
                if (disposable == emptyDisposable) {
                    return;
                }
            } while (!compareAndSet(disposable, emptyDisposable));
            if (disposable != SchedulerWhen.f49195b) {
                disposable.dispose();
            }
        }
    }

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: a */
    public final Scheduler.Worker mo17594a() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribedDisposable implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
        }
    }
}
