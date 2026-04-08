package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFirstStageObserver<T> extends ObservableStageObserver<T> {
    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (isDone()) {
            return;
        }
        this.f49451a = null;
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        DisposableHelper.m17952a(null);
        throw null;
    }
}
