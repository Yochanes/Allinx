package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobImpl;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class DelayMetCommandHandler implements OnConstraintsStateChangedListener, WorkTimer.TimeLimitExceededListener {

    /* JADX INFO: renamed from: t */
    public static final String f32837t = Logger.m12101g("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a */
    public final Context f32838a;

    /* JADX INFO: renamed from: b */
    public final int f32839b;

    /* JADX INFO: renamed from: c */
    public final WorkGenerationalId f32840c;

    /* JADX INFO: renamed from: d */
    public final SystemAlarmDispatcher f32841d;

    /* JADX INFO: renamed from: f */
    public final WorkConstraintsTracker f32842f;

    /* JADX INFO: renamed from: g */
    public final Object f32843g;

    /* JADX INFO: renamed from: i */
    public int f32844i;

    /* JADX INFO: renamed from: j */
    public final SerialExecutor f32845j;

    /* JADX INFO: renamed from: n */
    public final Executor f32846n;

    /* JADX INFO: renamed from: o */
    public PowerManager.WakeLock f32847o;

    /* JADX INFO: renamed from: p */
    public boolean f32848p;

    /* JADX INFO: renamed from: q */
    public final StartStopToken f32849q;

    /* JADX INFO: renamed from: r */
    public final CoroutineDispatcher f32850r;

    /* JADX INFO: renamed from: s */
    public volatile JobImpl f32851s;

    public DelayMetCommandHandler(Context context, int i, SystemAlarmDispatcher systemAlarmDispatcher, StartStopToken startStopToken) {
        this.f32838a = context;
        this.f32839b = i;
        this.f32841d = systemAlarmDispatcher;
        this.f32840c = startStopToken.f32691a;
        this.f32849q = startStopToken;
        Trackers trackers = systemAlarmDispatcher.f32858f.f32737j;
        TaskExecutor taskExecutor = systemAlarmDispatcher.f32855b;
        this.f32845j = taskExecutor.mo12331c();
        this.f32846n = taskExecutor.mo12330b();
        this.f32850r = taskExecutor.mo12329a();
        this.f32842f = new WorkConstraintsTracker(trackers);
        this.f32848p = false;
        this.f32844i = 0;
        this.f32843g = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m12166b(DelayMetCommandHandler delayMetCommandHandler) {
        WorkGenerationalId workGenerationalId = delayMetCommandHandler.f32840c;
        String str = workGenerationalId.f33000a;
        int i = delayMetCommandHandler.f32844i;
        String str2 = f32837t;
        if (i >= 2) {
            Logger.m12100e().mo12102a(str2, "Already stopped work for " + str);
            return;
        }
        delayMetCommandHandler.f32844i = 2;
        Logger.m12100e().mo12102a(str2, "Stopping work for WorkSpec " + str);
        String str3 = CommandHandler.f32821g;
        Context context = delayMetCommandHandler.f32838a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        CommandHandler.m12164d(intent, workGenerationalId);
        SystemAlarmDispatcher systemAlarmDispatcher = delayMetCommandHandler.f32841d;
        int i2 = delayMetCommandHandler.f32839b;
        SystemAlarmDispatcher.AddRunnable addRunnable = new SystemAlarmDispatcher.AddRunnable(i2, intent, systemAlarmDispatcher);
        Executor executor = delayMetCommandHandler.f32846n;
        executor.execute(addRunnable);
        if (!systemAlarmDispatcher.f32857d.m12121e(workGenerationalId.f33000a)) {
            Logger.m12100e().mo12102a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        Logger.m12100e().mo12102a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        CommandHandler.m12164d(intent2, workGenerationalId);
        executor.execute(new SystemAlarmDispatcher.AddRunnable(i2, intent2, systemAlarmDispatcher));
    }

    /* JADX INFO: renamed from: c */
    public static void m12167c(DelayMetCommandHandler delayMetCommandHandler) {
        if (delayMetCommandHandler.f32844i != 0) {
            Logger.m12100e().mo12102a(f32837t, "Already started work for " + delayMetCommandHandler.f32840c);
            return;
        }
        delayMetCommandHandler.f32844i = 1;
        Logger.m12100e().mo12102a(f32837t, "onAllConstraintsMet for " + delayMetCommandHandler.f32840c);
        if (!delayMetCommandHandler.f32841d.f32857d.m12123g(delayMetCommandHandler.f32849q, null)) {
            delayMetCommandHandler.m12169e();
            return;
        }
        WorkTimer workTimer = delayMetCommandHandler.f32841d.f32856c;
        WorkGenerationalId workGenerationalId = delayMetCommandHandler.f32840c;
        synchronized (workTimer.f33107d) {
            Logger.m12100e().mo12102a(WorkTimer.f33103e, "Starting timer for " + workGenerationalId);
            workTimer.m12289a(workGenerationalId);
            WorkTimer.WorkTimerRunnable workTimerRunnable = new WorkTimer.WorkTimerRunnable(workTimer, workGenerationalId);
            workTimer.f33105b.put(workGenerationalId, workTimerRunnable);
            workTimer.f33106c.put(workGenerationalId, delayMetCommandHandler);
            workTimer.f33104a.m12115b(workTimerRunnable, 600000L);
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    /* JADX INFO: renamed from: a */
    public final void mo12168a(WorkGenerationalId workGenerationalId) {
        Logger.m12100e().mo12102a(f32837t, "Exceeded time limits on execution for " + workGenerationalId);
        this.f32845j.execute(new RunnableC2282a(this, 0));
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    /* JADX INFO: renamed from: d */
    public final void mo12158d(WorkSpec workSpec, ConstraintsState constraintsState) {
        boolean z2 = constraintsState instanceof ConstraintsState.ConstraintsMet;
        SerialExecutor serialExecutor = this.f32845j;
        if (z2) {
            serialExecutor.execute(new RunnableC2282a(this, 1));
        } else {
            serialExecutor.execute(new RunnableC2282a(this, 0));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12169e() {
        synchronized (this.f32843g) {
            try {
                if (this.f32851s != null) {
                    this.f32851s.mo17054i(null);
                }
                this.f32841d.f32856c.m12289a(this.f32840c);
                PowerManager.WakeLock wakeLock = this.f32847o;
                if (wakeLock != null && wakeLock.isHeld()) {
                    Logger.m12100e().mo12102a(f32837t, "Releasing wakelock " + this.f32847o + "for WorkSpec " + this.f32840c);
                    this.f32847o.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12170f() {
        String str = this.f32840c.f33000a;
        Context context = this.f32838a;
        StringBuilder sbM21r = AbstractC0000a.m21r(str, " (");
        sbM21r.append(this.f32839b);
        sbM21r.append(")");
        this.f32847o = WakeLocks.m12286b(context, sbM21r.toString());
        Logger loggerM12100e = Logger.m12100e();
        String str2 = f32837t;
        loggerM12100e.mo12102a(str2, "Acquiring wakelock " + this.f32847o + "for WorkSpec " + str);
        this.f32847o.acquire();
        WorkSpec workSpecMo12257v = this.f32841d.f32858f.f32730c.mo12141w().mo12257v(str);
        if (workSpecMo12257v == null) {
            this.f32845j.execute(new RunnableC2282a(this, 0));
            return;
        }
        boolean zM12230c = workSpecMo12257v.m12230c();
        this.f32848p = zM12230c;
        if (zM12230c) {
            this.f32851s = WorkConstraintsTrackerKt.m12191a(this.f32842f, workSpecMo12257v, this.f32850r, this);
        } else {
            Logger.m12100e().mo12102a(str2, "No constraints for ".concat(str));
            this.f32845j.execute(new RunnableC2282a(this, 1));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12171g(boolean z2) {
        Logger loggerM12100e = Logger.m12100e();
        StringBuilder sb = new StringBuilder("onExecuted ");
        WorkGenerationalId workGenerationalId = this.f32840c;
        sb.append(workGenerationalId);
        sb.append(", ");
        sb.append(z2);
        loggerM12100e.mo12102a(f32837t, sb.toString());
        m12169e();
        int i = this.f32839b;
        SystemAlarmDispatcher systemAlarmDispatcher = this.f32841d;
        Executor executor = this.f32846n;
        Context context = this.f32838a;
        if (z2) {
            String str = CommandHandler.f32821g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            CommandHandler.m12164d(intent, workGenerationalId);
            executor.execute(new SystemAlarmDispatcher.AddRunnable(i, intent, systemAlarmDispatcher));
        }
        if (this.f32848p) {
            String str2 = CommandHandler.f32821g;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new SystemAlarmDispatcher.AddRunnable(i, intent2, systemAlarmDispatcher));
        }
    }
}
