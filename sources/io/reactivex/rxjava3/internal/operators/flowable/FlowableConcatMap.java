package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59721 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49633a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f49633a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49633a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49634a;

        /* JADX INFO: renamed from: b */
        public SimpleQueue f49635b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f49636c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f49637d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f49638f;

        /* JADX INFO: renamed from: g */
        public int f49639g;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: c */
        public final void mo17992c() {
            this.f49638f = false;
            mo17993d();
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo17993d();

        /* JADX INFO: renamed from: e */
        public abstract void mo17994e();

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49634a, subscription)) {
                this.f49634a = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(7);
                    if (iMo17962e == 1) {
                        this.f49639g = iMo17962e;
                        this.f49635b = queueSubscription;
                        this.f49636c = true;
                        mo17994e();
                        mo17993d();
                        return;
                    }
                    if (iMo17962e == 2) {
                        this.f49639g = iMo17962e;
                        this.f49635b = queueSubscription;
                        mo17994e();
                        subscription.request(0);
                        return;
                    }
                }
                this.f49635b = new SpscArrayQueue(0);
                mo17994e();
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49636c = true;
            mo17993d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49639g == 2 || this.f49635b.offer(obj)) {
                mo17993d();
            } else {
                this.f49634a.cancel();
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
            if (this.f49637d) {
                return;
            }
            this.f49637d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo17993d() {
            Throwable th;
            if (getAndIncrement() == 0) {
                while (!this.f49637d) {
                    if (!this.f49638f) {
                        boolean z2 = this.f49636c;
                        if (z2) {
                            throw null;
                        }
                        try {
                            boolean z3 = this.f49635b.poll() == null;
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

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: e */
        public final void mo17994e() {
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
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: a */
        public final void mo17995a(Throwable th) {
            this.f49634a.cancel();
            HalfSerializer.m18255d(null, th, this, null);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: b */
        public final void mo17996b(Object obj) {
            HalfSerializer.m18257f(null, obj, this, null);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49637d) {
                return;
            }
            this.f49637d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo17993d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: e */
        public final void mo17994e() {
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
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {

        /* JADX INFO: renamed from: n */
        public long f49640n;

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j = this.f49640n;
            if (j != 0) {
                this.f49640n = 0L;
                m18219d(j);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            long j = this.f49640n;
            if (j != 0) {
                this.f49640n = 0L;
                m18219d(j);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49640n++;
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ConcatMapSupport<T> {
        /* JADX INFO: renamed from: a */
        void mo17995a(Throwable th);

        /* JADX INFO: renamed from: b */
        void mo17996b(Object obj);

        /* JADX INFO: renamed from: c */
        void mo17992c();
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        if (!FlowableScalarXMap.m18080a(null, (FlowableSubscriber) subscriber)) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SimpleScalarSubscription<T> extends AtomicBoolean implements Subscription {
        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (j > 0 && compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }
    }
}
