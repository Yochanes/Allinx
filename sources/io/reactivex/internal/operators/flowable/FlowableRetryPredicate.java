package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48073a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f48074b;

        /* JADX INFO: renamed from: c */
        public final Publisher f48075c;

        /* JADX INFO: renamed from: d */
        public long f48076d = 0;

        /* JADX INFO: renamed from: f */
        public long f48077f;

        public RetrySubscriber(FlowableSubscriber flowableSubscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.f48073a = flowableSubscriber;
            this.f48074b = subscriptionArbiter;
            this.f48075c = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f48074b.m17866e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48073a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            long j = this.f48076d;
            if (j != Long.MAX_VALUE) {
                this.f48076d = j - 1;
            }
            FlowableSubscriber flowableSubscriber = this.f48073a;
            if (j == 0) {
                flowableSubscriber.onError(th);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                flowableSubscriber.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f48077f++;
            this.f48073a.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter();
        subscriber.mo12367j(subscriptionArbiter);
        RetrySubscriber retrySubscriber = new RetrySubscriber((FlowableSubscriber) subscriber, subscriptionArbiter, this.f47628b);
        if (retrySubscriber.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!retrySubscriber.f48074b.f49264g) {
                long j = retrySubscriber.f48077f;
                if (j != 0) {
                    retrySubscriber.f48077f = 0L;
                    retrySubscriber.f48074b.m17865d(j);
                }
                retrySubscriber.f48075c.mo15432g(retrySubscriber);
                iAddAndGet = retrySubscriber.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
