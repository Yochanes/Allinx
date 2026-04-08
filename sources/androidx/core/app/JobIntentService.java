package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.text.android.AbstractC1329b;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: b */
    public static final HashMap f22965b = new HashMap();

    /* JADX INFO: renamed from: a */
    public JobServiceEngineImpl f22966a;

    /* JADX INFO: compiled from: Proguard */
    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            throw null;
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r1) {
            throw null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface CompatJobEngine {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
    }

    /* JADX INFO: compiled from: Proguard */
    public final class CompatWorkItem implements GenericWorkItem {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface GenericWorkItem {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {

        /* JADX INFO: renamed from: a */
        public final JobIntentService f22967a;

        /* JADX INFO: renamed from: b */
        public final Object f22968b;

        /* JADX INFO: renamed from: c */
        public JobParameters f22969c;

        /* JADX INFO: compiled from: Proguard */
        public final class WrapperWorkItem implements GenericWorkItem {

            /* JADX INFO: renamed from: a */
            public final JobWorkItem f22970a;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.f22970a = jobWorkItem;
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f22968b = new Object();
            this.f22967a = jobIntentService;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f22969c = jobParameters;
            this.f22967a.getClass();
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            this.f22967a.getClass();
            synchronized (this.f22968b) {
                this.f22969c = null;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class WorkEnqueuer {
    }

    /* JADX INFO: renamed from: a */
    public abstract void m7403a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineImpl jobServiceEngineImpl = this.f22966a;
        if (jobServiceEngineImpl != null) {
            return AbstractC1329b.m6462l(jobServiceEngineImpl);
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f22966a = new JobServiceEngineImpl(this);
            return;
        }
        this.f22966a = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap map = f22965b;
        if (((WorkEnqueuer) map.get(componentName)) == null) {
            if (i >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            CompatWorkEnqueuer compatWorkEnqueuer = new CompatWorkEnqueuer();
            getApplicationContext();
            PowerManager powerManager = (PowerManager) getSystemService("power");
            powerManager.newWakeLock(1, componentName.getClassName() + ":launch").setReferenceCounted(false);
            powerManager.newWakeLock(1, componentName.getClassName() + ":run").setReferenceCounted(false);
            map.put(componentName, compatWorkEnqueuer);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
