package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.QueueDrain;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {

    /* JADX INFO: renamed from: c */
    public final SerializedSubscriber f51186c;

    /* JADX INFO: renamed from: d */
    public final MpscLinkedQueue f51187d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f51188f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f51189g;

    public QueueDrainSubscriber(SerializedSubscriber serializedSubscriber, MpscLinkedQueue mpscLinkedQueue) {
        this.f51186c = serializedSubscriber;
        this.f51187d = mpscLinkedQueue;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo17991a(Object obj, Subscriber subscriber) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18208b() {
        return this.f51191a.getAndIncrement() == 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m18209c(Object obj, Disposable disposable) {
        SerializedSubscriber serializedSubscriber = this.f51186c;
        MpscLinkedQueue mpscLinkedQueue = this.f51187d;
        AtomicInteger atomicInteger = this.f51191a;
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            long j = this.f51190b.get();
            if (j == 0) {
                this.f51188f = true;
                disposable.dispose();
                throw null;
            }
            if (mpscLinkedQueue.isEmpty()) {
                if (mo17991a(obj, serializedSubscriber) && j != Long.MAX_VALUE) {
                    m18211g();
                }
                if (this.f51191a.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                mpscLinkedQueue.offer(obj);
            }
        } else {
            mpscLinkedQueue.offer(obj);
            if (!m18208b()) {
                return;
            }
        }
        QueueDrainHelper.m18271c(mpscLinkedQueue, serializedSubscriber, disposable, this);
    }

    /* JADX INFO: renamed from: e */
    public final int m18210e(int i) {
        return this.f51191a.addAndGet(i);
    }

    /* JADX INFO: renamed from: g */
    public final long m18211g() {
        return this.f51190b.addAndGet(-1L);
    }

    /* JADX INFO: renamed from: h */
    public final long m18212h() {
        return this.f51190b.get();
    }

    public void request(long j) {
        if (SubscriptionHelper.m18226f(j)) {
            BackpressureHelper.m18237a(this.f51190b, j);
        }
    }
}
