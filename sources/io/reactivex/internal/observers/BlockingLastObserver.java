package io.reactivex.internal.observers;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingLastObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.internal.observers.BlockingBaseObserver, io.reactivex.Observer
    public final void onError(Throwable th) {
        this.f47570a = null;
        countDown();
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        this.f47570a = obj;
    }
}
