package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49938a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f49939b;

        /* JADX INFO: renamed from: c */
        public final Publisher f49940c;

        /* JADX INFO: renamed from: d */
        public long f49941d = -1;

        /* JADX INFO: renamed from: f */
        public long f49942f;

        public RepeatSubscriber(FlowableSubscriber flowableSubscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.f49938a = flowableSubscriber;
            this.f49939b = subscriptionArbiter;
            this.f49940c = publisher;
        }

        /* JADX INFO: renamed from: a */
        public final void m18064a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f49939b.f51212i) {
                    long j = this.f49942f;
                    if (j != 0) {
                        this.f49942f = 0L;
                        this.f49939b.m18219d(j);
                    }
                    this.f49940c.mo15432g(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f49939b.m18220e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j = this.f49941d;
            if (j != Long.MAX_VALUE) {
                this.f49941d = j - 1;
            }
            if (j != 0) {
                m18064a();
            } else {
                this.f49938a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49938a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49942f++;
            this.f49938a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.mo12367j(subscriptionArbiter);
        new RepeatSubscriber((FlowableSubscriber) subscriber, subscriptionArbiter, null).m18064a();
    }
}
