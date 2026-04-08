package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: i */
        public static final SwitchMapSingleObserver f50382i = new SwitchMapSingleObserver(null);

        /* JADX INFO: renamed from: a */
        public final Observer f50383a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f50384b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50385c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public Disposable f50386d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f50387f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f50388g;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final SwitchMapSingleMainObserver f50389a;

            /* JADX INFO: renamed from: b */
            public volatile Object f50390b;

            public SwitchMapSingleObserver(SwitchMapSingleMainObserver switchMapSingleMainObserver) {
                this.f50389a = switchMapSingleMainObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                SwitchMapSingleMainObserver switchMapSingleMainObserver = this.f50389a;
                AtomicReference atomicReference = switchMapSingleMainObserver.f50385c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.m18275b(th);
                        return;
                    }
                }
                if (switchMapSingleMainObserver.f50384b.m18231a(th)) {
                    switchMapSingleMainObserver.f50386d.dispose();
                    switchMapSingleMainObserver.m18128a();
                    switchMapSingleMainObserver.m18129b();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                this.f50390b = obj;
                this.f50389a.m18129b();
            }
        }

        public SwitchMapSingleMainObserver(Observer observer) {
            this.f50383a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18128a() {
            AtomicReference atomicReference = this.f50385c;
            SwitchMapSingleObserver switchMapSingleObserver = f50382i;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.m17952a(switchMapSingleObserver2);
        }

        /* JADX INFO: renamed from: b */
        public final void m18129b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f50383a;
            AtomicThrowable atomicThrowable = this.f50384b;
            AtomicReference atomicReference = this.f50385c;
            int iAddAndGet = 1;
            while (!this.f50388g) {
                if (atomicThrowable.get() != null) {
                    atomicThrowable.m18234d(observer);
                    return;
                }
                boolean z2 = this.f50387f;
                SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                boolean z3 = switchMapSingleObserver == null;
                if (z2 && z3) {
                    atomicThrowable.m18234d(observer);
                    return;
                }
                if (z3 || switchMapSingleObserver.f50390b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                    }
                    observer.onNext(switchMapSingleObserver.f50390b);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50386d, disposable)) {
                this.f50386d = disposable;
                this.f50383a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50388g;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50388g = true;
            this.f50386d.dispose();
            m18128a();
            this.f50384b.m18232b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50387f = true;
            m18129b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50384b.m18231a(th)) {
                m18128a();
                this.f50387f = true;
                m18129b();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f50385c;
            SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
            if (switchMapSingleObserver != null) {
                DisposableHelper.m17952a(switchMapSingleObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50386d.dispose();
                atomicReference.getAndSet(f50382i);
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        new SwitchMapSingleMainObserver(observer);
        throw null;
    }
}
