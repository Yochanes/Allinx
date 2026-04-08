package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50200a;

        public DelayMaybeObserver(MaybeObserver maybeObserver) {
            this.f50200a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50200a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50200a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50200a.onSuccess(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OtherSubscriber<T> implements FlowableSubscriber<Object>, Disposable {

        /* JADX INFO: renamed from: a */
        public final DelayMaybeObserver f50201a;

        /* JADX INFO: renamed from: b */
        public Subscription f50202b;

        public OtherSubscriber(MaybeObserver maybeObserver) {
            this.f50201a = new DelayMaybeObserver(maybeObserver);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(this.f50201a.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50202b.cancel();
            this.f50202b = SubscriptionHelper.f51214a;
            DisposableHelper.m17952a(this.f50201a);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50202b, subscription)) {
                this.f50202b = subscription;
                this.f50201a.f50200a.mo12364c(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = this.f50202b;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (subscription == subscriptionHelper) {
                return;
            }
            this.f50202b = subscriptionHelper;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Subscription subscription = this.f50202b;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50202b = subscriptionHelper;
                this.f50201a.f50200a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = this.f50202b;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (subscription == subscriptionHelper) {
                return;
            }
            subscription.cancel();
            this.f50202b = subscriptionHelper;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        new OtherSubscriber(maybeObserver);
        throw null;
    }
}
