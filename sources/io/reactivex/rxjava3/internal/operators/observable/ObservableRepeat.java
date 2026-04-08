package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRepeat<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50759a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f50760b;

        /* JADX INFO: renamed from: c */
        public final ObservableSource f50761c;

        /* JADX INFO: renamed from: d */
        public long f50762d = -1;

        public RepeatObserver(Observer observer, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.f50759a = observer;
            this.f50760b = sequentialDisposable;
            this.f50761c = observableSource;
        }

        /* JADX INFO: renamed from: a */
        public final void m18166a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f50760b.mo12353d()) {
                    this.f50761c.mo17931a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f50760b;
            sequentialDisposable.getClass();
            DisposableHelper.m17954c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            long j = this.f50762d;
            if (j != Long.MAX_VALUE) {
                this.f50762d = j - 1;
            }
            if (j != 0) {
                m18166a();
            } else {
                this.f50759a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50759a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50759a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo12365c(sequentialDisposable);
        new RepeatObserver(observer, sequentialDisposable, this.f50392a).m18166a();
    }
}
