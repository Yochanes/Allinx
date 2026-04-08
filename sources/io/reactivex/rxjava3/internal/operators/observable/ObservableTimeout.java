package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTimeout<T, U, V> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutConsumer extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (obj == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (obj == disposableHelper) {
                RxJavaPlugins.m18275b(th);
            } else {
                lazySet(disposableHelper);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
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
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo18187a(long j) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        /* JADX INFO: renamed from: b */
        public final void mo18188b(long j, Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(null, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(null);
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, TimeoutSelectorSupport {

        /* JADX INFO: renamed from: a */
        public final Observer f50898a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f50899b = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50900c = new AtomicReference();

        public TimeoutObserver(Observer observer) {
            this.f50898a = observer;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo18187a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.m17952a(this.f50900c);
                this.f50898a.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        /* JADX INFO: renamed from: b */
        public final void mo18188b(long j, Throwable th) {
            if (!compareAndSet(j, Long.MAX_VALUE)) {
                RxJavaPlugins.m18275b(th);
            } else {
                DisposableHelper.m17952a(this.f50900c);
                this.f50898a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(this.f50900c, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b((Disposable) this.f50900c.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this.f50900c);
            SequentialDisposable sequentialDisposable = this.f50899b;
            sequentialDisposable.getClass();
            DisposableHelper.m17952a(sequentialDisposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.f50899b;
                sequentialDisposable.getClass();
                DisposableHelper.m17952a(sequentialDisposable);
                this.f50898a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            SequentialDisposable sequentialDisposable = this.f50899b;
            sequentialDisposable.getClass();
            DisposableHelper.m17952a(sequentialDisposable);
            this.f50898a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            long j = get();
            if (j == Long.MAX_VALUE || !compareAndSet(j, 1 + j)) {
                return;
            }
            Disposable disposable = this.f50899b.get();
            if (disposable != null) {
                disposable.dispose();
            }
            Observer observer = this.f50898a;
            observer.onNext(obj);
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                ((Disposable) this.f50900c.get()).dispose();
                getAndSet(Long.MAX_VALUE);
                observer.onError(th);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TimeoutSelectorSupport extends ObservableTimeoutTimed.TimeoutSupport {
        /* JADX INFO: renamed from: b */
        void mo18188b(long j, Throwable th);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        TimeoutObserver timeoutObserver = new TimeoutObserver(observer);
        observer.mo12365c(timeoutObserver);
        this.f50392a.mo17931a(timeoutObserver);
    }
}
