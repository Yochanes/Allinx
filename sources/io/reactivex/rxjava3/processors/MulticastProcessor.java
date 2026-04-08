package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@BackpressureSupport
@SchedulerSupport
public final class MulticastProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public volatile SimpleQueue f51269b;

    /* JADX INFO: compiled from: Proguard */
    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f51270a;

        /* JADX INFO: renamed from: b */
        public final MulticastProcessor f51271b;

        public MulticastSubscription(FlowableSubscriber flowableSubscriber, MulticastProcessor multicastProcessor) {
            this.f51270a = flowableSubscriber;
            this.f51271b = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f51271b.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                long jM18238b = BackpressureHelper.m18238b(this, j);
                if (jM18238b == Long.MIN_VALUE || jM18238b == Long.MAX_VALUE) {
                    return;
                }
                this.f51271b.getClass();
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new MulticastSubscription((FlowableSubscriber) subscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18225e(null, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iMo17962e = queueSubscription.mo17962e(3);
                if (iMo17962e == 1) {
                    this.f51269b = queueSubscription;
                    throw null;
                }
                if (iMo17962e == 2) {
                    this.f51269b = queueSubscription;
                    subscription.request(0);
                    return;
                }
            }
            this.f51269b = new SpscArrayQueue(0);
            subscription.request(0);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        RxJavaPlugins.m18275b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
    }
}
