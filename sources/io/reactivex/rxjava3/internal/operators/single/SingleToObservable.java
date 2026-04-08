package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleToObservable<T> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f51067c;

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f51067c, disposable)) {
                this.f51067c = disposable;
                this.f49479a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f51067c.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        new SingleToObservableObserver(observer);
        throw null;
    }
}
