package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
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
        public final FlowableSubscriber f49804a;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f49806c = new AtomicReference();

        /* JADX INFO: renamed from: b */
        public long f49805b = 0;

        public IntervalRangeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49804a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.m17952a(this.f49806c);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference atomicReference = this.f49806c;
            Object obj = atomicReference.get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (obj != disposableHelper) {
                long j = get();
                FlowableSubscriber flowableSubscriber = this.f49804a;
                if (j == 0) {
                    flowableSubscriber.onError(new MissingBackpressureException(AbstractC0000a.m12i(this.f49805b, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                    DisposableHelper.m17952a(atomicReference);
                    return;
                }
                long j2 = this.f49805b;
                flowableSubscriber.onNext(Long.valueOf(j2));
                if (j2 == 0) {
                    if (atomicReference.get() != disposableHelper) {
                        flowableSubscriber.onComplete();
                    }
                    DisposableHelper.m17952a(atomicReference);
                } else {
                    this.f49805b = j2 + 1;
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new IntervalRangeSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
