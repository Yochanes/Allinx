package androidx.camera.core.impl.utils.futures;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {

    /* JADX INFO: renamed from: c */
    public AsyncFunction f2926c;

    /* JADX INFO: renamed from: d */
    public final LinkedBlockingQueue f2927d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: f */
    public final CountDownLatch f2928f = new CountDownLatch(1);

    /* JADX INFO: renamed from: g */
    public ListenableFuture f2929g;

    /* JADX INFO: renamed from: i */
    public volatile ListenableFuture f2930i;

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.ChainingListenableFuture$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC02961 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ListenableFuture f2931a;

        public RunnableC02961(ListenableFuture listenableFuture) {
            this.f2931a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    ChainingListenableFuture chainingListenableFuture = ChainingListenableFuture.this;
                    Object objM1627d = Futures.m1627d(this.f2931a);
                    CallbackToFutureAdapter.Completer completer = chainingListenableFuture.f2934b;
                    if (completer != null) {
                        completer.m6742b(objM1627d);
                    }
                } catch (CancellationException unused) {
                    ChainingListenableFuture.this.cancel(false);
                } catch (ExecutionException e) {
                    ChainingListenableFuture chainingListenableFuture2 = ChainingListenableFuture.this;
                    Throwable cause = e.getCause();
                    CallbackToFutureAdapter.Completer completer2 = chainingListenableFuture2.f2934b;
                    if (completer2 != null) {
                        completer2.m6744d(cause);
                    }
                    ChainingListenableFuture.this.f2930i = null;
                    return;
                }
                ChainingListenableFuture.this.f2930i = null;
            } catch (Throwable th) {
                ChainingListenableFuture.this.f2930i = null;
                throw th;
            }
        }
    }

    public ChainingListenableFuture(AsyncFunction asyncFunction, ListenableFuture listenableFuture) {
        this.f2926c = asyncFunction;
        listenableFuture.getClass();
        this.f2929g = listenableFuture;
    }

    /* JADX INFO: renamed from: b */
    public static Object m1622b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z2 = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        boolean z3 = false;
        if (!this.f2933a.cancel(z2)) {
            return false;
        }
        while (true) {
            try {
                this.f2927d.put(Boolean.valueOf(z2));
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture listenableFuture = this.f2929g;
        if (listenableFuture != null) {
            listenableFuture.cancel(z2);
        }
        ListenableFuture listenableFuture2 = this.f2930i;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z2);
        }
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.f2933a.isDone()) {
            ListenableFuture listenableFuture = this.f2929g;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f2928f.await();
            ListenableFuture listenableFuture2 = this.f2930i;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return this.f2933a.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0;
        ?? r02 = 0;
        r02 = 0;
        r02 = 0;
        r02 = 0;
        r02 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            ListenableFuture listenableFutureApply = this.f2926c.apply(Futures.m1627d(this.f2929g));
                            this.f2930i = listenableFutureApply;
                            if (this.f2933a.isCancelled()) {
                                listenableFutureApply.cancel(((Boolean) m1622b(this.f2927d)).booleanValue());
                                this.f2930i = null;
                            } else {
                                listenableFutureApply.addListener(new RunnableC02961(listenableFutureApply), CameraXExecutors.m1615a());
                            }
                        } catch (Exception e) {
                            CallbackToFutureAdapter.Completer completer = this.f2934b;
                            r0 = r02;
                            if (completer != null) {
                                completer.m6744d(e);
                                r0 = r02;
                            }
                        }
                    } catch (Error e2) {
                        CallbackToFutureAdapter.Completer completer2 = this.f2934b;
                        r0 = r02;
                        if (completer2 != null) {
                            completer2.m6744d(e2);
                            r0 = r02;
                        }
                    }
                } finally {
                    this.f2926c = r02;
                    this.f2929g = r02;
                    this.f2928f.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                CallbackToFutureAdapter.Completer completer3 = this.f2934b;
                if (completer3 != null) {
                    completer3.m6744d(cause);
                }
            }
        } catch (UndeclaredThrowableException e4) {
            Throwable cause2 = e4.getCause();
            CallbackToFutureAdapter.Completer completer4 = this.f2934b;
            r0 = r02;
            if (completer4 != null) {
                completer4.m6744d(cause2);
                r0 = r02;
            }
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f2933a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.f2929g;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f2928f.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ListenableFuture listenableFuture2 = this.f2930i;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f2933a.get(j, timeUnit);
    }
}
