package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
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
        public final FlowableSubscriber f50058a;

        /* JADX INFO: renamed from: b */
        public Subscription f50059b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f50060c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50061d;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f50062f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final AtomicInteger f50063g = new AtomicInteger();

        public TakeLastSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50058a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18090a() {
            if (this.f50063g.getAndIncrement() == 0) {
                FlowableSubscriber flowableSubscriber = this.f50058a;
                long jM18241e = this.f50062f.get();
                while (!this.f50061d) {
                    if (this.f50060c) {
                        long j = 0;
                        while (j != jM18241e) {
                            if (this.f50061d) {
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
                        if (isEmpty()) {
                            flowableSubscriber.onComplete();
                            return;
                        } else if (j != 0) {
                            jM18241e = BackpressureHelper.m18241e(this.f50062f, j);
                        }
                    }
                    if (this.f50063g.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50061d = true;
            this.f50059b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50059b, subscription)) {
                this.f50059b = subscription;
                this.f50058a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50060c = true;
            m18090a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f50058a.onError(th);
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
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f50062f, j);
                m18090a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new TakeLastSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
