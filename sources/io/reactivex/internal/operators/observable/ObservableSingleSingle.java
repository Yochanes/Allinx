package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSingleSingle<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48872a;

        /* JADX INFO: renamed from: b */
        public Object f48873b;

        /* JADX INFO: renamed from: c */
        public boolean f48874c;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48872a, disposable)) {
                this.f48872a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48872a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48872a.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48874c) {
                return;
            }
            this.f48874c = true;
            Object obj = this.f48873b;
            this.f48873b = null;
            obj.getClass();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48874c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48874c = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48874c) {
                return;
            }
            if (this.f48873b == null) {
                this.f48873b = obj;
                return;
            }
            this.f48874c = true;
            this.f48872a.dispose();
            new IllegalArgumentException("Sequence contains more than one element!");
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
