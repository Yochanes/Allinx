package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMapObservable<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50391a;

        public FlatMapObserver(Observer observer) {
            this.f50391a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17954c(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50391a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50391a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50391a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50391a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        observer.mo12365c(new FlatMapObserver(observer));
        throw null;
    }
}
