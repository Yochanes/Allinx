package io.reactivex;

import io.reactivex.disposables.Disposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface MaybeObserver<T> {
    /* JADX INFO: renamed from: c */
    void mo17586c(Disposable disposable);

    void onComplete();

    void onError(Throwable th);

    void onSuccess(Object obj);
}
