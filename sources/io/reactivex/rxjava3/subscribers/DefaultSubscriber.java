package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.Objects;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: a */
    public Subscription f51347a;

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        Subscription subscription2 = this.f51347a;
        Class<?> cls = getClass();
        Objects.requireNonNull(subscription, "next is null");
        if (subscription2 == null) {
            this.f51347a = subscription;
            subscription.request(Long.MAX_VALUE);
        } else {
            subscription.cancel();
            if (subscription2 != SubscriptionHelper.f51214a) {
                EndConsumerHelper.m18243a(cls);
            }
        }
    }
}
