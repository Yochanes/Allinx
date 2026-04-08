package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToObservable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableIgnoreElementsCompletable<T> extends Completable implements FuseToObservable<T> {
    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IgnoreObservable<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48730a;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            this.f48730a = disposable;
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48730a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48730a.dispose();
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
