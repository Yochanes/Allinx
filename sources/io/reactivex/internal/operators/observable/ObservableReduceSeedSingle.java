package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableReduceSeedSingle<T, R> extends Single<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ReduceSeedObserver<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Object f48802a;

        /* JADX INFO: renamed from: b */
        public Disposable f48803b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48803b, disposable)) {
                this.f48803b = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48803b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48803b.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48802a == null) {
                return;
            }
            this.f48802a = null;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48802a == null) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48802a = null;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48802a == null) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48803b.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
