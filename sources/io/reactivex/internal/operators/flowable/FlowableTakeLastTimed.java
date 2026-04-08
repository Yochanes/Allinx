package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
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
        public final FlowableSubscriber f48165a;

        /* JADX INFO: renamed from: c */
        public Subscription f48167c;

        /* JADX INFO: renamed from: f */
        public volatile boolean f48169f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48170g;

        /* JADX INFO: renamed from: i */
        public Throwable f48171i;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f48168d = new AtomicLong();

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f48166b = new SpscLinkedArrayQueue(0);

        public TakeLastTimedSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48165a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m17747a(boolean z2, Subscriber subscriber) {
            if (this.f48169f) {
                this.f48166b.clear();
                return true;
            }
            Throwable th = this.f48171i;
            if (th != null) {
                this.f48166b.clear();
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
        public final void m17748b() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f48165a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48166b;
            int iAddAndGet = 1;
            do {
                if (this.f48170g) {
                    if (m17747a(spscLinkedArrayQueue.isEmpty(), flowableSubscriber)) {
                        return;
                    }
                    long j = this.f48168d.get();
                    long j2 = 0;
                    while (true) {
                        if (m17747a(spscLinkedArrayQueue.m17846b() == null, flowableSubscriber)) {
                            return;
                        }
                        if (j != j2) {
                            spscLinkedArrayQueue.poll();
                            flowableSubscriber.onNext(spscLinkedArrayQueue.poll());
                            j2++;
                        } else if (j2 != 0) {
                            BackpressureHelper.m17882e(this.f48168d, j2);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f48169f) {
                return;
            }
            this.f48169f = true;
            this.f48167c.cancel();
            if (getAndIncrement() == 0) {
                this.f48166b.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48167c, subscription)) {
                this.f48167c = subscription;
                this.f48165a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48171i = th;
            this.f48170g = true;
            m17748b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f48168d, j);
                m17748b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new TakeLastTimedSubscriber((FlowableSubscriber) subscriber));
    }
}
