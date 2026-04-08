package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelFilter<T> extends ParallelFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f50972a;

        /* JADX INFO: renamed from: b */
        public boolean f50973b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50972a.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (mo17969f(obj) || this.f50973b) {
                return;
            }
            this.f50972a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f50972a.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {
        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f50973b) {
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
            if (SubscriptionHelper.m18227h(this.f50972a, subscription)) {
                this.f50972a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50973b) {
                return;
            }
            this.f50973b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50973b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50973b = true;
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {
        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f50973b) {
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
            if (SubscriptionHelper.m18227h(this.f50972a, subscription)) {
                this.f50972a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50973b) {
                return;
            }
            this.f50973b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50973b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50973b = true;
                throw null;
            }
        }
    }
}
