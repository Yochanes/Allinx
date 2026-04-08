package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new SubscriptionArbiter());
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public final class DelaySubscriber implements FlowableSubscriber<U> {

        /* JADX INFO: renamed from: a */
        public boolean f47747a;

        /* JADX INFO: compiled from: Proguard */
        public final class OnCompleteSubscriber implements FlowableSubscriber<T> {
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

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47747a) {
                return;
            }
            this.f47747a = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47747a) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47747a = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            onComplete();
        }

        /* JADX INFO: compiled from: Proguard */
        public final class DelaySubscription implements Subscription {
            @Override // org.reactivestreams.Subscription
            public final void cancel() {
                throw null;
            }

            @Override // org.reactivestreams.Subscription
            public final void request(long j) {
            }
        }
    }
}
