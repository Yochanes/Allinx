package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {

    /* JADX INFO: renamed from: c */
    public final SerializedSubscriber f49238c;

    /* JADX INFO: renamed from: d */
    public final MpscLinkedQueue f49239d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f49240f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f49241g;

    /* JADX INFO: renamed from: i */
    public Throwable f49242i;

    public QueueDrainSubscriber(SerializedSubscriber serializedSubscriber, MpscLinkedQueue mpscLinkedQueue) {
        this.f49238c = serializedSubscriber;
        this.f49239d = mpscLinkedQueue;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo17649a(Object obj, Subscriber subscriber) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17854b() {
        return this.f49244a.getAndIncrement() == 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17855c() {
        AtomicInteger atomicInteger = this.f49244a;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m17856e(Object obj, Disposable disposable) {
        SerializedSubscriber serializedSubscriber = this.f49238c;
        MpscLinkedQueue mpscLinkedQueue = this.f49239d;
        if (m17855c()) {
            long j = this.f49243b.get();
            if (j == 0) {
                this.f49240f = true;
                disposable.dispose();
                throw null;
            }
            if (mpscLinkedQueue.isEmpty()) {
                if (mo17649a(obj, serializedSubscriber) && j != Long.MAX_VALUE) {
                    m17858h();
                }
                if (this.f49244a.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                mpscLinkedQueue.offer(obj);
            }
        } else {
            mpscLinkedQueue.offer(obj);
            if (!m17854b()) {
                return;
            }
        }
        QueueDrainHelper.m17909c(mpscLinkedQueue, serializedSubscriber, disposable, this);
    }

    /* JADX INFO: renamed from: g */
    public final int m17857g(int i) {
        return this.f49244a.addAndGet(i);
    }

    /* JADX INFO: renamed from: h */
    public final long m17858h() {
        return this.f49243b.addAndGet(-1L);
    }

    /* JADX INFO: renamed from: i */
    public final long m17859i() {
        return this.f49243b.get();
    }

    public void request(long j) {
        if (SubscriptionHelper.m17873h(j)) {
            BackpressureHelper.m17878a(this.f49243b, j);
        }
    }
}
