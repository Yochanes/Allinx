package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.InnerQueuedObserver;
import io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableConcatMapEager<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, InnerQueuedObserverSupport<R> {

        /* JADX INFO: renamed from: a */
        public final Observer f50497a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f50498b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final ArrayDeque f50499c = new ArrayDeque();

        /* JADX INFO: renamed from: d */
        public SimpleQueue f50500d;

        /* JADX INFO: renamed from: f */
        public Disposable f50501f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f50502g;

        /* JADX INFO: renamed from: i */
        public int f50503i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f50504j;

        /* JADX INFO: renamed from: n */
        public InnerQueuedObserver f50505n;

        /* JADX INFO: renamed from: o */
        public int f50506o;

        public ConcatMapEagerMainObserver(Observer observer) {
            this.f50497a = observer;
        }

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        /* JADX INFO: renamed from: a */
        public final void mo17975a(InnerQueuedObserver innerQueuedObserver, Object obj) {
            innerQueuedObserver.f49485a.offer(obj);
            mo17976b();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            throw null;
         */
        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo17976b() {
            Object objPoll;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue simpleQueue = this.f50500d;
            ArrayDeque arrayDeque = this.f50499c;
            Observer observer = this.f50497a;
            int iAddAndGet = 1;
            while (true) {
                int i = this.f50506o;
                if (i != 0) {
                    if (this.f50504j) {
                        simpleQueue.clear();
                        m18136g();
                        return;
                    }
                    try {
                        if (simpleQueue.poll() != null) {
                            break;
                        }
                    } catch (Throwable th) {
                        Exceptions.m17950a(th);
                        this.f50501f.dispose();
                        simpleQueue.clear();
                        m18136g();
                        this.f50498b.m18231a(th);
                        this.f50498b.m18234d(this.f50497a);
                        return;
                    }
                }
                this.f50506o = i;
                if (this.f50504j) {
                    simpleQueue.clear();
                    m18136g();
                    return;
                }
                InnerQueuedObserver innerQueuedObserver = this.f50505n;
                if (innerQueuedObserver == null) {
                    boolean z3 = this.f50502g;
                    InnerQueuedObserver innerQueuedObserver2 = (InnerQueuedObserver) arrayDeque.poll();
                    boolean z4 = innerQueuedObserver2 == null;
                    if (z3 && z4) {
                        if (this.f50498b.get() == null) {
                            observer.onComplete();
                            return;
                        }
                        simpleQueue.clear();
                        m18136g();
                        this.f50498b.m18234d(observer);
                        return;
                    }
                    if (!z4) {
                        this.f50505n = innerQueuedObserver2;
                    }
                    innerQueuedObserver = innerQueuedObserver2;
                }
                if (innerQueuedObserver != null) {
                    SimpleQueue simpleQueue2 = innerQueuedObserver.f49485a;
                    while (!this.f50504j) {
                        boolean z5 = innerQueuedObserver.f49486b;
                        try {
                            objPoll = simpleQueue2.poll();
                            z2 = objPoll == null;
                        } catch (Throwable th2) {
                            Exceptions.m17950a(th2);
                            this.f50498b.m18231a(th2);
                            this.f50505n = null;
                            this.f50506o--;
                        }
                        if (z5 && z2) {
                            this.f50505n = null;
                            this.f50506o--;
                        } else if (!z2) {
                            observer.onNext(objPoll);
                        }
                    }
                    simpleQueue.clear();
                    m18136g();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50501f, disposable)) {
                this.f50501f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo17962e = queueDisposable.mo17962e(3);
                    if (iMo17962e == 1) {
                        this.f50503i = iMo17962e;
                        this.f50500d = queueDisposable;
                        this.f50502g = true;
                        this.f50497a.mo12365c(this);
                        mo17976b();
                        return;
                    }
                    if (iMo17962e == 2) {
                        this.f50503i = iMo17962e;
                        this.f50500d = queueDisposable;
                        this.f50497a.mo12365c(this);
                        return;
                    }
                }
                this.f50500d = new SpscLinkedArrayQueue(0);
                this.f50497a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50504j;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50504j) {
                return;
            }
            this.f50504j = true;
            this.f50501f.dispose();
            this.f50498b.m18232b();
            if (getAndIncrement() == 0) {
                do {
                    this.f50500d.clear();
                    m18136g();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        /* JADX INFO: renamed from: e */
        public final void mo17977e(InnerQueuedObserver innerQueuedObserver) {
            innerQueuedObserver.f49486b = true;
            mo17976b();
        }

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        /* JADX INFO: renamed from: f */
        public final void mo17978f(InnerQueuedObserver innerQueuedObserver, Throwable th) {
            if (this.f50498b.m18231a(th)) {
                innerQueuedObserver.f49486b = true;
                mo17976b();
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m18136g() {
            InnerQueuedObserver innerQueuedObserver = this.f50505n;
            if (innerQueuedObserver != null) {
                DisposableHelper.m17952a(innerQueuedObserver);
            }
            while (true) {
                InnerQueuedObserver innerQueuedObserver2 = (InnerQueuedObserver) this.f50499c.poll();
                if (innerQueuedObserver2 == null) {
                    return;
                } else {
                    DisposableHelper.m17952a(innerQueuedObserver2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50502g = true;
            mo17976b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50498b.m18231a(th)) {
                this.f50502g = true;
                mo17976b();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50503i == 0) {
                this.f50500d.offer(obj);
            }
            mo17976b();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new ConcatMapEagerMainObserver(observer));
    }
}
