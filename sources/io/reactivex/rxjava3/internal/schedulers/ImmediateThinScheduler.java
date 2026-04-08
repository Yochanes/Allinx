package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ImmediateThinScheduler extends Scheduler {

    /* JADX INFO: renamed from: c */
    public static final Scheduler.Worker f51107c = new ImmediateThinWorker();

    /* JADX INFO: renamed from: d */
    public static final Disposable f51108d;

    static {
        Disposable disposableM17946k = Disposable.m17946k(Functions.f49388b);
        f51108d = disposableM17946k;
        disposableM17946k.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo17920b() {
        return f51107c;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: c */
    public final Disposable mo17936c(Runnable runnable) {
        runnable.run();
        return f51108d;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: e */
    public final Disposable mo17921e(Runnable runnable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ImmediateThinWorker extends Scheduler.Worker {
        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo17938b(Runnable runnable) {
            runnable.run();
            return ImmediateThinScheduler.f51108d;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17922c(Runnable runnable, long j, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

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
