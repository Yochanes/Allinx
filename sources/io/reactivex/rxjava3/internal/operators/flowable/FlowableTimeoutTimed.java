package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
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
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo18094a(long j) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18225e(null, subscription)) {
                m18220e(subscription);
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
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo18094a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.m18221a(null);
                throw null;
            }
        }

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
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                throw null;
            }
            RxJavaPlugins.m18275b(th);
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
            SubscriptionHelper.m18222b(null, null, j);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TimeoutSupport {
        /* JADX INFO: renamed from: a */
        void mo18094a(long j);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutTask implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
