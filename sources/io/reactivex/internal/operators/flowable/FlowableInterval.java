package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableInterval extends Flowable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class IntervalSubscriber extends AtomicLong implements Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47889a;

        /* JADX INFO: renamed from: b */
        public long f47890b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f47891c = new AtomicReference();

        public IntervalSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47889a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.m17615a(this.f47891c);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference atomicReference = this.f47891c;
            if (atomicReference.get() != DisposableHelper.f47552a) {
                long j = get();
                FlowableSubscriber flowableSubscriber = this.f47889a;
                if (j == 0) {
                    flowableSubscriber.onError(new MissingBackpressureException(AbstractC0000a.m12i(this.f47890b, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                    DisposableHelper.m17615a(atomicReference);
                } else {
                    long j2 = this.f47890b;
                    this.f47890b = j2 + 1;
                    flowableSubscriber.onNext(Long.valueOf(j2));
                    BackpressureHelper.m17882e(this, 1L);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new IntervalSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
