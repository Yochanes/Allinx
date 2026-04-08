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
public final class FlowableTakeLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50065a;

        /* JADX INFO: renamed from: c */
        public Subscription f50067c;

        /* JADX INFO: renamed from: f */
        public volatile boolean f50069f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f50070g;

        /* JADX INFO: renamed from: i */
        public Throwable f50071i;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f50068d = new AtomicLong();

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f50066b = new SpscLinkedArrayQueue(0);

        public TakeLastTimedSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50065a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m18091a(boolean z2, Subscriber subscriber) {
            if (this.f50069f) {
                this.f50066b.clear();
                return true;
            }
            Throwable th = this.f50071i;
            if (th != null) {
                this.f50066b.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public final void m18092b() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f50065a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f50066b;
            int iAddAndGet = 1;
            do {
                if (this.f50070g) {
                    if (m18091a(spscLinkedArrayQueue.isEmpty(), flowableSubscriber)) {
                        return;
                    }
                    long j = this.f50068d.get();
                    long j2 = 0;
                    while (true) {
                        if (m18091a(spscLinkedArrayQueue.m18273b() == null, flowableSubscriber)) {
                            return;
                        }
                        if (j != j2) {
                            spscLinkedArrayQueue.poll();
                            flowableSubscriber.onNext(spscLinkedArrayQueue.poll());
                            j2++;
                        } else if (j2 != 0) {
                            BackpressureHelper.m18241e(this.f50068d, j2);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f50069f) {
                return;
            }
            this.f50069f = true;
            this.f50067c.cancel();
            if (getAndIncrement() == 0) {
                this.f50066b.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50067c, subscription)) {
                this.f50067c = subscription;
                this.f50065a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f50071i = th;
            this.f50070g = true;
            m18092b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f50068d, j);
                m18092b();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new TakeLastTimedSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
