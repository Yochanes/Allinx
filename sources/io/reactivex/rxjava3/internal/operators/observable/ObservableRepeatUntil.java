package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRepeatUntil<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RepeatUntilObserver<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50763a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f50764b;

        /* JADX INFO: renamed from: c */
        public final ObservableSource f50765c;

        public RepeatUntilObserver(Observer observer, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.f50763a = observer;
            this.f50764b = sequentialDisposable;
            this.f50765c = observableSource;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f50764b;
            sequentialDisposable.getClass();
            DisposableHelper.m17954c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50763a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50763a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50763a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo12365c(sequentialDisposable);
        RepeatUntilObserver repeatUntilObserver = new RepeatUntilObserver(observer, sequentialDisposable, this.f50392a);
        if (repeatUntilObserver.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                repeatUntilObserver.f50765c.mo17931a(repeatUntilObserver);
                iAddAndGet = repeatUntilObserver.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
