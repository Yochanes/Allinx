package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.schedulers.Timed;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50091a;

        public TimeIntervalSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50091a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(null, subscription)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50091a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f50091a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new TimeIntervalSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
