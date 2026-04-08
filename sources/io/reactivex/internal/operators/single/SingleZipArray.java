package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleZipArray<T, R> extends Single<R> {

    /* JADX INFO: compiled from: Proguard */
    public final class SingletonArrayFunc implements Function<T, R> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() <= 0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
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
        throw null;
    }
}
