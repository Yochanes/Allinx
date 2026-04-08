package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {

    /* JADX INFO: renamed from: a */
    public final FlowableSubscriber f49224a;

    /* JADX INFO: renamed from: b */
    public Subscription f49225b;

    /* JADX INFO: renamed from: c */
    public QueueSubscription f49226c;

    /* JADX INFO: renamed from: d */
    public boolean f49227d;

    /* JADX INFO: renamed from: f */
    public int f49228f;

    public BasicFuseableSubscriber(FlowableSubscriber flowableSubscriber) {
        this.f49224a = flowableSubscriber;
    }

    /* JADX INFO: renamed from: a */
    public final void m17853a(Throwable th) {
        Exceptions.m17612a(th);
        this.f49225b.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f49225b.cancel();
    }

    public void clear() {
        this.f49226c.clear();
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* JADX INFO: renamed from: e */
    public int mo17626e(int i) {
        QueueSubscription queueSubscription = this.f49226c;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iMo17626e = queueSubscription.mo17626e(i);
        if (iMo17626e == 0) {
            return iMo17626e;
        }
        this.f49228f = iMo17626e;
        return iMo17626e;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f49226c.isEmpty();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17874i(this.f49225b, subscription)) {
            this.f49225b = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f49226c = (QueueSubscription) subscription;
            }
            this.f49224a.mo12367j(this);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f49227d) {
            return;
        }
        this.f49227d = true;
        this.f49224a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f49227d) {
            RxJavaPlugins.m17911b(th);
        } else {
            this.f49227d = true;
            this.f49224a.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        this.f49225b.request(j);
    }
}
