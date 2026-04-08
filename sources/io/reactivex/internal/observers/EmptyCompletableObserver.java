package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, LambdaConsumerIntrospection {
    @Override // io.reactivex.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo17580c(Disposable disposable) {
        DisposableHelper.m17619f(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return get() == DisposableHelper.f47552a;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17615a(this);
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        lazySet(DisposableHelper.f47552a);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.f47552a);
        RxJavaPlugins.m17911b(new OnErrorNotImplementedException(th));
    }
}
