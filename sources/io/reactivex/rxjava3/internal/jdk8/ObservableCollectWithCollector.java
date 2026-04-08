package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableCollectWithCollector<T, A, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CollectorObserver<T, A, R> extends DeferredScalarDisposable<R> implements Observer<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f49438c;

        /* JADX INFO: renamed from: d */
        public boolean f49439d;

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f49438c, disposable)) {
                this.f49438c = disposable;
                this.f49479a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f49438c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f49439d) {
                return;
            }
            this.f49439d = true;
            this.f49438c = DisposableHelper.f49380a;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49479a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f49439d) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f49439d = true;
            this.f49438c = DisposableHelper.f49380a;
            this.f49479a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f49439d) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49438c.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptyDisposable.m17960f(th, observer);
        }
    }
}
