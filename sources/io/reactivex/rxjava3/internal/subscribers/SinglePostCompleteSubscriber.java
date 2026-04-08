package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public final FlowableSubscriber f51192a;

    /* JADX INFO: renamed from: b */
    public Subscription f51193b;

    /* JADX INFO: renamed from: c */
    public Object f51194c;

    /* JADX INFO: renamed from: d */
    public long f51195d;

    public SinglePostCompleteSubscriber(FlowableSubscriber flowableSubscriber) {
        this.f51192a = flowableSubscriber;
    }

    /* JADX INFO: renamed from: a */
    public final void m18213a(Object obj) {
        long j = this.f51195d;
        if (j != 0) {
            BackpressureHelper.m18241e(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                mo18042b(obj);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                FlowableSubscriber flowableSubscriber = this.f51192a;
                flowableSubscriber.onNext(obj);
                flowableSubscriber.onComplete();
                return;
            }
            this.f51194c = obj;
            if (compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            } else {
                this.f51194c = null;
            }
        }
    }

    public void cancel() {
        this.f51193b.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18227h(this.f51193b, subscription)) {
            this.f51193b = subscription;
            this.f51192a.mo12367j(this);
        }
    }

    public void onSuccess(Object obj) {
        m18213a(obj);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.m18226f(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        Object obj = this.f51194c;
                        FlowableSubscriber flowableSubscriber = this.f51192a;
                        flowableSubscriber.onNext(obj);
                        flowableSubscriber.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, BackpressureHelper.m18239c(j2, j)));
            this.f51193b.request(j);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo18042b(Object obj) {
    }
}
