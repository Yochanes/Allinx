package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
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
        public final FlowableSubscriber f48037a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f48038b;

        /* JADX INFO: renamed from: c */
        public final Publisher f48039c;

        /* JADX INFO: renamed from: d */
        public long f48040d = -1;

        /* JADX INFO: renamed from: f */
        public long f48041f;

        public RepeatSubscriber(FlowableSubscriber flowableSubscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.f48037a = flowableSubscriber;
            this.f48038b = subscriptionArbiter;
            this.f48039c = publisher;
        }

        /* JADX INFO: renamed from: a */
        public final void m17720a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f48038b.f49264g) {
                    long j = this.f48041f;
                    if (j != 0) {
                        this.f48041f = 0L;
                        this.f48038b.m17865d(j);
                    }
                    this.f48039c.mo15432g(this);
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
            this.f48038b.m17866e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j = this.f48040d;
            if (j != Long.MAX_VALUE) {
                this.f48040d = j - 1;
            }
            if (j != 0) {
                m17720a();
            } else {
                this.f48037a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48037a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f48041f++;
            this.f48037a.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter();
        subscriber.mo12367j(subscriptionArbiter);
        new RepeatSubscriber((FlowableSubscriber) subscriber, subscriptionArbiter, this.f47628b).m17720a();
    }
}
