package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: c */
    public Subscription f51180c;

    @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
    public void cancel() {
        super.cancel();
        this.f51180c.cancel();
    }

    /* JADX INFO: renamed from: j */
    public void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18227h(this.f51180c, subscription)) {
            this.f51180c = subscription;
            this.f51202a.mo12367j(this);
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void onComplete() {
        this.f51202a.onComplete();
    }

    public void onError(Throwable th) {
        this.f51203b = null;
        this.f51202a.onError(th);
    }
}
