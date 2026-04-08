package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeToObservable<T> extends Observable<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f48392c;

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48392c, disposable)) {
                this.f48392c = disposable;
                this.f47575a.mo17593c(this);
            }
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f48392c.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f47575a.onComplete();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new MaybeToObservableObserver(observer);
        throw null;
    }
}
