package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
