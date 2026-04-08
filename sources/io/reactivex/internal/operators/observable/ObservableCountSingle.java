package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableCountSingle<T> extends Single<Long> implements FuseToObservable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CountObserver implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48620a;

        /* JADX INFO: renamed from: b */
        public long f48621b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48620a, disposable)) {
                this.f48620a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48620a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48620a.dispose();
            this.f48620a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48620a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48620a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48621b++;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
