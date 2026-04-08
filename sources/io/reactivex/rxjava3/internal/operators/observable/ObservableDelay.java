package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DelayObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f50542a;

        /* JADX INFO: compiled from: Proguard */
        public final class OnComplete implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public final class OnError implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public final class OnNext implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50542a, disposable)) {
                this.f50542a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50542a.dispose();
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

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        throw null;
    }
}
