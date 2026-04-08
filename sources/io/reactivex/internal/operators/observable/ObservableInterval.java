package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableInterval extends Observable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class IntervalObserver extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final Observer f48732a;

        /* JADX INFO: renamed from: b */
        public long f48733b;

        public IntervalObserver(Observer observer) {
            this.f48732a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == DisposableHelper.f47552a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.f47552a) {
                long j = this.f48733b;
                this.f48733b = 1 + j;
                this.f48732a.onNext(Long.valueOf(j));
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new IntervalObserver(observer));
        throw null;
    }
}
