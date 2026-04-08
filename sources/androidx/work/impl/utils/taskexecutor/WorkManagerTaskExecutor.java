package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class WorkManagerTaskExecutor implements TaskExecutor {

    /* JADX INFO: renamed from: a */
    public final SerialExecutorImpl f33147a;

    /* JADX INFO: renamed from: b */
    public final CoroutineDispatcher f33148b;

    /* JADX INFO: renamed from: c */
    public final Handler f33149c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final Executor f33150d = new ExecutorC23421();

    /* JADX INFO: renamed from: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ExecutorC23421 implements Executor {
        public ExecutorC23421() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.f33149c.post(runnable);
        }
    }

    public WorkManagerTaskExecutor(ExecutorService executorService) {
        SerialExecutorImpl serialExecutorImpl = new SerialExecutorImpl(executorService);
        this.f33147a = serialExecutorImpl;
        this.f33148b = ExecutorsKt.m20593a(serialExecutorImpl);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    /* JADX INFO: renamed from: a */
    public final CoroutineDispatcher mo12329a() {
        return this.f33148b;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    /* JADX INFO: renamed from: b */
    public final Executor mo12330b() {
        return this.f33150d;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    /* JADX INFO: renamed from: c */
    public final SerialExecutorImpl mo12331c() {
        return this.f33147a;
    }
}
