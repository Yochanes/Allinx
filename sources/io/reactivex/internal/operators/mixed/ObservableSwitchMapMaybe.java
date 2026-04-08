package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class ObservableSwitchMapMaybe<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: i */
        public static final SwitchMapMaybeObserver f48507i = new SwitchMapMaybeObserver(null);

        /* JADX INFO: renamed from: a */
        public final Observer f48508a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48509b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48510c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public Disposable f48511d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f48512f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48513g;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: a */
            public final SwitchMapMaybeMainObserver f48514a;

            /* JADX INFO: renamed from: b */
            public volatile Object f48515b;

            public SwitchMapMaybeObserver(SwitchMapMaybeMainObserver switchMapMaybeMainObserver) {
                this.f48514a = switchMapMaybeMainObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo17586c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                SwitchMapMaybeMainObserver switchMapMaybeMainObserver = this.f48514a;
                AtomicReference atomicReference = switchMapMaybeMainObserver.f48510c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                switchMapMaybeMainObserver.m17775b();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                SwitchMapMaybeMainObserver switchMapMaybeMainObserver = this.f48514a;
                AtomicReference atomicReference = switchMapMaybeMainObserver.f48510c;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        AtomicThrowable atomicThrowable = switchMapMaybeMainObserver.f48509b;
                        atomicThrowable.getClass();
                        if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                            switchMapMaybeMainObserver.f48511d.dispose();
                            switchMapMaybeMainObserver.m17774a();
                            switchMapMaybeMainObserver.m17775b();
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.m17911b(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                this.f48515b = obj;
                this.f48514a.m17775b();
            }
        }

        public SwitchMapMaybeMainObserver(Observer observer) {
            this.f48508a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17774a() {
            AtomicReference atomicReference = this.f48510c;
            SwitchMapMaybeObserver switchMapMaybeObserver = f48507i;
            SwitchMapMaybeObserver switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.m17615a(switchMapMaybeObserver2);
        }

        /* JADX INFO: renamed from: b */
        public final void m17775b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f48508a;
            AtomicThrowable atomicThrowable = this.f48509b;
            AtomicReference atomicReference = this.f48510c;
            int iAddAndGet = 1;
            while (!this.f48513g) {
                if (atomicThrowable.get() != null) {
                    observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                    return;
                }
                boolean z2 = this.f48512f;
                SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
                boolean z3 = switchMapMaybeObserver == null;
                if (z2 && z3) {
                    Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                    if (thM17888b != null) {
                        observer.onError(thM17888b);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z3 || switchMapMaybeObserver.f48515b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapMaybeObserver, null) && atomicReference.get() == switchMapMaybeObserver) {
                    }
                    observer.onNext(switchMapMaybeObserver.f48515b);
                }
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48511d, disposable)) {
                this.f48511d = disposable;
                this.f48508a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48513g;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48513g = true;
            this.f48511d.dispose();
            m17774a();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48512f = true;
            m17775b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48509b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            m17774a();
            this.f48512f = true;
            m17775b();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f48510c;
            SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
            if (switchMapMaybeObserver != null) {
                DisposableHelper.m17615a(switchMapMaybeObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48511d.dispose();
                atomicReference.getAndSet(f48507i);
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new SwitchMapMaybeMainObserver(observer);
        throw null;
    }
}
