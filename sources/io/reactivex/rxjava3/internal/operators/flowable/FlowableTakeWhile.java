package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTakeWhile<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeWhileSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50081a;

        /* JADX INFO: renamed from: b */
        public Subscription f50082b;

        /* JADX INFO: renamed from: c */
        public boolean f50083c;

        public TakeWhileSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50081a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50082b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50082b, subscription)) {
                this.f50082b = subscription;
                this.f50081a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50083c) {
                return;
            }
            this.f50083c = true;
            this.f50081a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50083c) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50083c = true;
                this.f50081a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50083c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50082b.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f50082b.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new TakeWhileSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
