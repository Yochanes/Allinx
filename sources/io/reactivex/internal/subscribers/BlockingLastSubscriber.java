package io.reactivex.internal.subscribers;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f49229a = null;
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        this.f49229a = obj;
    }
}
