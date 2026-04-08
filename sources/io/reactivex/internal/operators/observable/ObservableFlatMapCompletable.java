package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlatMapCompletable<T> extends AbstractObservableWithUpstream<T, T> {
    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new FlatMapCompletableMainObserver(observer);
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48675a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48676b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f48677c = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public Disposable f48678d;

        /* JADX INFO: compiled from: Proguard */
        public final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
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

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                throw null;
            }
        }

        public FlatMapCompletableMainObserver(Observer observer) {
            this.f48675a = observer;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48678d, disposable)) {
                this.f48678d = disposable;
                this.f48675a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48678d.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48678d.dispose();
            this.f48677c.dispose();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.f48676b;
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                Observer observer = this.f48675a;
                if (thM17888b != null) {
                    observer.onError(thM17888b);
                } else {
                    observer.onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48676b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f48675a.onError(ExceptionHelper.m17888b(atomicThrowable));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48678d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }
    }
}
