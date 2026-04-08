package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NewThreadScheduler extends Scheduler {

    /* JADX INFO: renamed from: d */
    public static final RxThreadFactory f51130d = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: c */
    public final RxThreadFactory f51131c = f51130d;

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo17920b() {
        return new NewThreadWorker(this.f51131c);
    }
}
