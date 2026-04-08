package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTakeLast<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48158a;

        /* JADX INFO: renamed from: b */
        public Subscription f48159b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f48160c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48161d;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f48162f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final AtomicInteger f48163g = new AtomicInteger();

        public TakeLastSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48158a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m17746a() {
            if (this.f48163g.getAndIncrement() == 0) {
                FlowableSubscriber flowableSubscriber = this.f48158a;
                long jAddAndGet = this.f48162f.get();
                while (!this.f48161d) {
                    if (this.f48160c) {
                        long j = 0;
                        while (j != jAddAndGet) {
                            if (this.f48161d) {
                                return;
                            }
                            T tPoll = poll();
                            if (tPoll == null) {
                                flowableSubscriber.onComplete();
                                return;
                            } else {
                                flowableSubscriber.onNext(tPoll);
                                j++;
                            }
                        }
                        if (j != 0 && jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f48162f.addAndGet(-j);
                        }
                    }
                    if (this.f48163g.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48161d = true;
            this.f48159b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48159b, subscription)) {
                this.f48159b = subscription;
                this.f48158a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48160c = true;
            m17746a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48158a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (size() == 0) {
                poll();
            }
            offer(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f48162f, j);
                m17746a();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new TakeLastSubscriber((FlowableSubscriber) subscriber));
    }
}
