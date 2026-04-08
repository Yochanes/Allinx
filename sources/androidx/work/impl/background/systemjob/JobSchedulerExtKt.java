package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.privacysandbox.ads.adservices.customaudience.AbstractC2096a;
import androidx.work.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"work-runtime_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class JobSchedulerExtKt {

    /* JADX INFO: renamed from: a */
    public static final String f32876a;

    static {
        String strM12101g = Logger.m12101g("SystemJobScheduler");
        Intrinsics.m18598f(strM12101g, "tagWithPrefix(\"SystemJobScheduler\")");
        f32876a = strM12101g;
    }

    /* JADX INFO: renamed from: a */
    public static final List m12175a(JobScheduler jobScheduler) {
        Intrinsics.m18599g(jobScheduler, "<this>");
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            Intrinsics.m18598f(allPendingJobs, "jobScheduler.allPendingJobs");
            return allPendingJobs;
        } catch (Throwable th) {
            Logger.m12100e().mo12105d(f32876a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final JobScheduler m12176b(Context context) {
        Intrinsics.m18599g(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.m18597e(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler jobSchedulerM11450m = AbstractC2096a.m11450m(jobScheduler);
        Intrinsics.m18598f(jobSchedulerM11450m, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerM11450m;
    }
}
