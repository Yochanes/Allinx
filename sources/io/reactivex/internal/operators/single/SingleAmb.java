package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleAmb<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AmbSingleObserver<T> extends AtomicBoolean implements SingleObserver<T> {
        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                throw null;
            }
            RxJavaPlugins.m17911b(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptyDisposable.m17625h(th, singleObserver);
        }
    }
}
