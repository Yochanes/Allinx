package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Observer<T> {
    /* JADX INFO: renamed from: c */
    void mo12365c(Disposable disposable);

    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);
}
