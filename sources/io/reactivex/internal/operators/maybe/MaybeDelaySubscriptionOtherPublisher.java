package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48303a;

        public DelayMaybeObserver(MaybeObserver maybeObserver) {
            this.f48303a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48303a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48303a.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48303a.onSuccess(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OtherSubscriber<T> implements FlowableSubscriber<Object>, Disposable {

        /* JADX INFO: renamed from: a */
        public final DelayMaybeObserver f48304a;

        /* JADX INFO: renamed from: b */
        public Maybe f48305b;

        /* JADX INFO: renamed from: c */
        public Subscription f48306c;

        public OtherSubscriber(MaybeObserver maybeObserver, Maybe maybe) {
            this.f48304a = new DelayMaybeObserver(maybeObserver);
            this.f48305b = maybe;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(this.f48304a.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48306c.cancel();
            this.f48306c = SubscriptionHelper.f49266a;
            DisposableHelper.m17615a(this.f48304a);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48306c, subscription)) {
                this.f48306c = subscription;
                this.f48304a.f48303a.mo17586c(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = this.f48306c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
            if (subscription != subscriptionHelper) {
                this.f48306c = subscriptionHelper;
                Maybe maybe = this.f48305b;
                this.f48305b = null;
                maybe.mo17584a(this.f48304a);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Subscription subscription = this.f48306c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48306c = subscriptionHelper;
                this.f48304a.f48303a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = this.f48306c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
            if (subscription != subscriptionHelper) {
                subscription.cancel();
                this.f48306c = subscriptionHelper;
                Maybe maybe = this.f48305b;
                this.f48305b = null;
                maybe.mo17584a(this.f48304a);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        new OtherSubscriber(maybeObserver, this.f48278a);
        throw null;
    }
}
