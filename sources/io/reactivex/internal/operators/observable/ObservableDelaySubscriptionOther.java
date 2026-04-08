package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public final class DelayObserver implements Observer<U> {

        /* JADX INFO: renamed from: a */
        public boolean f48638a;

        /* JADX INFO: compiled from: Proguard */
        public final class OnComplete implements Observer<T> {
            @Override // io.reactivex.Observer
            /* JADX INFO: renamed from: c */
            public final void mo17593c(Disposable disposable) {
                throw null;
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
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48638a) {
                return;
            }
            this.f48638a = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48638a) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48638a = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            onComplete();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new SequentialDisposable());
        throw null;
    }
}
