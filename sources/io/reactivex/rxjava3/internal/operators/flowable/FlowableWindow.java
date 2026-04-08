package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.processors.UnicastProcessor;
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
        public final FlowableSubscriber f50103a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f50104b;

        /* JADX INFO: renamed from: c */
        public long f50105c;

        /* JADX INFO: renamed from: d */
        public Subscription f50106d;

        /* JADX INFO: renamed from: f */
        public UnicastProcessor f50107f;

        public WindowExactSubscriber(FlowableSubscriber flowableSubscriber) {
            super(1);
            this.f50103a = flowableSubscriber;
            this.f50104b = new AtomicBoolean();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f50104b.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50106d, subscription)) {
                this.f50106d = subscription;
                this.f50103a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            UnicastProcessor unicastProcessor = this.f50107f;
            if (unicastProcessor != null) {
                this.f50107f = null;
                unicastProcessor.onComplete();
            }
            this.f50103a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            UnicastProcessor unicastProcessor = this.f50107f;
            if (unicastProcessor != null) {
                this.f50107f = null;
                unicastProcessor.onError(th);
            }
            this.f50103a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            FlowableWindowSubscribeIntercept flowableWindowSubscribeIntercept;
            long j = this.f50105c;
            UnicastProcessor unicastProcessorM18278h = this.f50107f;
            if (j == 0) {
                getAndIncrement();
                unicastProcessorM18278h = UnicastProcessor.m18278h(this, 0);
                this.f50107f = unicastProcessorM18278h;
                flowableWindowSubscribeIntercept = new FlowableWindowSubscribeIntercept(unicastProcessorM18278h);
                this.f50103a.onNext(flowableWindowSubscribeIntercept);
            } else {
                flowableWindowSubscribeIntercept = null;
            }
            long j2 = j + 1;
            unicastProcessorM18278h.onNext(obj);
            if (j2 == 0) {
                this.f50105c = 0L;
                this.f50107f = null;
                unicastProcessorM18278h.onComplete();
            } else {
                this.f50105c = j2;
            }
            if (flowableWindowSubscribeIntercept == null || !flowableWindowSubscribeIntercept.m18099c()) {
                return;
            }
            flowableWindowSubscribeIntercept.f50143b.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                this.f50106d.request(BackpressureHelper.m18240d(0L, j));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f50106d.cancel();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public Subscription f50108a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f50109b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50109b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50108a, subscription)) {
                this.f50108a = subscription;
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
            if (0 != 0 || this.f50109b) {
                throw null;
            }
            getAndIncrement();
            UnicastProcessor.m18278h(this, 0);
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(null, j);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f50108a.cancel();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public long f50110a;

        /* JADX INFO: renamed from: b */
        public Subscription f50111b;

        /* JADX INFO: renamed from: c */
        public UnicastProcessor f50112c;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50111b, subscription)) {
                this.f50111b = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            UnicastProcessor unicastProcessor = this.f50112c;
            if (unicastProcessor == null) {
                throw null;
            }
            this.f50112c = null;
            unicastProcessor.onComplete();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            UnicastProcessor unicastProcessor = this.f50112c;
            if (unicastProcessor == null) {
                throw null;
            }
            this.f50112c = null;
            unicastProcessor.onError(th);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.f50110a;
            UnicastProcessor unicastProcessor = this.f50112c;
            if (j == 0) {
                getAndIncrement();
                UnicastProcessor unicastProcessorM18278h = UnicastProcessor.m18278h(this, 0);
                this.f50112c = unicastProcessorM18278h;
                new FlowableWindowSubscribeIntercept(unicastProcessorM18278h);
                throw null;
            }
            long j2 = j + 1;
            if (unicastProcessor != null) {
                unicastProcessor.onNext(obj);
            }
            if (j2 == 0) {
                this.f50112c = null;
                unicastProcessor.onComplete();
            }
            if (j2 == 0) {
                this.f50110a = 0L;
            } else {
                this.f50110a = j2;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f50111b.cancel();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new WindowExactSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
