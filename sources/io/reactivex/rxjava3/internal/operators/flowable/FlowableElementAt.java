package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableElementAt<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public Subscription f49701c;

        /* JADX INFO: renamed from: d */
        public long f49702d;

        /* JADX INFO: renamed from: f */
        public boolean f49703f;

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f49701c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49701c, subscription)) {
                this.f49701c = subscription;
                this.f51202a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49703f) {
                return;
            }
            this.f49703f = true;
            this.f51202a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49703f) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49703f = true;
                this.f51202a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49703f) {
                return;
            }
            long j = this.f49702d;
            if (j != 0) {
                this.f49702d = j + 1;
                return;
            }
            this.f49703f = true;
            this.f49701c.cancel();
            m18214d(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new ElementAtSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
