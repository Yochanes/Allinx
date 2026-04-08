package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements Observer<T> {

    /* JADX INFO: renamed from: c */
    public Disposable f47577c;

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        if (DisposableHelper.m17620h(this.f47577c, disposable)) {
            this.f47577c = disposable;
            this.f47575a.mo17593c(this);
        }
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
    public final void dispose() {
        super.dispose();
        this.f47577c.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        Object obj = this.f47576b;
        if (obj != null) {
            this.f47576b = null;
            m17632a(obj);
        } else {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f47575a.onComplete();
        }
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.Observer
    public final void onError(Throwable th) {
        this.f47576b = null;
        m17633b(th);
    }
}
