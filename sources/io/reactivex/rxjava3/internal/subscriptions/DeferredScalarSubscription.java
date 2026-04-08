package io.reactivex.rxjava3.internal.subscriptions;

import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {

    /* JADX INFO: renamed from: a */
    public final Subscriber f51202a;

    /* JADX INFO: renamed from: b */
    public Object f51203b;

    public DeferredScalarSubscription(Subscriber subscriber) {
        this.f51202a = subscriber;
    }

    public void cancel() {
        set(4);
        this.f51203b = null;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.f51203b = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m18214d(Object obj) {
        int i = get();
        do {
            Subscriber subscriber = this.f51202a;
            if (i == 8) {
                this.f51203b = obj;
                lazySet(16);
                subscriber.onNext(null);
                if (get() != 4) {
                    subscriber.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                subscriber.onNext(obj);
                if (get() != 4) {
                    subscriber.onComplete();
                    return;
                }
                return;
            }
            this.f51203b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.f51203b = null;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17962e(int i) {
        lazySet(8);
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18215h() {
        return get() == 4;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        m18214d(obj);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f51203b;
        this.f51203b = null;
        return obj;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        Object obj;
        if (SubscriptionHelper.m18226f(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f51203b) == null) {
                        return;
                    }
                    this.f51203b = null;
                    Subscriber subscriber = this.f51202a;
                    subscriber.onNext(obj);
                    if (get() != 4) {
                        subscriber.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
