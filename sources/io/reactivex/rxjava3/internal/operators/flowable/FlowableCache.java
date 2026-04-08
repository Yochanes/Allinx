package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableCache<T> extends AbstractFlowableWithUpstream<T, T> implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: b */
    public volatile long f49615b;

    /* JADX INFO: renamed from: c */
    public Node f49616c;

    /* JADX INFO: renamed from: d */
    public int f49617d;

    /* JADX INFO: compiled from: Proguard */
    public static final class CacheSubscription<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49618a;

        /* JADX INFO: renamed from: b */
        public final FlowableCache f49619b;

        /* JADX INFO: renamed from: f */
        public int f49622f;

        /* JADX INFO: renamed from: g */
        public long f49623g;

        /* JADX INFO: renamed from: d */
        public Node f49621d = null;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f49620c = new AtomicLong();

        public CacheSubscription(FlowableSubscriber flowableSubscriber, FlowableCache flowableCache) {
            this.f49618a = flowableSubscriber;
            this.f49619b = flowableCache;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49620c.getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f49619b.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (!SubscriptionHelper.m18226f(j)) {
                return;
            }
            BackpressureHelper.m18238b(this.f49620c, j);
            FlowableCache flowableCache = this.f49619b;
            flowableCache.getClass();
            if (getAndIncrement() != 0) {
                return;
            }
            long j2 = this.f49623g;
            int i = this.f49622f;
            Node node = this.f49621d;
            AtomicLong atomicLong = this.f49620c;
            FlowableSubscriber flowableSubscriber = this.f49618a;
            int iAddAndGet = 1;
            while (true) {
                boolean z2 = flowableCache.f49615b == j2;
                if (z2) {
                    this.f49621d = null;
                    flowableSubscriber.onComplete();
                    return;
                }
                if (!z2) {
                    long j3 = atomicLong.get();
                    if (j3 == Long.MIN_VALUE) {
                        this.f49621d = null;
                        return;
                    } else if (j3 != j2) {
                        if (i == 0) {
                            node = node.f49625b;
                            i = 0;
                        }
                        flowableSubscriber.onNext(node.f49624a[i]);
                        i++;
                        j2++;
                    }
                }
                this.f49623g = j2;
                this.f49622f = i;
                this.f49621d = node;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Node<T> {

        /* JADX INFO: renamed from: a */
        public final Object[] f49624a;

        /* JADX INFO: renamed from: b */
        public volatile Node f49625b;

        public Node(int i) {
            this.f49624a = new Object[i];
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new CacheSubscription((FlowableSubscriber) subscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        RxJavaPlugins.m18275b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        int i = this.f49617d;
        if (i == 0) {
            Node node = new Node(i);
            node.f49624a[0] = obj;
            this.f49617d = 1;
            this.f49616c.f49625b = node;
            this.f49616c = node;
        } else {
            this.f49616c.f49624a[i] = obj;
            this.f49617d = i + 1;
        }
        this.f49615b++;
        throw null;
    }
}
