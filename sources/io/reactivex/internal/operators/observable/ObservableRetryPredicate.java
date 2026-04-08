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
public final class ObservableRetryPredicate<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48833a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f48834b;

        /* JADX INFO: renamed from: c */
        public long f48835c = 0;

        public RepeatObserver(Observer observer, SequentialDisposable sequentialDisposable) {
            this.f48833a = observer;
            this.f48834b = sequentialDisposable;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f48834b;
            sequentialDisposable.getClass();
            DisposableHelper.m17618e(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48833a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            long j = this.f48835c;
            if (j != Long.MAX_VALUE) {
                this.f48835c = j - 1;
            }
            Observer observer = this.f48833a;
            if (j == 0) {
                observer.onError(th);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                observer.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48833a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo17593c(sequentialDisposable);
        RepeatObserver repeatObserver = new RepeatObserver(observer, sequentialDisposable);
        if (repeatObserver.getAndIncrement() == 0 && !repeatObserver.f48834b.mo17596d()) {
            throw null;
        }
    }
}
