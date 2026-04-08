package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlatMapMaybe<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapMaybeObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48683a;

        /* JADX INFO: renamed from: g */
        public Disposable f48688g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48689i;

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f48684b = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f48686d = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f48685c = new AtomicInteger(1);

        /* JADX INFO: renamed from: f */
        public final AtomicReference f48687f = new AtomicReference();

        /* JADX INFO: compiled from: Proguard */
        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            @Override // io.reactivex.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo17586c(Disposable disposable) {
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

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public FlatMapMaybeObserver(Observer observer) {
            this.f48683a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17793a() {
            Observer observer = this.f48683a;
            AtomicInteger atomicInteger = this.f48685c;
            AtomicReference atomicReference = this.f48687f;
            int iAddAndGet = 1;
            while (!this.f48689i) {
                if (this.f48686d.get() != null) {
                    AtomicThrowable atomicThrowable = this.f48686d;
                    atomicThrowable.getClass();
                    Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.f48687f.get();
                    if (spscLinkedArrayQueue != null) {
                        spscLinkedArrayQueue.clear();
                    }
                    observer.onError(thM17888b);
                    return;
                }
                boolean z2 = atomicInteger.get() == 0;
                SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                Object objPoll = spscLinkedArrayQueue2 != null ? spscLinkedArrayQueue2.poll() : null;
                boolean z3 = objPoll == null;
                if (z2 && z3) {
                    AtomicThrowable atomicThrowable2 = this.f48686d;
                    atomicThrowable2.getClass();
                    Throwable thM17888b2 = ExceptionHelper.m17888b(atomicThrowable2);
                    if (thM17888b2 != null) {
                        observer.onError(thM17888b2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(objPoll);
                }
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue3 = (SpscLinkedArrayQueue) this.f48687f.get();
            if (spscLinkedArrayQueue3 != null) {
                spscLinkedArrayQueue3.clear();
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48688g, disposable)) {
                this.f48688g = disposable;
                this.f48683a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48689i;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48689i = true;
            this.f48688g.dispose();
            this.f48684b.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48685c.decrementAndGet();
            if (getAndIncrement() == 0) {
                m17793a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48685c.decrementAndGet();
            AtomicThrowable atomicThrowable = this.f48686d;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f48684b.dispose();
            if (getAndIncrement() == 0) {
                m17793a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48688g.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new FlatMapMaybeObserver(observer);
        throw null;
    }
}
