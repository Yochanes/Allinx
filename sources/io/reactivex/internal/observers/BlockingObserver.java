package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public static final Object f47574a = null;

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        DisposableHelper.m17619f(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return get() == DisposableHelper.f47552a;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (DisposableHelper.m17615a(this)) {
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        throw null;
    }
}
