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
public final class FlowableIntervalRange extends Flowable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class IntervalRangeSubscriber extends AtomicLong implements Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47892a;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f47894c = new AtomicReference();

        /* JADX INFO: renamed from: b */
        public long f47893b = 0;

        public IntervalRangeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47892a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.m17615a(this.f47894c);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference atomicReference = this.f47894c;
            Object obj = atomicReference.get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (obj != disposableHelper) {
                long j = get();
                FlowableSubscriber flowableSubscriber = this.f47892a;
                if (j == 0) {
                    flowableSubscriber.onError(new MissingBackpressureException(AbstractC0000a.m12i(this.f47893b, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                    DisposableHelper.m17615a(atomicReference);
                    return;
                }
                long j2 = this.f47893b;
                flowableSubscriber.onNext(Long.valueOf(j2));
                if (j2 == 0) {
                    if (atomicReference.get() != disposableHelper) {
                        flowableSubscriber.onComplete();
                    }
                    DisposableHelper.m17615a(atomicReference);
                } else {
                    this.f47893b = j2 + 1;
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new IntervalRangeSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
