package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableZip<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: a */
        public volatile boolean f48272a;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f48272a) {
                return;
            }
            this.f48272a = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(null, j);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public SimpleQueue f48273a;

        /* JADX INFO: renamed from: b */
        public long f48274b;

        /* JADX INFO: renamed from: c */
        public int f48275c;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m17867a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17872f(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17626e = queueSubscription.mo17626e(7);
                    if (iMo17626e == 1) {
                        this.f48275c = iMo17626e;
                        this.f48273a = queueSubscription;
                        throw null;
                    }
                    if (iMo17626e == 2) {
                        this.f48275c = iMo17626e;
                        this.f48273a = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.f48273a = new SpscArrayQueue(0);
                subscription.request(0);
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
            if (this.f48275c != 2) {
                this.f48273a.offer(obj);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (this.f48275c != 1) {
                long j2 = this.f48274b + j;
                if (j2 < 0) {
                    this.f48274b = j2;
                } else {
                    this.f48274b = 0L;
                    get().request(j2);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        Object obj = null;
        obj.getClass();
        throw null;
    }
}
