package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.io.Serializable;
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
            m18065g(0);
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
            SubscriptionHelper.m18221a(null);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18223c(null, null, subscription);
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
            SubscriptionHelper.m18222b(null, null, j);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: n */
        public long f49947n;

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            throw null;
        }

        /* JADX INFO: renamed from: g */
        public final void m18065g(Serializable serializable) {
            m18220e(EmptySubscription.f51204a);
            long j = this.f49947n;
            if (j != 0) {
                this.f49947n = 0L;
                m18219d(j);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49947n++;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        ObjectHelper.m17964a(8, "capacityHint");
        new UnicastProcessor(null, 8).m18276c();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptySubscription.m18217b(th, subscriber);
        }
    }
}
