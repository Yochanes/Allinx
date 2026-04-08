package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
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
        public final FlowableSubscriber f50027a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f50028b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f50029c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final OtherSubscriber f50030d = new OtherSubscriber();

        /* JADX INFO: renamed from: f */
        public final AtomicThrowable f50031f = new AtomicThrowable();

        /* JADX INFO: renamed from: g */
        public volatile boolean f50032g;

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
                SkipUntilMainSubscriber.this.f50032g = true;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                SkipUntilMainSubscriber skipUntilMainSubscriber = SkipUntilMainSubscriber.this;
                SubscriptionHelper.m18221a(skipUntilMainSubscriber.f50028b);
                HalfSerializer.m18255d(skipUntilMainSubscriber.f50027a, th, skipUntilMainSubscriber, skipUntilMainSubscriber.f50031f);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SkipUntilMainSubscriber.this.f50032g = true;
                get().cancel();
            }
        }

        public SkipUntilMainSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50027a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m18221a(this.f50028b);
            SubscriptionHelper.m18221a(this.f50030d);
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (!this.f50032g) {
                return false;
            }
            HalfSerializer.m18257f(this.f50027a, obj, this, this.f50031f);
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18223c(this.f50028b, this.f50029c, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.m18221a(this.f50030d);
            HalfSerializer.m18253b(this.f50027a, this, this.f50031f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.m18221a(this.f50030d);
            HalfSerializer.m18255d(this.f50027a, th, this, this.f50031f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (mo17969f(obj)) {
                return;
            }
            ((Subscription) this.f50028b.get()).request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m18222b(this.f50028b, this.f50029c, j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new SkipUntilMainSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
