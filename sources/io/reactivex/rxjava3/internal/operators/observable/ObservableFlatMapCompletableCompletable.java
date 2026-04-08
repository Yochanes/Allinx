package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends Completable implements FuseToObservable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements Disposable, Observer<T> {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f50601a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f50602b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f50603c = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public Disposable f50604d;

        /* JADX INFO: compiled from: Proguard */
        public final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
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

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                throw null;
            }
        }

        public FlatMapCompletableMainObserver(CompletableObserver completableObserver) {
            this.f50601a = completableObserver;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50604d, disposable)) {
                this.f50604d = disposable;
                this.f50601a.mo12363c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50604d.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50604d.dispose();
            this.f50603c.dispose();
            this.f50602b.m18232b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f50602b.m18233c(this.f50601a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50602b.m18231a(th)) {
                this.f50604d.dispose();
                this.f50603c.dispose();
                this.f50602b.m18233c(this.f50601a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50604d.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new FlatMapCompletableMainObserver(completableObserver);
        throw null;
    }
}
