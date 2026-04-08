package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final Subscriber f49747a;

        /* JADX INFO: renamed from: d */
        public Subscription f49750d;

        /* JADX INFO: renamed from: f */
        public SimpleQueue f49751f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f49752g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f49753i;

        /* JADX INFO: renamed from: n */
        public Iterator f49755n;

        /* JADX INFO: renamed from: o */
        public int f49756o;

        /* JADX INFO: renamed from: p */
        public int f49757p;

        /* JADX INFO: renamed from: b */
        public final int f49748b = 0;

        /* JADX INFO: renamed from: j */
        public final AtomicReference f49754j = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f49749c = new AtomicLong();

        public FlattenIterableSubscriber(Subscriber subscriber) {
            this.f49747a = subscriber;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
        
            throw null;
         */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m18018b() {
            boolean z2;
            long j;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber subscriber = this.f49747a;
            SimpleQueue simpleQueue = this.f49751f;
            boolean z3 = true;
            boolean z4 = this.f49757p != 1;
            Iterator it = this.f49755n;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z5 = this.f49752g;
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (m18019d(z5, objPoll == null ? z3 : false, subscriber, simpleQueue)) {
                            return;
                        }
                        if (objPoll != null) {
                            try {
                                break;
                            } catch (Throwable th) {
                                Exceptions.m17950a(th);
                                this.f49750d.cancel();
                                ExceptionHelper.m18246a(this.f49754j, th);
                                subscriber.onError(ExceptionHelper.m18249d(this.f49754j));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.m17950a(th2);
                        this.f49750d.cancel();
                        ExceptionHelper.m18246a(this.f49754j, th2);
                        Throwable thM18249d = ExceptionHelper.m18249d(this.f49754j);
                        this.f49755n = null;
                        simpleQueue.clear();
                        subscriber.onError(thM18249d);
                        return;
                    }
                }
                if (it != null) {
                    long j2 = this.f49749c.get();
                    long j3 = 0;
                    while (true) {
                        if (j3 == j2) {
                            z2 = z3;
                            j = 0;
                            break;
                        }
                        if (m18019d(this.f49752g, false, subscriber, simpleQueue)) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            z2 = z3;
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            subscriber.onNext(next);
                            if (m18019d(this.f49752g, false, subscriber, simpleQueue)) {
                                return;
                            }
                            j3++;
                            try {
                                if (it.hasNext()) {
                                    z3 = z2;
                                } else {
                                    if (z4) {
                                        int i = this.f49756o + 1;
                                        if (i == this.f49748b) {
                                            this.f49756o = 0;
                                            j = 0;
                                            this.f49750d.request(i);
                                        } else {
                                            j = 0;
                                            this.f49756o = i;
                                        }
                                    } else {
                                        j = 0;
                                    }
                                    this.f49755n = null;
                                    it = null;
                                }
                            } catch (Throwable th3) {
                                Exceptions.m17950a(th3);
                                this.f49755n = null;
                                this.f49750d.cancel();
                                ExceptionHelper.m18246a(this.f49754j, th3);
                                subscriber.onError(ExceptionHelper.m18249d(this.f49754j));
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.m17950a(th4);
                            this.f49755n = null;
                            this.f49750d.cancel();
                            ExceptionHelper.m18246a(this.f49754j, th4);
                            subscriber.onError(ExceptionHelper.m18249d(this.f49754j));
                            return;
                        }
                    }
                    if (j3 == j2) {
                        if (m18019d(this.f49752g, (simpleQueue.isEmpty() && it == null) ? z2 : false, subscriber, simpleQueue)) {
                            return;
                        }
                    }
                    if (j3 != j && j2 != Long.MAX_VALUE) {
                        this.f49749c.addAndGet(-j3);
                    }
                    if (it == null) {
                        continue;
                    }
                    z3 = z2;
                } else {
                    z2 = z3;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    z3 = z2;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49753i) {
                return;
            }
            this.f49753i = true;
            this.f49750d.cancel();
            if (getAndIncrement() == 0) {
                this.f49751f.clear();
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49755n = null;
            this.f49751f.clear();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m18019d(boolean z2, boolean z3, Subscriber subscriber, SimpleQueue simpleQueue) {
            if (this.f49753i) {
                this.f49755n = null;
                simpleQueue.clear();
                return true;
            }
            if (!z2) {
                return false;
            }
            if (((Throwable) this.f49754j.get()) == null) {
                if (!z3) {
                    return false;
                }
                subscriber.onComplete();
                return true;
            }
            Throwable thM18249d = ExceptionHelper.m18249d(this.f49754j);
            this.f49755n = null;
            simpleQueue.clear();
            subscriber.onError(thM18249d);
            return true;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return this.f49757p == 1 ? 1 : 0;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f49755n == null && this.f49751f.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49750d, subscription)) {
                this.f49750d = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(3);
                    if (iMo17962e == 1) {
                        this.f49757p = iMo17962e;
                        this.f49751f = queueSubscription;
                        this.f49752g = true;
                        this.f49747a.mo12367j(this);
                        return;
                    }
                    if (iMo17962e == 2) {
                        this.f49757p = iMo17962e;
                        this.f49751f = queueSubscription;
                        this.f49747a.mo12367j(this);
                        subscription.request(0);
                        return;
                    }
                }
                this.f49751f = new SpscArrayQueue(0);
                this.f49747a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49752g) {
                return;
            }
            this.f49752g = true;
            m18018b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49752g || !ExceptionHelper.m18246a(this.f49754j, th)) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49752g = true;
                m18018b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49752g) {
                return;
            }
            if (this.f49757p != 0 || this.f49751f.offer(obj)) {
                m18018b();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Iterator it = this.f49755n;
            if (it == null) {
                if (this.f49751f.poll() == null) {
                    return null;
                }
                throw null;
            }
            Object next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f49755n = null;
            }
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f49749c, j);
                m18018b();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new FlattenIterableSubscriber(subscriber);
        throw null;
    }
}
