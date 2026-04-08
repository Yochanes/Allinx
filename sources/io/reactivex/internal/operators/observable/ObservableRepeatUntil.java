package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRepeatUntil<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RepeatUntilObserver<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48815a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f48816b;

        public RepeatUntilObserver(Observer observer, SequentialDisposable sequentialDisposable) {
            this.f48815a = observer;
            this.f48816b = sequentialDisposable;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f48816b;
            sequentialDisposable.getClass();
            DisposableHelper.m17617c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48815a.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48815a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48815a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo17593c(sequentialDisposable);
        if (new RepeatUntilObserver(observer, sequentialDisposable).getAndIncrement() == 0) {
            throw null;
        }
    }
}
