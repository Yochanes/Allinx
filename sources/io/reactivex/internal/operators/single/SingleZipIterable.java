package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleZipIterable<T, R> extends Single<R> {

    /* JADX INFO: compiled from: Proguard */
    public final class SingletonArrayFunc implements Function<T, R> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
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
