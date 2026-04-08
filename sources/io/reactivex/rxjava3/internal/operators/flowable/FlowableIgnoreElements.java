package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableIgnoreElements<T> extends AbstractFlowableWithUpstream<T, T> {
    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new IgnoreElementsSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, QueueSubscription<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49797a;

        /* JADX INFO: renamed from: b */
        public Subscription f49798b;

        public IgnoreElementsSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49797a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49798b.cancel();
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49798b, subscription)) {
                this.f49798b = subscription;
                this.f49797a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49797a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49797a.onError(th);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
        }
    }
}
