package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface TaskExecutor {
    /* JADX INFO: renamed from: a */
    default CoroutineDispatcher mo12329a() {
        return ExecutorsKt.m20593a(mo12331c());
    }

    /* JADX INFO: renamed from: b */
    Executor mo12330b();

    /* JADX INFO: renamed from: c */
    SerialExecutorImpl mo12331c();

    /* JADX INFO: renamed from: d */
    default void m12332d(Runnable runnable) {
        mo12331c().execute(runnable);
    }
}
