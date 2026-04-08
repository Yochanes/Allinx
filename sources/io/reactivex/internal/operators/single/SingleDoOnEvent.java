package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleDoOnEvent<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public final class DoOnEvent implements SingleObserver<T> {
        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                new CompositeException(th, th2);
                throw null;
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                throw null;
            }
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
