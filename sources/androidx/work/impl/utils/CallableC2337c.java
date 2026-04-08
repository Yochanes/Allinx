package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: androidx.work.impl.utils.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC2337c implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IdGenerator f33112a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33113b;

    public /* synthetic */ CallableC2337c(IdGenerator idGenerator, int i) {
        this.f33112a = idGenerator;
        this.f33113b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        IdGenerator idGenerator = this.f33112a;
        WorkDatabase workDatabase = idGenerator.f33071a;
        Long lMo12214a = workDatabase.mo12136r().mo12214a("next_job_scheduler_id");
        int i = 0;
        int iLongValue = lMo12214a != null ? (int) lMo12214a.longValue() : 0;
        workDatabase.mo12136r().mo12215b(new Preference("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
        if (iLongValue < 0 || iLongValue > this.f33113b) {
            idGenerator.f33071a.mo12136r().mo12215b(new Preference("next_job_scheduler_id", Long.valueOf(1)));
        } else {
            i = iLongValue;
        }
        return Integer.valueOf(i);
    }
}
