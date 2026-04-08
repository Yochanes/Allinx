package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LottieTask<T> {

    /* JADX INFO: renamed from: e */
    public static final ExecutorService f34102e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f34103a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f34104b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c */
    public final Handler f34105c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public volatile LottieResult f34106d = null;

    /* JADX INFO: compiled from: Proguard */
    public class LottieFutureTask extends FutureTask<LottieResult<T>> {
        public LottieFutureTask(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            LottieTask lottieTask = LottieTask.this;
            if (isCancelled()) {
                return;
            }
            try {
                LottieResult<T> lottieResult = get();
                ExecutorService executorService = LottieTask.f34102e;
                lottieTask.m12582c(lottieResult);
            } catch (InterruptedException | ExecutionException e) {
                LottieResult lottieResult2 = new LottieResult(e);
                ExecutorService executorService2 = LottieTask.f34102e;
                lottieTask.m12582c(lottieResult2);
            }
        }
    }

    public LottieTask(Callable callable, boolean z2) {
        if (!z2) {
            f34102e.execute(new LottieFutureTask(callable));
            return;
        }
        try {
            m12582c((LottieResult) callable.call());
        } catch (Throwable th) {
            m12582c(new LottieResult(th));
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12580a(LottieListener lottieListener) {
        Throwable th;
        try {
            LottieResult lottieResult = this.f34106d;
            if (lottieResult != null && (th = lottieResult.f34101b) != null) {
                lottieListener.onResult(th);
            }
            this.f34104b.add(lottieListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12581b(LottieListener lottieListener) {
        Object obj;
        try {
            LottieResult lottieResult = this.f34106d;
            if (lottieResult != null && (obj = lottieResult.f34100a) != null) {
                lottieListener.onResult(obj);
            }
            this.f34103a.add(lottieListener);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12582c(LottieResult lottieResult) {
        if (this.f34106d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f34106d = lottieResult;
        this.f34105c.post(new RunnableC2408f(this, 2));
    }
}
