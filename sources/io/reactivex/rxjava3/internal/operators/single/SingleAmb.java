package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleAmb<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AmbSingleObserver<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public Disposable f51002a;

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            this.f51002a = disposable;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptyDisposable.m17961h(th, singleObserver);
        }
    }
}
