package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        DisposableHelper.m17955e(this, disposable);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return DisposableHelper.m17953b(get());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17952a(this);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        RxJavaPlugins.m18275b(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
    }
}
