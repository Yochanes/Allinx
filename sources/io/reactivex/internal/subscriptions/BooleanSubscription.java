package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BooleanSubscription extends AtomicBoolean implements Subscription {
    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        lazySet(true);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.m17873h(j);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
