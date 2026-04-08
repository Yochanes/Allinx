package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class UnicastSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: a */
    public final SpscLinkedArrayQueue f51336a;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f51338c;

    /* JADX INFO: renamed from: f */
    public volatile boolean f51340f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f51341g;

    /* JADX INFO: renamed from: i */
    public Throwable f51342i;

    /* JADX INFO: renamed from: o */
    public boolean f51345o;

    /* JADX INFO: renamed from: d */
    public final boolean f51339d = true;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f51337b = new AtomicReference();

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f51343j = new AtomicBoolean();

    /* JADX INFO: renamed from: n */
    public final BasicIntQueueDisposable f51344n = new UnicastQueueDisposable();

    /* JADX INFO: compiled from: Proguard */
    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            UnicastSubject.this.f51336a.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return UnicastSubject.this.f51340f;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (UnicastSubject.this.f51340f) {
                return;
            }
            UnicastSubject.this.f51340f = true;
            UnicastSubject.this.m18287l();
            UnicastSubject.this.f51337b.lazySet(null);
            if (UnicastSubject.this.f51344n.getAndIncrement() == 0) {
                UnicastSubject.this.f51337b.lazySet(null);
                UnicastSubject unicastSubject = UnicastSubject.this;
                if (unicastSubject.f51345o) {
                    return;
                }
                unicastSubject.f51336a.clear();
            }
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            UnicastSubject.this.f51345o = true;
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return UnicastSubject.this.f51336a.isEmpty();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return UnicastSubject.this.f51336a.poll();
        }
    }

    public UnicastSubject(Runnable runnable, int i) {
        this.f51336a = new SpscLinkedArrayQueue(i);
        this.f51338c = new AtomicReference(runnable);
    }

    /* JADX INFO: renamed from: j */
    public static UnicastSubject m18286j(Runnable runnable) {
        ObjectHelper.m17964a(0, "capacityHint");
        Objects.requireNonNull(runnable, "onTerminate");
        return new UnicastSubject(runnable, 0);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (this.f51341g || this.f51340f) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        if (this.f51343j.get() || !this.f51343j.compareAndSet(false, true)) {
            EmptyDisposable.m17960f(new IllegalStateException("Only a single observer allowed."), observer);
            return;
        }
        observer.mo12365c(this.f51344n);
        this.f51337b.lazySet(observer);
        if (this.f51340f) {
            this.f51337b.lazySet(null);
        } else {
            m18288m();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m18287l() {
        AtomicReference atomicReference = this.f51338c;
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

    /* JADX INFO: renamed from: m */
    public final void m18288m() {
        Throwable th;
        if (this.f51344n.getAndIncrement() != 0) {
            return;
        }
        Observer observer = (Observer) this.f51337b.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (observer == null) {
            iAddAndGet2 = this.f51344n.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                observer = (Observer) this.f51337b.get();
            }
        }
        if (this.f51345o) {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f51336a;
            boolean z2 = this.f51339d;
            while (!this.f51340f) {
                boolean z3 = this.f51341g;
                if (!z2 && z3 && (th = this.f51342i) != null) {
                    this.f51337b.lazySet(null);
                    spscLinkedArrayQueue.clear();
                    observer.onError(th);
                    return;
                }
                observer.onNext(null);
                if (z3) {
                    this.f51337b.lazySet(null);
                    Throwable th2 = this.f51342i;
                    if (th2 != null) {
                        observer.onError(th2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f51344n.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f51337b.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.f51336a;
        boolean z4 = this.f51339d;
        boolean z5 = true;
        int iAddAndGet3 = 1;
        while (!this.f51340f) {
            boolean z6 = this.f51341g;
            Object objPoll = this.f51336a.poll();
            boolean z7 = objPoll == null;
            if (z6) {
                if (!z4 && z5) {
                    Throwable th3 = this.f51342i;
                    if (th3 != null) {
                        this.f51337b.lazySet(null);
                        spscLinkedArrayQueue2.clear();
                        observer.onError(th3);
                        return;
                    }
                    z5 = false;
                }
                if (z7) {
                    this.f51337b.lazySet(null);
                    Throwable th4 = this.f51342i;
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
                iAddAndGet3 = this.f51344n.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                observer.onNext(objPoll);
            }
        }
        this.f51337b.lazySet(null);
        spscLinkedArrayQueue2.clear();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.f51341g || this.f51340f) {
            return;
        }
        this.f51341g = true;
        m18287l();
        m18288m();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        if (this.f51341g || this.f51340f) {
            RxJavaPlugins.m18275b(th);
            return;
        }
        this.f51342i = th;
        this.f51341g = true;
        m18287l();
        m18288m();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
        if (this.f51341g || this.f51340f) {
            return;
        }
        this.f51336a.offer(obj);
        m18288m();
    }
}
