package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Subscription f48113a;

        /* JADX INFO: renamed from: b */
        public boolean f48114b;

        /* JADX INFO: renamed from: c */
        public Object f48115c;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48113a == SubscriptionHelper.f49266a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48113a.cancel();
            this.f48113a = SubscriptionHelper.f49266a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48113a, subscription)) {
                this.f48113a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48114b) {
                return;
            }
            this.f48114b = true;
            this.f48113a = SubscriptionHelper.f49266a;
            Object obj = this.f48115c;
            this.f48115c = null;
            obj.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48114b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48114b = true;
                this.f48113a = SubscriptionHelper.f49266a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48114b) {
                return;
            }
            if (this.f48115c == null) {
                this.f48115c = obj;
                return;
            }
            this.f48114b = true;
            this.f48113a.cancel();
            this.f48113a = SubscriptionHelper.f49266a;
            new IllegalArgumentException("Sequence contains more than one element!");
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
