package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSkipWhile<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipWhileSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48133a;

        /* JADX INFO: renamed from: b */
        public Subscription f48134b;

        public SkipWhileSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48133a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48134b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48134b, subscription)) {
                this.f48134b = subscription;
                this.f48133a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48133a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48133a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            FlowableSubscriber flowableSubscriber = this.f48133a;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48134b.cancel();
                flowableSubscriber.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f48134b.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new SkipWhileSubscriber((FlowableSubscriber) subscriber));
    }
}
