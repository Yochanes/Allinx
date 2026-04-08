package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public Subscription f50977a;

        /* JADX INFO: renamed from: b */
        public SimpleQueue f50978b;

        /* JADX INFO: renamed from: c */
        public int f50979c;

        /* JADX INFO: compiled from: Proguard */
        public final class RailSubscription implements Subscription {
            @Override // org.reactivestreams.Subscription
            public final void cancel() {
                throw null;
            }

            @Override // org.reactivestreams.Subscription
            public final void request(long j) {
                if (SubscriptionHelper.m18226f(j)) {
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m18198a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f50979c != 1) {
                throw null;
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50977a, subscription)) {
                this.f50977a = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(7);
                    if (iMo17962e == 1) {
                        this.f50979c = iMo17962e;
                        this.f50978b = queueSubscription;
                        throw null;
                    }
                    if (iMo17962e == 2) {
                        this.f50979c = iMo17962e;
                        this.f50978b = queueSubscription;
                        throw null;
                    }
                }
                this.f50978b = new SpscArrayQueue(0);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            m18198a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            m18198a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50979c != 0 || this.f50978b.offer(obj)) {
                m18198a();
            } else {
                this.f50977a.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }
    }
}
