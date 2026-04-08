package io.reactivex.internal.observers;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f47570a == null) {
            this.f47570a = obj;
            this.f47571b.dispose();
            countDown();
        }
    }
}
