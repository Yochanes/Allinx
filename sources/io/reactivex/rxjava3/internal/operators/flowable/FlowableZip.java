package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
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
        public volatile boolean f50169a;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f50169a) {
                return;
            }
            this.f50169a = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(null, j);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public SimpleQueue f50170a;

        /* JADX INFO: renamed from: b */
        public long f50171b;

        /* JADX INFO: renamed from: c */
        public int f50172c;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m18221a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18225e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(7);
                    if (iMo17962e == 1) {
                        this.f50172c = iMo17962e;
                        this.f50170a = queueSubscription;
                        throw null;
                    }
                    if (iMo17962e == 2) {
                        this.f50172c = iMo17962e;
                        this.f50170a = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.f50170a = new SpscArrayQueue(0);
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
            if (this.f50172c != 2) {
                this.f50170a.offer(obj);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (this.f50172c != 1) {
                long j2 = this.f50171b + j;
                if (j2 < 0) {
                    this.f50171b = j2;
                } else {
                    this.f50171b = 0L;
                    get().request(j2);
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
