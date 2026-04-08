package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50036a;

        /* JADX INFO: renamed from: b */
        public final FlowableJust f50037b;

        /* JADX INFO: renamed from: d */
        public boolean f50039d = true;

        /* JADX INFO: renamed from: c */
        public final SubscriptionArbiter f50038c = new SubscriptionArbiter(false);

        public SwitchIfEmptySubscriber(FlowableSubscriber flowableSubscriber, FlowableJust flowableJust) {
            this.f50036a = flowableSubscriber;
            this.f50037b = flowableJust;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f50038c.m18220e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (!this.f50039d) {
                this.f50036a.onComplete();
            } else {
                this.f50039d = false;
                this.f50037b.mo15432g(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f50036a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50039d) {
                this.f50039d = false;
            }
            this.f50036a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new SwitchIfEmptySubscriber((FlowableSubscriber) subscriber, null).f50038c);
        throw null;
    }
}
