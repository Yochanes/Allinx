package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public volatile SimpleQueue f51182a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f51183b;

    /* JADX INFO: renamed from: c */
    public long f51184c;

    /* JADX INFO: renamed from: d */
    public int f51185d;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.m18221a(this);
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18225e(this, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iMo17962e = queueSubscription.mo17962e(3);
                if (iMo17962e == 1) {
                    this.f51185d = iMo17962e;
                    this.f51182a = queueSubscription;
                    this.f51183b = true;
                    throw null;
                }
                if (iMo17962e == 2) {
                    this.f51185d = iMo17962e;
                    this.f51182a = queueSubscription;
                    subscription.request(0);
                    return;
                }
            }
            this.f51182a = new SpscArrayQueue(0);
            subscription.request(0);
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
        if (this.f51185d != 0) {
            throw null;
        }
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (this.f51185d != 1) {
            long j2 = this.f51184c + j;
            if (j2 < 0) {
                this.f51184c = j2;
            } else {
                this.f51184c = 0L;
                get().request(j2);
            }
        }
    }
}
