package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: a */
    public Object f51177a;

    /* JADX INFO: renamed from: b */
    public Subscription f51178b;

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18227h(this.f51178b, subscription)) {
            this.f51178b = subscription;
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }
}
