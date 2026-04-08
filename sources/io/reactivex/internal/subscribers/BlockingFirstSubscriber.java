package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.f49229a != null) {
            RxJavaPlugins.m17911b(th);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.f49229a == null) {
            this.f49229a = obj;
            this.f49230b.cancel();
            countDown();
        }
    }
}
