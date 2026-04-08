package io.reactivex.rxjava3.internal.subscribers;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f51177a = null;
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        this.f51177a = obj;
    }
}
