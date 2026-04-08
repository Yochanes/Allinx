package io.reactivex.rxjava3.internal.fuseable;

import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.QueueSubscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractEmptyQueueFuseable<T> implements QueueSubscription<T>, QueueDisposable<T> {
    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public boolean mo12353d() {
        return false;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17962e(int i) {
        return 2;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
