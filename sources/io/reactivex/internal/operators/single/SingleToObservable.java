package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleToObservable<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final SingleSource f49101a;

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f49102c;

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f49102c, disposable)) {
                this.f49102c = disposable;
                this.f47575a.mo17593c(this);
            }
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f49102c.dispose();
        }
    }

    public SingleToObservable(SingleSource singleSource) {
        this.f49101a = singleSource;
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        this.f49101a.mo17600a(new SingleToObservableObserver(observer));
    }
}
