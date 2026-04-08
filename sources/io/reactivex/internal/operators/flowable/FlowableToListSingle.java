package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToFlowable<U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ToListSubscriber<T, U extends Collection<? super T>> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Subscription f48199a;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48199a == SubscriptionHelper.f49266a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48199a.cancel();
            this.f48199a = SubscriptionHelper.f49266a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48199a, subscription)) {
                this.f48199a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48199a = SubscriptionHelper.f49266a;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48199a = SubscriptionHelper.f49266a;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptyDisposable.m17625h(th, singleObserver);
        }
    }
}
