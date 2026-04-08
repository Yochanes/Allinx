package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, m18303k = 4, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class JobKt {
    /* JADX INFO: renamed from: a */
    public static JobImpl m20598a() {
        return new JobImpl(null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m20599b(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.mo2464u(Job.Key.f55324a);
        if (job != null) {
            job.mo17054i(cancellationException);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Object m20600c(Job job, SuspendLambda suspendLambda) {
        job.mo17054i(null);
        Object objMo17049H = job.mo17049H(suspendLambda);
        return objMo17049H == CoroutineSingletons.f51584a ? objMo17049H : Unit.f51459a;
    }

    /* JADX INFO: renamed from: d */
    public static final void m20601d(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.mo2464u(Job.Key.f55324a);
        if (job != null && !job.isActive()) {
            throw job.mo17051N();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Job m20602e(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.mo2464u(Job.Key.f55324a);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    /* JADX INFO: renamed from: f */
    public static final DisposableHandle m20603f(Job job, boolean z2, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).m20627k0(z2, jobNode) : job.mo17050L(jobNode.mo20497k(), z2, new JobKt__JobKt$invokeOnCompletion$1(1, jobNode, JobNode.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m20604g(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.mo2464u(Job.Key.f55324a);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }
}
