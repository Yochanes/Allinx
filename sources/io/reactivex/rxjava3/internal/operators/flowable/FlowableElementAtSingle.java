package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableElementAtSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Subscription f49706a;

        /* JADX INFO: renamed from: b */
        public boolean f49707b;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49706a == SubscriptionHelper.f51214a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49706a.cancel();
            this.f49706a = SubscriptionHelper.f51214a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49706a, subscription)) {
                this.f49706a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49706a = SubscriptionHelper.f51214a;
            if (this.f49707b) {
                return;
            }
            this.f49707b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49707b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49707b = true;
                this.f49706a = SubscriptionHelper.f51214a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!this.f49707b) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        throw null;
    }
}
