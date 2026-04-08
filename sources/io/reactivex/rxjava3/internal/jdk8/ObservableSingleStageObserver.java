package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSingleStageObserver<T> extends ObservableStageObserver<T> {
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
        if (this.f49451a == null) {
            this.f49451a = obj;
            return;
        }
        this.f49451a = null;
        new IllegalArgumentException("Sequence contains more than one element!");
        DisposableHelper.m17952a(null);
        throw null;
    }
}
