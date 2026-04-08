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
public final class ObservableRetryPredicate<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50784a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f50785b;

        /* JADX INFO: renamed from: c */
        public final ObservableSource f50786c;

        /* JADX INFO: renamed from: d */
        public long f50787d = 0;

        public RepeatObserver(Observer observer, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.f50784a = observer;
            this.f50785b = sequentialDisposable;
            this.f50786c = observableSource;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f50785b;
            sequentialDisposable.getClass();
            DisposableHelper.m17954c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50784a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            long j = this.f50787d;
            if (j != Long.MAX_VALUE) {
                this.f50787d = j - 1;
            }
            Observer observer = this.f50784a;
            if (j == 0) {
                observer.onError(th);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                observer.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50784a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo12365c(sequentialDisposable);
        RepeatObserver repeatObserver = new RepeatObserver(observer, sequentialDisposable, this.f50392a);
        if (repeatObserver.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!repeatObserver.f50785b.mo12353d()) {
                repeatObserver.f50786c.mo17931a(repeatObserver);
                iAddAndGet = repeatObserver.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
