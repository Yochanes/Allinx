package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {
    @Override // io.reactivex.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo17602c(Disposable disposable) {
        DisposableHelper.m17617c(null, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        throw null;
    }
}
