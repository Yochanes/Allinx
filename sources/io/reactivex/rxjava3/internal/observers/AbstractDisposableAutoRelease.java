package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractDisposableAutoRelease extends AtomicReference<Disposable> implements Disposable, LambdaConsumerIntrospection {
    /* JADX INFO: renamed from: c */
    public final void m17971c(Disposable disposable) {
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
        throw null;
    }

    public final void onComplete() {
        Disposable disposable = get();
        DisposableHelper disposableHelper = DisposableHelper.f49380a;
        if (disposable == disposableHelper) {
            throw null;
        }
        lazySet(disposableHelper);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            RxJavaPlugins.m18275b(th);
            throw null;
        }
    }

    public final void onError(Throwable th) {
        Disposable disposable = get();
        DisposableHelper disposableHelper = DisposableHelper.f49380a;
        if (disposable == disposableHelper) {
            RxJavaPlugins.m18275b(th);
            throw null;
        }
        lazySet(disposableHelper);
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m17950a(th2);
            RxJavaPlugins.m18275b(new CompositeException(th, th2));
            throw null;
        }
    }
}
