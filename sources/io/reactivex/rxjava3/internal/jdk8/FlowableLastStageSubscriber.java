package io.reactivex.rxjava3.internal.jdk8;

import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableLastStageSubscriber<T> extends FlowableStageSubscriber<T> {
    @Override // io.reactivex.rxjava3.internal.jdk8.FlowableStageSubscriber
    /* JADX INFO: renamed from: a */
    public final void mo17965a(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (isDone()) {
            return;
        }
        this.f49418a = null;
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        this.f49418a = obj;
    }
}
