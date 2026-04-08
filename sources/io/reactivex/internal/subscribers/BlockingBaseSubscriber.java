package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: a */
    public Object f49229a;

    /* JADX INFO: renamed from: b */
    public Subscription f49230b;

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17874i(this.f49230b, subscription)) {
            this.f49230b = subscription;
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }
}
