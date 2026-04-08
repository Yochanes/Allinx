package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableConcatMapScheduler<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public SimpleQueue f50507a;

        /* JADX INFO: renamed from: b */
        public Disposable f50508b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f50509c;

        /* JADX INFO: renamed from: d */
        public int f50510d;

        /* JADX INFO: compiled from: Proguard */
        public static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {
            @Override // io.reactivex.rxjava3.core.Observer
            /* JADX INFO: renamed from: c */
            public final void mo12365c(Disposable disposable) {
                DisposableHelper.m17954c(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m18137a() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50508b, disposable)) {
                this.f50508b = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo17962e = queueDisposable.mo17962e(3);
                    if (iMo17962e == 1) {
                        this.f50510d = iMo17962e;
                        this.f50507a = queueDisposable;
                        throw null;
                    }
                    if (iMo17962e == 2) {
                        this.f50510d = iMo17962e;
                        this.f50507a = queueDisposable;
                        throw null;
                    }
                }
                this.f50507a = new SpscLinkedArrayQueue(0);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50509c;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50509c = true;
            this.f50508b.dispose();
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            m18137a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50510d == 0) {
                this.f50507a.offer(obj);
            }
            m18137a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            SimpleQueue simpleQueue = this.f50507a;
            if (!this.f50509c) {
                throw null;
            }
            simpleQueue.clear();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public SimpleQueue f50511a;

        /* JADX INFO: renamed from: b */
        public Disposable f50512b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f50513c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50514d;

        /* JADX INFO: renamed from: f */
        public int f50515f;

        /* JADX INFO: compiled from: Proguard */
        public static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {
            @Override // io.reactivex.rxjava3.core.Observer
            /* JADX INFO: renamed from: c */
            public final void mo12365c(Disposable disposable) {
                DisposableHelper.m17954c(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50512b, disposable)) {
                this.f50512b = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo17962e = queueDisposable.mo17962e(3);
                    if (iMo17962e == 1) {
                        this.f50515f = iMo17962e;
                        this.f50511a = queueDisposable;
                        this.f50514d = true;
                        throw null;
                    }
                    if (iMo17962e == 2) {
                        this.f50515f = iMo17962e;
                        this.f50511a = queueDisposable;
                        throw null;
                    }
                }
                this.f50511a = new SpscLinkedArrayQueue(0);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50513c;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50513c = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50514d) {
                return;
            }
            this.f50514d = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50514d) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50514d = true;
                this.f50513c = true;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50514d) {
                return;
            }
            if (this.f50515f == 0) {
                this.f50511a.offer(obj);
            }
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.f50513c) {
                boolean z2 = this.f50514d;
                try {
                    boolean z3 = this.f50511a.poll() == null;
                    if (z2 && z3) {
                        this.f50513c = true;
                        throw null;
                    }
                    if (!z3) {
                        try {
                            throw null;
                        } finally {
                        }
                    } else if (decrementAndGet() == 0) {
                        return;
                    }
                } finally {
                }
            }
            this.f50511a.clear();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        throw null;
    }
}
