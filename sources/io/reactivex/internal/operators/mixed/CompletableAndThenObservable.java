package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableAndThenObservable<R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AndThenObservableObserver<R> extends AtomicReference<Disposable> implements Observer<R>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48398a;

        public AndThenObservableObserver(Observer observer) {
            this.f48398a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17617c(this, disposable);
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
            this.f48398a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48398a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48398a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new AndThenObservableObserver(observer));
        throw null;
    }
}
