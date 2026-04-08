package io.reactivex.rxjava3.internal.observers;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.f49471a == null) {
            this.f49471a = obj;
            this.f49472b.dispose();
            countDown();
        }
    }
}
