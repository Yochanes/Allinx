package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableConcatMapEager<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, InnerQueuedObserverSupport<R> {

        /* JADX INFO: renamed from: a */
        public final Observer f48602a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48603b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final ArrayDeque f48604c = new ArrayDeque();

        /* JADX INFO: renamed from: d */
        public SimpleQueue f48605d;

        /* JADX INFO: renamed from: f */
        public Disposable f48606f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48607g;

        /* JADX INFO: renamed from: i */
        public int f48608i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f48609j;

        /* JADX INFO: renamed from: n */
        public InnerQueuedObserver f48610n;

        /* JADX INFO: renamed from: o */
        public int f48611o;

        public ConcatMapEagerMainObserver(Observer observer) {
            this.f48602a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17785a() {
            InnerQueuedObserver innerQueuedObserver = this.f48610n;
            if (innerQueuedObserver != null) {
                DisposableHelper.m17615a(innerQueuedObserver);
            }
            while (true) {
                InnerQueuedObserver innerQueuedObserver2 = (InnerQueuedObserver) this.f48604c.poll();
                if (innerQueuedObserver2 == null) {
                    return;
                } else {
                    DisposableHelper.m17615a(innerQueuedObserver2);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            throw null;
         */
        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo17634b() {
            Object objPoll;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue simpleQueue = this.f48605d;
            ArrayDeque arrayDeque = this.f48604c;
            Observer observer = this.f48602a;
            int iAddAndGet = 1;
            while (true) {
                int i = this.f48611o;
                if (i != 0) {
                    if (this.f48609j) {
                        simpleQueue.clear();
                        m17785a();
                        return;
                    }
                    try {
                        if (simpleQueue.poll() != null) {
                            break;
                        }
                    } catch (Throwable th) {
                        Exceptions.m17612a(th);
                        this.f48606f.dispose();
                        simpleQueue.clear();
                        m17785a();
                        AtomicThrowable atomicThrowable = this.f48603b;
                        atomicThrowable.getClass();
                        ExceptionHelper.m17887a(atomicThrowable, th);
                        AtomicThrowable atomicThrowable2 = this.f48603b;
                        atomicThrowable2.getClass();
                        observer.onError(ExceptionHelper.m17888b(atomicThrowable2));
                        return;
                    }
                }
                this.f48611o = i;
                if (this.f48609j) {
                    simpleQueue.clear();
                    m17785a();
                    return;
                }
                InnerQueuedObserver innerQueuedObserver = this.f48610n;
                if (innerQueuedObserver == null) {
                    boolean z3 = this.f48607g;
                    InnerQueuedObserver innerQueuedObserver2 = (InnerQueuedObserver) arrayDeque.poll();
                    boolean z4 = innerQueuedObserver2 == null;
                    if (z3 && z4) {
                        if (this.f48603b.get() == null) {
                            observer.onComplete();
                            return;
                        }
                        simpleQueue.clear();
                        m17785a();
                        AtomicThrowable atomicThrowable3 = this.f48603b;
                        atomicThrowable3.getClass();
                        observer.onError(ExceptionHelper.m17888b(atomicThrowable3));
                        return;
                    }
                    if (!z4) {
                        this.f48610n = innerQueuedObserver2;
                    }
                    innerQueuedObserver = innerQueuedObserver2;
                }
                if (innerQueuedObserver != null) {
                    SimpleQueue simpleQueue2 = innerQueuedObserver.f47581a;
                    while (!this.f48609j) {
                        boolean z5 = innerQueuedObserver.f47582b;
                        try {
                            objPoll = simpleQueue2.poll();
                            z2 = objPoll == null;
                        } catch (Throwable th2) {
                            Exceptions.m17612a(th2);
                            AtomicThrowable atomicThrowable4 = this.f48603b;
                            atomicThrowable4.getClass();
                            ExceptionHelper.m17887a(atomicThrowable4, th2);
                            this.f48610n = null;
                            this.f48611o--;
                        }
                        if (z5 && z2) {
                            this.f48610n = null;
                            this.f48611o--;
                        } else if (!z2) {
                            observer.onNext(objPoll);
                        }
                    }
                    simpleQueue.clear();
                    m17785a();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48606f, disposable)) {
                this.f48606f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo17626e = queueDisposable.mo17626e(3);
                    if (iMo17626e == 1) {
                        this.f48608i = iMo17626e;
                        this.f48605d = queueDisposable;
                        this.f48607g = true;
                        this.f48602a.mo17593c(this);
                        mo17634b();
                        return;
                    }
                    if (iMo17626e == 2) {
                        this.f48608i = iMo17626e;
                        this.f48605d = queueDisposable;
                        this.f48602a.mo17593c(this);
                        return;
                    }
                }
                this.f48605d = new SpscLinkedArrayQueue(0);
                this.f48602a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48609j;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48609j = true;
            if (getAndIncrement() == 0) {
                this.f48605d.clear();
                m17785a();
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        /* JADX INFO: renamed from: e */
        public final void mo17635e(InnerQueuedObserver innerQueuedObserver, Throwable th) {
            AtomicThrowable atomicThrowable = this.f48603b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                innerQueuedObserver.f47582b = true;
                mo17634b();
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        /* JADX INFO: renamed from: f */
        public final void mo17636f(InnerQueuedObserver innerQueuedObserver) {
            innerQueuedObserver.f47582b = true;
            mo17634b();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        /* JADX INFO: renamed from: g */
        public final void mo17637g(InnerQueuedObserver innerQueuedObserver, Object obj) {
            innerQueuedObserver.f47581a.offer(obj);
            mo17634b();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48607g = true;
            mo17634b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48603b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48607g = true;
                mo17634b();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48608i == 0) {
                this.f48605d.offer(obj);
            }
            mo17634b();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new ConcatMapEagerMainObserver(observer);
        throw null;
    }
}
