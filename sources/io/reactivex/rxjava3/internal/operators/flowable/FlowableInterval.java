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
public final class FlowableInterval extends Flowable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class IntervalSubscriber extends AtomicLong implements Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49801a;

        /* JADX INFO: renamed from: b */
        public long f49802b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f49803c = new AtomicReference();

        public IntervalSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49801a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.m17952a(this.f49803c);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference atomicReference = this.f49803c;
            if (atomicReference.get() != DisposableHelper.f49380a) {
                long j = get();
                FlowableSubscriber flowableSubscriber = this.f49801a;
                if (j == 0) {
                    flowableSubscriber.onError(new MissingBackpressureException(AbstractC0000a.m12i(this.f49802b, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                    DisposableHelper.m17952a(atomicReference);
                } else {
                    long j2 = this.f49802b;
                    this.f49802b = j2 + 1;
                    flowableSubscriber.onNext(Long.valueOf(j2));
                    BackpressureHelper.m18241e(this, 1L);
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new IntervalSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
