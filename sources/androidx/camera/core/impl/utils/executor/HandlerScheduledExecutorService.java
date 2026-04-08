package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class HandlerScheduledExecutorService extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a */
    public final Handler f2898a;

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C02901 extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        public final ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return CameraXExecutors.m1618d();
            }
            if (Looper.myLooper() != null) {
                return new HandlerScheduledExecutorService(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$2 */
    /* JADX INFO: compiled from: Proguard */
    class CallableC02912 implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f2899a;

        public CallableC02912(Runnable runnable) {
            this.f2899a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            this.f2899a.run();
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class HandlerScheduledFuture<V> implements RunnableScheduledFuture<V> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference f2900a = new AtomicReference(null);

        /* JADX INFO: renamed from: b */
        public final long f2901b;

        /* JADX INFO: renamed from: c */
        public final Callable f2902c;

        /* JADX INFO: renamed from: d */
        public final ListenableFuture f2903d;

        /* JADX INFO: renamed from: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$HandlerScheduledFuture$1 */
        /* JADX INFO: compiled from: Proguard */
        class C02921 implements CallbackToFutureAdapter.Resolver<Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Handler f2904a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Callable f2905b;

            /* JADX INFO: renamed from: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$HandlerScheduledFuture$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: Proguard */
            class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C02921 c02921 = C02921.this;
                    if (HandlerScheduledFuture.this.f2900a.getAndSet(null) != null) {
                        c02921.f2904a.removeCallbacks(HandlerScheduledFuture.this);
                    }
                }
            }

            public C02921(Handler handler, Callable callable) {
                this.f2904a = handler;
                this.f2905b = callable;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            /* JADX INFO: renamed from: d */
            public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
                completer.m6741a(new AnonymousClass1(), CameraXExecutors.m1615a());
                HandlerScheduledFuture.this.f2900a.set(completer);
                return "HandlerScheduledFuture-" + this.f2905b.toString();
            }
        }

        public HandlerScheduledFuture(Handler handler, long j, Callable callable) {
            this.f2901b = j;
            this.f2902c = callable;
            this.f2903d = CallbackToFutureAdapter.m6740a(new C02921(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z2) {
            return this.f2903d.cancel(z2);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.f2903d.get();
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f2901b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f2903d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f2903d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.f2900a.getAndSet(null);
            if (completer != null) {
                try {
                    completer.m6742b(this.f2902c.call());
                } catch (Exception e) {
                    completer.m6744d(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return this.f2903d.get(j, timeUnit);
        }
    }

    static {
        new C02901();
    }

    public HandlerScheduledExecutorService(Handler handler) {
        this.f2898a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f2898a;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new CallableC02912(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f2898a;
        HandlerScheduledFuture handlerScheduledFuture = new HandlerScheduledFuture(handler, jConvert, callable);
        if (handler.postAtTime(handlerScheduledFuture, jConvert)) {
            return handlerScheduledFuture;
        }
        return Futures.m1629f(new RejectedExecutionException(handler + " is shutting down"));
    }
}
