package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, InnerQueuedSubscriberSupport<R> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49641a;

        /* JADX INFO: renamed from: f */
        public Subscription f49645f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f49646g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f49647i;

        /* JADX INFO: renamed from: j */
        public volatile InnerQueuedSubscriber f49648j;

        /* JADX INFO: renamed from: d */
        public final SpscLinkedArrayQueue f49644d = new SpscLinkedArrayQueue(Math.min(0, 0));

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f49642b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f49643c = new AtomicLong();

        public ConcatMapEagerDelayErrorSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49641a = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: a */
        public final void mo17997a(InnerQueuedSubscriber innerQueuedSubscriber) {
            innerQueuedSubscriber.f51183b = true;
            mo17998b();
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
        
            if (r11 != r5) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
        
            if (r18.f49646g == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
        
            m18001e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
        
            r8 = r7.f51183b;
            r9 = r10.isEmpty();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
        
            if (r8 == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
        
            if (r9 == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
        
            r18.f49648j = null;
            r18.f49645f.request(1);
            r7 = null;
            r0 = true;
         */
        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo17998b() {
            InnerQueuedSubscriber innerQueuedSubscriber;
            long j;
            long j2;
            boolean z2;
            SimpleQueue simpleQueue;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber innerQueuedSubscriber2 = this.f49648j;
            FlowableSubscriber flowableSubscriber = this.f49641a;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.f49643c.get();
                if (innerQueuedSubscriber2 != null) {
                    innerQueuedSubscriber = innerQueuedSubscriber2;
                } else {
                    if (this.f49642b.get() != null) {
                        m18001e();
                        this.f49642b.m18236f(this.f49641a);
                        return;
                    }
                    boolean z3 = this.f49647i;
                    innerQueuedSubscriber = (InnerQueuedSubscriber) this.f49644d.poll();
                    if (z3 && innerQueuedSubscriber == null) {
                        this.f49642b.m18236f(this.f49641a);
                        return;
                    } else if (innerQueuedSubscriber != null) {
                        this.f49648j = innerQueuedSubscriber;
                    }
                }
                if (innerQueuedSubscriber != null && (simpleQueue = innerQueuedSubscriber.f51182a) != null) {
                    j2 = 0;
                    while (true) {
                        if (j2 == j3) {
                            j = 0;
                            break;
                        }
                        if (this.f49646g) {
                            m18001e();
                            return;
                        }
                        boolean z4 = innerQueuedSubscriber.f51183b;
                        j = 0;
                        try {
                            Object objPoll = simpleQueue.poll();
                            boolean z5 = objPoll == null;
                            if (z4 && z5) {
                                this.f49648j = null;
                                this.f49645f.request(1L);
                                innerQueuedSubscriber = null;
                                z2 = true;
                                break;
                            }
                            if (z5) {
                                break;
                            }
                            flowableSubscriber.onNext(objPoll);
                            j2++;
                            innerQueuedSubscriber.request(1L);
                        } catch (Throwable th) {
                            Exceptions.m17950a(th);
                            this.f49648j = null;
                            SubscriptionHelper.m18221a(innerQueuedSubscriber);
                            m18001e();
                            flowableSubscriber.onError(th);
                            return;
                        }
                    }
                } else {
                    j = 0;
                    j2 = 0;
                    z2 = false;
                }
                if (j2 != j && j3 != Long.MAX_VALUE) {
                    this.f49643c.addAndGet(-j2);
                }
                if (!z2 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                } else {
                    innerQueuedSubscriber2 = innerQueuedSubscriber;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: c */
        public final void mo17999c(InnerQueuedSubscriber innerQueuedSubscriber, Throwable th) {
            if (this.f49642b.m18231a(th)) {
                innerQueuedSubscriber.f51183b = true;
                this.f49645f.cancel();
                mo17998b();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49646g) {
                return;
            }
            this.f49646g = true;
            this.f49645f.cancel();
            this.f49642b.m18232b();
            if (getAndIncrement() == 0) {
                do {
                    m18001e();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: d */
        public final void mo18000d(InnerQueuedSubscriber innerQueuedSubscriber, Object obj) {
            if (innerQueuedSubscriber.f51182a.offer(obj)) {
                mo17998b();
            } else {
                SubscriptionHelper.m18221a(innerQueuedSubscriber);
                mo17999c(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m18001e() {
            InnerQueuedSubscriber innerQueuedSubscriber = this.f49648j;
            this.f49648j = null;
            if (innerQueuedSubscriber != null) {
                SubscriptionHelper.m18221a(innerQueuedSubscriber);
            }
            while (true) {
                InnerQueuedSubscriber innerQueuedSubscriber2 = (InnerQueuedSubscriber) this.f49644d.poll();
                if (innerQueuedSubscriber2 == null) {
                    return;
                } else {
                    SubscriptionHelper.m18221a(innerQueuedSubscriber2);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49645f, subscription)) {
                this.f49645f = subscription;
                this.f49641a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49647i = true;
            mo17998b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49642b.m18231a(th)) {
                this.f49647i = true;
                mo17998b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49645f.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f49643c, j);
                mo17998b();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new ConcatMapEagerDelayErrorSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
