package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.RunnableC0320d;
import androidx.work.Configuration;
import androidx.work.ListenableFutureKt;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.airbnb.lottie.CallableC2407e;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class Processor implements ForegroundProcessor {

    /* JADX INFO: renamed from: l */
    public static final String f32677l = Logger.m12101g("Processor");

    /* JADX INFO: renamed from: b */
    public final Context f32679b;

    /* JADX INFO: renamed from: c */
    public final Configuration f32680c;

    /* JADX INFO: renamed from: d */
    public final WorkManagerTaskExecutor f32681d;

    /* JADX INFO: renamed from: e */
    public final WorkDatabase f32682e;

    /* JADX INFO: renamed from: g */
    public final HashMap f32684g = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f32683f = new HashMap();

    /* JADX INFO: renamed from: i */
    public final HashSet f32686i = new HashSet();

    /* JADX INFO: renamed from: j */
    public final ArrayList f32687j = new ArrayList();

    /* JADX INFO: renamed from: a */
    public PowerManager.WakeLock f32678a = null;

    /* JADX INFO: renamed from: k */
    public final Object f32688k = new Object();

    /* JADX INFO: renamed from: h */
    public final HashMap f32685h = new HashMap();

    public Processor(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, WorkDatabase workDatabase) {
        this.f32679b = context;
        this.f32680c = configuration;
        this.f32681d = workManagerTaskExecutor;
        this.f32682e = workDatabase;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12117d(String str, WorkerWrapper workerWrapper, int i) {
        String str2 = f32677l;
        if (workerWrapper == null) {
            Logger.m12100e().mo12102a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.f32754n.mo20617O(new WorkerStoppedException(i));
        Logger.m12100e().mo12102a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m12118a(ExecutionListener executionListener) {
        synchronized (this.f32688k) {
            this.f32687j.add(executionListener);
        }
    }

    /* JADX INFO: renamed from: b */
    public final WorkerWrapper m12119b(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f32683f.remove(str);
        boolean z2 = workerWrapper != null;
        if (!z2) {
            workerWrapper = (WorkerWrapper) this.f32684g.remove(str);
        }
        this.f32685h.remove(str);
        if (z2) {
            synchronized (this.f32688k) {
                try {
                    if (this.f32683f.isEmpty()) {
                        Context context = this.f32679b;
                        String str2 = SystemForegroundDispatcher.f32969o;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f32679b.startService(intent);
                        } catch (Throwable th) {
                            Logger.m12100e().mo12105d(f32677l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f32678a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f32678a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return workerWrapper;
    }

    /* JADX INFO: renamed from: c */
    public final WorkerWrapper m12120c(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f32683f.get(str);
        return workerWrapper == null ? (WorkerWrapper) this.f32684g.get(str) : workerWrapper;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12121e(String str) {
        boolean z2;
        synchronized (this.f32688k) {
            z2 = m12120c(str) != null;
        }
        return z2;
    }

    /* JADX INFO: renamed from: f */
    public final void m12122f(ExecutionListener executionListener) {
        synchronized (this.f32688k) {
            this.f32687j.remove(executionListener);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12123g(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        Throwable th;
        WorkGenerationalId workGenerationalId = startStopToken.f32691a;
        String str = workGenerationalId.f33000a;
        ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.f32682e.m11822m(new CallableC2407e(this, arrayList, str));
        if (workSpec == null) {
            Logger.m12100e().mo12107h(f32677l, "Didn't find WorkSpec for id " + workGenerationalId);
            this.f32681d.f33150d.execute(new RunnableC2276a(this, workGenerationalId));
            return false;
        }
        synchronized (this.f32688k) {
            try {
                try {
                    try {
                        if (m12121e(str)) {
                            Set set = (Set) this.f32685h.get(str);
                            if (((StartStopToken) set.iterator().next()).f32691a.f33001b == workGenerationalId.f33001b) {
                                set.add(startStopToken);
                                Logger.m12100e().mo12102a(f32677l, "Work " + workGenerationalId + " is already enqueued for processing");
                            } else {
                                this.f32681d.f33150d.execute(new RunnableC2276a(this, workGenerationalId));
                            }
                            return false;
                        }
                        if (workSpec.f33030t != workGenerationalId.f33001b) {
                            this.f32681d.f33150d.execute(new RunnableC2276a(this, workGenerationalId));
                            return false;
                        }
                        WorkerWrapper.Builder builder = new WorkerWrapper.Builder(this.f32679b, this.f32680c, this.f32681d, this, this.f32682e, workSpec, arrayList);
                        if (runtimeExtras != null) {
                            builder.f32762h = runtimeExtras;
                        }
                        WorkerWrapper workerWrapper = new WorkerWrapper(builder);
                        CoroutineDispatcher coroutineDispatcher = workerWrapper.f32745e.f33148b;
                        JobImpl jobImplM20598a = JobKt.m20598a();
                        coroutineDispatcher.getClass();
                        ListenableFuture listenableFutureM12099a = ListenableFutureKt.m12099a(CoroutineContext.DefaultImpls.m18550a(coroutineDispatcher, jobImplM20598a), new WorkerWrapper$launch$1(workerWrapper, null));
                        listenableFutureM12099a.addListener(new RunnableC0320d(this, 5, listenableFutureM12099a, workerWrapper), this.f32681d.f33150d);
                        this.f32684g.put(str, workerWrapper);
                        HashSet hashSet = new HashSet();
                        hashSet.add(startStopToken);
                        this.f32685h.put(str, hashSet);
                        Logger.m12100e().mo12102a(f32677l, getClass().getSimpleName() + ": processing " + workGenerationalId);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            throw th;
        }
    }
}
