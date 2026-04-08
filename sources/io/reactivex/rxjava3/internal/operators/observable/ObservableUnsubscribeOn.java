package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableUnsubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50904a;

        /* JADX INFO: renamed from: b */
        public Disposable f50905b;

        /* JADX INFO: compiled from: Proguard */
        public final class DisposeTask implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public UnsubscribeObserver(Observer observer) {
            this.f50904a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50905b, disposable)) {
                this.f50905b = disposable;
                this.f50904a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f50904a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50904a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.f50904a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new UnsubscribeObserver(observer));
    }
}
