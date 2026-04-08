package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Schedulers {

    /* JADX INFO: renamed from: a */
    public static final Scheduler f51356a = RxJavaPlugins.m17910a(new SingleTask());

    /* JADX INFO: renamed from: b */
    public static final Scheduler f51357b = RxJavaPlugins.m17910a(new ComputationTask());

    /* JADX INFO: compiled from: Proguard */
    public static final class ComputationHolder {

        /* JADX INFO: renamed from: a */
        public static final ComputationScheduler f51358a = new ComputationScheduler();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ComputationTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return ComputationHolder.f51358a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IOTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return IoHolder.f51359a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IoHolder {

        /* JADX INFO: renamed from: a */
        public static final IoScheduler f51359a = new IoScheduler();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NewThreadHolder {

        /* JADX INFO: renamed from: a */
        public static final NewThreadScheduler f51360a = new NewThreadScheduler();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NewThreadTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return NewThreadHolder.f51360a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleHolder {

        /* JADX INFO: renamed from: a */
        public static final SingleScheduler f51361a = new SingleScheduler();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return SingleHolder.f51361a;
        }
    }

    static {
        RxJavaPlugins.m17910a(new IOTask());
        int i = TrampolineScheduler.f49205b;
        RxJavaPlugins.m17910a(new NewThreadTask());
    }
}
