package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.SystemClock;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class CommandHandler implements ExecutionListener {

    /* JADX INFO: renamed from: g */
    public static final String f32821g = Logger.m12101g("CommandHandler");

    /* JADX INFO: renamed from: a */
    public final Context f32822a;

    /* JADX INFO: renamed from: b */
    public final HashMap f32823b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Object f32824c = new Object();

    /* JADX INFO: renamed from: d */
    public final SystemClock f32825d;

    /* JADX INFO: renamed from: f */
    public final StartStopTokens f32826f;

    public CommandHandler(Context context, SystemClock systemClock, StartStopTokens startStopTokens) {
        this.f32822a = context;
        this.f32825d = systemClock;
        this.f32826f = startStopTokens;
    }

    /* JADX INFO: renamed from: c */
    public static WorkGenerationalId m12163c(Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* JADX INFO: renamed from: d */
    public static void m12164d(Intent intent, WorkGenerationalId workGenerationalId) {
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.f33000a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", workGenerationalId.f33001b);
    }

    /* JADX INFO: renamed from: a */
    public final void m12165a(int i, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        List<StartStopToken> listRemove;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            Logger.m12100e().mo12102a(f32821g, "Handling constraints changed " + intent);
            ConstraintsCommandHandler constraintsCommandHandler = new ConstraintsCommandHandler(this.f32822a, this.f32825d, i, systemAlarmDispatcher);
            ArrayList<WorkSpec> arrayListMo12250o = systemAlarmDispatcher.f32858f.f32730c.mo12141w().mo12250o();
            String str = ConstraintProxy.f32827a;
            Iterator it = arrayListMo12250o.iterator();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (it.hasNext()) {
                Constraints constraints = ((WorkSpec) it.next()).f33020j;
                z2 |= constraints.f32548e;
                z3 |= constraints.f32546c;
                z4 |= constraints.f32549f;
                z5 |= constraints.f32544a != NetworkType.f32586a;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f32828a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = constraintsCommandHandler.f32833a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            ArrayList<WorkSpec> arrayList = new ArrayList(arrayListMo12250o.size());
            constraintsCommandHandler.f32834b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (WorkSpec workSpec : arrayListMo12250o) {
                if (jCurrentTimeMillis >= workSpec.m12229a() && (!workSpec.m12230c() || constraintsCommandHandler.f32836d.m12189a(workSpec))) {
                    arrayList.add(workSpec);
                }
            }
            for (WorkSpec workSpec2 : arrayList) {
                String str3 = workSpec2.f33011a;
                WorkGenerationalId workGenerationalIdM12262a = WorkSpecKt.m12262a(workSpec2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                m12164d(intent3, workGenerationalIdM12262a);
                Logger.m12100e().mo12102a(ConstraintsCommandHandler.f32832e, AbstractC0000a.m3D("Creating a delay_met command for workSpec with id (", str3, ")"));
                systemAlarmDispatcher.f32855b.mo12330b().execute(new SystemAlarmDispatcher.AddRunnable(constraintsCommandHandler.f32835c, intent3, systemAlarmDispatcher));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            Logger.m12100e().mo12102a(f32821g, "Handling reschedule " + intent + ", " + i);
            systemAlarmDispatcher.f32858f.m12150d();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            Logger.m12100e().mo12104c(f32821g, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            WorkGenerationalId workGenerationalIdM12163c = m12163c(intent);
            String str4 = f32821g;
            Logger.m12100e().mo12102a(str4, "Handling schedule work for " + workGenerationalIdM12163c);
            WorkDatabase workDatabase = systemAlarmDispatcher.f32858f.f32730c;
            workDatabase.m11812c();
            try {
                WorkSpec workSpecMo12257v = workDatabase.mo12141w().mo12257v(workGenerationalIdM12163c.f33000a);
                if (workSpecMo12257v == null) {
                    Logger.m12100e().mo12107h(str4, "Skipping scheduling " + workGenerationalIdM12163c + " because it's no longer in the DB");
                    return;
                }
                if (workSpecMo12257v.f33012b.m12110a()) {
                    Logger.m12100e().mo12107h(str4, "Skipping scheduling " + workGenerationalIdM12163c + "because it is finished.");
                    return;
                }
                long jM12229a = workSpecMo12257v.m12229a();
                boolean zM12230c = workSpecMo12257v.m12230c();
                Context context2 = this.f32822a;
                if (zM12230c) {
                    Logger.m12100e().mo12102a(str4, "Opportunistically setting an alarm for " + workGenerationalIdM12163c + "at " + jM12229a);
                    Alarms.m12162b(context2, workDatabase, workGenerationalIdM12163c, jM12229a);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    systemAlarmDispatcher.f32855b.mo12330b().execute(new SystemAlarmDispatcher.AddRunnable(i, intent4, systemAlarmDispatcher));
                } else {
                    Logger.m12100e().mo12102a(str4, "Setting up Alarms for " + workGenerationalIdM12163c + "at " + jM12229a);
                    Alarms.m12162b(context2, workDatabase, workGenerationalIdM12163c, jM12229a);
                }
                workDatabase.m11824o();
                return;
            } finally {
                workDatabase.m11819j();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f32824c) {
                try {
                    WorkGenerationalId workGenerationalIdM12163c2 = m12163c(intent);
                    Logger loggerM12100e = Logger.m12100e();
                    String str5 = f32821g;
                    loggerM12100e.mo12102a(str5, "Handing delay met for " + workGenerationalIdM12163c2);
                    if (this.f32823b.containsKey(workGenerationalIdM12163c2)) {
                        Logger.m12100e().mo12102a(str5, "WorkSpec " + workGenerationalIdM12163c2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.f32822a, i, systemAlarmDispatcher, this.f32826f.mo12130b(workGenerationalIdM12163c2));
                        this.f32823b.put(workGenerationalIdM12163c2, delayMetCommandHandler);
                        delayMetCommandHandler.m12170f();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                Logger.m12100e().mo12107h(f32821g, "Ignoring intent " + intent);
                return;
            }
            WorkGenerationalId workGenerationalIdM12163c3 = m12163c(intent);
            boolean z6 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            Logger.m12100e().mo12102a(f32821g, "Handling onExecutionCompleted " + intent + ", " + i);
            mo12116b(workGenerationalIdM12163c3, z6);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        StartStopTokens startStopTokens = this.f32826f;
        if (zContainsKey) {
            int i2 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            StartStopToken startStopTokenMo12132d = startStopTokens.mo12132d(new WorkGenerationalId(string, i2));
            listRemove = arrayList2;
            if (startStopTokenMo12132d != null) {
                arrayList2.add(startStopTokenMo12132d);
                listRemove = arrayList2;
            }
        } else {
            listRemove = startStopTokens.remove(string);
        }
        for (StartStopToken startStopToken : listRemove) {
            Logger.m12100e().mo12102a(f32821g, AbstractC0000a.m13j("Handing stopWork work for ", string));
            systemAlarmDispatcher.f32864p.m12145b(startStopToken);
            WorkDatabase workDatabase2 = systemAlarmDispatcher.f32858f.f32730c;
            WorkGenerationalId workGenerationalId = startStopToken.f32691a;
            String str6 = Alarms.f32820a;
            SystemIdInfoDao systemIdInfoDaoMo12138t = workDatabase2.mo12138t();
            SystemIdInfo systemIdInfoM12220e = systemIdInfoDaoMo12138t.m12220e(workGenerationalId);
            if (systemIdInfoM12220e != null) {
                Alarms.m12161a(this.f32822a, workGenerationalId, systemIdInfoM12220e.f32995c);
                Logger.m12100e().mo12102a(Alarms.f32820a, "Removing SystemIdInfo for workSpecId (" + workGenerationalId + ")");
                systemIdInfoDaoMo12138t.m12216a(workGenerationalId);
            }
            systemAlarmDispatcher.mo12116b(startStopToken.f32691a, false);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    /* JADX INFO: renamed from: b */
    public final void mo12116b(WorkGenerationalId workGenerationalId, boolean z2) {
        synchronized (this.f32824c) {
            try {
                DelayMetCommandHandler delayMetCommandHandler = (DelayMetCommandHandler) this.f32823b.remove(workGenerationalId);
                this.f32826f.mo12132d(workGenerationalId);
                if (delayMetCommandHandler != null) {
                    delayMetCommandHandler.m12171g(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
