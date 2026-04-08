package androidx.media3.common.util;

import java.lang.Exception;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: a */
    public Exception f25647a;

    /* JADX INFO: renamed from: b */
    public Object f25648b;

    /* JADX INFO: renamed from: c */
    public Thread f25649c;

    /* JADX INFO: renamed from: d */
    public boolean f25650d;

    /* JADX INFO: renamed from: b */
    public abstract Object mo9575b();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f25650d;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        throw null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        TimeUnit.MILLISECONDS.convert(j, timeUnit);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void mo9574a() {
    }
}
