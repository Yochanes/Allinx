package io.reactivex.processors;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public final SpscLinkedArrayQueue f49335b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f49336c;

    /* JADX INFO: renamed from: d */
    public final boolean f49337d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f49338f;

    /* JADX INFO: renamed from: g */
    public Throwable f49339g;

    /* JADX INFO: renamed from: i */
    public final AtomicReference f49340i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f49341j;

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f49342n;

    /* JADX INFO: renamed from: o */
    public final BasicIntQueueSubscription f49343o;

    /* JADX INFO: renamed from: p */
    public final AtomicLong f49344p;

    /* JADX INFO: renamed from: q */
    public boolean f49345q;

    /* JADX INFO: compiled from: Proguard */
    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        public UnicastQueueSubscription() {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (UnicastProcessor.this.f49341j) {
                return;
            }
            UnicastProcessor.this.f49341j = true;
            Runnable runnable = (Runnable) UnicastProcessor.this.f49336c.getAndSet(null);
            if (runnable != null) {
                runnable.run();
            }
            UnicastProcessor unicastProcessor = UnicastProcessor.this;
            if (unicastProcessor.f49345q || unicastProcessor.f49343o.getAndIncrement() != 0) {
                return;
            }
            UnicastProcessor.this.f49335b.clear();
            UnicastProcessor.this.f49340i.lazySet(null);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            UnicastProcessor.this.f49335b.clear();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            UnicastProcessor.this.f49345q = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return UnicastProcessor.this.f49335b.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return UnicastProcessor.this.f49335b.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                BackpressureHelper.m17878a(unicastProcessor.f49344p, j);
                unicastProcessor.m17918i();
            }
        }
    }

    public UnicastProcessor(Runnable runnable, int i) {
        ObjectHelper.m17629c(i, "capacityHint");
        this.f49335b = new SpscLinkedArrayQueue(i);
        this.f49336c = new AtomicReference(runnable);
        this.f49337d = true;
        this.f49340i = new AtomicReference();
        this.f49342n = new AtomicBoolean();
        this.f49343o = new UnicastQueueSubscription();
        this.f49344p = new AtomicLong();
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        if (this.f49342n.get() || !this.f49342n.compareAndSet(false, true)) {
            EmptySubscription.m17863b(new IllegalStateException("This processor allows only a single Subscriber"), subscriber);
            return;
        }
        subscriber.mo12367j(this.f49343o);
        this.f49340i.set(subscriber);
        if (this.f49341j) {
            this.f49340i.lazySet(null);
        } else {
            m17918i();
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m17917h(boolean z2, boolean z3, boolean z4, Subscriber subscriber, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        if (this.f49341j) {
            spscLinkedArrayQueue.clear();
            this.f49340i.lazySet(null);
            return true;
        }
        if (!z3) {
            return false;
        }
        if (z2 && this.f49339g != null) {
            spscLinkedArrayQueue.clear();
            this.f49340i.lazySet(null);
            subscriber.onError(this.f49339g);
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th = this.f49339g;
        this.f49340i.lazySet(null);
        if (th != null) {
            subscriber.onError(th);
            return true;
        }
        subscriber.onComplete();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m17918i() {
        boolean z2;
        if (this.f49343o.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        Subscriber subscriber = (Subscriber) this.f49340i.get();
        int iAddAndGet2 = 1;
        while (subscriber == null) {
            iAddAndGet2 = this.f49343o.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                subscriber = (Subscriber) this.f49340i.get();
            }
        }
        if (this.f49345q) {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f49335b;
            boolean z3 = this.f49337d;
            while (!this.f49341j) {
                boolean z4 = this.f49338f;
                if (!z3 && z4 && this.f49339g != null) {
                    spscLinkedArrayQueue.clear();
                    this.f49340i.lazySet(null);
                    subscriber.onError(this.f49339g);
                    return;
                }
                subscriber.onNext(null);
                if (z4) {
                    this.f49340i.lazySet(null);
                    Throwable th = this.f49339g;
                    if (th != null) {
                        subscriber.onError(th);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f49343o.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
            this.f49340i.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.f49335b;
        boolean z5 = !this.f49337d;
        int iAddAndGet3 = 1;
        while (true) {
            long j = this.f49344p.get();
            long j2 = 0;
            while (j != j2) {
                boolean z6 = this.f49338f;
                Object objPoll = spscLinkedArrayQueue2.poll();
                boolean z7 = objPoll == null;
                if (m17917h(z5, z6, z7, subscriber, spscLinkedArrayQueue2)) {
                    return;
                }
                if (z7) {
                    break;
                }
                subscriber.onNext(objPoll);
                j2++;
            }
            if (j == j2) {
                z2 = z5;
                if (m17917h(z5, this.f49338f, spscLinkedArrayQueue2.isEmpty(), subscriber, spscLinkedArrayQueue2)) {
                    return;
                }
            } else {
                z2 = z5;
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.f49344p.addAndGet(-j2);
            }
            iAddAndGet3 = this.f49343o.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z5 = z2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (this.f49338f || this.f49341j) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f49338f || this.f49341j) {
            return;
        }
        this.f49338f = true;
        Runnable runnable = (Runnable) this.f49336c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        m17918i();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f49338f || this.f49341j) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        this.f49339g = th;
        this.f49338f = true;
        Runnable runnable = (Runnable) this.f49336c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        m17918i();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f49338f || this.f49341j) {
            return;
        }
        this.f49335b.offer(obj);
        m17918i();
    }
}
