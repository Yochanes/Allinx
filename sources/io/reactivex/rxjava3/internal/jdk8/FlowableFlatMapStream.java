package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlatMapStream<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapStreamSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final Subscriber f49402a;

        /* JADX INFO: renamed from: c */
        public SimpleQueue f49404c;

        /* JADX INFO: renamed from: d */
        public Subscription f49405d;

        /* JADX INFO: renamed from: f */
        public Iterator f49406f;

        /* JADX INFO: renamed from: g */
        public Stream f49407g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f49408i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f49409j;

        /* JADX INFO: renamed from: o */
        public long f49411o;

        /* JADX INFO: renamed from: p */
        public int f49412p;

        /* JADX INFO: renamed from: q */
        public int f49413q;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f49403b = new AtomicLong();

        /* JADX INFO: renamed from: n */
        public final AtomicThrowable f49410n = new AtomicThrowable();

        public FlatMapStreamSubscriber(Subscriber subscriber) {
            this.f49402a = subscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m17966a() {
            long j;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber subscriber = this.f49402a;
            SimpleQueue simpleQueue = this.f49404c;
            AtomicThrowable atomicThrowable = this.f49410n;
            Iterator it = this.f49406f;
            long j2 = this.f49403b.get();
            long j3 = this.f49411o;
            ?? r11 = 1;
            boolean z2 = this.f49413q != 1;
            long j4 = j3;
            int iAddAndGet = 1;
            long j5 = j2;
            Iterator it2 = it;
            while (true) {
                if (this.f49408i) {
                    simpleQueue.clear();
                    try {
                        this.f49406f = null;
                        Stream stream = this.f49407g;
                        this.f49407g = null;
                        if (stream != null) {
                            stream.close();
                        }
                    } catch (Throwable th) {
                        Exceptions.m17950a(th);
                        RxJavaPlugins.m18275b(th);
                    }
                } else {
                    boolean z3 = this.f49409j;
                    if (atomicThrowable.get() != null) {
                        subscriber.onError(atomicThrowable.get());
                        this.f49408i = r11;
                        j = j4;
                    } else {
                        if (it2 == null) {
                            try {
                                ?? r15 = simpleQueue.poll() == null ? r11 : 0;
                                if (z3 && r15 != 0) {
                                    subscriber.onComplete();
                                    this.f49408i = r11;
                                } else if (r15 == 0) {
                                    if (z2) {
                                        int i = this.f49412p + r11;
                                        this.f49412p = i;
                                        if (i == 0) {
                                            this.f49412p = 0;
                                            j = j4;
                                            this.f49405d.request(0);
                                        } else {
                                            j = j4;
                                        }
                                        try {
                                            throw null;
                                        } catch (Throwable th2) {
                                            Exceptions.m17950a(th2);
                                            m17967b(th2, subscriber);
                                        }
                                    }
                                }
                                j = j4;
                                if (it2 != null || j == j5) {
                                    j4 = j;
                                } else {
                                    try {
                                        Object next = it2.next();
                                        Objects.requireNonNull(next, "The Stream.Iterator returned a null value");
                                        if (!this.f49408i) {
                                            subscriber.onNext(next);
                                            j4 = j + 1;
                                            if (!this.f49408i) {
                                                try {
                                                    if (!it2.hasNext()) {
                                                        try {
                                                            this.f49406f = null;
                                                            Stream stream2 = this.f49407g;
                                                            this.f49407g = null;
                                                            if (stream2 != null) {
                                                                stream2.close();
                                                            }
                                                            it2 = null;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            it2 = null;
                                                            Exceptions.m17950a(th);
                                                            m17967b(th, subscriber);
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        Exceptions.m17950a(th5);
                                        m17967b(th5, subscriber);
                                    }
                                }
                            } catch (Throwable th6) {
                                j = j4;
                                Exceptions.m17950a(th6);
                                m17967b(th6, subscriber);
                            }
                        } else {
                            j = j4;
                            if (it2 != null) {
                            }
                            j4 = j;
                        }
                        r11 = 1;
                    }
                    j4 = j;
                    r11 = 1;
                }
                this.f49411o = j4;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                j5 = this.f49403b.get();
                r11 = 1;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m17967b(Throwable th, Subscriber subscriber) {
            if (!this.f49410n.compareAndSet(null, th)) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f49405d.cancel();
            this.f49408i = true;
            subscriber.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49408i = true;
            this.f49405d.cancel();
            m17966a();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49405d, subscription)) {
                this.f49405d = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(7);
                    if (iMo17962e == 1) {
                        this.f49413q = iMo17962e;
                        this.f49404c = queueSubscription;
                        this.f49409j = true;
                        this.f49402a.mo12367j(this);
                        return;
                    }
                    if (iMo17962e == 2) {
                        this.f49413q = iMo17962e;
                        this.f49404c = queueSubscription;
                        this.f49402a.mo12367j(this);
                        subscription.request(0);
                        return;
                    }
                }
                this.f49404c = new SpscArrayQueue(0);
                this.f49402a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49409j = true;
            m17966a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (!this.f49410n.compareAndSet(null, th)) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49409j = true;
                m17966a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49413q == 2 || this.f49404c.offer(obj)) {
                m17966a();
            } else {
                this.f49405d.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f49403b, j);
                m17966a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new FlatMapStreamSubscriber(subscriber);
        throw null;
    }
}
