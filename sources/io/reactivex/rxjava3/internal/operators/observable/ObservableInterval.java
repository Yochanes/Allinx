package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableInterval extends Observable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class IntervalObserver extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final Observer f50664a;

        /* JADX INFO: renamed from: b */
        public long f50665b;

        public IntervalObserver(Observer observer) {
            this.f50664a = observer;
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
            if (get() != DisposableHelper.f49380a) {
                long j = this.f50665b;
                this.f50665b = 1 + j;
                this.f50664a.onNext(Long.valueOf(j));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        observer.mo12365c(new IntervalObserver(observer));
        throw null;
    }
}
