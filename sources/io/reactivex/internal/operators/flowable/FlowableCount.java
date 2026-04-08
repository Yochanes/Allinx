package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableCount<T> extends AbstractFlowableWithUpstream<T, Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CountSubscriber extends DeferredScalarSubscription<Long> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: c */
        public Subscription f47724c;

        /* JADX INFO: renamed from: d */
        public long f47725d;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f47724c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47724c, subscription)) {
                this.f47724c = subscription;
                this.f49255a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            m17861d(Long.valueOf(this.f47725d));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49255a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f47725d++;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new CountSubscriber(subscriber));
    }
}
