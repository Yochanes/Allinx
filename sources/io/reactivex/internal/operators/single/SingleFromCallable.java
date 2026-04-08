package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFromCallable<T> extends Single<T> {
    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        Disposable disposableM17608a = Disposables.m17608a(Functions.f47560b);
        singleObserver.mo17602c(disposableM17608a);
        if (disposableM17608a.mo17596d()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            if (disposableM17608a.mo17596d()) {
                RxJavaPlugins.m17911b(th);
            } else {
                singleObserver.onError(th);
            }
        }
    }
}
