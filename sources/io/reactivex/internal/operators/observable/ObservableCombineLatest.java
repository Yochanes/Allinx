package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public volatile boolean f48585a;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48585a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48585a) {
                return;
            }
            this.f48585a = true;
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
