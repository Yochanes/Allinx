package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class ModernAsyncTask<Params, Progress, Result> {

    /* JADX INFO: renamed from: g */
    public static final ThreadPoolExecutor f25065g;

    /* JADX INFO: renamed from: i */
    public static InternalHandler f25066i;

    /* JADX INFO: renamed from: j */
    public static volatile ThreadPoolExecutor f25067j;

    /* JADX INFO: renamed from: a */
    public final C17182 f25068a;

    /* JADX INFO: renamed from: b */
    public final FutureTask f25069b;

    /* JADX INFO: renamed from: c */
    public volatile Status f25070c = Status.f25079a;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f25071d = new AtomicBoolean();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f25072f = new AtomicBoolean();

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class ThreadFactoryC17171 implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f25073a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f25073a.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$2 */
    /* JADX INFO: compiled from: Proguard */
    class C17182 extends WorkerRunnable<Object, Object> {
        public C17182() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            modernAsyncTask.f25072f.set(true);
            Object objMo9204a = null;
            try {
                Process.setThreadPriority(10);
                objMo9204a = modernAsyncTask.mo9204a();
                Binder.flushPendingCommands();
                return objMo9204a;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$3 */
    /* JADX INFO: compiled from: Proguard */
    class C17193 extends FutureTask<Object> {
        public C17193(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            try {
                Object obj = get();
                if (modernAsyncTask.f25072f.get()) {
                    return;
                }
                modernAsyncTask.m9208d(obj);
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                if (modernAsyncTask.f25072f.get()) {
                    return;
                }
                modernAsyncTask.m9208d(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$4 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C17204 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25076a;

        static {
            int[] iArr = new int[Status.values().length];
            f25076a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25076a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AsyncTaskResult<Data> {

        /* JADX INFO: renamed from: a */
        public final ModernAsyncTask f25077a;

        /* JADX INFO: renamed from: b */
        public final Object[] f25078b;

        public AsyncTaskResult(ModernAsyncTask modernAsyncTask, Object... objArr) {
            this.f25077a = modernAsyncTask;
            this.f25078b = objArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class InternalHandler extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                asyncTaskResult.f25077a.getClass();
            } else {
                ModernAsyncTask modernAsyncTask = asyncTaskResult.f25077a;
                Object obj = asyncTaskResult.f25078b[0];
                if (modernAsyncTask.f25071d.get()) {
                    modernAsyncTask.mo9205b(obj);
                } else {
                    modernAsyncTask.mo9206c(obj);
                }
                modernAsyncTask.f25070c = Status.f25081c;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Status {

        /* JADX INFO: renamed from: a */
        public static final Status f25079a;

        /* JADX INFO: renamed from: b */
        public static final Status f25080b;

        /* JADX INFO: renamed from: c */
        public static final Status f25081c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ Status[] f25082d;

        static {
            Status status = new Status("PENDING", 0);
            f25079a = status;
            Status status2 = new Status("RUNNING", 1);
            f25080b = status2;
            Status status3 = new Status("FINISHED", 2);
            f25081c = status3;
            f25082d = new Status[]{status, status2, status3};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f25082d.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class WorkerRunnable<Params, Result> implements Callable<Result> {
    }

    static {
        ThreadFactoryC17171 threadFactoryC17171 = new ThreadFactoryC17171();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactoryC17171);
        f25065g = threadPoolExecutor;
        f25067j = threadPoolExecutor;
    }

    public ModernAsyncTask() {
        C17182 c17182 = new C17182();
        this.f25068a = c17182;
        this.f25069b = new C17193(c17182);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo9204a();

    /* JADX INFO: renamed from: d */
    public final void m9208d(Object obj) {
        InternalHandler internalHandler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f25066i == null) {
                    f25066i = new InternalHandler(Looper.getMainLooper());
                }
                internalHandler = f25066i;
            } catch (Throwable th) {
                throw th;
            }
        }
        internalHandler.obtainMessage(1, new AsyncTaskResult(this, obj)).sendToTarget();
    }

    /* JADX INFO: renamed from: b */
    public void mo9205b(Object obj) {
    }

    /* JADX INFO: renamed from: c */
    public void mo9206c(Object obj) {
    }
}
