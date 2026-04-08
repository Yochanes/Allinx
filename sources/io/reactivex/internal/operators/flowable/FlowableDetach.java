package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDetach<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DetachSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public FlowableSubscriber f47751a;

        /* JADX INFO: renamed from: b */
        public Subscription f47752b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            Subscription subscription = this.f47752b;
            EmptyComponent emptyComponent = EmptyComponent.f49273a;
            this.f47752b = emptyComponent;
            this.f47751a = emptyComponent;
            subscription.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47752b, subscription)) {
                this.f47752b = subscription;
                this.f47751a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            FlowableSubscriber flowableSubscriber = this.f47751a;
            EmptyComponent emptyComponent = EmptyComponent.f49273a;
            this.f47752b = emptyComponent;
            this.f47751a = emptyComponent;
            flowableSubscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            FlowableSubscriber flowableSubscriber = this.f47751a;
            EmptyComponent emptyComponent = EmptyComponent.f49273a;
            this.f47752b = emptyComponent;
            this.f47751a = emptyComponent;
            flowableSubscriber.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f47751a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f47752b.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        DetachSubscriber detachSubscriber = new DetachSubscriber();
        detachSubscriber.f47751a = (FlowableSubscriber) subscriber;
        this.f47628b.m17582b(detachSubscriber);
    }
}
