package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableFromCallable extends Completable {
    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        Disposable disposableM17608a = Disposables.m17608a(Functions.f47560b);
        completableObserver.mo17580c(disposableM17608a);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            if (disposableM17608a.mo17596d()) {
                return;
            }
            completableObserver.onError(th);
        }
    }
}
