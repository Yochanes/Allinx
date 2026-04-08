package androidx.camera.core.impl.utils.futures;

import androidx.activity.compose.C0044a;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Futures {

    /* JADX INFO: renamed from: a */
    public static final Function f2936a = new C02992();

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.Futures$1 */
    /* JADX INFO: compiled from: Proguard */
    class C02981 implements AsyncFunction<Object, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function f2937a;

        public C02981(Function function) {
            this.f2937a = function;
        }

        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.android.datatransport.Transformer
        public final ListenableFuture apply(Object obj) {
            return Futures.m1630g(this.f2937a.apply(obj));
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.Futures$3 */
    /* JADX INFO: compiled from: Proguard */
    class C03003 implements FutureCallback<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f2938a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function f2939b;

        public C03003(CallbackToFutureAdapter.Completer completer) {
            Function function = Futures.f2936a;
            this.f2938a = completer;
            this.f2939b = function;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            this.f2938a.m6744d(th);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            CallbackToFutureAdapter.Completer completer = this.f2938a;
            try {
                completer.m6742b(obj);
            } catch (Throwable th) {
                completer.m6744d(th);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.Futures$4 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC03014 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ListenableFuture f2940a;

        public RunnableC03014(ListenableFuture listenableFuture) {
            this.f2940a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2940a.cancel(true);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CallbackListener<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ListenableFuture f2941a;

        /* JADX INFO: renamed from: b */
        public final FutureCallback f2942b;

        public CallbackListener(ListenableFuture listenableFuture, FutureCallback futureCallback) {
            this.f2941a = listenableFuture;
            this.f2942b = futureCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FutureCallback futureCallback = this.f2942b;
            try {
                futureCallback.onSuccess(Futures.m1626c(this.f2941a));
            } catch (Error e) {
                e = e;
                futureCallback.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                futureCallback.onFailure(e);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    futureCallback.onFailure(e3);
                } else {
                    futureCallback.onFailure(cause);
                }
            }
        }

        public final String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.f2942b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1624a(ListenableFuture listenableFuture, FutureCallback futureCallback, Executor executor) {
        futureCallback.getClass();
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    /* JADX INFO: renamed from: b */
    public static ListenableFuture m1625b(List list) {
        return new ListFuture(new ArrayList(list), true, CameraXExecutors.m1615a());
    }

    /* JADX INFO: renamed from: c */
    public static Object m1626c(ListenableFuture listenableFuture) {
        Preconditions.m7699f(listenableFuture.isDone(), "Future was expected to be done, " + listenableFuture);
        return m1627d(listenableFuture);
    }

    /* JADX INFO: renamed from: d */
    public static Object m1627d(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public static ListenableFuture m1628e(Exception exc) {
        return new ImmediateFuture.ImmediateFailedFuture(exc);
    }

    /* JADX INFO: renamed from: f */
    public static ScheduledFuture m1629f(RejectedExecutionException rejectedExecutionException) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(rejectedExecutionException);
    }

    /* JADX INFO: renamed from: g */
    public static ListenableFuture m1630g(Object obj) {
        return obj == null ? ImmediateFuture.ImmediateSuccessfulFuture.f2944b : new ImmediateFuture.ImmediateSuccessfulFuture(obj);
    }

    /* JADX INFO: renamed from: h */
    public static ListenableFuture m1631h(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return listenableFuture.isDone() ? listenableFuture : CallbackToFutureAdapter.m6740a(new C0044a(listenableFuture, 2));
    }

    /* JADX INFO: renamed from: i */
    public static void m1632i(boolean z2, ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer, Executor executor) {
        listenableFuture.getClass();
        completer.getClass();
        executor.getClass();
        m1624a(listenableFuture, new C03003(completer), executor);
        if (z2) {
            completer.m6741a(new RunnableC03014(listenableFuture), CameraXExecutors.m1615a());
        }
    }

    /* JADX INFO: renamed from: j */
    public static ListenableFuture m1633j(List list) {
        return new ListFuture(new ArrayList(list), false, CameraXExecutors.m1615a());
    }

    /* JADX INFO: renamed from: k */
    public static ListenableFuture m1634k(ListenableFuture listenableFuture, Function function, Executor executor) {
        return m1635l(listenableFuture, new C02981(function), executor);
    }

    /* JADX INFO: renamed from: l */
    public static ListenableFuture m1635l(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, listenableFuture);
        listenableFuture.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.Futures$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C02992 implements Function<Object, Object> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
