package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public volatile SimpleQueue f49234a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f49235b;

    /* JADX INFO: renamed from: c */
    public long f49236c;

    /* JADX INFO: renamed from: d */
    public int f49237d;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.m17867a(this);
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17872f(this, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iMo17626e = queueSubscription.mo17626e(3);
                if (iMo17626e == 1) {
                    this.f49237d = iMo17626e;
                    this.f49234a = queueSubscription;
                    this.f49235b = true;
                    throw null;
                }
                if (iMo17626e == 2) {
                    this.f49237d = iMo17626e;
                    this.f49234a = queueSubscription;
                    subscription.request(0);
                    return;
                }
            }
            this.f49234a = new SpscArrayQueue(0);
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
        if (this.f49237d != 0) {
            throw null;
        }
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (this.f49237d != 1) {
            long j2 = this.f49236c + j;
            if (j2 < 0) {
                this.f49236c = j2;
            } else {
                this.f49236c = 0L;
                get().request(j2);
            }
        }
    }
}
