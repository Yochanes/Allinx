package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelPeek<T> extends ParallelFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelPeekSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f50990a;

        /* JADX INFO: renamed from: b */
        public boolean f50991b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
                this.f50990a.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50990a, subscription)) {
                this.f50990a = subscription;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    subscription.cancel();
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50991b) {
                return;
            }
            this.f50991b = true;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50991b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
                this.f50990a.request(j);
            }
        }
    }
}
