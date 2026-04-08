package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableEmpty extends Observable<Object> implements ScalarSupplier<Object> {

    /* JADX INFO: renamed from: a */
    public static final ObservableEmpty f50572a = new ObservableEmpty();

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return null;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        EmptyDisposable.m17957a(observer);
    }
}
