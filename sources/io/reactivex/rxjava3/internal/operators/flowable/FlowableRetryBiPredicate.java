package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49969a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f49970b;

        /* JADX INFO: renamed from: c */
        public final Publisher f49971c;

        /* JADX INFO: renamed from: d */
        public int f49972d;

        /* JADX INFO: renamed from: f */
        public long f49973f;

        public RetryBiSubscriber(FlowableSubscriber flowableSubscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.f49969a = flowableSubscriber;
            this.f49970b = subscriptionArbiter;
            this.f49971c = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f49970b.m18220e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49969a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            try {
                this.f49972d++;
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                this.f49969a.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49973f++;
            this.f49969a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.mo12367j(subscriptionArbiter);
        RetryBiSubscriber retryBiSubscriber = new RetryBiSubscriber((FlowableSubscriber) subscriber, subscriptionArbiter, null);
        if (retryBiSubscriber.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!retryBiSubscriber.f49970b.f51212i) {
                long j = retryBiSubscriber.f49973f;
                if (j != 0) {
                    retryBiSubscriber.f49973f = 0L;
                    retryBiSubscriber.f49970b.m18219d(j);
                }
                retryBiSubscriber.f49971c.mo15432g(retryBiSubscriber);
                iAddAndGet = retryBiSubscriber.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
