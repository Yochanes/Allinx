package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableLastSingle<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class LastObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48748a;

        /* JADX INFO: renamed from: b */
        public Object f48749b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48748a, disposable)) {
                this.f48748a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48748a == DisposableHelper.f47552a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48748a.dispose();
            this.f48748a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48748a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48748a = DisposableHelper.f47552a;
            this.f48749b = null;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48749b = obj;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
