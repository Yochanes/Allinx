package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableWithLatestFromMany<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public final class SingletonArrayFunc implements Function<T, R> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WithLatestFromSubscriber<T, R> extends AtomicInteger implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public volatile boolean f48270a;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m17867a(null);
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f48270a) {
                return false;
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17869c(null, null, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48270a) {
                return;
            }
            this.f48270a = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48270a) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48270a = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17630f(obj);
            if (!this.f48270a) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m17868b(null, null, j);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WithLatestInnerSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: a */
        public boolean f48271a;

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17871e(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (!this.f48271a) {
                throw null;
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!this.f48271a) {
                this.f48271a = true;
            }
            throw null;
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
