package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableAny<T> extends AbstractObservableWithUpstream<T, Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AnyObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48548a;

        /* JADX INFO: renamed from: b */
        public boolean f48549b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48548a, disposable)) {
                this.f48548a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48548a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48548a.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48549b) {
                return;
            }
            this.f48549b = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48549b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48549b = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48549b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48548a.dispose();
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
