package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.exceptions.Exceptions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableMergeDelayErrorIterable extends Completable {
    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        completableObserver.mo12363c(new CompositeDisposable());
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            completableObserver.onError(th);
        }
    }
}
