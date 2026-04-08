package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
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
        public final FlowableSubscriber f47658a;

        /* JADX INFO: renamed from: b */
        public Collection f47659b;

        /* JADX INFO: renamed from: c */
        public Subscription f47660c;

        /* JADX INFO: renamed from: d */
        public boolean f47661d;

        /* JADX INFO: renamed from: f */
        public int f47662f;

        public PublisherBufferExactSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47658a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47660c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47660c, subscription)) {
                this.f47660c = subscription;
                this.f47658a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47661d) {
                return;
            }
            this.f47661d = true;
            Collection collection = this.f47659b;
            FlowableSubscriber flowableSubscriber = this.f47658a;
            if (collection != null && !collection.isEmpty()) {
                flowableSubscriber.onNext(collection);
            }
            flowableSubscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47661d) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47661d = true;
                this.f47658a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47661d) {
                return;
            }
            Collection collection = this.f47659b;
            if (collection == null) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            collection.add(obj);
            int i = this.f47662f + 1;
            if (i != 0) {
                this.f47662f = i;
                return;
            }
            this.f47662f = 0;
            this.f47659b = null;
            this.f47658a.onNext(collection);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                this.f47660c.request(BackpressureHelper.m17881d(j, 0));
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, Subscription, BooleanSupplier {

        /* JADX INFO: renamed from: a */
        public Subscription f47663a;

        /* JADX INFO: renamed from: b */
        public boolean f47664b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f47665c;

        @Override // io.reactivex.functions.BooleanSupplier
        /* JADX INFO: renamed from: a */
        public final boolean mo17613a() {
            return this.f47665c;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47665c = true;
            this.f47663a.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47663a, subscription)) {
                this.f47663a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47664b) {
                return;
            }
            this.f47664b = true;
            if (0 != 0) {
                BackpressureHelper.m17882e(this, 0L);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47664b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47664b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47664b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            if (!SubscriptionHelper.m17873h(j)) {
                return;
            }
            do {
                j2 = get();
            } while (!compareAndSet(j2, BackpressureHelper.m17880c(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
            ArrayDeque arrayDeque = null;
            if (j2 != Long.MIN_VALUE) {
                throw null;
            }
            long j3 = j | Long.MIN_VALUE;
            long j4 = j3 & Long.MIN_VALUE;
            while (true) {
                boolean zMo17613a = true;
                if (j4 != j3) {
                    try {
                        zMo17613a = mo17613a();
                    } catch (Throwable th) {
                        Exceptions.m17612a(th);
                    }
                    if (zMo17613a) {
                        return;
                    }
                    arrayDeque.poll().getClass();
                    throw null;
                }
                try {
                    zMo17613a = mo17613a();
                } catch (Throwable th2) {
                    Exceptions.m17612a(th2);
                }
                if (zMo17613a) {
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
        public Collection f47666a;

        /* JADX INFO: renamed from: b */
        public Subscription f47667b;

        /* JADX INFO: renamed from: c */
        public boolean f47668c;

        /* JADX INFO: renamed from: d */
        public int f47669d;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47667b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47667b, subscription)) {
                this.f47667b = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47668c) {
                return;
            }
            this.f47668c = true;
            Collection collection = this.f47666a;
            this.f47666a = null;
            collection.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47668c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47668c = true;
                this.f47666a = null;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47668c) {
                return;
            }
            Collection collection = this.f47666a;
            int i = this.f47669d;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (collection != null) {
                collection.add(obj);
                if (collection.size() == 0) {
                    this.f47666a = null;
                    throw null;
                }
            }
            if (i2 == 0) {
                i2 = 0;
            }
            this.f47669d = i2;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.f47667b.request(BackpressureHelper.m17881d(0, j));
                    return;
                }
                this.f47667b.request(BackpressureHelper.m17880c(BackpressureHelper.m17881d(j, 0), BackpressureHelper.m17881d(0, j - 1)));
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new PublisherBufferExactSubscriber((FlowableSubscriber) subscriber));
    }
}
