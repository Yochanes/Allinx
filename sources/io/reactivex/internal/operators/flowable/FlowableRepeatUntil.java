package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableRepeatUntil<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48042a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f48043b;

        /* JADX INFO: renamed from: c */
        public final Publisher f48044c;

        /* JADX INFO: renamed from: d */
        public long f48045d;

        public RepeatSubscriber(FlowableSubscriber flowableSubscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.f48042a = flowableSubscriber;
            this.f48043b = subscriptionArbiter;
            this.f48044c = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f48043b.m17866e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48042a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48042a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f48045d++;
            this.f48042a.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter();
        subscriber.mo12367j(subscriptionArbiter);
        RepeatSubscriber repeatSubscriber = new RepeatSubscriber((FlowableSubscriber) subscriber, subscriptionArbiter, this.f47628b);
        if (repeatSubscriber.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!repeatSubscriber.f48043b.f49264g) {
                long j = repeatSubscriber.f48045d;
                if (j != 0) {
                    repeatSubscriber.f48045d = 0L;
                    repeatSubscriber.f48043b.m17865d(j);
                }
                repeatSubscriber.f48044c.mo15432g(repeatSubscriber);
                iAddAndGet = repeatSubscriber.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
