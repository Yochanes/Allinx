package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SchedulerWhen extends Scheduler implements Disposable {

    /* JADX INFO: renamed from: c */
    public static final Disposable f51143c = new SubscribedDisposable();

    /* JADX INFO: compiled from: Proguard */
    public static final class CreateWorkerFunction implements Function<ScheduledAction, Completable> {

        /* JADX INFO: compiled from: Proguard */
        public final class WorkerCompletable extends Completable {

            /* JADX INFO: renamed from: a */
            public final ScheduledAction f51144a;

            public WorkerCompletable(CreateWorkerFunction createWorkerFunction, ScheduledAction scheduledAction) {
                this.f51144a = scheduledAction;
            }

            @Override // io.reactivex.rxjava3.core.Completable
            /* JADX INFO: renamed from: b */
            public final void mo12357b(CompletableObserver completableObserver) {
                completableObserver.mo12363c(this.f51144a);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return new WorkerCompletable(this, (ScheduledAction) obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class DelayedAction extends ScheduledAction {

        /* JADX INFO: renamed from: a */
        public final Runnable f51145a;

        public DelayedAction(Runnable runnable, long j, TimeUnit timeUnit) {
            this.f51145a = runnable;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ImmediateAction extends ScheduledAction {

        /* JADX INFO: renamed from: a */
        public final Runnable f51146a;

        public ImmediateAction(Runnable runnable) {
            this.f51146a = runnable;
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
        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo17938b(Runnable runnable) {
            new ImmediateAction(runnable);
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17922c(Runnable runnable, long j, TimeUnit timeUnit) {
            new DelayedAction(runnable, j, timeUnit);
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ScheduledAction extends AtomicReference<Disposable> implements Disposable {
        public ScheduledAction() {
            super(SchedulerWhen.f51143c);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get().mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            Disposable disposable = SchedulerWhen.f51143c;
            getAndSet(EmptyDisposable.f49382a).dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo17920b() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribedDisposable implements Disposable {
        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return false;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
        }
    }
}
