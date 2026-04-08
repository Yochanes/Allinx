package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableIntervalRange extends Observable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class IntervalRangeObserver extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final Observer f48734a;

        /* JADX INFO: renamed from: b */
        public long f48735b = 0;

        public IntervalRangeObserver(Observer observer) {
            this.f48734a = observer;
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
            if (mo17596d()) {
                return;
            }
            long j = this.f48735b;
            Long lValueOf = Long.valueOf(j);
            Observer observer = this.f48734a;
            observer.onNext(lValueOf);
            if (j != 0) {
                this.f48735b = j + 1;
            } else {
                DisposableHelper.m17615a(this);
                observer.onComplete();
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new IntervalRangeObserver(observer));
        throw null;
    }
}
