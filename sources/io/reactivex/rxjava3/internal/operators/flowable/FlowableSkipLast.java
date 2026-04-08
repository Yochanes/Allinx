package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSkipLast<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50020a;

        /* JADX INFO: renamed from: b */
        public Subscription f50021b;

        public SkipLastSubscriber(FlowableSubscriber flowableSubscriber) {
            super(0);
            this.f50020a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50021b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50021b, subscription)) {
                this.f50021b = subscription;
                this.f50020a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50020a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f50020a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (size() == 0) {
                this.f50020a.onNext(poll());
            } else {
                this.f50021b.request(1L);
            }
            offer(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f50021b.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new SkipLastSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
