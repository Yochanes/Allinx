package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableReduceSeedSingle<T, R> extends Single<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ReduceSeedObserver<T, R> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Object f48027a;

        /* JADX INFO: renamed from: b */
        public Subscription f48028b;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48028b == SubscriptionHelper.f49266a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48028b.cancel();
            this.f48028b = SubscriptionHelper.f49266a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48028b, subscription)) {
                this.f48028b = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48027a == null) {
                return;
            }
            this.f48027a = null;
            this.f48028b = SubscriptionHelper.f49266a;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48027a == null) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48027a = null;
                this.f48028b = SubscriptionHelper.f49266a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48027a == null) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48028b.cancel();
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
