package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
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
        public final FlowableSubscriber f48172a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f48173b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48174c = new AtomicReference();

        /* JADX INFO: renamed from: f */
        public final OtherSubscriber f48176f = new OtherSubscriber();

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f48175d = new AtomicThrowable();

        /* JADX INFO: compiled from: Proguard */
        public final class OtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public OtherSubscriber() {
            }

            @Override // org.reactivestreams.Subscriber
            /* JADX INFO: renamed from: j */
            public final void mo12367j(Subscription subscription) {
                SubscriptionHelper.m17871e(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                SubscriptionHelper.m17867a(takeUntilMainSubscriber.f48174c);
                HalfSerializer.m17891b(takeUntilMainSubscriber.f48172a, takeUntilMainSubscriber, takeUntilMainSubscriber.f48175d);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                SubscriptionHelper.m17867a(takeUntilMainSubscriber.f48174c);
                HalfSerializer.m17893d(takeUntilMainSubscriber.f48172a, th, takeUntilMainSubscriber, takeUntilMainSubscriber.f48175d);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SubscriptionHelper.m17867a(this);
                onComplete();
            }
        }

        public TakeUntilMainSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48172a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m17867a(this.f48174c);
            SubscriptionHelper.m17867a(this.f48176f);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17869c(this.f48174c, this.f48173b, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.m17867a(this.f48176f);
            HalfSerializer.m17891b(this.f48172a, this, this.f48175d);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.m17867a(this.f48176f);
            HalfSerializer.m17893d(this.f48172a, th, this, this.f48175d);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            HalfSerializer.m17895f(this.f48172a, obj, this, this.f48175d);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m17868b(this.f48174c, this.f48173b, j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new TakeUntilMainSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
