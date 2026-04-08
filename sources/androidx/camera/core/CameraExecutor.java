package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraFactory;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraExecutor implements Executor {

    /* JADX INFO: renamed from: c */
    public static final ThreadFactory f2200c = new ThreadFactoryC02271();

    /* JADX INFO: renamed from: a */
    public final Object f2201a = new Object();

    /* JADX INFO: renamed from: b */
    public ThreadPoolExecutor f2202b;

    /* JADX INFO: renamed from: androidx.camera.core.CameraExecutor$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ThreadFactoryC02271 implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f2203a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-core_camera_" + this.f2203a.getAndIncrement());
            return thread;
        }
    }

    public CameraExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f2200c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC0244c());
        this.f2202b = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final void m1214a(CameraFactory cameraFactory) {
        ThreadPoolExecutor threadPoolExecutor;
        cameraFactory.getClass();
        synchronized (this.f2201a) {
            try {
                if (this.f2202b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f2200c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC0244c());
                    this.f2202b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f2202b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, cameraFactory.mo898a().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f2201a) {
            this.f2202b.execute(runnable);
        }
    }
}
