package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        DisposableHelper.m17619f(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return DisposableHelper.m17616b(get());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17615a(this);
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        RxJavaPlugins.m17911b(th);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
    }
}
