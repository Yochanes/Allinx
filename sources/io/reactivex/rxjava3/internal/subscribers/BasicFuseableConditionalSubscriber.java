package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicFuseableConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {

    /* JADX INFO: renamed from: a */
    public final ConditionalSubscriber f51167a;

    /* JADX INFO: renamed from: b */
    public Subscription f51168b;

    /* JADX INFO: renamed from: c */
    public QueueSubscription f51169c;

    /* JADX INFO: renamed from: d */
    public boolean f51170d;

    /* JADX INFO: renamed from: f */
    public int f51171f;

    public BasicFuseableConditionalSubscriber(ConditionalSubscriber conditionalSubscriber) {
        this.f51167a = conditionalSubscriber;
    }

    /* JADX INFO: renamed from: a */
    public final void m18206a(Throwable th) {
        Exceptions.m17950a(th);
        this.f51168b.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f51168b.cancel();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        this.f51169c.clear();
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: e */
    public int mo17962e(int i) {
        QueueSubscription queueSubscription = this.f51169c;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iMo17962e = queueSubscription.mo17962e(i);
        if (iMo17962e == 0) {
            return iMo17962e;
        }
        this.f51171f = iMo17962e;
        return iMo17962e;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.f51169c.isEmpty();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18227h(this.f51168b, subscription)) {
            this.f51168b = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f51169c = (QueueSubscription) subscription;
            }
            this.f51167a.mo12367j(this);
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f51170d) {
            return;
        }
        this.f51170d = true;
        this.f51167a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f51170d) {
            RxJavaPlugins.m18275b(th);
        } else {
            this.f51170d = true;
            this.f51167a.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(Object obj) {
        mo17969f(obj);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        this.f51168b.request(j);
    }
}
