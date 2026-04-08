package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTimeout<T, U, V> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutConsumer extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {
        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == SubscriptionHelper.f51214a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.m18221a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18224d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (obj == subscriptionHelper) {
                return;
            }
            lazySet(subscriptionHelper);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (obj == subscriptionHelper) {
                RxJavaPlugins.m18275b(th);
            } else {
                lazySet(subscriptionHelper);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = (Subscription) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (subscription == subscriptionHelper) {
                return;
            }
            subscription.cancel();
            lazySet(subscriptionHelper);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSelectorSupport {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo18094a(long j) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        /* JADX INFO: renamed from: b */
        public final void mo18095b(long j, Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18225e(null, subscription)) {
                m18220e(subscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TimeoutSelectorSupport extends FlowableTimeoutTimed.TimeoutSupport {
        /* JADX INFO: renamed from: b */
        void mo18095b(long j, Throwable th);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, TimeoutSelectorSupport {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50092a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f50093b = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50094c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f50095d = new AtomicLong();

        public TimeoutSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50092a = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: a */
        public final void mo18094a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.m18221a(this.f50094c);
                this.f50092a.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        /* JADX INFO: renamed from: b */
        public final void mo18095b(long j, Throwable th) {
            if (!compareAndSet(j, Long.MAX_VALUE)) {
                RxJavaPlugins.m18275b(th);
            } else {
                SubscriptionHelper.m18221a(this.f50094c);
                this.f50092a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m18221a(this.f50094c);
            SequentialDisposable sequentialDisposable = this.f50093b;
            sequentialDisposable.getClass();
            DisposableHelper.m17952a(sequentialDisposable);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18223c(this.f50094c, this.f50095d, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.f50093b;
                sequentialDisposable.getClass();
                DisposableHelper.m17952a(sequentialDisposable);
                this.f50092a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            SequentialDisposable sequentialDisposable = this.f50093b;
            sequentialDisposable.getClass();
            DisposableHelper.m17952a(sequentialDisposable);
            this.f50092a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = get();
            if (j == Long.MAX_VALUE || !compareAndSet(j, 1 + j)) {
                return;
            }
            Disposable disposable = this.f50093b.get();
            if (disposable != null) {
                disposable.dispose();
            }
            FlowableSubscriber flowableSubscriber = this.f50092a;
            flowableSubscriber.onNext(obj);
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                ((Subscription) this.f50094c.get()).cancel();
                getAndSet(Long.MAX_VALUE);
                flowableSubscriber.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m18222b(this.f50094c, this.f50095d, j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new TimeoutSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
