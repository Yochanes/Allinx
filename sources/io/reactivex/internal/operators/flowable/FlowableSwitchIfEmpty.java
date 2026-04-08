package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48135a;

        /* JADX INFO: renamed from: b */
        public final FlowableJust f48136b;

        /* JADX INFO: renamed from: d */
        public boolean f48138d = true;

        /* JADX INFO: renamed from: c */
        public final SubscriptionArbiter f48137c = new SubscriptionArbiter();

        public SwitchIfEmptySubscriber(FlowableSubscriber flowableSubscriber, FlowableJust flowableJust) {
            this.f48135a = flowableSubscriber;
            this.f48136b = flowableJust;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f48137c.m17866e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (!this.f48138d) {
                this.f48135a.onComplete();
            } else {
                this.f48138d = false;
                this.f48136b.mo15432g(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48135a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48138d) {
                this.f48138d = false;
            }
            this.f48135a.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber((FlowableSubscriber) subscriber, null);
        subscriber.mo12367j(switchIfEmptySubscriber.f48137c);
        this.f47628b.m17582b(switchIfEmptySubscriber);
    }
}
