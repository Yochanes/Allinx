package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSkipUntil<T, U> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public final class SkipUntil implements Observer<U> {

        /* JADX INFO: renamed from: a */
        public Disposable f48883a;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48883a, disposable)) {
                this.f48883a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48883a.dispose();
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new SerializedObserver(observer).mo17593c(new ArrayCompositeDisposable(2));
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipUntilObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public Disposable f48884a;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48884a, disposable)) {
                this.f48884a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
        }
    }
}
