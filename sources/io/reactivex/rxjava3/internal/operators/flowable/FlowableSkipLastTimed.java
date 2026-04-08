package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50022a;

        /* JADX INFO: renamed from: c */
        public Subscription f50024c;

        /* JADX INFO: renamed from: f */
        public volatile boolean f50026f;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f50025d = new AtomicLong();

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f50023b = new SpscLinkedArrayQueue(0);

        public SkipLastTimedSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50022a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18087a() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                AtomicLong atomicLong = this.f50025d;
                if (0 != atomicLong.get()) {
                    throw null;
                }
                if (0 != 0) {
                    BackpressureHelper.m18241e(atomicLong, 0L);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f50026f) {
                return;
            }
            this.f50026f = true;
            this.f50024c.cancel();
            if (getAndIncrement() == 0) {
                this.f50023b.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50024c, subscription)) {
                this.f50024c = subscription;
                this.f50022a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            m18087a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            m18087a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f50025d, j);
                m18087a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new SkipLastTimedSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
