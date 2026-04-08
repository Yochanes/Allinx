package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.flowables.GroupedFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableGroupBy<T, K, V> extends AbstractFlowableWithUpstream<T, GroupedFlowable<K, V>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EvictionAction<K, V> implements Consumer<GroupedUnicast<K, V>> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class GroupBySubscriber<T, K, V> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: n */
        public static final Object f49770n = new Object();

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49771a;

        /* JADX INFO: renamed from: c */
        public final ConcurrentHashMap f49773c;

        /* JADX INFO: renamed from: d */
        public Subscription f49774d;

        /* JADX INFO: renamed from: j */
        public boolean f49778j;

        /* JADX INFO: renamed from: f */
        public final AtomicBoolean f49775f = new AtomicBoolean();

        /* JADX INFO: renamed from: g */
        public final AtomicInteger f49776g = new AtomicInteger(1);

        /* JADX INFO: renamed from: i */
        public final AtomicLong f49777i = new AtomicLong();

        /* JADX INFO: renamed from: b */
        public final int f49772b = 0;

        public GroupBySubscriber(FlowableSubscriber flowableSubscriber, ConcurrentHashMap concurrentHashMap) {
            this.f49771a = flowableSubscriber;
            this.f49773c = concurrentHashMap;
        }

        /* JADX INFO: renamed from: a */
        public final void m18025a(long j) {
            long j2;
            long jM18239c;
            AtomicLong atomicLong = this.f49777i;
            do {
                j2 = atomicLong.get();
                jM18239c = BackpressureHelper.m18239c(j2, j);
            } while (!atomicLong.compareAndSet(j2, jM18239c));
            while (true) {
                long j3 = this.f49772b;
                if (jM18239c < j3) {
                    return;
                }
                if (atomicLong.compareAndSet(jM18239c, jM18239c - j3)) {
                    this.f49774d.request(j3);
                }
                jM18239c = atomicLong.get();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49775f.compareAndSet(false, true) && this.f49776g.decrementAndGet() == 0) {
                this.f49774d.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49774d, subscription)) {
                this.f49774d = subscription;
                this.f49771a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49778j) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = this.f49773c;
            Iterator<V> it = concurrentHashMap.values().iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            concurrentHashMap.clear();
            this.f49778j = true;
            this.f49771a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49778j) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f49778j = true;
            Iterator<V> it = this.f49773c.values().iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            this.f49773c.clear();
            this.f49771a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49778j) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49774d.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this, j);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class GroupedUnicast<K, T> extends GroupedFlowable<K, T> {
        @Override // io.reactivex.rxjava3.core.Flowable
        /* JADX INFO: renamed from: b */
        public final void mo12359b(Subscriber subscriber) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements Publisher<T> {

        /* JADX INFO: renamed from: a */
        public volatile boolean f49779a;

        /* JADX INFO: renamed from: b */
        public Throwable f49780b;

        /* JADX INFO: renamed from: c */
        public int f49781c;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m18026d(boolean z2, boolean z3, Subscriber subscriber, long j, boolean z4) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 0;
        }

        @Override // org.reactivestreams.Publisher
        /* JADX INFO: renamed from: g */
        public final void mo15432g(Subscriber subscriber) {
            throw null;
        }

        /* JADX INFO: renamed from: h */
        public final void m18027h(long j, boolean z2) {
            if (z2) {
                j++;
            }
            if (j != 0) {
                m18028i(j);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m18028i(long j) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        /* JADX INFO: renamed from: k */
        public final void m18029k() {
            int i = this.f49781c;
            if (i != 0) {
                this.f49781c = 0;
                m18028i(i);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(null, j);
                if (getAndIncrement() == 0) {
                    throw null;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        try {
            new GroupBySubscriber((FlowableSubscriber) subscriber, new ConcurrentHashMap());
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            subscriber.mo12367j(EmptyComponent.f51222a);
            subscriber.onError(th);
        }
    }
}
