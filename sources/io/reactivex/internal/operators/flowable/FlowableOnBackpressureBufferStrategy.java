package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59571 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f47971a;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            f47971a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47971a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47972a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f47973b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final ArrayDeque f47974c = new ArrayDeque();

        /* JADX INFO: renamed from: d */
        public Subscription f47975d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f47976f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f47977g;

        /* JADX INFO: renamed from: i */
        public Throwable f47978i;

        public OnBackpressureBufferStrategySubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47972a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m17706a(ArrayDeque arrayDeque) {
            synchronized (arrayDeque) {
                arrayDeque.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m17707b() {
            boolean zIsEmpty;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            ArrayDeque arrayDeque = this.f47974c;
            FlowableSubscriber flowableSubscriber = this.f47972a;
            int iAddAndGet = 1;
            do {
                long j = this.f47973b.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f47976f) {
                        m17706a(arrayDeque);
                        return;
                    }
                    boolean z2 = this.f47977g;
                    synchronized (arrayDeque) {
                        objPoll = arrayDeque.poll();
                    }
                    boolean z3 = objPoll == null;
                    if (z2) {
                        Throwable th = this.f47978i;
                        if (th != null) {
                            m17706a(arrayDeque);
                            flowableSubscriber.onError(th);
                            return;
                        } else if (z3) {
                            flowableSubscriber.onComplete();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    flowableSubscriber.onNext(objPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.f47976f) {
                        m17706a(arrayDeque);
                        return;
                    }
                    boolean z4 = this.f47977g;
                    synchronized (arrayDeque) {
                        zIsEmpty = arrayDeque.isEmpty();
                    }
                    if (z4) {
                        Throwable th2 = this.f47978i;
                        if (th2 != null) {
                            m17706a(arrayDeque);
                            flowableSubscriber.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            flowableSubscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m17882e(this.f47973b, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47976f = true;
            this.f47975d.cancel();
            if (getAndIncrement() == 0) {
                m17706a(this.f47974c);
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47975d, subscription)) {
                this.f47975d = subscription;
                this.f47972a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47977g = true;
            m17707b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47977g) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f47978i = th;
            this.f47977g = true;
            m17707b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47977g) {
                return;
            }
            ArrayDeque arrayDeque = this.f47974c;
            synchronized (arrayDeque) {
                if (arrayDeque.size() == 0) {
                    throw null;
                }
                arrayDeque.offer(obj);
            }
            m17707b();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f47973b, j);
                m17707b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new OnBackpressureBufferStrategySubscriber((FlowableSubscriber) subscriber));
    }
}
