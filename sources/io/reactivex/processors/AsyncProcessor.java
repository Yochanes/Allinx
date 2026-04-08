package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {

        /* JADX INFO: renamed from: c */
        public final AsyncProcessor f49299c;

        public AsyncSubscription(FlowableSubscriber flowableSubscriber, AsyncProcessor asyncProcessor) {
            super(flowableSubscriber);
            this.f49299c = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(4) == 4) {
                return;
            }
            this.f49299c.getClass();
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new AsyncSubscription((FlowableSubscriber) subscriber, this));
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
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
