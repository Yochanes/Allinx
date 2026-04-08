package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public class SystemJobService extends JobService implements ExecutionListener {

    /* JADX INFO: renamed from: f */
    public static final String f32888f = Logger.m12101g("SystemJobService");

    /* JADX INFO: renamed from: a */
    public WorkManagerImpl f32889a;

    /* JADX INFO: renamed from: b */
    public final HashMap f32890b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final StartStopTokens f32891c = StartStopTokens.Companion.m12133a(false);

    /* JADX INFO: renamed from: d */
    public WorkLauncherImpl f32892d;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static Network m12183a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api31Impl {
        /* JADX INFO: renamed from: a */
        public static int m12184a(JobParameters jobParameters) {
            int stopReason = jobParameters.getStopReason();
            String str = SystemJobService.f32888f;
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case TYPE_BYTES_VALUE:
                case 13:
                case 14:
                case 15:
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12181a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0000a.m3D("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: c */
    public static WorkGenerationalId m12182c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    /* JADX INFO: renamed from: b */
    public final void mo12116b(WorkGenerationalId workGenerationalId, boolean z2) {
        m12181a("onExecuted");
        Logger.m12100e().mo12102a(f32888f, AbstractC0000a.m19p(new StringBuilder(), workGenerationalId.f33000a, " executed on JobScheduler"));
        JobParameters jobParameters = (JobParameters) this.f32890b.remove(workGenerationalId);
        this.f32891c.mo12132d(workGenerationalId);
        if (jobParameters != null) {
            jobFinished(jobParameters, z2);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImplM12147a = WorkManagerImpl.m12147a(getApplicationContext());
            this.f32889a = workManagerImplM12147a;
            Processor processor = workManagerImplM12147a.f32733f;
            this.f32892d = new WorkLauncherImpl(processor, workManagerImplM12147a.f32731d);
            processor.m12118a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            Logger.m12100e().mo12107h(f32888f, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.f32889a;
        if (workManagerImpl != null) {
            workManagerImpl.f32733f.m12122f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        m12181a("onStartJob");
        WorkManagerImpl workManagerImpl = this.f32889a;
        String str = f32888f;
        if (workManagerImpl == null) {
            Logger.m12100e().mo12102a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdM12182c = m12182c(jobParameters);
        if (workGenerationalIdM12182c == null) {
            Logger.m12100e().mo12104c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f32890b;
        if (map.containsKey(workGenerationalIdM12182c)) {
            Logger.m12100e().mo12102a(str, "Job is already being executed by SystemJobService: " + workGenerationalIdM12182c);
            return false;
        }
        Logger.m12100e().mo12102a(str, "onStartJob for " + workGenerationalIdM12182c);
        map.put(workGenerationalIdM12182c, jobParameters);
        int i = Build.VERSION.SDK_INT;
        WorkerParameters.RuntimeExtras runtimeExtras = new WorkerParameters.RuntimeExtras();
        if (jobParameters.getTriggeredContentUris() != null) {
            runtimeExtras.f32647b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            runtimeExtras.f32646a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (i >= 28) {
            runtimeExtras.f32648c = Api28Impl.m12183a(jobParameters);
        }
        this.f32892d.m12146c(this.f32891c.mo12130b(workGenerationalIdM12182c), runtimeExtras);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        m12181a("onStopJob");
        if (this.f32889a == null) {
            Logger.m12100e().mo12102a(f32888f, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdM12182c = m12182c(jobParameters);
        if (workGenerationalIdM12182c == null) {
            Logger.m12100e().mo12104c(f32888f, "WorkSpec id not found!");
            return false;
        }
        Logger.m12100e().mo12102a(f32888f, "onStopJob for " + workGenerationalIdM12182c);
        this.f32890b.remove(workGenerationalIdM12182c);
        StartStopToken startStopTokenMo12132d = this.f32891c.mo12132d(workGenerationalIdM12182c);
        if (startStopTokenMo12132d != null) {
            int iM12184a = Build.VERSION.SDK_INT >= 31 ? Api31Impl.m12184a(jobParameters) : -512;
            WorkLauncherImpl workLauncherImpl = this.f32892d;
            workLauncherImpl.getClass();
            workLauncherImpl.mo12144a(startStopTokenMo12132d, iM12184a);
        }
        Processor processor = this.f32889a.f32733f;
        String str = workGenerationalIdM12182c.f33000a;
        synchronized (processor.f32688k) {
            zContains = processor.f32686i.contains(str);
        }
        return !zContains;
    }
}
