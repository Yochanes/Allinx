package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        if (DisposableHelper.m17619f(null, disposable)) {
            throw null;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17615a(null);
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        DisposableHelper.m17615a(null);
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        DisposableHelper.m17615a(null);
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        throw null;
    }
}
