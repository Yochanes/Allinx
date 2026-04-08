package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowBoundaryInnerObserver<T, B> extends DisposableObserver<B> {

        /* JADX INFO: renamed from: b */
        public final WindowBoundaryMainObserver f48972b;

        /* JADX INFO: renamed from: c */
        public boolean f48973c;

        public WindowBoundaryInnerObserver(WindowBoundaryMainObserver windowBoundaryMainObserver) {
            this.f48972b = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48973c) {
                return;
            }
            this.f48973c = true;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.f48972b;
            windowBoundaryMainObserver.f48982i.dispose();
            windowBoundaryMainObserver.f48983j = true;
            windowBoundaryMainObserver.m17837b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48973c) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f48973c = true;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.f48972b;
            windowBoundaryMainObserver.f48982i.dispose();
            AtomicThrowable atomicThrowable = windowBoundaryMainObserver.f48980f;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                windowBoundaryMainObserver.f48983j = true;
                windowBoundaryMainObserver.m17837b();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48973c) {
                return;
            }
            this.f48973c = true;
            dispose();
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.f48972b;
            AtomicReference atomicReference = windowBoundaryMainObserver.f48977b;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            windowBoundaryMainObserver.f48979d.offer(WindowBoundaryMainObserver.f48975p);
            windowBoundaryMainObserver.m17837b();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: o */
        public static final WindowBoundaryInnerObserver f48974o = new WindowBoundaryInnerObserver(null);

        /* JADX INFO: renamed from: p */
        public static final Object f48975p = new Object();

        /* JADX INFO: renamed from: a */
        public final Observer f48976a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48977b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f48978c = new AtomicInteger(1);

        /* JADX INFO: renamed from: d */
        public final MpscLinkedQueue f48979d = new MpscLinkedQueue();

        /* JADX INFO: renamed from: f */
        public final AtomicThrowable f48980f = new AtomicThrowable();

        /* JADX INFO: renamed from: g */
        public final AtomicBoolean f48981g = new AtomicBoolean();

        /* JADX INFO: renamed from: i */
        public Disposable f48982i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f48983j;

        /* JADX INFO: renamed from: n */
        public UnicastSubject f48984n;

        public WindowBoundaryMainObserver(Observer observer) {
            this.f48976a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17836a() {
            AtomicReference atomicReference = this.f48977b;
            WindowBoundaryInnerObserver windowBoundaryInnerObserver = f48974o;
            Disposable disposable = (Disposable) atomicReference.getAndSet(windowBoundaryInnerObserver);
            if (disposable == null || disposable == windowBoundaryInnerObserver) {
                return;
            }
            disposable.dispose();
        }

        /* JADX INFO: renamed from: b */
        public final void m17837b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f48976a;
            MpscLinkedQueue mpscLinkedQueue = this.f48979d;
            AtomicThrowable atomicThrowable = this.f48980f;
            int iAddAndGet = 1;
            while (this.f48978c.get() != 0) {
                UnicastSubject unicastSubject = this.f48984n;
                boolean z2 = this.f48983j;
                if (z2 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                    if (unicastSubject != null) {
                        this.f48984n = null;
                        unicastSubject.onError(thM17888b);
                    }
                    observer.onError(thM17888b);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z3 = objPoll == null;
                if (z2 && z3) {
                    atomicThrowable.getClass();
                    Throwable thM17888b2 = ExceptionHelper.m17888b(atomicThrowable);
                    if (thM17888b2 == null) {
                        if (unicastSubject != null) {
                            this.f48984n = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.f48984n = null;
                        unicastSubject.onError(thM17888b2);
                    }
                    observer.onError(thM17888b2);
                    return;
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f48975p) {
                    unicastSubject.onNext(objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.f48984n = null;
                        unicastSubject.onComplete();
                    }
                    if (this.f48981g.get()) {
                        continue;
                    } else {
                        this.f48984n = new UnicastSubject(this);
                        this.f48978c.getAndIncrement();
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Exceptions.m17612a(th);
                            atomicThrowable.getClass();
                            ExceptionHelper.m17887a(atomicThrowable, th);
                            this.f48983j = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f48984n = null;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48982i, disposable)) {
                this.f48982i = disposable;
                this.f48976a.mo17593c(this);
                this.f48979d.offer(f48975p);
                m17837b();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48981g.get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48981g.compareAndSet(false, true)) {
                m17836a();
                if (this.f48978c.decrementAndGet() == 0) {
                    this.f48982i.dispose();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            m17836a();
            this.f48983j = true;
            m17837b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            m17836a();
            AtomicThrowable atomicThrowable = this.f48980f;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48983j = true;
                m17837b();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48979d.offer(obj);
            m17837b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f48978c.decrementAndGet() == 0) {
                this.f48982i.dispose();
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new WindowBoundaryMainObserver(observer);
        throw null;
    }
}
