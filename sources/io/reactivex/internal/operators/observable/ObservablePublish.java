package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservablePublish<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InnerDisposable<T> extends AtomicReference<Object> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48791a;

        public InnerDisposable(Observer observer) {
            this.f48791a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == this;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PublishObserver<T> implements Observer<T>, Disposable {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(null, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
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

    /* JADX INFO: compiled from: Proguard */
    public static final class PublishSource<T> implements ObservableSource<T> {
        @Override // io.reactivex.ObservableSource
        /* JADX INFO: renamed from: a */
        public final void mo17591a(Observer observer) {
            observer.mo17593c(new InnerDisposable(observer));
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
