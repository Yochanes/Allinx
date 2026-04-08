package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: j */
        public final FlowableSubscriber f47698j;

        /* JADX INFO: renamed from: n */
        public final AtomicInteger f47699n = new AtomicInteger();

        /* JADX INFO: renamed from: o */
        public long f47700o;

        public ConcatArraySubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47698j = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47699n.getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47698j.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f47700o++;
            this.f47698j.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber((FlowableSubscriber) subscriber);
        subscriber.mo12367j(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
