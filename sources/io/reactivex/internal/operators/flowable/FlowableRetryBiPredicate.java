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
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48068a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f48069b;

        /* JADX INFO: renamed from: c */
        public final Publisher f48070c;

        /* JADX INFO: renamed from: d */
        public int f48071d;

        /* JADX INFO: renamed from: f */
        public long f48072f;

        public RetryBiSubscriber(FlowableSubscriber flowableSubscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.f48068a = flowableSubscriber;
            this.f48069b = subscriptionArbiter;
            this.f48070c = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f48069b.m17866e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48068a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            try {
                this.f48071d++;
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                this.f48068a.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f48072f++;
            this.f48068a.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter();
        subscriber.mo12367j(subscriptionArbiter);
        RetryBiSubscriber retryBiSubscriber = new RetryBiSubscriber((FlowableSubscriber) subscriber, subscriptionArbiter, this.f47628b);
        if (retryBiSubscriber.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!retryBiSubscriber.f48069b.f49264g) {
                long j = retryBiSubscriber.f48072f;
                if (j != 0) {
                    retryBiSubscriber.f48072f = 0L;
                    retryBiSubscriber.f48069b.m17865d(j);
                }
                retryBiSubscriber.f48070c.mo15432g(retryBiSubscriber);
                iAddAndGet = retryBiSubscriber.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
