package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends Completable implements FuseToObservable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements Disposable, Observer<T> {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f48679a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48680b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f48681c = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public Disposable f48682d;

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

        public FlatMapCompletableMainObserver(CompletableObserver completableObserver) {
            this.f48679a = completableObserver;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48682d, disposable)) {
                this.f48682d = disposable;
                this.f48679a.mo17580c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48682d.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48682d.dispose();
            this.f48681c.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.f48680b;
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                CompletableObserver completableObserver = this.f48679a;
                if (thM17888b != null) {
                    completableObserver.onError(thM17888b);
                } else {
                    completableObserver.onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48680b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f48679a.onError(ExceptionHelper.m17888b(atomicThrowable));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48682d.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new FlatMapCompletableMainObserver(completableObserver);
        throw null;
    }
}
