package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTimeout<T, U, V> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutConsumer extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (obj == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (obj == disposableHelper) {
                RxJavaPlugins.m17911b(th);
            } else {
                lazySet(disposableHelper);
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper) {
                return;
            }
            disposable.dispose();
            lazySet(disposableHelper);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, TimeoutSelectorSupport {
        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo17832a(long j) {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        /* JADX INFO: renamed from: b */
        public final void mo17833b(long j, Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(null, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, TimeoutSelectorSupport {

        /* JADX INFO: renamed from: a */
        public final Observer f48935a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f48936b = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48937c = new AtomicReference();

        public TimeoutObserver(Observer observer) {
            this.f48935a = observer;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo17832a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.m17615a(this.f48937c);
                this.f48935a.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        /* JADX INFO: renamed from: b */
        public final void mo17833b(long j, Throwable th) {
            if (!compareAndSet(j, Long.MAX_VALUE)) {
                RxJavaPlugins.m17911b(th);
            } else {
                DisposableHelper.m17615a(this.f48937c);
                this.f48935a.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this.f48937c, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b((Disposable) this.f48937c.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this.f48937c);
            SequentialDisposable sequentialDisposable = this.f48936b;
            sequentialDisposable.getClass();
            DisposableHelper.m17615a(sequentialDisposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.f48936b;
                sequentialDisposable.getClass();
                DisposableHelper.m17615a(sequentialDisposable);
                this.f48935a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            SequentialDisposable sequentialDisposable = this.f48936b;
            sequentialDisposable.getClass();
            DisposableHelper.m17615a(sequentialDisposable);
            this.f48935a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            long j = get();
            if (j == Long.MAX_VALUE || !compareAndSet(j, 1 + j)) {
                return;
            }
            Disposable disposable = this.f48936b.get();
            if (disposable != null) {
                disposable.dispose();
            }
            Observer observer = this.f48935a;
            observer.onNext(obj);
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                ((Disposable) this.f48937c.get()).dispose();
                getAndSet(Long.MAX_VALUE);
                observer.onError(th);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TimeoutSelectorSupport extends ObservableTimeoutTimed.TimeoutSupport {
        /* JADX INFO: renamed from: b */
        void mo17833b(long j, Throwable th);
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new TimeoutObserver(observer));
        throw null;
    }
}
