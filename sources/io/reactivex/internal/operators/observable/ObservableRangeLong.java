package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRangeLong extends Observable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {

        /* JADX INFO: renamed from: a */
        public final Observer f48796a;

        /* JADX INFO: renamed from: b */
        public long f48797b = 0;

        /* JADX INFO: renamed from: c */
        public boolean f48798c;

        public RangeDisposable(Observer observer) {
            this.f48796a = observer;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f48797b = 0L;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() != 0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            this.f48798c = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f48797b == 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            long j = this.f48797b;
            if (j != 0) {
                this.f48797b = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        Observer observer2;
        RangeDisposable rangeDisposable = new RangeDisposable(observer);
        observer.mo17593c(rangeDisposable);
        if (rangeDisposable.f48798c) {
            return;
        }
        long j = rangeDisposable.f48797b;
        while (true) {
            observer2 = rangeDisposable.f48796a;
            if (j == 0 || rangeDisposable.get() != 0) {
                break;
            }
            observer2.onNext(Long.valueOf(j));
            j++;
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            observer2.onComplete();
        }
    }
}
