package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public final FlowableSubscriber f49245a;

    /* JADX INFO: renamed from: b */
    public Subscription f49246b;

    /* JADX INFO: renamed from: c */
    public Object f49247c;

    /* JADX INFO: renamed from: d */
    public long f49248d;

    public SinglePostCompleteSubscriber(FlowableSubscriber flowableSubscriber) {
        this.f49245a = flowableSubscriber;
    }

    /* JADX INFO: renamed from: a */
    public final void m17860a(Object obj) {
        long j = this.f49248d;
        if (j != 0) {
            BackpressureHelper.m17882e(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                mo17696b(obj);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                FlowableSubscriber flowableSubscriber = this.f49245a;
                flowableSubscriber.onNext(obj);
                flowableSubscriber.onComplete();
                return;
            }
            this.f49247c = obj;
            if (compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            } else {
                this.f49247c = null;
            }
        }
    }

    public void cancel() {
        this.f49246b.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17874i(this.f49246b, subscription)) {
            this.f49246b = subscription;
            this.f49245a.mo12367j(this);
        }
    }

    public void onSuccess(Object obj) {
        m17860a(obj);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.m17873h(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        Object obj = this.f49247c;
                        FlowableSubscriber flowableSubscriber = this.f49245a;
                        flowableSubscriber.onNext(obj);
                        flowableSubscriber.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, BackpressureHelper.m17880c(j2, j)));
            this.f49246b.request(j);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo17696b(Object obj) {
    }
}
