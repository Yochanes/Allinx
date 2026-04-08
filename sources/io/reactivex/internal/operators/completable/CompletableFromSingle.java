package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableFromSingle<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletableFromSingleObserver<T> implements SingleObserver<T> {
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

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        throw null;
    }
}
