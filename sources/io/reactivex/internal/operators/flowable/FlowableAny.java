package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableAny<T> extends AbstractFlowableWithUpstream<T, Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AnySubscriber<T> extends DeferredScalarSubscription<Boolean> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public Subscription f47654c;

        /* JADX INFO: renamed from: d */
        public boolean f47655d;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f47654c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47654c, subscription)) {
                this.f47654c = subscription;
                this.f49255a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47655d) {
                return;
            }
            this.f47655d = true;
            m17861d(Boolean.FALSE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47655d) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47655d = true;
                this.f49255a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47655d) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f47654c.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new AnySubscriber((FlowableSubscriber) subscriber));
    }
}
