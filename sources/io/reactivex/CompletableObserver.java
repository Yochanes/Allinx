package io.reactivex;

import io.reactivex.disposables.Disposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface CompletableObserver {
    /* JADX INFO: renamed from: c */
    void mo17580c(Disposable disposable);

    void onComplete();

    void onError(Throwable th);
}
