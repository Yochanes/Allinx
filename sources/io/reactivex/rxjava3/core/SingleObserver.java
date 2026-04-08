package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface SingleObserver<T> {
    /* JADX INFO: renamed from: c */
    void mo12366c(Disposable disposable);

    void onError(Throwable th);

    void onSuccess(Object obj);
}
