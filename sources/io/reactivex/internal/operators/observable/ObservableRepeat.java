package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRepeat<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48812a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f48813b;

        /* JADX INFO: renamed from: c */
        public long f48814c = -1;

        public RepeatObserver(Observer observer, SequentialDisposable sequentialDisposable) {
            this.f48812a = observer;
            this.f48813b = sequentialDisposable;
        }

        /* JADX INFO: renamed from: a */
        public final void m17811a() {
            if (getAndIncrement() == 0 && !this.f48813b.mo17596d()) {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f48813b;
            sequentialDisposable.getClass();
            DisposableHelper.m17617c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            long j = this.f48814c;
            if (j != Long.MAX_VALUE) {
                this.f48814c = j - 1;
            }
            if (j != 0) {
                m17811a();
            } else {
                this.f48812a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48812a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48812a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo17593c(sequentialDisposable);
        new RepeatObserver(observer, sequentialDisposable).m17811a();
    }
}
