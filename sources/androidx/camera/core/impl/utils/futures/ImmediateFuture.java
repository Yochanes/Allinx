package androidx.camera.core.impl.utils.futures;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
abstract class ImmediateFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: compiled from: Proguard */
    public static class ImmediateFailedFuture<V> extends ImmediateFuture<V> {

        /* JADX INFO: renamed from: a */
        public final Exception f2943a;

        public ImmediateFailedFuture(Exception exc) {
            this.f2943a = exc;
        }

        @Override // java.util.concurrent.Future
        public final Object get() throws ExecutionException {
            throw new ExecutionException(this.f2943a);
        }

        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f2943a + "]]";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ImmediateFailedScheduledFuture<V> extends ImmediateFailedFuture<V> implements ScheduledFuture<V> {
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {

        /* JADX INFO: renamed from: b */
        public static final ImmediateSuccessfulFuture f2944b = new ImmediateSuccessfulFuture(null);

        /* JADX INFO: renamed from: a */
        public final Object f2945a;

        public ImmediateSuccessfulFuture(Object obj) {
            this.f2945a = obj;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.f2945a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            return AbstractC0000a.m18o(sb, this.f2945a, "]]");
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger.m1283d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
