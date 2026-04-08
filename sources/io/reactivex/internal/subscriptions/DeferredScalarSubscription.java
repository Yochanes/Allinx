package io.reactivex.internal.subscriptions;

import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {

    /* JADX INFO: renamed from: a */
    public final Subscriber f49255a;

    /* JADX INFO: renamed from: b */
    public Object f49256b;

    public DeferredScalarSubscription(Subscriber subscriber) {
        this.f49255a = subscriber;
    }

    public void cancel() {
        set(4);
        this.f49256b = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.f49256b = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m17861d(Object obj) {
        int i = get();
        do {
            Subscriber subscriber = this.f49255a;
            if (i == 8) {
                this.f49256b = obj;
                lazySet(16);
                subscriber.onNext(obj);
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
            this.f49256b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.f49256b = null;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17626e(int i) {
        lazySet(8);
        return 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        m17861d(obj);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f49256b;
        this.f49256b = null;
        return obj;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        Object obj;
        if (SubscriptionHelper.m17873h(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f49256b) == null) {
                        return;
                    }
                    this.f49256b = null;
                    Subscriber subscriber = this.f49255a;
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
