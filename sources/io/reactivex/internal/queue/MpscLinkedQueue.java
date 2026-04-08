package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f49106a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f49107b;

    /* JADX INFO: compiled from: Proguard */
    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {

        /* JADX INFO: renamed from: a */
        public Object f49108a;
    }

    public MpscLinkedQueue() {
        AtomicReference atomicReference = new AtomicReference();
        this.f49106a = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.f49107b = atomicReference2;
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        atomicReference2.lazySet(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return ((LinkedQueueNode) this.f49107b.get()) == ((LinkedQueueNode) this.f49106a.get());
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        linkedQueueNode.f49108a = obj;
        ((LinkedQueueNode) this.f49106a.getAndSet(linkedQueueNode)).lazySet(linkedQueueNode);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        LinkedQueueNode linkedQueueNode;
        AtomicReference atomicReference = this.f49107b;
        LinkedQueueNode linkedQueueNode2 = (LinkedQueueNode) atomicReference.get();
        LinkedQueueNode linkedQueueNode3 = linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            Object obj = linkedQueueNode3.f49108a;
            linkedQueueNode3.f49108a = null;
            atomicReference.lazySet(linkedQueueNode3);
            return obj;
        }
        if (linkedQueueNode2 == ((LinkedQueueNode) this.f49106a.get())) {
            return null;
        }
        do {
            linkedQueueNode = linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        Object obj2 = linkedQueueNode.f49108a;
        linkedQueueNode.f49108a = null;
        atomicReference.lazySet(linkedQueueNode);
        return obj2;
    }
}
