package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SchedulerSupport
@BackpressureSupport
@Experimental
public final class MulticastProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public volatile SimpleQueue f49317b;

    /* JADX INFO: compiled from: Proguard */
    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49318a;

        /* JADX INFO: renamed from: b */
        public final MulticastProcessor f49319b;

        public MulticastSubscription(FlowableSubscriber flowableSubscriber, MulticastProcessor multicastProcessor) {
            this.f49318a = flowableSubscriber;
            this.f49319b = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f49319b.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.m17873h(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j3 = j2 + j;
                    }
                } while (!compareAndSet(j2, j3 >= 0 ? j3 : Long.MAX_VALUE));
                this.f49319b.getClass();
                throw null;
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new MulticastSubscription((FlowableSubscriber) subscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17872f(null, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iMo17626e = queueSubscription.mo17626e(3);
                if (iMo17626e == 1) {
                    this.f49317b = queueSubscription;
                    throw null;
                }
                if (iMo17626e == 2) {
                    this.f49317b = queueSubscription;
                    subscription.request(0);
                    return;
                }
            }
            this.f49317b = new SpscArrayQueue(0);
            subscription.request(0);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        throw null;
    }
}
