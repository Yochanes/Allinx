package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            throw null;
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
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {
        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo17750a(long j) {
            throw null;
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            throw null;
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17872f(null, subscription)) {
                m17866e(subscription);
            }
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
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, TimeoutSupport {
        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo17750a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.m17867a(null);
                throw null;
            }
        }

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
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                throw null;
            }
            RxJavaPlugins.m17911b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = get();
            if (j != Long.MAX_VALUE && compareAndSet(j, 1 + j)) {
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
    public interface TimeoutSupport {
        /* JADX INFO: renamed from: a */
        void mo17750a(long j);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutTask implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        throw null;
    }
}
