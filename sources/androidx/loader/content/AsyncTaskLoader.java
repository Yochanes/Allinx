package androidx.loader.content;

import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {

    /* JADX INFO: renamed from: b */
    public volatile LoadTask f25058b;

    /* JADX INFO: renamed from: c */
    public volatile LoadTask f25059c;

    /* JADX INFO: compiled from: Proguard */
    public final class LoadTask extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: n */
        public final CountDownLatch f25060n = new CountDownLatch(1);

        public LoadTask() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: a */
        public final Object mo9204a() {
            try {
                AsyncTaskLoader.this.mo9201d();
                throw null;
            } catch (OperationCanceledException e) {
                if (this.f25071d.get()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: b */
        public final void mo9205b(Object obj) {
            CountDownLatch countDownLatch = this.f25060n;
            try {
                AsyncTaskLoader asyncTaskLoader = AsyncTaskLoader.this;
                asyncTaskLoader.mo9202e(obj);
                if (asyncTaskLoader.f25059c == this) {
                    SystemClock.uptimeMillis();
                    asyncTaskLoader.f25059c = null;
                    asyncTaskLoader.m9200c();
                }
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: c */
        public final void mo9206c(Object obj) {
            try {
                AsyncTaskLoader asyncTaskLoader = AsyncTaskLoader.this;
                if (asyncTaskLoader.f25058b != this) {
                    asyncTaskLoader.mo9202e(obj);
                    if (asyncTaskLoader.f25059c == this) {
                        SystemClock.uptimeMillis();
                        asyncTaskLoader.f25059c = null;
                        asyncTaskLoader.m9200c();
                    }
                } else {
                    asyncTaskLoader.f25064a = false;
                    SystemClock.uptimeMillis();
                    asyncTaskLoader.f25058b = null;
                    asyncTaskLoader.mo9207a(obj);
                }
            } finally {
                this.f25060n.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AsyncTaskLoader.this.m9200c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9200c() {
        if (this.f25059c != null || this.f25058b == null) {
            return;
        }
        this.f25058b.getClass();
        LoadTask loadTask = this.f25058b;
        if (loadTask.f25070c == ModernAsyncTask.Status.f25079a) {
            loadTask.f25070c = ModernAsyncTask.Status.f25080b;
            loadTask.f25068a.getClass();
            throw null;
        }
        int iOrdinal = loadTask.f25070c.ordinal();
        if (iOrdinal == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iOrdinal == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo9201d();

    /* JADX INFO: renamed from: f */
    public final void m9203f() {
        if (this.f25058b != null) {
            if (this.f25059c != null) {
                this.f25058b.getClass();
                this.f25058b = null;
            } else {
                this.f25058b.getClass();
                LoadTask loadTask = this.f25058b;
                loadTask.f25071d.set(true);
                if (loadTask.f25069b.cancel(false)) {
                    this.f25059c = this.f25058b;
                    mo9199b();
                }
                this.f25058b = null;
            }
        }
        this.f25058b = new LoadTask();
        m9200c();
    }

    /* JADX INFO: renamed from: b */
    public void mo9199b() {
    }

    /* JADX INFO: renamed from: e */
    public void mo9202e(Object obj) {
    }
}
