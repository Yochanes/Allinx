package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public final class DelayObserver implements Observer<U> {

        /* JADX INFO: renamed from: a */
        public boolean f50543a;

        /* JADX INFO: compiled from: Proguard */
        public final class OnComplete implements Observer<T> {
            @Override // io.reactivex.rxjava3.core.Observer
            /* JADX INFO: renamed from: c */
            public final void mo12365c(Disposable disposable) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50543a) {
                return;
            }
            this.f50543a = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50543a) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50543a = true;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        observer.mo12365c(new SequentialDisposable());
        throw null;
    }
}
