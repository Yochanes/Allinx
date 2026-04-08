package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {

    /* JADX INFO: renamed from: a */
    public final FlowableSubscriber f51172a;

    /* JADX INFO: renamed from: b */
    public Subscription f51173b;

    /* JADX INFO: renamed from: c */
    public QueueSubscription f51174c;

    /* JADX INFO: renamed from: d */
    public boolean f51175d;

    /* JADX INFO: renamed from: f */
    public int f51176f;

    public BasicFuseableSubscriber(FlowableSubscriber flowableSubscriber) {
        this.f51172a = flowableSubscriber;
    }

    /* JADX INFO: renamed from: a */
    public final void m18207a(Throwable th) {
        Exceptions.m17950a(th);
        this.f51173b.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f51173b.cancel();
    }

    public void clear() {
        this.f51174c.clear();
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: e */
    public int mo17962e(int i) {
        QueueSubscription queueSubscription = this.f51174c;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iMo17962e = queueSubscription.mo17962e(i);
        if (iMo17962e == 0) {
            return iMo17962e;
        }
        this.f51176f = iMo17962e;
        return iMo17962e;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.f51174c.isEmpty();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18227h(this.f51173b, subscription)) {
            this.f51173b = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f51174c = (QueueSubscription) subscription;
            }
            this.f51172a.mo12367j(this);
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f51175d) {
            return;
        }
        this.f51175d = true;
        this.f51172a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f51175d) {
            RxJavaPlugins.m18275b(th);
        } else {
            this.f51175d = true;
            this.f51172a.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        this.f51173b.request(j);
    }
}
