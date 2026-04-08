package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlattenIterable<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlattenIterableObserver<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48697a;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48697a, disposable)) {
                this.f48697a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48697a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48697a.dispose();
            this.f48697a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Disposable disposable = this.f48697a;
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper) {
                return;
            }
            this.f48697a = disposableHelper;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Disposable disposable = this.f48697a;
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48697a = disposableHelper;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48697a == DisposableHelper.f47552a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48697a.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
