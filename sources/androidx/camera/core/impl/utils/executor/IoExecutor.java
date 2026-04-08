package androidx.camera.core.impl.utils.executor;

import androidx.annotation.RequiresApi;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class IoExecutor implements Executor {

    /* JADX INFO: renamed from: b */
    public static volatile Executor f2910b;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f2911a = Executors.newFixedThreadPool(2, new ThreadFactoryC02941());

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.executor.IoExecutor$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ThreadFactoryC02941 implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f2912a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_io_" + this.f2912a.getAndIncrement());
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2911a.execute(runnable);
    }
}
