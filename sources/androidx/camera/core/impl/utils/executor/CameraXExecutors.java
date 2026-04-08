package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraXExecutors {
    /* JADX INFO: renamed from: a */
    public static Executor m1615a() {
        if (DirectExecutor.f2897a != null) {
            return DirectExecutor.f2897a;
        }
        synchronized (DirectExecutor.class) {
            try {
                if (DirectExecutor.f2897a == null) {
                    DirectExecutor.f2897a = new DirectExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return DirectExecutor.f2897a;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m1616b() {
        if (HighPriorityExecutor.f2908b != null) {
            return HighPriorityExecutor.f2908b;
        }
        synchronized (HighPriorityExecutor.class) {
            try {
                if (HighPriorityExecutor.f2908b == null) {
                    HighPriorityExecutor.f2908b = new HighPriorityExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return HighPriorityExecutor.f2908b;
    }

    /* JADX INFO: renamed from: c */
    public static Executor m1617c() {
        if (IoExecutor.f2910b != null) {
            return IoExecutor.f2910b;
        }
        synchronized (IoExecutor.class) {
            try {
                if (IoExecutor.f2910b == null) {
                    IoExecutor.f2910b = new IoExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return IoExecutor.f2910b;
    }

    /* JADX INFO: renamed from: d */
    public static ScheduledExecutorService m1618d() {
        if (MainThreadExecutor.f2913a != null) {
            return MainThreadExecutor.f2913a;
        }
        synchronized (MainThreadExecutor.class) {
            try {
                if (MainThreadExecutor.f2913a == null) {
                    MainThreadExecutor.f2913a = new HandlerScheduledExecutorService(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return MainThreadExecutor.f2913a;
    }

    /* JADX INFO: renamed from: e */
    public static ScheduledExecutorService m1619e(Handler handler) {
        return new HandlerScheduledExecutorService(handler);
    }

    /* JADX INFO: renamed from: f */
    public static Executor m1620f(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
