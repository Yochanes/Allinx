package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableToList<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: c */
        public Subscription f48198c;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f48198c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48198c, subscription)) {
                this.f48198c = subscription;
                this.f49255a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            m17861d(this.f49256b);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49256b = null;
            this.f49255a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Collection collection = (Collection) this.f49256b;
            if (collection != null) {
                collection.add(obj);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptySubscription.m17863b(th, subscriber);
        }
    }
}
