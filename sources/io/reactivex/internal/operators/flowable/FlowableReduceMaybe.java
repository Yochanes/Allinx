package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableReduceMaybe<T> extends Maybe<T> implements HasUpstreamPublisher<T>, FuseToFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ReduceSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Object f48024a;

        /* JADX INFO: renamed from: b */
        public Subscription f48025b;

        /* JADX INFO: renamed from: c */
        public boolean f48026c;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48026c;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48025b.cancel();
            this.f48026c = true;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48025b, subscription)) {
                this.f48025b = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48026c) {
                return;
            }
            this.f48026c = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48026c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48026c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48026c) {
                return;
            }
            if (this.f48024a == null) {
                this.f48024a = obj;
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48025b.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        throw null;
    }
}
