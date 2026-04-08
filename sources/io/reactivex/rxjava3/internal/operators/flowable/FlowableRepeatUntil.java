package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
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
        public final FlowableSubscriber f49943a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f49944b;

        /* JADX INFO: renamed from: c */
        public final Publisher f49945c;

        /* JADX INFO: renamed from: d */
        public long f49946d;

        public RepeatSubscriber(FlowableSubscriber flowableSubscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.f49943a = flowableSubscriber;
            this.f49944b = subscriptionArbiter;
            this.f49945c = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f49944b.m18220e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49943a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49943a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49946d++;
            this.f49943a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.mo12367j(subscriptionArbiter);
        RepeatSubscriber repeatSubscriber = new RepeatSubscriber((FlowableSubscriber) subscriber, subscriptionArbiter, null);
        if (repeatSubscriber.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!repeatSubscriber.f49944b.f51212i) {
                long j = repeatSubscriber.f49946d;
                if (j != 0) {
                    repeatSubscriber.f49946d = 0L;
                    repeatSubscriber.f49944b.m18219d(j);
                }
                repeatSubscriber.f49945c.mo15432g(repeatSubscriber);
                iAddAndGet = repeatSubscriber.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
