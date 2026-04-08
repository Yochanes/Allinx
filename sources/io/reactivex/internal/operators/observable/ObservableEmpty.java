package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableEmpty extends Observable<Object> implements ScalarCallable<Object> {
    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        EmptyDisposable.m17621a(observer);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }
}
