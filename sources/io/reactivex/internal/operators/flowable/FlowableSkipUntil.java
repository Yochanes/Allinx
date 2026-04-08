package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
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
public final class FlowableSkipUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipUntilMainSubscriber<T> extends AtomicInteger implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48126a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48127b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f48128c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final OtherSubscriber f48129d = new OtherSubscriber();

        /* JADX INFO: renamed from: f */
        public final AtomicThrowable f48130f = new AtomicThrowable();

        /* JADX INFO: renamed from: g */
        public volatile boolean f48131g;

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
                SkipUntilMainSubscriber.this.f48131g = true;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                SkipUntilMainSubscriber skipUntilMainSubscriber = SkipUntilMainSubscriber.this;
                SubscriptionHelper.m17867a(skipUntilMainSubscriber.f48127b);
                HalfSerializer.m17893d(skipUntilMainSubscriber.f48126a, th, skipUntilMainSubscriber, skipUntilMainSubscriber.f48130f);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SkipUntilMainSubscriber.this.f48131g = true;
                get().cancel();
            }
        }

        public SkipUntilMainSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48126a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m17867a(this.f48127b);
            SubscriptionHelper.m17867a(this.f48129d);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (!this.f48131g) {
                return false;
            }
            HalfSerializer.m17895f(this.f48126a, obj, this, this.f48130f);
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17869c(this.f48127b, this.f48128c, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.m17867a(this.f48129d);
            HalfSerializer.m17891b(this.f48126a, this, this.f48130f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.m17867a(this.f48129d);
            HalfSerializer.m17893d(this.f48126a, th, this, this.f48130f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (mo17630f(obj)) {
                return;
            }
            ((Subscription) this.f48127b.get()).request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m17868b(this.f48127b, this.f48128c, j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new SkipUntilMainSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
