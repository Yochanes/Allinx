package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableIgnoreElements<T> extends AbstractFlowableWithUpstream<T, T> {
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new IgnoreElementsSubscriber((FlowableSubscriber) subscriber));
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, QueueSubscription<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47885a;

        /* JADX INFO: renamed from: b */
        public Subscription f47886b;

        public IgnoreElementsSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47885a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47886b.cancel();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47886b, subscription)) {
                this.f47886b = subscription;
                this.f47885a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47885a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47885a.onError(th);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
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
