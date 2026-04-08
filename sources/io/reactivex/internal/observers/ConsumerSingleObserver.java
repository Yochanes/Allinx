package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, LambdaConsumerIntrospection {
    @Override // io.reactivex.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo17602c(Disposable disposable) {
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

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.f47552a);
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m17612a(th2);
            RxJavaPlugins.m17911b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        lazySet(DisposableHelper.f47552a);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            RxJavaPlugins.m17911b(th);
        }
    }
}
