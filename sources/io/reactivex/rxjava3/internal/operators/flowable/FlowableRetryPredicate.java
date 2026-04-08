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
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49974a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f49975b;

        /* JADX INFO: renamed from: c */
        public final Publisher f49976c;

        /* JADX INFO: renamed from: d */
        public long f49977d = 0;

        /* JADX INFO: renamed from: f */
        public long f49978f;

        public RetrySubscriber(FlowableSubscriber flowableSubscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.f49974a = flowableSubscriber;
            this.f49975b = subscriptionArbiter;
            this.f49976c = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f49975b.m18220e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49974a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            long j = this.f49977d;
            if (j != Long.MAX_VALUE) {
                this.f49977d = j - 1;
            }
            FlowableSubscriber flowableSubscriber = this.f49974a;
            if (j == 0) {
                flowableSubscriber.onError(th);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                flowableSubscriber.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49978f++;
            this.f49974a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.mo12367j(subscriptionArbiter);
        RetrySubscriber retrySubscriber = new RetrySubscriber((FlowableSubscriber) subscriber, subscriptionArbiter, null);
        if (retrySubscriber.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!retrySubscriber.f49975b.f51212i) {
                long j = retrySubscriber.f49978f;
                if (j != 0) {
                    retrySubscriber.f49978f = 0L;
                    retrySubscriber.f49975b.m18219d(j);
                }
                retrySubscriber.f49976c.mo15432g(retrySubscriber);
                iAddAndGet = retrySubscriber.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
