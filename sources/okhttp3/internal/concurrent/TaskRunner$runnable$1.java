package okhttp3.internal.concurrent;

import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.concurrent.TaskRunner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/internal/concurrent/TaskRunner$runnable$1", "Ljava/lang/Runnable;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TaskRunner$runnable$1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskRunner f57370a;

    public TaskRunner$runnable$1(TaskRunner taskRunner) {
        this.f57370a = taskRunner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task taskM21377c;
        long jNanoTime;
        while (true) {
            TaskRunner taskRunner = this.f57370a;
            synchronized (taskRunner) {
                taskM21377c = taskRunner.m21377c();
            }
            if (taskM21377c == null) {
                return;
            }
            TaskQueue taskQueue = taskM21377c.f57350c;
            Intrinsics.m18596d(taskQueue);
            TaskRunner taskRunner2 = this.f57370a;
            boolean zIsLoggable = TaskRunner.f57361j.isLoggable(Level.FINE);
            if (zIsLoggable) {
                TaskRunner.RealBackend realBackend = taskQueue.f57352a.f57362a;
                jNanoTime = System.nanoTime();
                TaskLoggerKt.m21367a(taskM21377c, taskQueue, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                TaskRunner.m21375a(taskRunner2, taskM21377c);
                if (zIsLoggable) {
                    TaskRunner.RealBackend realBackend2 = taskQueue.f57352a.f57362a;
                    TaskLoggerKt.m21367a(taskM21377c, taskQueue, "finished run in ".concat(TaskLoggerKt.m21368b(System.nanoTime() - jNanoTime)));
                }
            } finally {
            }
        }
    }
}
