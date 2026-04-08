package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDetach<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DetachSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public FlowableSubscriber f49689a;

        /* JADX INFO: renamed from: b */
        public Subscription f49690b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            Subscription subscription = this.f49690b;
            EmptyComponent emptyComponent = EmptyComponent.f51222a;
            this.f49690b = emptyComponent;
            this.f49689a = emptyComponent;
            subscription.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49690b, subscription)) {
                this.f49690b = subscription;
                this.f49689a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            FlowableSubscriber flowableSubscriber = this.f49689a;
            EmptyComponent emptyComponent = EmptyComponent.f51222a;
            this.f49690b = emptyComponent;
            this.f49689a = emptyComponent;
            flowableSubscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            FlowableSubscriber flowableSubscriber = this.f49689a;
            EmptyComponent emptyComponent = EmptyComponent.f51222a;
            this.f49690b = emptyComponent;
            this.f49689a = emptyComponent;
            flowableSubscriber.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49689a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49690b.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
