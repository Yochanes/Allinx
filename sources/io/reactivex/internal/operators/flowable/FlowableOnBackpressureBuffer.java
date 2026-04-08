package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47962a;

        /* JADX INFO: renamed from: b */
        public final SimplePlainQueue f47963b;

        /* JADX INFO: renamed from: c */
        public final Action f47964c;

        /* JADX INFO: renamed from: d */
        public Subscription f47965d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f47966f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f47967g;

        /* JADX INFO: renamed from: i */
        public Throwable f47968i;

        /* JADX INFO: renamed from: j */
        public final AtomicLong f47969j = new AtomicLong();

        /* JADX INFO: renamed from: n */
        public boolean f47970n;

        public BackpressureBufferSubscriber(FlowableSubscriber flowableSubscriber, int i, boolean z2, Action action) {
            this.f47962a = flowableSubscriber;
            this.f47964c = action;
            this.f47963b = z2 ? new SpscLinkedArrayQueue(i) : new SpscArrayQueue(i);
        }

        /* JADX INFO: renamed from: b */
        public final void m17704b() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue simplePlainQueue = this.f47963b;
                FlowableSubscriber flowableSubscriber = this.f47962a;
                int iAddAndGet = 1;
                while (!m17705d(this.f47967g, simplePlainQueue.isEmpty(), flowableSubscriber)) {
                    long j = this.f47969j.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.f47967g;
                        Object objPoll = simplePlainQueue.poll();
                        boolean z3 = objPoll == null;
                        if (m17705d(z2, z3, flowableSubscriber)) {
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        flowableSubscriber.onNext(objPoll);
                        j2++;
                    }
                    if (j2 == j && m17705d(this.f47967g, simplePlainQueue.isEmpty(), flowableSubscriber)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.f47969j.addAndGet(-j2);
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
            if (this.f47966f) {
                return;
            }
            this.f47966f = true;
            this.f47965d.cancel();
            if (getAndIncrement() == 0) {
                this.f47963b.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f47963b.clear();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m17705d(boolean z2, boolean z3, Subscriber subscriber) {
            if (this.f47966f) {
                this.f47963b.clear();
                return true;
            }
            if (!z2) {
                return false;
            }
            Throwable th = this.f47968i;
            if (th != null) {
                this.f47963b.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z3) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            this.f47970n = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f47963b.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47965d, subscription)) {
                this.f47965d = subscription;
                this.f47962a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47967g = true;
            if (this.f47970n) {
                this.f47962a.onComplete();
            } else {
                m17704b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47968i = th;
            this.f47967g = true;
            if (this.f47970n) {
                this.f47962a.onError(th);
            } else {
                m17704b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47963b.offer(obj)) {
                if (this.f47970n) {
                    this.f47962a.onNext(null);
                    return;
                } else {
                    m17704b();
                    return;
                }
            }
            this.f47965d.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f47964c.getClass();
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return this.f47963b.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (this.f47970n || !SubscriptionHelper.m17873h(j)) {
                return;
            }
            BackpressureHelper.m17878a(this.f47969j, j);
            m17704b();
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new BackpressureBufferSubscriber((FlowableSubscriber) subscriber, 0, false, null));
    }
}
