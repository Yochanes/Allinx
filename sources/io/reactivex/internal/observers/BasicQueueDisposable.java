package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.QueueDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicQueueDisposable<T> implements QueueDisposable<T> {
    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
