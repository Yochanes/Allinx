package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelMap<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelMapConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f50981a;

        /* JADX INFO: renamed from: b */
        public boolean f50982b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50981a.cancel();
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f50982b) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                cancel();
                onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50981a, subscription)) {
                this.f50981a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50982b) {
                return;
            }
            this.f50982b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50982b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50982b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50982b) {
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

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f50981a.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelMapSubscriber<T, R> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f50983a;

        /* JADX INFO: renamed from: b */
        public boolean f50984b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50983a.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50983a, subscription)) {
                this.f50983a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50984b) {
                return;
            }
            this.f50984b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50984b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50984b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50984b) {
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

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f50983a.request(j);
        }
    }
}
