package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableFromAction extends Completable {
    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        Disposable disposableM17946k = Disposable.m17946k(Functions.f49388b);
        completableObserver.mo12363c(disposableM17946k);
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
                completableObserver.onError(th);
            }
        }
    }
}
