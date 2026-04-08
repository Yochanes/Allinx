package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableElementAt<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public Subscription f47784c;

        /* JADX INFO: renamed from: d */
        public long f47785d;

        /* JADX INFO: renamed from: f */
        public boolean f47786f;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f47784c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47784c, subscription)) {
                this.f47784c = subscription;
                this.f49255a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47786f) {
                return;
            }
            this.f47786f = true;
            this.f49255a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47786f) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47786f = true;
                this.f49255a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47786f) {
                return;
            }
            long j = this.f47785d;
            if (j != 0) {
                this.f47785d = j + 1;
                return;
            }
            this.f47786f = true;
            this.f47784c.cancel();
            m17861d(obj);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new ElementAtSubscriber((FlowableSubscriber) subscriber));
    }
}
