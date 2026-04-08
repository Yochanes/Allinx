package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleDelay<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public final class Delay implements SingleObserver<T> {

        /* JADX INFO: compiled from: Proguard */
        public final class OnError implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public final class OnSuccess implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        singleObserver.mo17602c(new SequentialDisposable());
        throw null;
    }
}
