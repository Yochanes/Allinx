package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTake<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public boolean f48905a;

        /* JADX INFO: renamed from: b */
        public Disposable f48906b;

        /* JADX INFO: renamed from: c */
        public long f48907c;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48906b, disposable)) {
                this.f48906b = disposable;
                if (this.f48907c != 0) {
                    throw null;
                }
                this.f48905a = true;
                disposable.dispose();
                EmptyDisposable.m17621a(null);
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48906b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48906b.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48905a) {
                return;
            }
            this.f48905a = true;
            this.f48906b.dispose();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48905a) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48905a = true;
                this.f48906b.dispose();
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48905a) {
                return;
            }
            long j = this.f48907c;
            this.f48907c = j - 1;
            if (j > 0) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
