package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48203a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f48204b;

        /* JADX INFO: renamed from: c */
        public long f48205c;

        /* JADX INFO: renamed from: d */
        public Subscription f48206d;

        /* JADX INFO: renamed from: f */
        public UnicastProcessor f48207f;

        public WindowExactSubscriber(FlowableSubscriber flowableSubscriber) {
            super(1);
            this.f48203a = flowableSubscriber;
            this.f48204b = new AtomicBoolean();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f48204b.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48206d, subscription)) {
                this.f48206d = subscription;
                this.f48203a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            UnicastProcessor unicastProcessor = this.f48207f;
            if (unicastProcessor != null) {
                this.f48207f = null;
                unicastProcessor.onComplete();
            }
            this.f48203a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            UnicastProcessor unicastProcessor = this.f48207f;
            if (unicastProcessor != null) {
                this.f48207f = null;
                unicastProcessor.onError(th);
            }
            this.f48203a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.f48205c;
            UnicastProcessor unicastProcessor = this.f48207f;
            if (j == 0) {
                getAndIncrement();
                unicastProcessor = new UnicastProcessor(this, 0);
                this.f48207f = unicastProcessor;
                this.f48203a.onNext(unicastProcessor);
            }
            long j2 = j + 1;
            unicastProcessor.onNext(obj);
            if (j2 != 0) {
                this.f48205c = j2;
                return;
            }
            this.f48205c = 0L;
            this.f48207f = null;
            unicastProcessor.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                this.f48206d.request(BackpressureHelper.m17881d(0L, j));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f48206d.cancel();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public Subscription f48208a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f48209b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48209b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48208a, subscription)) {
                this.f48208a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (0 != 0 || this.f48209b) {
                throw null;
            }
            getAndIncrement();
            new UnicastProcessor(this, 0);
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(null, j);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f48208a.cancel();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public long f48210a;

        /* JADX INFO: renamed from: b */
        public Subscription f48211b;

        /* JADX INFO: renamed from: c */
        public UnicastProcessor f48212c;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48211b, subscription)) {
                this.f48211b = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            UnicastProcessor unicastProcessor = this.f48212c;
            if (unicastProcessor == null) {
                throw null;
            }
            this.f48212c = null;
            unicastProcessor.onComplete();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            UnicastProcessor unicastProcessor = this.f48212c;
            if (unicastProcessor == null) {
                throw null;
            }
            this.f48212c = null;
            unicastProcessor.onError(th);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.f48210a;
            UnicastProcessor unicastProcessor = this.f48212c;
            if (j == 0) {
                getAndIncrement();
                this.f48212c = new UnicastProcessor(this, 0);
                throw null;
            }
            long j2 = j + 1;
            if (unicastProcessor != null) {
                unicastProcessor.onNext(obj);
            }
            if (j2 == 0) {
                this.f48212c = null;
                unicastProcessor.onComplete();
            }
            if (j2 == 0) {
                this.f48210a = 0L;
            } else {
                this.f48210a = j2;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f48211b.cancel();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new WindowExactSubscriber((FlowableSubscriber) subscriber));
    }
}
