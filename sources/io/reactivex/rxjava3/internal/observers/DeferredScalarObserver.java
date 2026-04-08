package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements Observer<T> {

    /* JADX INFO: renamed from: c */
    public Disposable f49481c;

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (DisposableHelper.m17956f(this.f49481c, disposable)) {
            this.f49481c = disposable;
            this.f49479a.mo12365c(this);
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        super.dispose();
        this.f49481c.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        Object obj = this.f49480b;
        if (obj != null) {
            this.f49480b = null;
            m17973a(obj);
        } else {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f49479a.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        this.f49480b = null;
        m17974b(th);
    }
}
