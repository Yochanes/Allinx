package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59751 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49876a;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            f49876a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49876a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49877a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f49878b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final ArrayDeque f49879c = new ArrayDeque();

        /* JADX INFO: renamed from: d */
        public Subscription f49880d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f49881f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f49882g;

        /* JADX INFO: renamed from: i */
        public Throwable f49883i;

        public OnBackpressureBufferStrategySubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49877a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18051a(ArrayDeque arrayDeque) {
            synchronized (arrayDeque) {
                arrayDeque.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m18052b() {
            boolean zIsEmpty;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            ArrayDeque arrayDeque = this.f49879c;
            FlowableSubscriber flowableSubscriber = this.f49877a;
            int iAddAndGet = 1;
            do {
                long j = this.f49878b.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f49881f) {
                        m18051a(arrayDeque);
                        return;
                    }
                    boolean z2 = this.f49882g;
                    synchronized (arrayDeque) {
                        objPoll = arrayDeque.poll();
                    }
                    boolean z3 = objPoll == null;
                    if (z2) {
                        Throwable th = this.f49883i;
                        if (th != null) {
                            m18051a(arrayDeque);
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
                    if (this.f49881f) {
                        m18051a(arrayDeque);
                        return;
                    }
                    boolean z4 = this.f49882g;
                    synchronized (arrayDeque) {
                        zIsEmpty = arrayDeque.isEmpty();
                    }
                    if (z4) {
                        Throwable th2 = this.f49883i;
                        if (th2 != null) {
                            m18051a(arrayDeque);
                            flowableSubscriber.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            flowableSubscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m18241e(this.f49878b, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49881f = true;
            this.f49880d.cancel();
            if (getAndIncrement() == 0) {
                m18051a(this.f49879c);
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49880d, subscription)) {
                this.f49880d = subscription;
                this.f49877a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49882g = true;
            m18052b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49882g) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f49883i = th;
            this.f49882g = true;
            m18052b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49882g) {
                return;
            }
            ArrayDeque arrayDeque = this.f49879c;
            synchronized (arrayDeque) {
                if (arrayDeque.size() == 0) {
                    throw null;
                }
                arrayDeque.offer(obj);
            }
            m18052b();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f49878b, j);
                m18052b();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new OnBackpressureBufferStrategySubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
