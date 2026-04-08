package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.schedulers.Timed;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTimeInterval<T> extends AbstractObservableWithUpstream<T, Timed<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeIntervalObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48934a;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48934a, disposable)) {
                this.f48934a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48934a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48934a.dispose();
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
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
