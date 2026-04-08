package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableConcatWithCompletable<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48612a;

        /* JADX INFO: renamed from: b */
        public boolean f48613b;

        public ConcatWithObserver(Observer observer) {
            this.f48612a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (!DisposableHelper.m17619f(this, disposable) || this.f48613b) {
                return;
            }
            this.f48612a.mo17593c(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48613b) {
                this.f48612a.onComplete();
            } else {
                this.f48613b = true;
                DisposableHelper.m17617c(this, null);
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48612a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48612a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new ConcatWithObserver(observer);
        throw null;
    }
}
