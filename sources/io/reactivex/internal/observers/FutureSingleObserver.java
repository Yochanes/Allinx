package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FutureSingleObserver<T> extends CountDownLatch implements SingleObserver<T>, Future<T>, Disposable {
    @Override // io.reactivex.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo17602c(Disposable disposable) {
        DisposableHelper.m17619f(null, disposable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        if (getCount() != 0) {
            await();
        }
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException();
        }
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }
}
