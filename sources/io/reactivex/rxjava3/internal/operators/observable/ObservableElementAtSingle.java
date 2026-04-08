package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableElementAtSingle<T> extends Single<T> implements FuseToObservable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f50570a;

        /* JADX INFO: renamed from: b */
        public boolean f50571b;

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50570a, disposable)) {
                this.f50570a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50570a.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50570a.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50571b) {
                return;
            }
            this.f50571b = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50571b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50571b = true;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (!this.f50571b) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        throw null;
    }
}
