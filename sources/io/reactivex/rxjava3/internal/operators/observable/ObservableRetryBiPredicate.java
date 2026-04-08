package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRetryBiPredicate<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RetryBiObserver<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50780a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f50781b;

        /* JADX INFO: renamed from: c */
        public final ObservableSource f50782c;

        /* JADX INFO: renamed from: d */
        public int f50783d;

        public RetryBiObserver(Observer observer, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.f50780a = observer;
            this.f50781b = sequentialDisposable;
            this.f50782c = observableSource;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f50781b;
            sequentialDisposable.getClass();
            DisposableHelper.m17954c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50780a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            try {
                this.f50783d++;
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                this.f50780a.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50780a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo12365c(sequentialDisposable);
        RetryBiObserver retryBiObserver = new RetryBiObserver(observer, sequentialDisposable, this.f50392a);
        if (retryBiObserver.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!retryBiObserver.f50781b.mo12353d()) {
                retryBiObserver.f50782c.mo17931a(retryBiObserver);
                iAddAndGet = retryBiObserver.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
