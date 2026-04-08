package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableReduce<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public Subscription f48023c;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f48023c.cancel();
            this.f48023c = SubscriptionHelper.f49266a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48023c, subscription)) {
                this.f48023c = subscription;
                this.f49255a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = this.f48023c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
            if (subscription == subscriptionHelper) {
                return;
            }
            this.f48023c = subscriptionHelper;
            Object obj = this.f49256b;
            if (obj != null) {
                m17861d(obj);
            } else {
                this.f49255a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Subscription subscription = this.f48023c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48023c = subscriptionHelper;
                this.f49255a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48023c == SubscriptionHelper.f49266a) {
                return;
            }
            if (this.f49256b == null) {
                this.f49256b = obj;
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48023c.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new ReduceSubscriber((FlowableSubscriber) subscriber));
    }
}
