package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromCallable<T> extends Observable<T> implements Supplier<T> {
    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.mo12365c(deferredScalarDisposable);
        if (deferredScalarDisposable.mo12353d()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            if (deferredScalarDisposable.mo12353d()) {
                RxJavaPlugins.m18275b(th);
            } else {
                observer.onError(th);
            }
        }
    }
}
