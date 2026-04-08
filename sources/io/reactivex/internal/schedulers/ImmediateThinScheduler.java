package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ImmediateThinScheduler extends Scheduler {

    /* JADX INFO: renamed from: b */
    public static final Scheduler.Worker f49156b = new ImmediateThinWorker();

    /* JADX INFO: renamed from: c */
    public static final Disposable f49157c;

    static {
        Disposable disposableM17608a = Disposables.m17608a(Functions.f47560b);
        f49157c = disposableM17608a;
        disposableM17608a.dispose();
    }

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: a */
    public final Scheduler.Worker mo17594a() {
        return f49156b;
    }

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: b */
    public final Disposable mo17595b(Runnable runnable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ImmediateThinWorker extends Scheduler.Worker {
        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo17598b(Runnable runnable) {
            runnable.run();
            return ImmediateThinScheduler.f49157c;
        }

        @Override // io.reactivex.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17599c(Runnable runnable, long j, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

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
