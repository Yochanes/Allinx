package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class DefaultTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: a */
    public final Object f1501a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f1502b = Executors.newFixedThreadPool(4, new ThreadFactoryC01531());

    /* JADX INFO: renamed from: c */
    public volatile Handler f1503c;

    /* JADX INFO: renamed from: androidx.arch.core.executor.DefaultTaskExecutor$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ThreadFactoryC01531 implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f1504a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f1504a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static Handler m805a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Handler m804a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.m805a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
