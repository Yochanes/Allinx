package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableAnySingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AnySubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Subscription f49583a;

        /* JADX INFO: renamed from: b */
        public boolean f49584b;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49583a == SubscriptionHelper.f51214a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49583a.cancel();
            this.f49583a = SubscriptionHelper.f51214a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49583a, subscription)) {
                this.f49583a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49584b) {
                return;
            }
            this.f49584b = true;
            this.f49583a = SubscriptionHelper.f51214a;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49584b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49584b = true;
                this.f49583a = SubscriptionHelper.f51214a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (this.f49584b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49583a.cancel();
                this.f49583a = subscriptionHelper;
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        throw null;
    }
}
