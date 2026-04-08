package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47910a;

        /* JADX INFO: renamed from: b */
        public long f47911b = 0;

        /* JADX INFO: renamed from: c */
        public Subscription f47912c;

        public LimitSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47910a = flowableSubscriber;
            lazySet(0L);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47912c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47912c, subscription)) {
                long j = this.f47911b;
                FlowableSubscriber flowableSubscriber = this.f47910a;
                if (j == 0) {
                    subscription.cancel();
                    EmptySubscription.m17862a(flowableSubscriber);
                } else {
                    this.f47912c = subscription;
                    flowableSubscriber.mo12367j(this);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47911b > 0) {
                this.f47911b = 0L;
                this.f47910a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47911b <= 0) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47911b = 0L;
                this.f47910a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.f47911b;
            if (j > 0) {
                long j2 = j - 1;
                this.f47911b = j2;
                FlowableSubscriber flowableSubscriber = this.f47910a;
                flowableSubscriber.onNext(obj);
                if (j2 == 0) {
                    this.f47912c.cancel();
                    flowableSubscriber.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.m17873h(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        j3 = j2 <= j ? j2 : j;
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.f47912c.request(j3);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new LimitSubscriber((FlowableSubscriber) subscriber));
    }
}
