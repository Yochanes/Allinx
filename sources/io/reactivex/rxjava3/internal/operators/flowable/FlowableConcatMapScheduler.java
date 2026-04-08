package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatMapScheduler<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59731 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49649a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f49649a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49649a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, FlowableConcatMap.ConcatMapSupport<R>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public Subscription f49650a;

        /* JADX INFO: renamed from: b */
        public SimpleQueue f49651b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f49652c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f49653d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f49654f;

        /* JADX INFO: renamed from: g */
        public int f49655g;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: c */
        public final void mo17992c() {
            this.f49654f = false;
            mo18002d();
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo18002d();

        /* JADX INFO: renamed from: e */
        public abstract void mo18003e();

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49650a, subscription)) {
                this.f49650a = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(7);
                    if (iMo17962e == 1) {
                        this.f49655g = iMo17962e;
                        this.f49651b = queueSubscription;
                        this.f49652c = true;
                        mo18003e();
                        mo18002d();
                        return;
                    }
                    if (iMo17962e == 2) {
                        this.f49655g = iMo17962e;
                        this.f49651b = queueSubscription;
                        mo18003e();
                        subscription.request(0);
                        return;
                    }
                }
                this.f49651b = new SpscArrayQueue(0);
                mo18003e();
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49652c = true;
            mo18002d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49655g == 2 || this.f49651b.offer(obj)) {
                mo18002d();
            } else {
                this.f49650a.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: a */
        public final void mo17995a(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: b */
        public final void mo17996b(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49653d) {
                return;
            }
            this.f49653d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo18002d() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: e */
        public final void mo18003e() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.f49653d) {
                if (!this.f49654f) {
                    boolean z2 = this.f49652c;
                    if (z2) {
                        throw null;
                    }
                    try {
                        boolean z3 = this.f49651b.poll() == null;
                        if (z2 && z3) {
                            throw null;
                        }
                        if (!z3) {
                            try {
                                throw null;
                            } finally {
                            }
                        }
                    } finally {
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: a */
        public final void mo17995a(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: b */
        public final void mo17996b(Object obj) {
            if (get() == 0 && compareAndSet(0, 1)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49653d) {
                return;
            }
            this.f49653d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo18002d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: e */
        public final void mo18003e() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f49653d) {
                return;
            }
            if (this.f49654f) {
                throw null;
            }
            boolean z2 = this.f49652c;
            try {
                boolean z3 = this.f49651b.poll() == null;
                if ((z2 && z3) || z3) {
                    throw null;
                }
                try {
                    throw null;
                } finally {
                }
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
