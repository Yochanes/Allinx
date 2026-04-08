package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.annotations.Experimental;
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
@Experimental
public final class ObservableConcatMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f48471a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48472b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final ConcatMapInnerObserver f48473c = new ConcatMapInnerObserver(this);

        /* JADX INFO: renamed from: d */
        public SimpleQueue f48474d;

        /* JADX INFO: renamed from: f */
        public Disposable f48475f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48476g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48477i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f48478j;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final ConcatMapCompletableObserver f48479a;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver concatMapCompletableObserver) {
                this.f48479a = concatMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                DisposableHelper.m17617c(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.f48479a;
                concatMapCompletableObserver.f48476g = false;
                concatMapCompletableObserver.m17771a();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.f48479a;
                AtomicThrowable atomicThrowable = concatMapCompletableObserver.f48472b;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                } else {
                    concatMapCompletableObserver.f48476g = false;
                    concatMapCompletableObserver.m17771a();
                }
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver) {
            this.f48471a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17771a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.f48472b;
            while (!this.f48478j) {
                if (!this.f48476g) {
                    boolean z2 = this.f48477i;
                    try {
                        if (this.f48474d.poll() != null) {
                            throw null;
                        }
                        if (z2) {
                            this.f48478j = true;
                            atomicThrowable.getClass();
                            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                            if (thM17888b != null) {
                                this.f48471a.onError(thM17888b);
                                return;
                            } else {
                                this.f48471a.onComplete();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.m17612a(th);
                        this.f48478j = true;
                        this.f48474d.clear();
                        this.f48475f.dispose();
                        atomicThrowable.getClass();
                        ExceptionHelper.m17887a(atomicThrowable, th);
                        this.f48471a.onError(ExceptionHelper.m17888b(atomicThrowable));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f48474d.clear();
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48475f, disposable)) {
                this.f48475f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo17626e = queueDisposable.mo17626e(3);
                    if (iMo17626e == 1) {
                        this.f48474d = queueDisposable;
                        this.f48477i = true;
                        this.f48471a.mo17580c(this);
                        m17771a();
                        return;
                    }
                    if (iMo17626e == 2) {
                        this.f48474d = queueDisposable;
                        this.f48471a.mo17580c(this);
                        return;
                    }
                }
                this.f48474d = new SpscLinkedArrayQueue(0);
                this.f48471a.mo17580c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48478j;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48478j = true;
            this.f48475f.dispose();
            ConcatMapInnerObserver concatMapInnerObserver = this.f48473c;
            concatMapInnerObserver.getClass();
            DisposableHelper.m17615a(concatMapInnerObserver);
            if (getAndIncrement() == 0) {
                this.f48474d.clear();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48477i = true;
            m17771a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48472b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48477i = true;
                m17771a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (obj != null) {
                this.f48474d.offer(obj);
            }
            m17771a();
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new ConcatMapCompletableObserver(completableObserver);
        throw null;
    }
}
