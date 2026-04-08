package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {
    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        if (DisposableHelper.m17619f(this, disposable)) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                disposable.dispose();
                onError(th);
            }
        }
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

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (mo17596d()) {
            return;
        }
        lazySet(DisposableHelper.f47552a);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            RxJavaPlugins.m17911b(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (mo17596d()) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        lazySet(DisposableHelper.f47552a);
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m17612a(th2);
            RxJavaPlugins.m17911b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (mo17596d()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            get().dispose();
            onError(th);
        }
    }
}
