package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.ObservableQueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class QueueDrainObserver<T, U, V> extends QueueDrainSubscriberPad2 implements Observer<T>, ObservableQueueDrain<U, V> {

    /* JADX INFO: renamed from: b */
    public final SerializedObserver f47584b;

    /* JADX INFO: renamed from: c */
    public final MpscLinkedQueue f47585c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f47586d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f47587f;

    /* JADX INFO: renamed from: g */
    public Throwable f47588g;

    public QueueDrainObserver(SerializedObserver serializedObserver, MpscLinkedQueue mpscLinkedQueue) {
        this.f47584b = serializedObserver;
        this.f47585c = mpscLinkedQueue;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17639b() {
        return this.f47589a.getAndIncrement() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17640e() {
        AtomicInteger atomicInteger = this.f47589a;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m17641f(Object obj, Disposable disposable) {
        AtomicInteger atomicInteger = this.f47589a;
        int i = atomicInteger.get();
        SerializedObserver serializedObserver = this.f47584b;
        MpscLinkedQueue mpscLinkedQueue = this.f47585c;
        if (i != 0 || !atomicInteger.compareAndSet(0, 1)) {
            mpscLinkedQueue.offer(obj);
            if (!m17639b()) {
                return;
            }
        } else if (mpscLinkedQueue.isEmpty()) {
            mo17638a(serializedObserver, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            mpscLinkedQueue.offer(obj);
        }
        QueueDrainHelper.m17908b(mpscLinkedQueue, serializedObserver, disposable, this);
    }

    /* JADX INFO: renamed from: g */
    public final int m17642g(int i) {
        return this.f47589a.addAndGet(i);
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    /* JADX INFO: renamed from: a */
    public void mo17638a(SerializedObserver serializedObserver, Object obj) {
    }
}
