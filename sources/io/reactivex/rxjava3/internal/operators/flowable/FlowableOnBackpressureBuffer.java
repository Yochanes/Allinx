package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49868a;

        /* JADX INFO: renamed from: c */
        public Subscription f49870c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f49871d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f49872f;

        /* JADX INFO: renamed from: g */
        public Throwable f49873g;

        /* JADX INFO: renamed from: j */
        public boolean f49875j;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f49874i = new AtomicLong();

        /* JADX INFO: renamed from: b */
        public final SimplePlainQueue f49869b = new SpscArrayQueue(0);

        public BackpressureBufferSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49868a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: b */
        public final void m18049b() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue simplePlainQueue = this.f49869b;
                FlowableSubscriber flowableSubscriber = this.f49868a;
                int iAddAndGet = 1;
                while (!m18050d(this.f49872f, simplePlainQueue.isEmpty(), flowableSubscriber)) {
                    long j = this.f49874i.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.f49872f;
                        Object objPoll = simplePlainQueue.poll();
                        boolean z3 = objPoll == null;
                        if (m18050d(z2, z3, flowableSubscriber)) {
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        flowableSubscriber.onNext(objPoll);
                        j2++;
                    }
                    if (j2 == j && m18050d(this.f49872f, simplePlainQueue.isEmpty(), flowableSubscriber)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.f49874i.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49871d) {
                return;
            }
            this.f49871d = true;
            this.f49870c.cancel();
            if (this.f49875j || getAndIncrement() != 0) {
                return;
            }
            this.f49869b.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49869b.clear();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m18050d(boolean z2, boolean z3, Subscriber subscriber) {
            if (this.f49871d) {
                this.f49869b.clear();
                return true;
            }
            if (!z2) {
                return false;
            }
            Throwable th = this.f49873g;
            if (th != null) {
                this.f49869b.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z3) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            this.f49875j = true;
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f49869b.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49870c, subscription)) {
                this.f49870c = subscription;
                this.f49868a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49872f = true;
            if (this.f49875j) {
                this.f49868a.onComplete();
            } else {
                m18049b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49873g = th;
            this.f49872f = true;
            if (this.f49875j) {
                this.f49868a.onError(th);
            } else {
                m18049b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49869b.offer(obj)) {
                if (this.f49875j) {
                    this.f49868a.onNext(null);
                    return;
                } else {
                    m18049b();
                    return;
                }
            }
            this.f49870c.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                missingBackpressureException.initCause(th);
                onError(missingBackpressureException);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return this.f49869b.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (this.f49875j || !SubscriptionHelper.m18226f(j)) {
                return;
            }
            BackpressureHelper.m18237a(this.f49874i, j);
            m18049b();
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new BackpressureBufferSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
