package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFromSupplier<T> extends Single<T> {
    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        Disposable disposableM17946k = Disposable.m17946k(Functions.f49388b);
        singleObserver.mo12366c(disposableM17946k);
        if (disposableM17946k.mo12353d()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            if (disposableM17946k.mo12353d()) {
                RxJavaPlugins.m18275b(th);
            } else {
                singleObserver.onError(th);
            }
        }
    }
}
