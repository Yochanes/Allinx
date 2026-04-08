package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRange extends Observable<Integer> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {

        /* JADX INFO: renamed from: a */
        public final Observer f50739a;

        /* JADX INFO: renamed from: b */
        public long f50740b;

        /* JADX INFO: renamed from: c */
        public boolean f50741c;

        public RangeDisposable(Observer observer, long j) {
            this.f50739a = observer;
            this.f50740b = j;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f50740b = 0L;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() != 0;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            this.f50741c = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f50740b == 0;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            long j = this.f50740b;
            if (j != 0) {
                this.f50740b = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        Observer observer2;
        RangeDisposable rangeDisposable = new RangeDisposable(observer, 0);
        observer.mo12365c(rangeDisposable);
        if (rangeDisposable.f50741c) {
            return;
        }
        long j = rangeDisposable.f50740b;
        while (true) {
            observer2 = rangeDisposable.f50739a;
            if (j == 0 || rangeDisposable.get() != 0) {
                break;
            }
            observer2.onNext(Integer.valueOf((int) j));
            j++;
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            observer2.onComplete();
        }
    }
}
