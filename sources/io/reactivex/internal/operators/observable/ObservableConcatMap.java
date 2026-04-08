package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableConcatMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48586a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48587b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final DelayErrorInnerObserver f48588c;

        /* JADX INFO: renamed from: d */
        public SimpleQueue f48589d;

        /* JADX INFO: renamed from: f */
        public Disposable f48590f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48591g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48592i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f48593j;

        /* JADX INFO: renamed from: n */
        public int f48594n;

        /* JADX INFO: compiled from: Proguard */
        public static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {

            /* JADX INFO: renamed from: a */
            public final Observer f48595a;

            /* JADX INFO: renamed from: b */
            public final ConcatMapDelayErrorObserver f48596b;

            public DelayErrorInnerObserver(Observer observer, ConcatMapDelayErrorObserver concatMapDelayErrorObserver) {
                this.f48595a = observer;
                this.f48596b = concatMapDelayErrorObserver;
            }

            @Override // io.reactivex.Observer
            /* JADX INFO: renamed from: c */
            public final void mo17593c(Disposable disposable) {
                DisposableHelper.m17617c(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.f48596b;
                concatMapDelayErrorObserver.f48591g = false;
                concatMapDelayErrorObserver.m17783a();
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.f48596b;
                AtomicThrowable atomicThrowable = concatMapDelayErrorObserver.f48587b;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                    return;
                }
                concatMapDelayErrorObserver.f48590f.dispose();
                concatMapDelayErrorObserver.f48591g = false;
                concatMapDelayErrorObserver.m17783a();
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                this.f48595a.onNext(obj);
            }
        }

        public ConcatMapDelayErrorObserver(Observer observer) {
            this.f48586a = observer;
            this.f48588c = new DelayErrorInnerObserver(observer, this);
        }

        /* JADX INFO: renamed from: a */
        public final void m17783a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f48586a;
            SimpleQueue simpleQueue = this.f48589d;
            AtomicThrowable atomicThrowable = this.f48587b;
            do {
                if (!this.f48591g) {
                    if (this.f48593j) {
                        simpleQueue.clear();
                        return;
                    }
                    if (atomicThrowable.get() != null) {
                        simpleQueue.clear();
                        this.f48593j = true;
                        observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                        return;
                    }
                    boolean z2 = this.f48592i;
                    try {
                        boolean z3 = simpleQueue.poll() == null;
                        if (z2 && z3) {
                            this.f48593j = true;
                            atomicThrowable.getClass();
                            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                            if (thM17888b != null) {
                                observer.onError(thM17888b);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                        if (!z3) {
                            try {
                                throw null;
                            } catch (Throwable th) {
                                Exceptions.m17612a(th);
                                this.f48593j = true;
                                this.f48590f.dispose();
                                simpleQueue.clear();
                                atomicThrowable.getClass();
                                ExceptionHelper.m17887a(atomicThrowable, th);
                                observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.m17612a(th2);
                        this.f48593j = true;
                        this.f48590f.dispose();
                        atomicThrowable.getClass();
                        ExceptionHelper.m17887a(atomicThrowable, th2);
                        observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                        return;
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48590f, disposable)) {
                this.f48590f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo17626e = queueDisposable.mo17626e(3);
                    if (iMo17626e == 1) {
                        this.f48594n = iMo17626e;
                        this.f48589d = queueDisposable;
                        this.f48592i = true;
                        this.f48586a.mo17593c(this);
                        m17783a();
                        return;
                    }
                    if (iMo17626e == 2) {
                        this.f48594n = iMo17626e;
                        this.f48589d = queueDisposable;
                        this.f48586a.mo17593c(this);
                        return;
                    }
                }
                this.f48589d = new SpscLinkedArrayQueue(0);
                this.f48586a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48593j;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48593j = true;
            this.f48590f.dispose();
            DelayErrorInnerObserver delayErrorInnerObserver = this.f48588c;
            delayErrorInnerObserver.getClass();
            DisposableHelper.m17615a(delayErrorInnerObserver);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48592i = true;
            m17783a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48587b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48592i = true;
                m17783a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48594n == 0) {
                this.f48589d.offer(obj);
            }
            m17783a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SourceObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public SimpleQueue f48597a;

        /* JADX INFO: renamed from: b */
        public Disposable f48598b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f48599c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48600d;

        /* JADX INFO: renamed from: f */
        public int f48601f;

        /* JADX INFO: compiled from: Proguard */
        public static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {
            @Override // io.reactivex.Observer
            /* JADX INFO: renamed from: c */
            public final void mo17593c(Disposable disposable) {
                DisposableHelper.m17618e(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m17784a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f48599c) {
                boolean z2 = this.f48600d;
                try {
                    boolean z3 = this.f48597a.poll() == null;
                    if (z2 && z3) {
                        this.f48599c = true;
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
            this.f48597a.clear();
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48598b, disposable)) {
                this.f48598b = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo17626e = queueDisposable.mo17626e(3);
                    if (iMo17626e == 1) {
                        this.f48601f = iMo17626e;
                        this.f48597a = queueDisposable;
                        this.f48600d = true;
                        throw null;
                    }
                    if (iMo17626e == 2) {
                        this.f48601f = iMo17626e;
                        this.f48597a = queueDisposable;
                        throw null;
                    }
                }
                this.f48597a = new SpscLinkedArrayQueue(0);
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48599c;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48599c = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48600d) {
                return;
            }
            this.f48600d = true;
            m17784a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48600d) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48600d = true;
                this.f48599c = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48600d) {
                return;
            }
            if (this.f48601f == 0) {
                this.f48597a.offer(obj);
            }
            m17784a();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new ConcatMapDelayErrorObserver(observer);
        throw null;
    }
}
