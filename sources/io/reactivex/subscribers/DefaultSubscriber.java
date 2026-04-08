package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: a */
    public Subscription f51395a;

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        Subscription subscription2 = this.f51395a;
        Class<?> cls = getClass();
        ObjectHelper.m17628b(subscription, "next is null");
        if (subscription2 == null) {
            this.f51395a = subscription;
            subscription.request(Long.MAX_VALUE);
        } else {
            subscription.cancel();
            if (subscription2 != SubscriptionHelper.f49266a) {
                EndConsumerHelper.m17884a(cls);
            }
        }
    }
}
