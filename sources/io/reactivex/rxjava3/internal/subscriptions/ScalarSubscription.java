package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.operators.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17962e(int i) {
        return 1;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (SubscriptionHelper.m18226f(j) && compareAndSet(0, 1)) {
            throw null;
        }
    }
}
