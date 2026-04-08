package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {

    /* JADX INFO: compiled from: Proguard */
    public static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49585a;

        /* JADX INFO: renamed from: b */
        public Collection f49586b;

        /* JADX INFO: renamed from: c */
        public Subscription f49587c;

        /* JADX INFO: renamed from: d */
        public boolean f49588d;

        /* JADX INFO: renamed from: f */
        public int f49589f;

        public PublisherBufferExactSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49585a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49587c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49587c, subscription)) {
                this.f49587c = subscription;
                this.f49585a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49588d) {
                return;
            }
            this.f49588d = true;
            Collection collection = this.f49586b;
            this.f49586b = null;
            FlowableSubscriber flowableSubscriber = this.f49585a;
            if (collection != null) {
                flowableSubscriber.onNext(collection);
            }
            flowableSubscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49588d) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f49586b = null;
            this.f49588d = true;
            this.f49585a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49588d) {
                return;
            }
            Collection collection = this.f49586b;
            if (collection == null) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            collection.add(obj);
            int i = this.f49589f + 1;
            if (i != 0) {
                this.f49589f = i;
                return;
            }
            this.f49589f = 0;
            this.f49586b = null;
            this.f49585a.onNext(collection);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                this.f49587c.request(BackpressureHelper.m18240d(j, 0));
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, Subscription, BooleanSupplier {

        /* JADX INFO: renamed from: a */
        public Subscription f49590a;

        /* JADX INFO: renamed from: b */
        public boolean f49591b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f49592c;

        @Override // io.reactivex.rxjava3.functions.BooleanSupplier
        /* JADX INFO: renamed from: a */
        public final boolean mo15172a() {
            return this.f49592c;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49592c = true;
            this.f49590a.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49590a, subscription)) {
                this.f49590a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49591b) {
                return;
            }
            this.f49591b = true;
            if (0 != 0) {
                BackpressureHelper.m18241e(this, 0L);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49591b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49591b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49591b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            if (!SubscriptionHelper.m18226f(j)) {
                return;
            }
            do {
                j2 = get();
            } while (!compareAndSet(j2, BackpressureHelper.m18239c(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
            ArrayDeque arrayDeque = null;
            if (j2 != Long.MIN_VALUE) {
                throw null;
            }
            long j3 = j | Long.MIN_VALUE;
            long j4 = j3 & Long.MIN_VALUE;
            while (true) {
                boolean zMo15172a = true;
                if (j4 != j3) {
                    try {
                        zMo15172a = mo15172a();
                    } catch (Throwable th) {
                        Exceptions.m17950a(th);
                    }
                    if (zMo15172a) {
                        return;
                    }
                    arrayDeque.poll().getClass();
                    throw null;
                }
                try {
                    zMo15172a = mo15172a();
                } catch (Throwable th2) {
                    Exceptions.m17950a(th2);
                }
                if (zMo15172a) {
                    return;
                }
                if (arrayDeque.isEmpty()) {
                    throw null;
                }
                j3 = get();
                if (j3 == j4) {
                    long jAddAndGet = addAndGet(-(j4 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return;
                    }
                    j4 = jAddAndGet & Long.MIN_VALUE;
                    j3 = jAddAndGet;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Collection f49593a;

        /* JADX INFO: renamed from: b */
        public Subscription f49594b;

        /* JADX INFO: renamed from: c */
        public boolean f49595c;

        /* JADX INFO: renamed from: d */
        public int f49596d;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49594b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49594b, subscription)) {
                this.f49594b = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49595c) {
                return;
            }
            this.f49595c = true;
            Collection collection = this.f49593a;
            this.f49593a = null;
            collection.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49595c) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49595c = true;
                this.f49593a = null;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49595c) {
                return;
            }
            Collection collection = this.f49593a;
            int i = this.f49596d;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (collection != null) {
                collection.add(obj);
                if (collection.size() == 0) {
                    this.f49593a = null;
                    throw null;
                }
            }
            if (i2 == 0) {
                i2 = 0;
            }
            this.f49596d = i2;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.f49594b.request(BackpressureHelper.m18240d(0, j));
                    return;
                }
                this.f49594b.request(BackpressureHelper.m18239c(BackpressureHelper.m18240d(j, 0), BackpressureHelper.m18240d(0, j - 1)));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new PublisherBufferExactSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
