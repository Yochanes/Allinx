package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableReduce<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public Subscription f49923c;

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f49923c.cancel();
            this.f49923c = SubscriptionHelper.f51214a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49923c, subscription)) {
                this.f49923c = subscription;
                this.f51202a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = this.f49923c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (subscription == subscriptionHelper) {
                return;
            }
            this.f49923c = subscriptionHelper;
            Object obj = this.f51203b;
            if (obj != null) {
                m18214d(obj);
            } else {
                this.f51202a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Subscription subscription = this.f49923c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49923c = subscriptionHelper;
                this.f51202a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49923c == SubscriptionHelper.f51214a) {
                return;
            }
            if (this.f51203b == null) {
                this.f51203b = obj;
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49923c.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new ReduceSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
