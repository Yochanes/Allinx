package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public final SpscLinkedArrayQueue f51282b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f51283c;

    /* JADX INFO: renamed from: f */
    public volatile boolean f51285f;

    /* JADX INFO: renamed from: g */
    public Throwable f51286g;

    /* JADX INFO: renamed from: j */
    public volatile boolean f51288j;

    /* JADX INFO: renamed from: q */
    public boolean f51292q;

    /* JADX INFO: renamed from: d */
    public final boolean f51284d = true;

    /* JADX INFO: renamed from: i */
    public final AtomicReference f51287i = new AtomicReference();

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f51289n = new AtomicBoolean();

    /* JADX INFO: renamed from: o */
    public final BasicIntQueueSubscription f51290o = new UnicastQueueSubscription();

    /* JADX INFO: renamed from: p */
    public final AtomicLong f51291p = new AtomicLong();

    /* JADX INFO: compiled from: Proguard */
    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        public UnicastQueueSubscription() {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (UnicastProcessor.this.f51288j) {
                return;
            }
            UnicastProcessor.this.f51288j = true;
            Runnable runnable = (Runnable) UnicastProcessor.this.f51283c.getAndSet(null);
            if (runnable != null) {
                runnable.run();
            }
            UnicastProcessor.this.f51287i.lazySet(null);
            if (UnicastProcessor.this.f51290o.getAndIncrement() == 0) {
                UnicastProcessor.this.f51287i.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.f51292q) {
                    return;
                }
                unicastProcessor.f51282b.clear();
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            UnicastProcessor.this.f51282b.clear();
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            UnicastProcessor.this.f51292q = true;
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return UnicastProcessor.this.f51282b.isEmpty();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return UnicastProcessor.this.f51282b.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                BackpressureHelper.m18237a(unicastProcessor.f51291p, j);
                unicastProcessor.m18280i();
            }
        }
    }

    public UnicastProcessor(Runnable runnable, int i) {
        this.f51282b = new SpscLinkedArrayQueue(i);
        this.f51283c = new AtomicReference(runnable);
    }

    /* JADX INFO: renamed from: h */
    public static UnicastProcessor m18278h(Runnable runnable, int i) {
        Objects.requireNonNull(runnable, "onTerminate");
        ObjectHelper.m17964a(i, "capacityHint");
        return new UnicastProcessor(runnable, i);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        if (this.f51289n.get() || !this.f51289n.compareAndSet(false, true)) {
            EmptySubscription.m18217b(new IllegalStateException("This processor allows only a single Subscriber"), subscriber);
            return;
        }
        subscriber.mo12367j(this.f51290o);
        this.f51287i.set(subscriber);
        if (this.f51288j) {
            this.f51287i.lazySet(null);
        } else {
            m18280i();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18279e(boolean z2, boolean z3, boolean z4, Subscriber subscriber, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        if (this.f51288j) {
            spscLinkedArrayQueue.clear();
            this.f51287i.lazySet(null);
            return true;
        }
        if (!z3) {
            return false;
        }
        if (z2 && this.f51286g != null) {
            spscLinkedArrayQueue.clear();
            this.f51287i.lazySet(null);
            subscriber.onError(this.f51286g);
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th = this.f51286g;
        this.f51287i.lazySet(null);
        if (th != null) {
            subscriber.onError(th);
            return true;
        }
        subscriber.onComplete();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m18280i() {
        boolean z2;
        if (this.f51290o.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        Subscriber subscriber = (Subscriber) this.f51287i.get();
        int iAddAndGet2 = 1;
        while (subscriber == null) {
            iAddAndGet2 = this.f51290o.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                subscriber = (Subscriber) this.f51287i.get();
            }
        }
        if (this.f51292q) {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f51282b;
            boolean z3 = this.f51284d;
            while (!this.f51288j) {
                boolean z4 = this.f51285f;
                if (!z3 && z4 && this.f51286g != null) {
                    spscLinkedArrayQueue.clear();
                    this.f51287i.lazySet(null);
                    subscriber.onError(this.f51286g);
                    return;
                }
                subscriber.onNext(null);
                if (z4) {
                    this.f51287i.lazySet(null);
                    Throwable th = this.f51286g;
                    if (th != null) {
                        subscriber.onError(th);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f51290o.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f51287i.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.f51282b;
        boolean z5 = !this.f51284d;
        int iAddAndGet3 = 1;
        while (true) {
            long j = this.f51291p.get();
            long j2 = 0;
            while (j != j2) {
                boolean z6 = this.f51285f;
                Object objPoll = spscLinkedArrayQueue2.poll();
                boolean z7 = objPoll == null;
                if (m18279e(z5, z6, z7, subscriber, spscLinkedArrayQueue2)) {
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
                if (m18279e(z5, this.f51285f, spscLinkedArrayQueue2.isEmpty(), subscriber, spscLinkedArrayQueue2)) {
                    return;
                }
            } else {
                z2 = z5;
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.f51291p.addAndGet(-j2);
            }
            iAddAndGet3 = this.f51290o.addAndGet(-iAddAndGet3);
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
        if (this.f51285f || this.f51288j) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f51285f || this.f51288j) {
            return;
        }
        this.f51285f = true;
        Runnable runnable = (Runnable) this.f51283c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        m18280i();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        if (this.f51285f || this.f51288j) {
            RxJavaPlugins.m18275b(th);
            return;
        }
        this.f51286g = th;
        this.f51285f = true;
        Runnable runnable = (Runnable) this.f51283c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        m18280i();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
        if (this.f51285f || this.f51288j) {
            return;
        }
        this.f51282b.offer(obj);
        m18280i();
    }
}
