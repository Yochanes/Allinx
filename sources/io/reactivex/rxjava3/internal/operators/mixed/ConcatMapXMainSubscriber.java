package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ConcatMapXMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicThrowable f50291a = new AtomicThrowable();

    /* JADX INFO: renamed from: b */
    public SimpleQueue f50292b;

    /* JADX INFO: renamed from: c */
    public Subscription f50293c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f50294d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f50295f;

    /* JADX INFO: renamed from: g */
    public boolean f50296g;

    /* JADX INFO: renamed from: b */
    public abstract void mo18116b();

    /* JADX INFO: renamed from: c */
    public abstract void mo18117c();

    public void cancel() {
        m18119g();
    }

    public void dispose() {
        m18119g();
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo18118e();

    /* JADX INFO: renamed from: g */
    public final void m18119g() {
        this.f50295f = true;
        this.f50293c.cancel();
        mo18116b();
        this.f50291a.m18232b();
        if (getAndIncrement() == 0) {
            this.f50292b.clear();
            mo18115a();
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18227h(this.f50293c, subscription)) {
            this.f50293c = subscription;
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iMo17962e = queueSubscription.mo17962e(7);
                if (iMo17962e == 1) {
                    this.f50292b = queueSubscription;
                    this.f50296g = true;
                    this.f50294d = true;
                    mo18118e();
                    mo18117c();
                    return;
                }
                if (iMo17962e == 2) {
                    this.f50292b = queueSubscription;
                    mo18118e();
                    this.f50293c.request(0);
                    return;
                }
            }
            this.f50292b = new SpscArrayQueue(0);
            mo18118e();
            this.f50293c.request(0);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f50294d = true;
        mo18117c();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.f50291a.m18231a(th)) {
            this.f50294d = true;
            mo18117c();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (obj == null || this.f50292b.offer(obj)) {
            mo18117c();
        } else {
            this.f50293c.cancel();
            onError(new MissingBackpressureException("queue full?!"));
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo18115a() {
    }
}
