package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49699a;

        /* JADX INFO: renamed from: b */
        public Subscription f49700b;

        public SubscriptionLambdaSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49699a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            Subscription subscription = this.f49700b;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (subscription == subscriptionHelper) {
                return;
            }
            this.f49700b = subscriptionHelper;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
                subscription.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                subscription.cancel();
                this.f49700b = SubscriptionHelper.f51214a;
                EmptySubscription.m18217b(th, this.f49699a);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49700b != SubscriptionHelper.f51214a) {
                this.f49699a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49700b != SubscriptionHelper.f51214a) {
                this.f49699a.onError(th);
            } else {
                RxJavaPlugins.m18275b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49699a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
                this.f49700b.request(j);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new SubscriptionLambdaSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
