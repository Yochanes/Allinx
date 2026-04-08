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
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48121a;

        /* JADX INFO: renamed from: c */
        public Subscription f48123c;

        /* JADX INFO: renamed from: f */
        public volatile boolean f48125f;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f48124d = new AtomicLong();

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f48122b = new SpscLinkedArrayQueue(0);

        public SkipLastTimedSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48121a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m17743a() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                AtomicLong atomicLong = this.f48124d;
                if (0 != atomicLong.get()) {
                    throw null;
                }
                if (0 != 0) {
                    BackpressureHelper.m17882e(atomicLong, 0L);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f48125f) {
                return;
            }
            this.f48125f = true;
            this.f48123c.cancel();
            if (getAndIncrement() == 0) {
                this.f48122b.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48123c, subscription)) {
                this.f48123c = subscription;
                this.f48121a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            m17743a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            m17743a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f48124d, j);
                m17743a();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new SkipLastTimedSubscriber((FlowableSubscriber) subscriber));
    }
}
