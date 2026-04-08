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
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Subscription f50014a;

        /* JADX INFO: renamed from: b */
        public boolean f50015b;

        /* JADX INFO: renamed from: c */
        public Object f50016c;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50014a == SubscriptionHelper.f51214a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50014a.cancel();
            this.f50014a = SubscriptionHelper.f51214a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50014a, subscription)) {
                this.f50014a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50015b) {
                return;
            }
            this.f50015b = true;
            this.f50014a = SubscriptionHelper.f51214a;
            Object obj = this.f50016c;
            this.f50016c = null;
            obj.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50015b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50015b = true;
                this.f50014a = SubscriptionHelper.f51214a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50015b) {
                return;
            }
            if (this.f50016c == null) {
                this.f50016c = obj;
                return;
            }
            this.f50015b = true;
            this.f50014a.cancel();
            this.f50014a = SubscriptionHelper.f51214a;
            new IllegalArgumentException("Sequence contains more than one element!");
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        throw null;
    }
}
