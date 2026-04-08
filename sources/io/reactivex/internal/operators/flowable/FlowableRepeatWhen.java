package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j = this.f48046j;
            if (j != 0) {
                this.f48046j = 0L;
                m17865d(j);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, Subscription {
        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m17867a(null);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17869c(null, null, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m17868b(null, null, j);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: j */
        public long f48046j;

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f48046j++;
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new UnicastProcessor(null, 8).m17914e();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptySubscription.m17863b(th, subscriber);
        }
    }
}
