package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableAnySingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AnySubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Subscription f47656a;

        /* JADX INFO: renamed from: b */
        public boolean f47657b;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47656a == SubscriptionHelper.f49266a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47656a.cancel();
            this.f47656a = SubscriptionHelper.f49266a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47656a, subscription)) {
                this.f47656a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47657b) {
                return;
            }
            this.f47657b = true;
            this.f47656a = SubscriptionHelper.f49266a;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47657b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47657b = true;
                this.f47656a = SubscriptionHelper.f49266a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
            if (this.f47657b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f47656a.cancel();
                this.f47656a = subscriptionHelper;
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
