package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicFuseableConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {

    /* JADX INFO: renamed from: a */
    public final ConditionalSubscriber f49219a;

    /* JADX INFO: renamed from: b */
    public Subscription f49220b;

    /* JADX INFO: renamed from: c */
    public QueueSubscription f49221c;

    /* JADX INFO: renamed from: d */
    public boolean f49222d;

    /* JADX INFO: renamed from: f */
    public int f49223f;

    public BasicFuseableConditionalSubscriber(ConditionalSubscriber conditionalSubscriber) {
        this.f49219a = conditionalSubscriber;
    }

    /* JADX INFO: renamed from: a */
    public final void m17852a(Throwable th) {
        Exceptions.m17612a(th);
        this.f49220b.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f49220b.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.f49221c.clear();
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* JADX INFO: renamed from: e */
    public int mo17626e(int i) {
        QueueSubscription queueSubscription = this.f49221c;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iMo17626e = queueSubscription.mo17626e(i);
        if (iMo17626e == 0) {
            return iMo17626e;
        }
        this.f49223f = iMo17626e;
        return iMo17626e;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f49221c.isEmpty();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17874i(this.f49220b, subscription)) {
            this.f49220b = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f49221c = (QueueSubscription) subscription;
            }
            this.f49219a.mo12367j(this);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f49222d) {
            return;
        }
        this.f49222d = true;
        this.f49219a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f49222d) {
            RxJavaPlugins.m17911b(th);
        } else {
            this.f49222d = true;
            this.f49219a.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        this.f49220b.request(j);
    }
}
