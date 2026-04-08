package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.DefaultRunnableScheduler;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class WorkTimer {

    /* JADX INFO: renamed from: e */
    public static final String f33103e = Logger.m12101g("WorkTimer");

    /* JADX INFO: renamed from: a */
    public final DefaultRunnableScheduler f33104a;

    /* JADX INFO: renamed from: b */
    public final HashMap f33105b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f33106c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Object f33107d = new Object();

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public interface TimeLimitExceededListener {
        /* JADX INFO: renamed from: a */
        void mo12168a(WorkGenerationalId workGenerationalId);
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class WorkTimerRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WorkTimer f33108a;

        /* JADX INFO: renamed from: b */
        public final WorkGenerationalId f33109b;

        public WorkTimerRunnable(WorkTimer workTimer, WorkGenerationalId workGenerationalId) {
            this.f33108a = workTimer;
            this.f33109b = workGenerationalId;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f33108a.f33107d) {
                try {
                    if (((WorkTimerRunnable) this.f33108a.f33105b.remove(this.f33109b)) != null) {
                        TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.f33108a.f33106c.remove(this.f33109b);
                        if (timeLimitExceededListener != null) {
                            timeLimitExceededListener.mo12168a(this.f33109b);
                        }
                    } else {
                        Logger.m12100e().mo12102a("WrkTimerRunnable", "Timer with " + this.f33109b + " is already marked as complete.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public WorkTimer(DefaultRunnableScheduler defaultRunnableScheduler) {
        this.f33104a = defaultRunnableScheduler;
    }

    /* JADX INFO: renamed from: a */
    public final void m12289a(WorkGenerationalId workGenerationalId) {
        synchronized (this.f33107d) {
            try {
                if (((WorkTimerRunnable) this.f33105b.remove(workGenerationalId)) != null) {
                    Logger.m12100e().mo12102a(f33103e, "Stopping timer for " + workGenerationalId);
                    this.f33106c.remove(workGenerationalId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
