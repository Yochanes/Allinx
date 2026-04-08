package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: n */
        public final FlowableSubscriber f49630n;

        /* JADX INFO: renamed from: o */
        public final AtomicInteger f49631o;

        /* JADX INFO: renamed from: p */
        public long f49632p;

        public ConcatArraySubscriber(FlowableSubscriber flowableSubscriber) {
            super(false);
            this.f49630n = flowableSubscriber;
            this.f49631o = new AtomicInteger();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49631o.getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49630n.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49632p++;
            this.f49630n.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber((FlowableSubscriber) subscriber);
        subscriber.mo12367j(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
