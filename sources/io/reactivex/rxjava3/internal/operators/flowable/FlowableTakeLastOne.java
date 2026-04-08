package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTakeLastOne<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeLastOneSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public Subscription f50064c;

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f50064c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50064c, subscription)) {
                this.f50064c = subscription;
                this.f51202a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Object obj = this.f51203b;
            if (obj != null) {
                m18214d(obj);
            } else {
                this.f51202a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f51203b = null;
            this.f51202a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f51203b = obj;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new TakeLastOneSubscriber(subscriber);
        throw null;
    }
}
