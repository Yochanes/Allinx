package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelFilter<T> extends ParallelFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49014a;

        /* JADX INFO: renamed from: b */
        public boolean f49015b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49014a.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (mo17630f(obj) || this.f49015b) {
                return;
            }
            this.f49014a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49014a.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f49015b) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                cancel();
                onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f49014a, subscription)) {
                this.f49014a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49015b) {
                return;
            }
            this.f49015b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49015b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49015b = true;
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f49015b) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                cancel();
                onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f49014a, subscription)) {
                this.f49014a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49015b) {
                return;
            }
            this.f49015b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49015b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49015b = true;
                throw null;
            }
        }
    }
}
