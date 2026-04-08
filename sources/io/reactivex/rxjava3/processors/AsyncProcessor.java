package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {

        /* JADX INFO: renamed from: c */
        public final AsyncProcessor f51264c;

        public AsyncSubscription(FlowableSubscriber flowableSubscriber, AsyncProcessor asyncProcessor) {
            super(flowableSubscriber);
            this.f51264c = asyncProcessor;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(4) == 4) {
                return;
            }
            this.f51264c.getClass();
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
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
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
        throw null;
    }
}
