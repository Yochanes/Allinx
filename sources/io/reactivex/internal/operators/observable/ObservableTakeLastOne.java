package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTakeLastOne<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeLastOneObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48911a;

        /* JADX INFO: renamed from: b */
        public Object f48912b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48911a, disposable)) {
                this.f48911a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48911a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48912b = null;
            this.f48911a.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48912b.getClass();
            this.f48912b = null;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48912b = null;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48912b = obj;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
