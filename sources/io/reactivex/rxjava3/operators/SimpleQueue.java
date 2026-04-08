package io.reactivex.rxjava3.operators;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface SimpleQueue<T> {
    void clear();

    boolean isEmpty();

    boolean offer(Object obj);

    Object poll();
}
