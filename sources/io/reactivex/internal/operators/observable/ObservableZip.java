package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableZip<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public volatile boolean f49005a;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49005a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f49005a) {
                return;
            }
            this.f49005a = true;
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipObserver<T, R> implements Observer<T> {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(null, disposable);
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

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        Object obj = null;
        obj.getClass();
        throw null;
    }
}
