package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableJust<T> extends Observable<T> implements ScalarSupplier<T> {

    /* JADX INFO: renamed from: a */
    public final Object f50678a;

    public ObservableJust(Object obj) {
        this.f50678a = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return this.f50678a;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(observer, this.f50678a);
        observer.mo12365c(scalarDisposable);
        scalarDisposable.run();
    }
}
