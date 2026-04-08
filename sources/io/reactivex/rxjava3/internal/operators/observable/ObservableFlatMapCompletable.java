package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlatMapCompletable<T> extends AbstractObservableWithUpstream<T, T> {
    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new FlatMapCompletableMainObserver(observer));
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50597a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f50598b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f50599c = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public Disposable f50600d;

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

        public FlatMapCompletableMainObserver(Observer observer) {
            this.f50597a = observer;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50600d, disposable)) {
                this.f50600d = disposable;
                this.f50597a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50600d.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50600d.dispose();
            this.f50599c.dispose();
            this.f50598b.m18232b();
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f50598b.m18234d(this.f50597a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50598b.m18231a(th)) {
                this.f50600d.dispose();
                this.f50599c.dispose();
                this.f50598b.m18234d(this.f50597a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50600d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
        }
    }
}
