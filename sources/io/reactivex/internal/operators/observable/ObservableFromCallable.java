package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromCallable<T> extends Observable<T> implements Callable<T> {
    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.mo17593c(deferredScalarDisposable);
        if (deferredScalarDisposable.mo17596d()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            if (deferredScalarDisposable.mo17596d()) {
                RxJavaPlugins.m17911b(th);
            } else {
                observer.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        throw null;
    }
}
