package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50017a;

        /* JADX INFO: renamed from: b */
        public long f50018b = 0;

        /* JADX INFO: renamed from: c */
        public Subscription f50019c;

        public SkipSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50017a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50019c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50019c, subscription)) {
                long j = this.f50018b;
                this.f50019c = subscription;
                this.f50017a.mo12367j(this);
                subscription.request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50017a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f50017a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.f50018b;
            if (j != 0) {
                this.f50018b = j - 1;
            } else {
                this.f50017a.onNext(obj);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f50019c.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new SkipSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
