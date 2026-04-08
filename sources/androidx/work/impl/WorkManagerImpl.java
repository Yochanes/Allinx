package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.tracing.Trace;
import androidx.work.Configuration;
import androidx.work.ConfigurationKt$createDefaultTracer$tracer$1;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.SerialExecutorImpl;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.internal.ContextScope;
import p005F.C0013a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class WorkManagerImpl extends WorkManager {

    /* JADX INFO: renamed from: k */
    public static WorkManagerImpl f32725k;

    /* JADX INFO: renamed from: l */
    public static WorkManagerImpl f32726l;

    /* JADX INFO: renamed from: m */
    public static final Object f32727m;

    /* JADX INFO: renamed from: a */
    public final Context f32728a;

    /* JADX INFO: renamed from: b */
    public final Configuration f32729b;

    /* JADX INFO: renamed from: c */
    public final WorkDatabase f32730c;

    /* JADX INFO: renamed from: d */
    public final TaskExecutor f32731d;

    /* JADX INFO: renamed from: e */
    public final List f32732e;

    /* JADX INFO: renamed from: f */
    public final Processor f32733f;

    /* JADX INFO: renamed from: g */
    public final PreferenceUtils f32734g;

    /* JADX INFO: renamed from: h */
    public boolean f32735h = false;

    /* JADX INFO: renamed from: i */
    public BroadcastReceiver.PendingResult f32736i;

    /* JADX INFO: renamed from: j */
    public final Trackers f32737j;

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C22751 implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            List list = (List) obj;
            if (list == null || list.size() <= 0) {
                return null;
            }
            return ((WorkSpec.WorkInfoPojo) list.get(0)).m12232a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    static {
        Logger.m12101g("WorkManagerImpl");
        f32725k = null;
        f32726l = null;
        f32727m = new Object();
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List list, Processor processor, Trackers trackers) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        Logger.LogcatLogger logcatLogger = new Logger.LogcatLogger(configuration.f32535h);
        synchronized (Logger.f32583a) {
            if (Logger.f32584b == null) {
                Logger.f32584b = logcatLogger;
            }
        }
        this.f32728a = applicationContext;
        this.f32731d = taskExecutor;
        this.f32730c = workDatabase;
        this.f32733f = processor;
        this.f32737j = trackers;
        this.f32729b = configuration;
        this.f32732e = list;
        CoroutineDispatcher coroutineDispatcherMo12329a = taskExecutor.mo12329a();
        Intrinsics.m18598f(coroutineDispatcherMo12329a, "taskExecutor.taskCoroutineDispatcher");
        ContextScope contextScopeM20560a = CoroutineScopeKt.m20560a(coroutineDispatcherMo12329a);
        this.f32734g = new PreferenceUtils(workDatabase);
        SerialExecutorImpl serialExecutorImplMo12331c = taskExecutor.mo12331c();
        String str = Schedulers.f32690a;
        processor.m12118a(new C2277b(serialExecutorImplMo12331c, list, configuration, workDatabase));
        taskExecutor.m12332d(new ForceStopRunnable(applicationContext, this));
        String str2 = UnfinishedWorkListenerKt.f32697a;
        if (ProcessUtils.m12283a(applicationContext, configuration)) {
            FlowKt.m20759s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(applicationContext, null), FlowKt.m20751k(FlowKt.m20743c(new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(workDatabase.mo12141w().mo12242g(), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(4, null)), -1))), contextScopeM20560a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static WorkManagerImpl m12147a(Context context) {
        WorkManagerImpl workManagerImplM12147a;
        Object obj = f32727m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    workManagerImplM12147a = f32725k;
                    if (workManagerImplM12147a == null) {
                        workManagerImplM12147a = f32726l;
                    }
                }
                return workManagerImplM12147a;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (workManagerImplM12147a == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Configuration.Provider)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            m12148b(applicationContext, ((Configuration.Provider) applicationContext).m12086a());
            workManagerImplM12147a = m12147a(applicationContext);
        }
        return workManagerImplM12147a;
    }

    /* JADX INFO: renamed from: b */
    public static void m12148b(Context context, Configuration configuration) {
        synchronized (f32727m) {
            try {
                WorkManagerImpl workManagerImpl = f32725k;
                if (workManagerImpl != null && f32726l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (workManagerImpl == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f32726l == null) {
                        f32726l = WorkManagerImplExtKt.m12151a(applicationContext, configuration);
                    }
                    f32725k = f32726l;
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12149c() {
        synchronized (f32727m) {
            try {
                this.f32735h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f32736i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f32736i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12150d() {
        ConfigurationKt$createDefaultTracer$tracer$1 configurationKt$createDefaultTracer$tracer$1 = this.f32729b.f32540m;
        C0013a c0013a = new C0013a(this, 4);
        Intrinsics.m18599g(configurationKt$createDefaultTracer$tracer$1, "<this>");
        boolean zM11951d = Trace.m11951d();
        if (zM11951d) {
            try {
                configurationKt$createDefaultTracer$tracer$1.m12088a("ReschedulingWork");
            } catch (Throwable th) {
                if (zM11951d) {
                    android.os.Trace.endSection();
                }
                throw th;
            }
        }
        c0013a.invoke();
        if (zM11951d) {
            android.os.Trace.endSection();
        }
    }
}
