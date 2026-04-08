package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSingle<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public Subscription f48108c;

        /* JADX INFO: renamed from: d */
        public boolean f48109d;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f48108c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48108c, subscription)) {
                this.f48108c = subscription;
                this.f49255a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48109d) {
                return;
            }
            this.f48109d = true;
            Object obj = this.f49256b;
            this.f49256b = null;
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                this.f49255a.onComplete();
            } else {
                m17861d(obj);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48109d) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48109d = true;
                this.f49255a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48109d) {
                return;
            }
            if (this.f49256b == null) {
                this.f49256b = obj;
                return;
            }
            this.f48109d = true;
            this.f48108c.cancel();
            this.f49255a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new SingleElementSubscriber((FlowableSubscriber) subscriber));
    }
}
