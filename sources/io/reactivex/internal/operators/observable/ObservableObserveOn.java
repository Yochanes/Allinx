package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {

        /* JADX INFO: renamed from: a */
        public SimpleQueue f48779a;

        /* JADX INFO: renamed from: b */
        public Disposable f48780b;

        /* JADX INFO: renamed from: c */
        public Throwable f48781c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48782d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f48783f;

        /* JADX INFO: renamed from: g */
        public int f48784g;

        /* JADX INFO: renamed from: i */
        public boolean f48785i;

        /* JADX INFO: renamed from: a */
        public final boolean m17809a(boolean z2, boolean z3, Observer observer) {
            if (this.f48783f) {
                this.f48779a.clear();
                return true;
            }
            if (!z2) {
                return false;
            }
            Throwable th = this.f48781c;
            if (th != null) {
                this.f48779a.clear();
                observer.onError(th);
                throw null;
            }
            if (!z3) {
                return false;
            }
            observer.onComplete();
            throw null;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48780b, disposable)) {
                this.f48780b = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo17626e = queueDisposable.mo17626e(7);
                    if (iMo17626e == 1) {
                        this.f48784g = iMo17626e;
                        this.f48779a = queueDisposable;
                        this.f48782d = true;
                        throw null;
                    }
                    if (iMo17626e == 2) {
                        this.f48784g = iMo17626e;
                        this.f48779a = queueDisposable;
                        throw null;
                    }
                }
                this.f48779a = new SpscLinkedArrayQueue(0);
                throw null;
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f48779a.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48783f;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48783f) {
                return;
            }
            this.f48783f = true;
            this.f48780b.dispose();
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            this.f48785i = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f48779a.isEmpty();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48782d) {
                return;
            }
            this.f48782d = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48782d) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f48781c = th;
            this.f48782d = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48782d) {
                return;
            }
            if (this.f48784g != 2) {
                this.f48779a.offer(obj);
            }
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return this.f48779a.poll();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f48785i) {
                if (this.f48783f) {
                    return;
                }
                boolean z2 = this.f48782d;
                Throwable th = this.f48781c;
                if (z2 && th != null) {
                    throw null;
                }
                throw null;
            }
            SimpleQueue simpleQueue = this.f48779a;
            int iAddAndGet = 1;
            while (!m17809a(this.f48782d, simpleQueue.isEmpty(), null)) {
                boolean z3 = this.f48782d;
                try {
                    boolean z4 = simpleQueue.poll() == null;
                    if (m17809a(z3, z4, null)) {
                        return;
                    }
                    if (!z4) {
                        throw null;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m17612a(th2);
                    this.f48780b.dispose();
                    simpleQueue.clear();
                    throw null;
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
