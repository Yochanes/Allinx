package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class ObservableSwitchMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapCompletableObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: g */
        public static final SwitchMapInnerObserver f48500g = new SwitchMapInnerObserver(null);

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f48501a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48502b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48503c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public volatile boolean f48504d;

        /* JADX INFO: renamed from: f */
        public Disposable f48505f;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final SwitchMapCompletableObserver f48506a;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver switchMapCompletableObserver) {
                this.f48506a = switchMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.f48506a;
                AtomicReference atomicReference = switchMapCompletableObserver.f48503c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (switchMapCompletableObserver.f48504d) {
                    AtomicThrowable atomicThrowable = switchMapCompletableObserver.f48502b;
                    atomicThrowable.getClass();
                    Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                    if (thM17888b == null) {
                        switchMapCompletableObserver.f48501a.onComplete();
                    } else {
                        switchMapCompletableObserver.f48501a.onError(thM17888b);
                    }
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.f48506a;
                AtomicReference atomicReference = switchMapCompletableObserver.f48503c;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        AtomicThrowable atomicThrowable = switchMapCompletableObserver.f48502b;
                        atomicThrowable.getClass();
                        if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                            switchMapCompletableObserver.dispose();
                            atomicThrowable.getClass();
                            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                            if (thM17888b != ExceptionHelper.f49276a) {
                                switchMapCompletableObserver.f48501a.onError(thM17888b);
                                return;
                            }
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.m17911b(th);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver) {
            this.f48501a = completableObserver;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48505f, disposable)) {
                this.f48505f = disposable;
                this.f48501a.mo17580c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48503c.get() == f48500g;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48505f.dispose();
            AtomicReference atomicReference = this.f48503c;
            SwitchMapInnerObserver switchMapInnerObserver = f48500g;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 == null || switchMapInnerObserver2 == switchMapInnerObserver) {
                return;
            }
            DisposableHelper.m17615a(switchMapInnerObserver2);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48504d = true;
            if (this.f48503c.get() == null) {
                AtomicThrowable atomicThrowable = this.f48502b;
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                if (thM17888b == null) {
                    this.f48501a.onComplete();
                } else {
                    this.f48501a.onError(thM17888b);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48502b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            AtomicReference atomicReference = this.f48503c;
            SwitchMapInnerObserver switchMapInnerObserver = f48500g;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 != null && switchMapInnerObserver2 != switchMapInnerObserver) {
                DisposableHelper.m17615a(switchMapInnerObserver2);
            }
            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
            if (thM17888b != ExceptionHelper.f49276a) {
                this.f48501a.onError(thM17888b);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48505f.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new SwitchMapCompletableObserver(completableObserver);
        throw null;
    }
}
