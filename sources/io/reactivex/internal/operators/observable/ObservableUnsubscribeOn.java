package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableUnsubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48941a;

        /* JADX INFO: renamed from: b */
        public Disposable f48942b;

        /* JADX INFO: compiled from: Proguard */
        public final class DisposeTask implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public UnsubscribeObserver(Observer observer) {
            this.f48941a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48942b, disposable)) {
                this.f48942b = disposable;
                this.f48941a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f48941a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48941a.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.f48941a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new UnsubscribeObserver(observer);
        throw null;
    }
}
