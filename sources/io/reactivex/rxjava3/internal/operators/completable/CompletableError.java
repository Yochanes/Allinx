package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableError extends Completable {

    /* JADX INFO: renamed from: a */
    public final Exception f49524a;

    public CompletableError(Exception exc) {
        this.f49524a = exc;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        EmptyDisposable.m17958b(this.f49524a, completableObserver);
    }
}
