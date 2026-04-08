package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48886a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48887b = new AtomicReference();

        public SubscribeOnObserver(Observer observer) {
            this.f48886a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this.f48887b, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this.f48887b);
            DisposableHelper.m17615a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48886a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48886a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48886a.onNext(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class SubscribeTask implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new SubscribeOnObserver(observer));
        throw null;
    }
}
