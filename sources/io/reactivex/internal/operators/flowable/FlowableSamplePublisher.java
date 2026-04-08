package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo17731a() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: b */
        public final void mo17732b() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: c */
        public final void mo17733c() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo17731a() {
            this.f48078a.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: b */
        public final void mo17732b() {
            this.f48078a.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* JADX INFO: renamed from: c */
        public final void mo17733c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f48079b;
                long j = atomicLong.get();
                SerializedSubscriber serializedSubscriber = this.f48078a;
                if (j != 0) {
                    serializedSubscriber.onNext(andSet);
                    BackpressureHelper.m17882e(atomicLong, 1L);
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
        public final SerializedSubscriber f48078a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f48079b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48080c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public Subscription f48081d;

        public SamplePublisherSubscriber(SerializedSubscriber serializedSubscriber) {
            this.f48078a = serializedSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo17731a();

        /* JADX INFO: renamed from: b */
        public abstract void mo17732b();

        /* JADX INFO: renamed from: c */
        public abstract void mo17733c();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m17867a(this.f48080c);
            this.f48081d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48081d, subscription)) {
                this.f48081d = subscription;
                this.f48078a.mo12367j(this);
                if (this.f48080c.get() == null) {
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.m17867a(this.f48080c);
            mo17731a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.m17867a(this.f48080c);
            this.f48078a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            lazySet(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f48079b, j);
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

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new SampleMainNoLast(new SerializedSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
