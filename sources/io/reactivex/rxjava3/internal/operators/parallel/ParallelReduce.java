package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelReduce<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {

        /* JADX INFO: renamed from: d */
        public Object f50992d;

        /* JADX INFO: renamed from: f */
        public boolean f50993f;

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f51180c.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f51180c, subscription)) {
                this.f51180c = subscription;
                this.f51202a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50993f) {
                return;
            }
            this.f50993f = true;
            Object obj = this.f50992d;
            this.f50992d = null;
            m18214d(obj);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50993f) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f50993f = true;
            this.f50992d = null;
            this.f51202a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50993f) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                cancel();
                onError(th);
            }
        }
    }
}
