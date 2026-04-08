package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.operators.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f51071a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f51072b;

    /* JADX INFO: compiled from: Proguard */
    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {

        /* JADX INFO: renamed from: a */
        public Object f51073a;
    }

    public MpscLinkedQueue() {
        AtomicReference atomicReference = new AtomicReference();
        this.f51071a = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.f51072b = atomicReference2;
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        atomicReference2.lazySet(linkedQueueNode);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return ((LinkedQueueNode) this.f51072b.get()) == ((LinkedQueueNode) this.f51071a.get());
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        linkedQueueNode.f51073a = obj;
        ((LinkedQueueNode) this.f51071a.getAndSet(linkedQueueNode)).lazySet(linkedQueueNode);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        LinkedQueueNode linkedQueueNode;
        AtomicReference atomicReference = this.f51072b;
        LinkedQueueNode linkedQueueNode2 = (LinkedQueueNode) atomicReference.get();
        LinkedQueueNode linkedQueueNode3 = linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            Object obj = linkedQueueNode3.f51073a;
            linkedQueueNode3.f51073a = null;
            atomicReference.lazySet(linkedQueueNode3);
            return obj;
        }
        if (linkedQueueNode2 == ((LinkedQueueNode) this.f51071a.get())) {
            return null;
        }
        do {
            linkedQueueNode = linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        Object obj2 = linkedQueueNode.f51073a;
        linkedQueueNode.f51073a = null;
        atomicReference.lazySet(linkedQueueNode);
        return obj2;
    }
}
