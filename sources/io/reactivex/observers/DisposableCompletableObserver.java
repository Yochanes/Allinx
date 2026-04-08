package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DisposableCompletableObserver implements CompletableObserver, Disposable {
    @Override // io.reactivex.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo17580c(Disposable disposable) {
        EndConsumerHelper.m17885b(null, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17615a(null);
        throw null;
    }
}
