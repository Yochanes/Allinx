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
public final class ObservableSwitchMap<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {

        /* JADX INFO: renamed from: a */
        public final SwitchMapObserver f48892a;

        /* JADX INFO: renamed from: b */
        public final long f48893b;

        /* JADX INFO: renamed from: c */
        public final int f48894c;

        /* JADX INFO: renamed from: d */
        public volatile SimpleQueue f48895d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f48896f;

        public SwitchMapInnerObserver(SwitchMapObserver switchMapObserver, long j, int i) {
            this.f48892a = switchMapObserver;
            this.f48893b = j;
            this.f48894c = i;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo17626e = queueDisposable.mo17626e(7);
                    if (iMo17626e == 1) {
                        this.f48895d = queueDisposable;
                        this.f48896f = true;
                        this.f48892a.m17829b();
                        return;
                    } else if (iMo17626e == 2) {
                        this.f48895d = queueDisposable;
                        return;
                    }
                }
                this.f48895d = new SpscLinkedArrayQueue(this.f48894c);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48893b == this.f48892a.f48904i) {
                this.f48896f = true;
                this.f48892a.m17829b();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            SwitchMapObserver switchMapObserver = this.f48892a;
            switchMapObserver.getClass();
            if (this.f48893b == switchMapObserver.f48904i) {
                AtomicThrowable atomicThrowable = switchMapObserver.f48899b;
                atomicThrowable.getClass();
                if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                    switchMapObserver.f48902f.dispose();
                    this.f48896f = true;
                    switchMapObserver.m17829b();
                    return;
                }
            }
            RxJavaPlugins.m17911b(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48893b == this.f48892a.f48904i) {
                if (obj != null) {
                    this.f48895d.offer(obj);
                }
                this.f48892a.m17829b();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: j */
        public static final SwitchMapInnerObserver f48897j;

        /* JADX INFO: renamed from: a */
        public final Observer f48898a;

        /* JADX INFO: renamed from: c */
        public volatile boolean f48900c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48901d;

        /* JADX INFO: renamed from: f */
        public Disposable f48902f;

        /* JADX INFO: renamed from: i */
        public volatile long f48904i;

        /* JADX INFO: renamed from: g */
        public final AtomicReference f48903g = new AtomicReference();

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48899b = new AtomicThrowable();

        static {
            SwitchMapInnerObserver switchMapInnerObserver = new SwitchMapInnerObserver(null, -1L, 1);
            f48897j = switchMapInnerObserver;
            DisposableHelper.m17615a(switchMapInnerObserver);
        }

        public SwitchMapObserver(Observer observer) {
            this.f48898a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17828a() {
            SwitchMapInnerObserver switchMapInnerObserver;
            AtomicReference atomicReference = this.f48903g;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.get();
            SwitchMapInnerObserver switchMapInnerObserver3 = f48897j;
            if (switchMapInnerObserver2 == switchMapInnerObserver3 || (switchMapInnerObserver = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver3)) == switchMapInnerObserver3 || switchMapInnerObserver == null) {
                return;
            }
            DisposableHelper.m17615a(switchMapInnerObserver);
        }

        /* JADX WARN: Removed duplicated region for block: B:92:0x00ee A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x000e A[SYNTHETIC] */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m17829b() {
            SimpleQueue simpleQueue;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f48898a;
            AtomicReference atomicReference = this.f48903g;
            int iAddAndGet = 1;
            while (!this.f48901d) {
                if (this.f48900c) {
                    boolean z2 = atomicReference.get() == null;
                    if (this.f48899b.get() != null) {
                        AtomicThrowable atomicThrowable = this.f48899b;
                        atomicThrowable.getClass();
                        observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                        return;
                    } else if (z2) {
                        observer.onComplete();
                        return;
                    }
                }
                SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) atomicReference.get();
                if (switchMapInnerObserver != null && (simpleQueue = switchMapInnerObserver.f48895d) != null) {
                    if (switchMapInnerObserver.f48896f) {
                        boolean zIsEmpty = simpleQueue.isEmpty();
                        if (this.f48899b.get() != null) {
                            AtomicThrowable atomicThrowable2 = this.f48899b;
                            atomicThrowable2.getClass();
                            observer.onError(ExceptionHelper.m17888b(atomicThrowable2));
                            return;
                        } else if (zIsEmpty) {
                            while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                            }
                        }
                    }
                    boolean z3 = false;
                    while (!this.f48901d) {
                        if (switchMapInnerObserver == atomicReference.get()) {
                            if (this.f48899b.get() != null) {
                                AtomicThrowable atomicThrowable3 = this.f48899b;
                                atomicThrowable3.getClass();
                                observer.onError(ExceptionHelper.m17888b(atomicThrowable3));
                                return;
                            }
                            boolean z4 = switchMapInnerObserver.f48896f;
                            try {
                                objPoll = simpleQueue.poll();
                            } catch (Throwable th) {
                                Exceptions.m17612a(th);
                                AtomicThrowable atomicThrowable4 = this.f48899b;
                                atomicThrowable4.getClass();
                                ExceptionHelper.m17887a(atomicThrowable4, th);
                                while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                }
                                m17828a();
                                this.f48902f.dispose();
                                this.f48900c = true;
                                z3 = true;
                                objPoll = null;
                            }
                            boolean z5 = objPoll == null;
                            if (z4 && z5) {
                                while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                }
                            } else if (!z5) {
                                observer.onNext(objPoll);
                            } else if (!z3) {
                                continue;
                            }
                        }
                        z3 = true;
                        if (!z3) {
                        }
                    }
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
            if (DisposableHelper.m17620h(this.f48902f, disposable)) {
                this.f48902f = disposable;
                this.f48898a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48901d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48901d) {
                return;
            }
            this.f48901d = true;
            this.f48902f.dispose();
            m17828a();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48900c) {
                return;
            }
            this.f48900c = true;
            m17829b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (!this.f48900c) {
                AtomicThrowable atomicThrowable = this.f48899b;
                atomicThrowable.getClass();
                if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                    m17828a();
                    this.f48900c = true;
                    m17829b();
                    return;
                }
            }
            RxJavaPlugins.m17911b(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48904i++;
            SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.f48903g.get();
            if (switchMapInnerObserver != null) {
                DisposableHelper.m17615a(switchMapInnerObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48902f.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new SwitchMapObserver(observer);
        throw null;
    }
}
