package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.ObservableQueueDrain;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class QueueDrainObserver<T, U, V> extends QueueDrainSubscriberPad2 implements Observer<T>, ObservableQueueDrain<U, V> {

    /* JADX INFO: renamed from: b */
    public final SerializedObserver f49492b;

    /* JADX INFO: renamed from: c */
    public final MpscLinkedQueue f49493c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f49494d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f49495f;

    public QueueDrainObserver(SerializedObserver serializedObserver, MpscLinkedQueue mpscLinkedQueue) {
        this.f49492b = serializedObserver;
        this.f49493c = mpscLinkedQueue;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17980b() {
        return this.f49496a.getAndIncrement() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m17981e(Object obj, Disposable disposable) {
        AtomicInteger atomicInteger = this.f49496a;
        int i = atomicInteger.get();
        SerializedObserver serializedObserver = this.f49492b;
        MpscLinkedQueue mpscLinkedQueue = this.f49493c;
        if (i != 0 || !atomicInteger.compareAndSet(0, 1)) {
            mpscLinkedQueue.offer(obj);
            if (!m17980b()) {
                return;
            }
        } else if (mpscLinkedQueue.isEmpty()) {
            mo17979a(serializedObserver, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            mpscLinkedQueue.offer(obj);
        }
        QueueDrainHelper.m18270b(mpscLinkedQueue, serializedObserver, disposable, this);
    }

    /* JADX INFO: renamed from: f */
    public final int m17982f(int i) {
        return this.f49496a.addAndGet(i);
    }

    @Override // io.reactivex.rxjava3.internal.util.ObservableQueueDrain
    /* JADX INFO: renamed from: a */
    public void mo17979a(SerializedObserver serializedObserver, Object obj) {
    }
}
