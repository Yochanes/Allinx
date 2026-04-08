package androidx.camera.core.impl.utils.executor;

import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class HighPriorityExecutor implements Executor {

    /* JADX INFO: renamed from: b */
    public static volatile Executor f2908b;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f2909a = Executors.newSingleThreadExecutor(new ThreadFactoryC02931());

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.executor.HighPriorityExecutor$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ThreadFactoryC02931 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2909a.execute(runnable);
    }
}
