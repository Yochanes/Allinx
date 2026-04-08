package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableZipIterable<T, U, V> extends AbstractFlowableWithUpstream<T, V> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipIterableSubscriber<T, U, V> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f48276a;

        /* JADX INFO: renamed from: b */
        public boolean f48277b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48276a.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48276a, subscription)) {
                this.f48276a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48277b) {
                return;
            }
            this.f48277b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48277b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48277b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f48276a.request(j);
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
