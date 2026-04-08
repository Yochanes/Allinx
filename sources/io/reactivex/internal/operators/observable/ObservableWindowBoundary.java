package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
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
public final class ObservableWindowBoundary<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowBoundaryInnerObserver<T, B> extends DisposableObserver<B> {

        /* JADX INFO: renamed from: b */
        public final WindowBoundaryMainObserver f48951b;

        /* JADX INFO: renamed from: c */
        public boolean f48952c;

        public WindowBoundaryInnerObserver(WindowBoundaryMainObserver windowBoundaryMainObserver) {
            this.f48951b = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48952c) {
                return;
            }
            this.f48952c = true;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.f48951b;
            DisposableHelper.m17615a(windowBoundaryMainObserver.f48956c);
            windowBoundaryMainObserver.f48961j = true;
            windowBoundaryMainObserver.m17834a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48952c) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f48952c = true;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.f48951b;
            DisposableHelper.m17615a(windowBoundaryMainObserver.f48956c);
            AtomicThrowable atomicThrowable = windowBoundaryMainObserver.f48959g;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                windowBoundaryMainObserver.f48961j = true;
                windowBoundaryMainObserver.m17834a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48952c) {
                return;
            }
            Object obj2 = WindowBoundaryMainObserver.f48953o;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.f48951b;
            windowBoundaryMainObserver.f48958f.offer(obj2);
            windowBoundaryMainObserver.m17834a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: o */
        public static final Object f48953o = new Object();

        /* JADX INFO: renamed from: a */
        public final Observer f48954a;

        /* JADX INFO: renamed from: b */
        public final WindowBoundaryInnerObserver f48955b = new WindowBoundaryInnerObserver(this);

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48956c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f48957d = new AtomicInteger(1);

        /* JADX INFO: renamed from: f */
        public final MpscLinkedQueue f48958f = new MpscLinkedQueue();

        /* JADX INFO: renamed from: g */
        public final AtomicThrowable f48959g = new AtomicThrowable();

        /* JADX INFO: renamed from: i */
        public final AtomicBoolean f48960i = new AtomicBoolean();

        /* JADX INFO: renamed from: j */
        public volatile boolean f48961j;

        /* JADX INFO: renamed from: n */
        public UnicastSubject f48962n;

        public WindowBoundaryMainObserver(Observer observer) {
            this.f48954a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17834a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f48954a;
            MpscLinkedQueue mpscLinkedQueue = this.f48958f;
            AtomicThrowable atomicThrowable = this.f48959g;
            int iAddAndGet = 1;
            while (this.f48957d.get() != 0) {
                UnicastSubject unicastSubject = this.f48962n;
                boolean z2 = this.f48961j;
                if (z2 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                    if (unicastSubject != null) {
                        this.f48962n = null;
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
                            this.f48962n = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.f48962n = null;
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
                } else if (objPoll != f48953o) {
                    unicastSubject.onNext(objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.f48962n = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.f48960i.get()) {
                        UnicastSubject unicastSubject2 = new UnicastSubject(this);
                        this.f48962n = unicastSubject2;
                        this.f48957d.getAndIncrement();
                        observer.onNext(unicastSubject2);
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f48962n = null;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17619f(this.f48956c, disposable)) {
                this.f48958f.offer(f48953o);
                m17834a();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48960i.get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48960i.compareAndSet(false, true)) {
                this.f48955b.dispose();
                if (this.f48957d.decrementAndGet() == 0) {
                    DisposableHelper.m17615a(this.f48956c);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48955b.dispose();
            this.f48961j = true;
            m17834a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48955b.dispose();
            AtomicThrowable atomicThrowable = this.f48959g;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48961j = true;
                m17834a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48958f.offer(obj);
            m17834a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f48957d.decrementAndGet() == 0) {
                DisposableHelper.m17615a(this.f48956c);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new WindowBoundaryMainObserver(observer));
        throw null;
    }
}
