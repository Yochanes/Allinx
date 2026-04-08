package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public Subscription f50087a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f50088b;

        /* JADX INFO: renamed from: c */
        public Throwable f50089c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50090d;

        /* JADX INFO: renamed from: a */
        public final void m18093a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f50090d || !this.f50088b || this.f50089c != null) {
                throw null;
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50090d = true;
            this.f50087a.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50087a, subscription)) {
                this.f50087a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50088b = true;
            m18093a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f50089c = th;
            this.f50088b = true;
            m18093a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(null, j);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            m18093a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
