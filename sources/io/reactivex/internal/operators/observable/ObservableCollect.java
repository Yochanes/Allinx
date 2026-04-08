package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableCollect<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CollectObserver<T, U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48581a;

        /* JADX INFO: renamed from: b */
        public boolean f48582b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48581a, disposable)) {
                this.f48581a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48581a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48581a.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48582b) {
                return;
            }
            this.f48582b = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48582b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48582b = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48582b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                this.f48581a.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            EmptyDisposable.m17624f(th, observer);
        }
    }
}
