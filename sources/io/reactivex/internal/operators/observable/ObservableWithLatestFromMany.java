package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableWithLatestFromMany<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public final class SingletonArrayFunc implements Function<T, R> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WithLatestFromObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public volatile boolean f49003a;

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
            DisposableHelper.m17615a(null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f49003a) {
                return;
            }
            this.f49003a = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f49003a) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49003a = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (!this.f49003a) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WithLatestInnerObserver extends AtomicReference<Disposable> implements Observer<Object> {

        /* JADX INFO: renamed from: a */
        public boolean f49004a;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (!this.f49004a) {
                throw null;
            }
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (!this.f49004a) {
                this.f49004a = true;
            }
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptyDisposable.m17624f(th, observer);
        }
    }
}
