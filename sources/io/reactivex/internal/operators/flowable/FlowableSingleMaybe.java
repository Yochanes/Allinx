package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSingleMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Subscription f48110a;

        /* JADX INFO: renamed from: b */
        public boolean f48111b;

        /* JADX INFO: renamed from: c */
        public Object f48112c;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48110a == SubscriptionHelper.f49266a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48110a.cancel();
            this.f48110a = SubscriptionHelper.f49266a;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48110a, subscription)) {
                this.f48110a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48111b) {
                return;
            }
            this.f48111b = true;
            this.f48110a = SubscriptionHelper.f49266a;
            this.f48112c = null;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48111b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48111b = true;
                this.f48110a = SubscriptionHelper.f49266a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48111b) {
                return;
            }
            if (this.f48112c == null) {
                this.f48112c = obj;
                return;
            }
            this.f48111b = true;
            this.f48110a.cancel();
            this.f48110a = SubscriptionHelper.f49266a;
            new IllegalArgumentException("Sequence contains more than one element!");
            throw null;
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        throw null;
    }
}
