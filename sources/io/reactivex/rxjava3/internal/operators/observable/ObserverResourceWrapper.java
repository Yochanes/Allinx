package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (DisposableHelper.m17955e(null, disposable)) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17952a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        DisposableHelper.m17952a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        DisposableHelper.m17952a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        throw null;
    }
}
