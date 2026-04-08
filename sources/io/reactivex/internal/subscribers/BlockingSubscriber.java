package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public static final Object f49231a = null;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (SubscriptionHelper.m17867a(this)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17872f(this, subscription)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        get().request(j);
    }
}
