package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class PublishSubscription<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f51272a;

        /* JADX INFO: renamed from: b */
        public final PublishProcessor f51273b;

        public PublishSubscription(FlowableSubscriber flowableSubscriber, PublishProcessor publishProcessor) {
            this.f51272a = flowableSubscriber;
            this.f51273b = publishProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f51273b.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18238b(this, j);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new PublishSubscription((FlowableSubscriber) subscriber, this));
        throw null;
    }

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
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
        throw null;
    }
}
