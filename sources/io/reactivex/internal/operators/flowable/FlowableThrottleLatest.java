package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public Subscription f48187a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f48188b;

        /* JADX INFO: renamed from: c */
        public Throwable f48189c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48190d;

        /* JADX INFO: renamed from: a */
        public final void m17749a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f48190d || !this.f48188b || this.f48189c != null) {
                throw null;
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48190d = true;
            this.f48187a.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48187a, subscription)) {
                this.f48187a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48188b = true;
            m17749a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48189c = th;
            this.f48188b = true;
            m17749a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(null, j);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            m17749a();
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        throw null;
    }
}
