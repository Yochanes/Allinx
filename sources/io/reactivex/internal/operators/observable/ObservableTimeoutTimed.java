package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTimeoutTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FallbackObserver<T> implements Observer<T> {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17617c(null, disposable);
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
    public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, TimeoutSupport {
        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo17832a(long j) {
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
    public static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, TimeoutSupport {
        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo17832a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.m17615a(null);
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(null, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                throw null;
            }
            RxJavaPlugins.m17911b(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            long j = get();
            if (j != Long.MAX_VALUE && compareAndSet(j, 1 + j)) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TimeoutSupport {
        /* JADX INFO: renamed from: a */
        void mo17832a(long j);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutTask implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
