package io.reactivex;

import io.reactivex.disposables.Disposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Observer<T> {
    /* JADX INFO: renamed from: c */
    void mo17593c(Disposable disposable);

    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);
}
