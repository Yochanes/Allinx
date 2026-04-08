package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromFuture<T> extends Observable<T> {
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
                return;
            }
            observer.onError(th);
        }
    }
}
