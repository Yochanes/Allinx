package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public Subscription f49019a;

        /* JADX INFO: renamed from: b */
        public SimpleQueue f49020b;

        /* JADX INFO: renamed from: c */
        public int f49021c;

        /* JADX INFO: compiled from: Proguard */
        public final class RailSubscription implements Subscription {
            @Override // org.reactivestreams.Subscription
            public final void cancel() {
                throw null;
            }

            @Override // org.reactivestreams.Subscription
            public final void request(long j) {
                if (SubscriptionHelper.m17873h(j)) {
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m17842a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f49021c != 1) {
                throw null;
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f49019a, subscription)) {
                this.f49019a = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17626e = queueSubscription.mo17626e(7);
                    if (iMo17626e == 1) {
                        this.f49021c = iMo17626e;
                        this.f49020b = queueSubscription;
                        throw null;
                    }
                    if (iMo17626e == 2) {
                        this.f49021c = iMo17626e;
                        this.f49020b = queueSubscription;
                        throw null;
                    }
                }
                this.f49020b = new SpscArrayQueue(0);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            m17842a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            m17842a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49021c != 0 || this.f49020b.offer(obj)) {
                m17842a();
            } else {
                this.f49019a.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }
    }
}
