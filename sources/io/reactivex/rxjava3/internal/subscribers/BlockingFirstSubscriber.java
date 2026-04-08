package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.f51177a != null) {
            RxJavaPlugins.m18275b(th);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.f51177a == null) {
            this.f51177a = obj;
            this.f51178b.cancel();
            countDown();
        }
    }
}
