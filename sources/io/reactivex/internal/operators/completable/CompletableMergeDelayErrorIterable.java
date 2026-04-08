package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableMergeDelayErrorIterable extends Completable {
    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        completableObserver.mo17580c(new CompositeDisposable());
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            completableObserver.onError(th);
        }
    }
}
