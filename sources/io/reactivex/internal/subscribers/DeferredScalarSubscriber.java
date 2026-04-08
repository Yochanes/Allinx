package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: c */
    public Subscription f49232c;

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
    public void cancel() {
        super.cancel();
        this.f49232c.cancel();
    }

    /* JADX INFO: renamed from: j */
    public void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17874i(this.f49232c, subscription)) {
            this.f49232c = subscription;
            this.f49255a.mo12367j(this);
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void onComplete() {
        this.f49255a.onComplete();
    }

    public void onError(Throwable th) {
        this.f49256b = null;
        this.f49255a.onError(th);
    }
}
