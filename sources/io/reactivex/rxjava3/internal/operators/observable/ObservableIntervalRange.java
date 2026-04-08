package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableIntervalRange extends Observable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class IntervalRangeObserver extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final Observer f50666a;

        /* JADX INFO: renamed from: b */
        public long f50667b = 0;

        public IntervalRangeObserver(Observer observer) {
            this.f50666a = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (mo12353d()) {
                return;
            }
            long j = this.f50667b;
            Long lValueOf = Long.valueOf(j);
            Observer observer = this.f50666a;
            observer.onNext(lValueOf);
            if (j != 0) {
                this.f50667b = j + 1;
                return;
            }
            if (!mo12353d()) {
                observer.onComplete();
            }
            DisposableHelper.m17952a(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        observer.mo12365c(new IntervalRangeObserver(observer));
        throw null;
    }
}
