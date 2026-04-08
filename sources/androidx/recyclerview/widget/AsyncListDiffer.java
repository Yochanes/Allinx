package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AsyncListDiffer<T> {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListDiffer$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC21111 implements Runnable {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListDiffer$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        class AnonymousClass1 extends DiffUtil.Callback {
            public AnonymousClass1() {
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListDiffer$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC21111.this.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ListListener<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MainThreadExecutor implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f31532a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f31532a.post(runnable);
        }
    }

    static {
        new MainThreadExecutor();
    }
}
