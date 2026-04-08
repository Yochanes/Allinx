package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSwitchMapMaybe<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: i */
        public static final SwitchMapMaybeObserver f50373i = new SwitchMapMaybeObserver(null);

        /* JADX INFO: renamed from: a */
        public final Observer f50374a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f50375b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50376c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public Disposable f50377d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f50378f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f50379g;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: a */
            public final SwitchMapMaybeMainObserver f50380a;

            /* JADX INFO: renamed from: b */
            public volatile Object f50381b;

            public SwitchMapMaybeObserver(SwitchMapMaybeMainObserver switchMapMaybeMainObserver) {
                this.f50380a = switchMapMaybeMainObserver;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo12364c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                SwitchMapMaybeMainObserver switchMapMaybeMainObserver = this.f50380a;
                AtomicReference atomicReference = switchMapMaybeMainObserver.f50376c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                switchMapMaybeMainObserver.m18127b();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                SwitchMapMaybeMainObserver switchMapMaybeMainObserver = this.f50380a;
                AtomicReference atomicReference = switchMapMaybeMainObserver.f50376c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.m18275b(th);
                        return;
                    }
                }
                if (switchMapMaybeMainObserver.f50375b.m18231a(th)) {
                    switchMapMaybeMainObserver.f50377d.dispose();
                    switchMapMaybeMainObserver.m18126a();
                    switchMapMaybeMainObserver.m18127b();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                this.f50381b = obj;
                this.f50380a.m18127b();
            }
        }

        public SwitchMapMaybeMainObserver(Observer observer) {
            this.f50374a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18126a() {
            AtomicReference atomicReference = this.f50376c;
            SwitchMapMaybeObserver switchMapMaybeObserver = f50373i;
            SwitchMapMaybeObserver switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.m17952a(switchMapMaybeObserver2);
        }

        /* JADX INFO: renamed from: b */
        public final void m18127b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f50374a;
            AtomicThrowable atomicThrowable = this.f50375b;
            AtomicReference atomicReference = this.f50376c;
            int iAddAndGet = 1;
            while (!this.f50379g) {
                if (atomicThrowable.get() != null) {
                    atomicThrowable.m18234d(observer);
                    return;
                }
                boolean z2 = this.f50378f;
                SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
                boolean z3 = switchMapMaybeObserver == null;
                if (z2 && z3) {
                    atomicThrowable.m18234d(observer);
                    return;
                }
                if (z3 || switchMapMaybeObserver.f50381b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapMaybeObserver, null) && atomicReference.get() == switchMapMaybeObserver) {
                    }
                    observer.onNext(switchMapMaybeObserver.f50381b);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50377d, disposable)) {
                this.f50377d = disposable;
                this.f50374a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50379g;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50379g = true;
            this.f50377d.dispose();
            m18126a();
            this.f50375b.m18232b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50378f = true;
            m18127b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50375b.m18231a(th)) {
                m18126a();
                this.f50378f = true;
                m18127b();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f50376c;
            SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
            if (switchMapMaybeObserver != null) {
                DisposableHelper.m17952a(switchMapMaybeObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50377d.dispose();
                atomicReference.getAndSet(f50373i);
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        new SwitchMapMaybeMainObserver(observer);
        throw null;
    }
}
