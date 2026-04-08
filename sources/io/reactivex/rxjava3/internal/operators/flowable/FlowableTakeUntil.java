package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTakeUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50072a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f50073b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50074c = new AtomicReference();

        /* JADX INFO: renamed from: f */
        public final OtherSubscriber f50076f = new OtherSubscriber();

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f50075d = new AtomicThrowable();

        /* JADX INFO: compiled from: Proguard */
        public final class OtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public OtherSubscriber() {
            }

            @Override // org.reactivestreams.Subscriber
            /* JADX INFO: renamed from: j */
            public final void mo12367j(Subscription subscription) {
                SubscriptionHelper.m18224d(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                SubscriptionHelper.m18221a(takeUntilMainSubscriber.f50074c);
                HalfSerializer.m18253b(takeUntilMainSubscriber.f50072a, takeUntilMainSubscriber, takeUntilMainSubscriber.f50075d);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                SubscriptionHelper.m18221a(takeUntilMainSubscriber.f50074c);
                HalfSerializer.m18255d(takeUntilMainSubscriber.f50072a, th, takeUntilMainSubscriber, takeUntilMainSubscriber.f50075d);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SubscriptionHelper.m18221a(this);
                onComplete();
            }
        }

        public TakeUntilMainSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50072a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m18221a(this.f50074c);
            SubscriptionHelper.m18221a(this.f50076f);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18223c(this.f50074c, this.f50073b, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.m18221a(this.f50076f);
            HalfSerializer.m18253b(this.f50072a, this, this.f50075d);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.m18221a(this.f50076f);
            HalfSerializer.m18255d(this.f50072a, th, this, this.f50075d);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            HalfSerializer.m18257f(this.f50072a, obj, this, this.f50075d);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m18222b(this.f50074c, this.f50073b, j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new TakeUntilMainSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
