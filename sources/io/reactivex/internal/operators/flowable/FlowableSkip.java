package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48116a;

        /* JADX INFO: renamed from: b */
        public long f48117b = 0;

        /* JADX INFO: renamed from: c */
        public Subscription f48118c;

        public SkipSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48116a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48118c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48118c, subscription)) {
                long j = this.f48117b;
                this.f48118c = subscription;
                this.f48116a.mo12367j(this);
                subscription.request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48116a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48116a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.f48117b;
            if (j != 0) {
                this.f48117b = j - 1;
            } else {
                this.f48116a.onNext(obj);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f48118c.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new SkipSubscriber((FlowableSubscriber) subscriber));
    }
}
