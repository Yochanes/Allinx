package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTakeUntil<T, U> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48918a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48919b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f48920c = new OtherObserver();

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f48921d = new AtomicThrowable();

        /* JADX INFO: compiled from: Proguard */
        public final class OtherObserver extends AtomicReference<Disposable> implements Observer<U> {
            public OtherObserver() {
            }

            @Override // io.reactivex.Observer
            /* JADX INFO: renamed from: c */
            public final void mo17593c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.m17615a(takeUntilMainObserver.f48919b);
                HalfSerializer.m17890a(takeUntilMainObserver.f48918a, takeUntilMainObserver, takeUntilMainObserver.f48921d);
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.m17615a(takeUntilMainObserver.f48919b);
                HalfSerializer.m17892c(takeUntilMainObserver.f48918a, th, takeUntilMainObserver, takeUntilMainObserver.f48921d);
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                DisposableHelper.m17615a(this);
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.m17615a(takeUntilMainObserver.f48919b);
                HalfSerializer.m17890a(takeUntilMainObserver.f48918a, takeUntilMainObserver, takeUntilMainObserver.f48921d);
            }
        }

        public TakeUntilMainObserver(Observer observer) {
            this.f48918a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this.f48919b, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b((Disposable) this.f48919b.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this.f48919b);
            DisposableHelper.m17615a(this.f48920c);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.m17615a(this.f48920c);
            HalfSerializer.m17890a(this.f48918a, this, this.f48921d);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17615a(this.f48920c);
            HalfSerializer.m17892c(this.f48918a, th, this, this.f48921d);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            HalfSerializer.m17894e(this.f48918a, obj, this, this.f48921d);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new TakeUntilMainObserver(observer));
        throw null;
    }
}
