package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFlatMapObservable<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48467a;

        public FlatMapObserver(Observer observer) {
            this.f48467a = observer;
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
            this.f48467a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48467a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48467a.onNext(obj);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48467a.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new FlatMapObserver(observer));
        throw null;
    }
}
