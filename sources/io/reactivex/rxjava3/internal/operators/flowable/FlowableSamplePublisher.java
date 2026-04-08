package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo18076a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: b */
        public final void mo18077b() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo18076a() {
            this.f49979a.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: b */
        public final void mo18077b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f49980b;
                long j = atomicLong.get();
                SerializedSubscriber serializedSubscriber = this.f49979a;
                if (j != 0) {
                    serializedSubscriber.onNext(andSet);
                    BackpressureHelper.m18241e(atomicLong, 1L);
                } else {
                    cancel();
                    serializedSubscriber.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SamplePublisherSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f49979a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f49980b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f49981c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public Subscription f49982d;

        public SamplePublisherSubscriber(SerializedSubscriber serializedSubscriber) {
            this.f49979a = serializedSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo18076a();

        /* JADX INFO: renamed from: b */
        public abstract void mo18077b();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m18221a(this.f49981c);
            this.f49982d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49982d, subscription)) {
                this.f49982d = subscription;
                this.f49979a.mo12367j(this);
                if (this.f49981c.get() == null) {
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.m18221a(this.f49981c);
            mo18076a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.m18221a(this.f49981c);
            this.f49979a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            lazySet(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f49980b, j);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SamplerSubscriber<T> implements FlowableSubscriber<Object> {
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            throw null;
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
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new SampleMainNoLast(new SerializedSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
