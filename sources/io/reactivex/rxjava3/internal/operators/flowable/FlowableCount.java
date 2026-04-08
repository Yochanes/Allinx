package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableCount<T> extends AbstractFlowableWithUpstream<T, Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CountSubscriber extends DeferredScalarSubscription<Long> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: c */
        public Subscription f49662c;

        /* JADX INFO: renamed from: d */
        public long f49663d;

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f49662c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49662c, subscription)) {
                this.f49662c = subscription;
                this.f51202a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            m18214d(Long.valueOf(this.f49663d));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f51202a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49663d++;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new CountSubscriber(subscriber);
        throw null;
    }
}
