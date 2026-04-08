package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTimer extends Observable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimerObserver extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final Observer f50901a;

        public TimerObserver(Observer observer) {
            this.f50901a = observer;
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
            Observer observer = this.f50901a;
            observer.onNext(0L);
            lazySet(EmptyDisposable.f49382a);
            observer.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        observer.mo12365c(new TimerObserver(observer));
        throw null;
    }
}
