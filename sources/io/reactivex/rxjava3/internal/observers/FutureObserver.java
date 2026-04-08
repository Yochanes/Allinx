package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public Object f49484a;

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        DisposableHelper.m17955e(null, disposable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
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

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.f49484a != null) {
            throw null;
        }
        onError(new NoSuchElementException("The source is empty"));
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.f49484a != null) {
            throw null;
        }
        this.f49484a = obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(ExceptionHelper.m18250e(j, timeUnit));
        }
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
    }
}
