package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, LambdaConsumerIntrospection {
    @Override // io.reactivex.rxjava3.core.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo12363c(Disposable disposable) {
        DisposableHelper.m17955e(this, disposable);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return get() == DisposableHelper.f49380a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17952a(this);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        lazySet(DisposableHelper.f49380a);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.f49380a);
        RxJavaPlugins.m18275b(new OnErrorNotImplementedException(th));
    }
}
