package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class UnicastSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: a */
    public final SpscLinkedArrayQueue f51384a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f51385b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f51386c;

    /* JADX INFO: renamed from: d */
    public final boolean f51387d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f51388f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f51389g;

    /* JADX INFO: renamed from: i */
    public Throwable f51390i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f51391j;

    /* JADX INFO: renamed from: n */
    public final BasicIntQueueDisposable f51392n;

    /* JADX INFO: renamed from: o */
    public boolean f51393o;

    /* JADX INFO: compiled from: Proguard */
    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            UnicastSubject.this.f51384a.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return UnicastSubject.this.f51388f;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (UnicastSubject.this.f51388f) {
                return;
            }
            UnicastSubject.this.f51388f = true;
            UnicastSubject.this.m18293g();
            UnicastSubject.this.f51385b.lazySet(null);
            if (UnicastSubject.this.f51392n.getAndIncrement() == 0) {
                UnicastSubject.this.f51385b.lazySet(null);
                UnicastSubject.this.f51384a.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            UnicastSubject.this.f51393o = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return UnicastSubject.this.f51384a.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return UnicastSubject.this.f51384a.poll();
        }
    }

    public UnicastSubject(int i) {
        ObjectHelper.m17629c(i, "capacityHint");
        this.f51384a = new SpscLinkedArrayQueue(i);
        this.f51386c = new AtomicReference();
        this.f51387d = true;
        this.f51385b = new AtomicReference();
        this.f51391j = new AtomicBoolean();
        this.f51392n = new UnicastQueueDisposable();
    }

    /* JADX INFO: renamed from: f */
    public static UnicastSubject m18292f() {
        return new UnicastSubject(0);
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        if (this.f51391j.get() || !this.f51391j.compareAndSet(false, true)) {
            EmptyDisposable.m17624f(new IllegalStateException("Only a single observer allowed."), observer);
            return;
        }
        observer.mo17593c(this.f51392n);
        this.f51385b.lazySet(observer);
        if (this.f51388f) {
            this.f51385b.lazySet(null);
        } else {
            m18294h();
        }
    }

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        if (this.f51389g || this.f51388f) {
            disposable.dispose();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18293g() {
        AtomicReference atomicReference = this.f51386c;
        Runnable runnable = (Runnable) atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m18294h() {
        Throwable th;
        if (this.f51392n.getAndIncrement() != 0) {
            return;
        }
        Observer observer = (Observer) this.f51385b.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (observer == null) {
            iAddAndGet2 = this.f51392n.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                observer = (Observer) this.f51385b.get();
            }
        }
        if (this.f51393o) {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f51384a;
            boolean z2 = this.f51387d;
            while (!this.f51388f) {
                boolean z3 = this.f51389g;
                if (!z2 && z3 && (th = this.f51390i) != null) {
                    this.f51385b.lazySet(null);
                    spscLinkedArrayQueue.clear();
                    observer.onError(th);
                    return;
                }
                observer.onNext(null);
                if (z3) {
                    this.f51385b.lazySet(null);
                    Throwable th2 = this.f51390i;
                    if (th2 != null) {
                        observer.onError(th2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f51392n.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f51385b.lazySet(null);
            spscLinkedArrayQueue.clear();
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.f51384a;
        boolean z4 = this.f51387d;
        boolean z5 = true;
        int iAddAndGet3 = 1;
        while (!this.f51388f) {
            boolean z6 = this.f51389g;
            Object objPoll = this.f51384a.poll();
            boolean z7 = objPoll == null;
            if (z6) {
                if (!z4 && z5) {
                    Throwable th3 = this.f51390i;
                    if (th3 != null) {
                        this.f51385b.lazySet(null);
                        spscLinkedArrayQueue2.clear();
                        observer.onError(th3);
                        return;
                    }
                    z5 = false;
                }
                if (z7) {
                    this.f51385b.lazySet(null);
                    Throwable th4 = this.f51390i;
                    if (th4 != null) {
                        observer.onError(th4);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
            }
            if (z7) {
                iAddAndGet3 = this.f51392n.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                observer.onNext(objPoll);
            }
        }
        this.f51385b.lazySet(null);
        spscLinkedArrayQueue2.clear();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f51389g || this.f51388f) {
            return;
        }
        this.f51389g = true;
        m18293g();
        m18294h();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f51389g || this.f51388f) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        this.f51390i = th;
        this.f51389g = true;
        m18293g();
        m18294h();
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f51389g || this.f51388f) {
            return;
        }
        this.f51384a.offer(obj);
        m18294h();
    }

    public UnicastSubject(Runnable runnable) {
        ObjectHelper.m17629c(0, "capacityHint");
        this.f51384a = new SpscLinkedArrayQueue(0);
        this.f51386c = new AtomicReference(runnable);
        this.f51387d = true;
        this.f51385b = new AtomicReference();
        this.f51391j = new AtomicBoolean();
        this.f51392n = new UnicastQueueDisposable();
    }
}
