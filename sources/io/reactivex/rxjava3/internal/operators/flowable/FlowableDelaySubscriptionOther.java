package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49682a;

        /* JADX INFO: renamed from: b */
        public final OtherSubscriber f49683b = new OtherSubscriber();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f49684c = new AtomicReference();

        /* JADX INFO: compiled from: Proguard */
        public final class OtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public OtherSubscriber() {
            }

            @Override // org.reactivestreams.Subscriber
            /* JADX INFO: renamed from: j */
            public final void mo12367j(Subscription subscription) {
                if (SubscriptionHelper.m18225e(this, subscription)) {
                    subscription.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                if (get() == SubscriptionHelper.f51214a) {
                    return;
                }
                MainSubscriber.this.getClass();
                throw null;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                if (get() != SubscriptionHelper.f51214a) {
                    MainSubscriber.this.f49682a.onError(th);
                } else {
                    RxJavaPlugins.m18275b(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                Subscription subscription = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
                if (subscription == subscriptionHelper) {
                    return;
                }
                lazySet(subscriptionHelper);
                subscription.cancel();
                MainSubscriber.this.getClass();
                throw null;
            }
        }

        public MainSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49682a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m18221a(this.f49683b);
            SubscriptionHelper.m18221a(this.f49684c);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18223c(this.f49684c, this, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49682a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49682a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49682a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                SubscriptionHelper.m18222b(this.f49684c, this, j);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new MainSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
