package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelReduce<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {

        /* JADX INFO: renamed from: d */
        public Object f49034d;

        /* JADX INFO: renamed from: f */
        public boolean f49035f;

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f49232c.cancel();
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f49232c, subscription)) {
                this.f49232c = subscription;
                this.f49255a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49035f) {
                return;
            }
            this.f49035f = true;
            Object obj = this.f49034d;
            this.f49034d = null;
            m17861d(obj);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49035f) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f49035f = true;
            this.f49034d = null;
            this.f49255a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49035f) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                cancel();
                onError(th);
            }
        }
    }
}
