package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.LinkedArrayList;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableCache<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplaySubscription<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47692a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f47693b = new AtomicLong();

        public ReplaySubscription(FlowableSubscriber flowableSubscriber) {
            this.f47692a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f47693b.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                AtomicLong atomicLong = this.f47693b;
                BackpressureHelper.m17879b(atomicLong, j);
                if (getAndIncrement() == 0 && atomicLong.get() != Long.MIN_VALUE) {
                    throw null;
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new ReplaySubscription((FlowableSubscriber) subscriber));
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CacheState<T> extends LinkedArrayList implements FlowableSubscriber<T> {
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17871e(null, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            RxJavaPlugins.m17911b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
        }
    }
}
