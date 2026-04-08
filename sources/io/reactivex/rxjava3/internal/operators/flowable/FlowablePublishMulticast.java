package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowablePublishMulticast<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MulticastProcessor<T> extends Flowable<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p */
        public static final MulticastSubscription[] f49900p = new MulticastSubscription[0];

        /* JADX INFO: renamed from: q */
        public static final MulticastSubscription[] f49901q = new MulticastSubscription[0];

        /* JADX INFO: renamed from: g */
        public volatile SimpleQueue f49906g;

        /* JADX INFO: renamed from: i */
        public int f49907i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f49908j;

        /* JADX INFO: renamed from: n */
        public Throwable f49909n;

        /* JADX INFO: renamed from: o */
        public int f49910o;

        /* JADX INFO: renamed from: d */
        public final int f49904d = 0;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f49902b = new AtomicInteger();

        /* JADX INFO: renamed from: f */
        public final AtomicReference f49905f = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f49903c = new AtomicReference(f49900p);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.Flowable
        /* JADX INFO: renamed from: b */
        public final void mo12359b(Subscriber subscriber) {
            MulticastSubscription multicastSubscription = new MulticastSubscription((FlowableSubscriber) subscriber, this);
            subscriber.mo12367j(multicastSubscription);
            while (true) {
                AtomicReference atomicReference = this.f49903c;
                MulticastSubscription[] multicastSubscriptionArr = (MulticastSubscription[]) atomicReference.get();
                if (multicastSubscriptionArr == f49901q) {
                    Throwable th = this.f49909n;
                    if (th != null) {
                        subscriber.onError(th);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                int length = multicastSubscriptionArr.length;
                MulticastSubscription[] multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
                while (!atomicReference.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    if (atomicReference.get() != multicastSubscriptionArr) {
                        break;
                    }
                }
                if (multicastSubscription.get() == Long.MIN_VALUE) {
                    m18057i(multicastSubscription);
                    return;
                } else {
                    m18055e();
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m18054c() {
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.f49903c.getAndSet(f49901q)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.f49911a.onComplete();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x00eb, code lost:
        
            r8 = r5;
         */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m18055e() {
            AtomicReference atomicReference;
            SubscriptionHelper subscriptionHelper;
            Throwable th;
            Throwable th2;
            if (this.f49902b.getAndIncrement() != 0) {
                return;
            }
            SimpleQueue simpleQueue = this.f49906g;
            int i = this.f49910o;
            int i2 = this.f49904d;
            boolean z2 = this.f49907i != 1;
            AtomicReference atomicReference2 = this.f49903c;
            MulticastSubscription[] multicastSubscriptionArr = (MulticastSubscription[]) atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = multicastSubscriptionArr.length;
                if (simpleQueue == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = multicastSubscriptionArr.length;
                    long j = Long.MAX_VALUE;
                    long j2 = Long.MAX_VALUE;
                    int i3 = 0;
                    while (i3 < length2) {
                        MulticastSubscription multicastSubscription = multicastSubscriptionArr[i3];
                        AtomicReference atomicReference3 = atomicReference2;
                        long j3 = multicastSubscription.get() - multicastSubscription.f49913c;
                        if (j3 == Long.MIN_VALUE) {
                            length--;
                        } else if (j2 > j3) {
                            j2 = j3;
                        }
                        i3++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j4 = 0;
                    if (length == 0) {
                        j2 = 0;
                    }
                    while (true) {
                        subscriptionHelper = SubscriptionHelper.f51214a;
                        if (j2 == j4) {
                            break;
                        }
                        if (this.f49905f.get() == subscriptionHelper) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z3 = this.f49908j;
                        if (z3 && (th2 = this.f49909n) != null) {
                            m18056h(th2);
                            return;
                        }
                        try {
                            Object objPoll = simpleQueue.poll();
                            boolean z4 = objPoll == null;
                            if (z3 && z4) {
                                Throwable th3 = this.f49909n;
                                if (th3 != null) {
                                    m18056h(th3);
                                    return;
                                } else {
                                    m18054c();
                                    return;
                                }
                            }
                            if (z4) {
                                break;
                            }
                            int length3 = multicastSubscriptionArr.length;
                            int i4 = 0;
                            boolean z5 = false;
                            while (i4 < length3) {
                                MulticastSubscription multicastSubscription2 = multicastSubscriptionArr[i4];
                                long j5 = multicastSubscription2.get();
                                if (j5 != Long.MIN_VALUE) {
                                    if (j5 != j) {
                                        multicastSubscription2.f49913c++;
                                    }
                                    multicastSubscription2.f49911a.onNext(objPoll);
                                } else {
                                    z5 = true;
                                }
                                i4++;
                                j = Long.MAX_VALUE;
                            }
                            j2--;
                            if (z2 && (i = i + 1) == i2) {
                                ((Subscription) this.f49905f.get()).request(i2);
                                i = 0;
                            }
                            MulticastSubscription[] multicastSubscriptionArr2 = (MulticastSubscription[]) atomicReference.get();
                            if (z5 || multicastSubscriptionArr2 != multicastSubscriptionArr) {
                                break;
                            }
                            j4 = 0;
                            j = Long.MAX_VALUE;
                        } catch (Throwable th4) {
                            Exceptions.m17950a(th4);
                            SubscriptionHelper.m18221a(this.f49905f);
                            m18056h(th4);
                            return;
                        }
                    }
                    if (j2 == j4) {
                        if (this.f49905f.get() == subscriptionHelper) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z6 = this.f49908j;
                        if (z6 && (th = this.f49909n) != null) {
                            m18056h(th);
                            return;
                        }
                        if (z6 && simpleQueue.isEmpty()) {
                            Throwable th5 = this.f49909n;
                            if (th5 != null) {
                                m18056h(th5);
                                return;
                            } else {
                                m18054c();
                                return;
                            }
                        }
                    }
                }
                this.f49910o = i;
                iAddAndGet = this.f49902b.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue == null) {
                    simpleQueue = this.f49906g;
                }
                multicastSubscriptionArr = (MulticastSubscription[]) atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m18056h(Throwable th) {
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.f49903c.getAndSet(f49901q)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.f49911a.onError(th);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public final void m18057i(MulticastSubscription multicastSubscription) {
            MulticastSubscription[] multicastSubscriptionArr;
            while (true) {
                AtomicReference atomicReference = this.f49903c;
                MulticastSubscription[] multicastSubscriptionArr2 = (MulticastSubscription[]) atomicReference.get();
                int length = multicastSubscriptionArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (multicastSubscriptionArr2[i] == multicastSubscription) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    multicastSubscriptionArr = f49900p;
                } else {
                    MulticastSubscription[] multicastSubscriptionArr3 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr2, 0, multicastSubscriptionArr3, 0, i);
                    System.arraycopy(multicastSubscriptionArr2, i + 1, multicastSubscriptionArr3, i, (length - i) - 1);
                    multicastSubscriptionArr = multicastSubscriptionArr3;
                }
                while (!atomicReference.compareAndSet(multicastSubscriptionArr2, multicastSubscriptionArr)) {
                    if (atomicReference.get() != multicastSubscriptionArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18225e(this.f49905f, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(3);
                    if (iMo17962e == 1) {
                        this.f49907i = iMo17962e;
                        this.f49906g = queueSubscription;
                        this.f49908j = true;
                        m18055e();
                        return;
                    }
                    if (iMo17962e == 2) {
                        this.f49907i = iMo17962e;
                        this.f49906g = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.f49906g = new SpscArrayQueue(0);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49908j) {
                return;
            }
            this.f49908j = true;
            m18055e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49908j) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f49909n = th;
            this.f49908j = true;
            m18055e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49908j) {
                return;
            }
            if (this.f49907i != 0 || this.f49906g.offer(obj)) {
                m18055e();
            } else {
                ((Subscription) this.f49905f.get()).cancel();
                onError(new MissingBackpressureException());
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49911a;

        /* JADX INFO: renamed from: b */
        public final MulticastProcessor f49912b;

        /* JADX INFO: renamed from: c */
        public long f49913c;

        public MulticastSubscription(FlowableSubscriber flowableSubscriber, MulticastProcessor multicastProcessor) {
            this.f49911a = flowableSubscriber;
            this.f49912b = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                MulticastProcessor multicastProcessor = this.f49912b;
                multicastProcessor.m18057i(this);
                multicastProcessor.m18055e();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18238b(this, j);
                this.f49912b.m18055e();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OutputCanceller<R> implements FlowableSubscriber<R>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49914a;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49914a.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49914a, subscription)) {
                this.f49914a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49914a.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new MulticastProcessor();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptySubscription.m18217b(th, subscriber);
        }
    }
}
