package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableAll<T> extends AbstractFlowableWithUpstream<T, Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AllSubscriber<T> extends DeferredScalarSubscription<Boolean> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public Subscription f49577c;

        /* JADX INFO: renamed from: d */
        public boolean f49578d;

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f49577c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49577c, subscription)) {
                this.f49577c = subscription;
                this.f51202a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49578d) {
                return;
            }
            this.f49578d = true;
            m18214d(Boolean.TRUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49578d) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49578d = true;
                this.f51202a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49578d) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49577c.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new AllSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
