package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50055a;

        /* JADX INFO: renamed from: b */
        public long f50056b = 0;

        /* JADX INFO: renamed from: c */
        public Subscription f50057c;

        public TakeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50055a = flowableSubscriber;
            lazySet(0L);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50057c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50057c, subscription)) {
                long j = this.f50056b;
                FlowableSubscriber flowableSubscriber = this.f50055a;
                if (j == 0) {
                    subscription.cancel();
                    EmptySubscription.m18216a(flowableSubscriber);
                } else {
                    this.f50057c = subscription;
                    flowableSubscriber.mo12367j(this);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50056b > 0) {
                this.f50056b = 0L;
                this.f50055a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50056b <= 0) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50056b = 0L;
                this.f50055a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.f50056b;
            if (j > 0) {
                long j2 = j - 1;
                this.f50056b = j2;
                FlowableSubscriber flowableSubscriber = this.f50055a;
                flowableSubscriber.onNext(obj);
                if (j2 == 0) {
                    this.f50057c.cancel();
                    flowableSubscriber.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            long jMin;
            if (SubscriptionHelper.m18226f(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        jMin = Math.min(j2, j);
                    }
                } while (!compareAndSet(j2, j2 - jMin));
                this.f50057c.request(jMin);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new TakeSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
