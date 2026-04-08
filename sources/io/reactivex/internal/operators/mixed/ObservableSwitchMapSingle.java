package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
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
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: i */
        public static final SwitchMapSingleObserver f48516i = new SwitchMapSingleObserver(null);

        /* JADX INFO: renamed from: a */
        public final Observer f48517a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48518b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48519c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public Disposable f48520d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f48521f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48522g;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final SwitchMapSingleMainObserver f48523a;

            /* JADX INFO: renamed from: b */
            public volatile Object f48524b;

            public SwitchMapSingleObserver(SwitchMapSingleMainObserver switchMapSingleMainObserver) {
                this.f48523a = switchMapSingleMainObserver;
            }

            @Override // io.reactivex.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo17602c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                SwitchMapSingleMainObserver switchMapSingleMainObserver = this.f48523a;
                AtomicReference atomicReference = switchMapSingleMainObserver.f48519c;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        AtomicThrowable atomicThrowable = switchMapSingleMainObserver.f48518b;
                        atomicThrowable.getClass();
                        if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                            switchMapSingleMainObserver.f48520d.dispose();
                            switchMapSingleMainObserver.m17776a();
                            switchMapSingleMainObserver.m17777b();
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.m17911b(th);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                this.f48524b = obj;
                this.f48523a.m17777b();
            }
        }

        public SwitchMapSingleMainObserver(Observer observer) {
            this.f48517a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17776a() {
            AtomicReference atomicReference = this.f48519c;
            SwitchMapSingleObserver switchMapSingleObserver = f48516i;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.m17615a(switchMapSingleObserver2);
        }

        /* JADX INFO: renamed from: b */
        public final void m17777b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f48517a;
            AtomicThrowable atomicThrowable = this.f48518b;
            AtomicReference atomicReference = this.f48519c;
            int iAddAndGet = 1;
            while (!this.f48522g) {
                if (atomicThrowable.get() != null) {
                    observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                    return;
                }
                boolean z2 = this.f48521f;
                SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                boolean z3 = switchMapSingleObserver == null;
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
                if (z3 || switchMapSingleObserver.f48524b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                    }
                    observer.onNext(switchMapSingleObserver.f48524b);
                }
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48520d, disposable)) {
                this.f48520d = disposable;
                this.f48517a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48522g;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48522g = true;
            this.f48520d.dispose();
            m17776a();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48521f = true;
            m17777b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48518b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            m17776a();
            this.f48521f = true;
            m17777b();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f48519c;
            SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
            if (switchMapSingleObserver != null) {
                DisposableHelper.m17615a(switchMapSingleObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48520d.dispose();
                atomicReference.getAndSet(f48516i);
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new SwitchMapSingleMainObserver(observer);
        throw null;
    }
}
