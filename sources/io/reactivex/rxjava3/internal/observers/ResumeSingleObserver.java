package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {
    @Override // io.reactivex.rxjava3.core.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo12366c(Disposable disposable) {
        DisposableHelper.m17954c(null, disposable);
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
