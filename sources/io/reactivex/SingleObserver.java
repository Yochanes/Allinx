package io.reactivex;

import io.reactivex.disposables.Disposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface SingleObserver<T> {
    /* JADX INFO: renamed from: c */
    void mo17602c(Disposable disposable);

    void onError(Throwable th);

    void onSuccess(Object obj);
}
