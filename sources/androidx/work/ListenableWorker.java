package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.exoplayer.analytics.C1795m;
import androidx.work.impl.utils.C2339e;
import androidx.work.impl.utils.SerialExecutorImpl;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Result {

        /* JADX INFO: compiled from: Proguard */
        @RestrictTo
        public static final class Failure extends Result {

            /* JADX INFO: renamed from: a */
            public final Data f32581a = Data.f32563b;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Failure.class != obj.getClass()) {
                    return false;
                }
                return this.f32581a.equals(((Failure) obj).f32581a);
            }

            public final int hashCode() {
                return this.f32581a.hashCode() + 846803280;
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f32581a + '}';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @RestrictTo
        public static final class Retry extends Result {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && Retry.class == obj.getClass();
            }

            public final int hashCode() {
                return 25945934;
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @RestrictTo
        public static final class Success extends Result {

            /* JADX INFO: renamed from: a */
            public final Data f32582a;

            public Success(Data data) {
                this.f32582a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Success.class != obj.getClass()) {
                    return false;
                }
                return this.f32582a.equals(((Success) obj).f32582a);
            }

            public final int hashCode() {
                return this.f32582a.hashCode() - 1876823561;
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f32582a + '}';
            }
        }
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @RestrictTo
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f32640f;
    }

    public ListenableFuture getForegroundInfoAsync() {
        return CallbackToFutureAdapter.m6740a(new C1795m(20));
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.f32635a;
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.f32636b;
    }

    @Nullable
    @RequiresApi
    public final Network getNetwork() {
        return this.mWorkerParams.f32638d.f32648c;
    }

    @IntRange
    public final int getRunAttemptCount() {
        return this.mWorkerParams.f32639e;
    }

    @RequiresApi
    public final int getStopReason() {
        return this.mStopReason.get();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.f32637c;
    }

    @NonNull
    @RestrictTo
    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.f32642h;
    }

    @NonNull
    @RequiresApi
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f32638d.f32646a;
    }

    @NonNull
    @RequiresApi
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f32638d.f32647b;
    }

    @NonNull
    @RestrictTo
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.f32643i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    @RestrictTo
    public final boolean isUsed() {
        return this.mUsed;
    }

    @NonNull
    public final ListenableFuture<Void> setForegroundAsync(@NonNull ForegroundInfo foregroundInfo) {
        return this.mWorkerParams.f32645k.m12288a(getApplicationContext(), getId(), foregroundInfo);
    }

    @NonNull
    public ListenableFuture<Void> setProgressAsync(@NonNull Data data) {
        WorkProgressUpdater workProgressUpdater = this.mWorkerParams.f32644j;
        getApplicationContext();
        UUID id = getId();
        WorkManagerTaskExecutor workManagerTaskExecutor = workProgressUpdater.f33102b;
        C2339e c2339e = new C2339e(workProgressUpdater, 0, id, data);
        SerialExecutorImpl serialExecutorImpl = workManagerTaskExecutor.f33147a;
        Intrinsics.m18599g(serialExecutorImpl, "<this>");
        return CallbackToFutureAdapter.m6740a(new C2270a(serialExecutorImpl, "updateProgress", c2339e));
    }

    @RestrictTo
    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    @RestrictTo
    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }

    public void onStopped() {
    }
}
