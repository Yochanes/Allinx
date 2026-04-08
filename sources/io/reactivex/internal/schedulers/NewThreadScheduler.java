package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NewThreadScheduler extends Scheduler {

    /* JADX INFO: renamed from: c */
    public static final RxThreadFactory f49177c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: b */
    public final RxThreadFactory f49178b = f49177c;

    @Override // io.reactivex.Scheduler
    /* JADX INFO: renamed from: a */
    public final Scheduler.Worker mo17594a() {
        return new NewThreadWorker(this.f49178b);
    }
}
