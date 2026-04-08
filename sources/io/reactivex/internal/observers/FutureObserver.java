package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public Object f47579a;

    /* JADX INFO: renamed from: b */
    public Throwable f47580b;

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
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

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f47579a != null) {
            throw null;
        }
        onError(new NoSuchElementException("The source is empty"));
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f47580b != null) {
            RxJavaPlugins.m17911b(th);
        } else {
            this.f47580b = th;
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f47579a != null) {
            throw null;
        }
        this.f47579a = obj;
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
