package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRetryBiPredicate<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RetryBiObserver<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48830a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f48831b;

        /* JADX INFO: renamed from: c */
        public int f48832c;

        public RetryBiObserver(Observer observer, SequentialDisposable sequentialDisposable) {
            this.f48830a = observer;
            this.f48831b = sequentialDisposable;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f48831b;
            sequentialDisposable.getClass();
            DisposableHelper.m17618e(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48830a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            try {
                this.f48832c++;
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                this.f48830a.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48830a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo17593c(sequentialDisposable);
        RetryBiObserver retryBiObserver = new RetryBiObserver(observer, sequentialDisposable);
        if (retryBiObserver.getAndIncrement() == 0 && !retryBiObserver.f48831b.mo17596d()) {
            throw null;
        }
    }
}
