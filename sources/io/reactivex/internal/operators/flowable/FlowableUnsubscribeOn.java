package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48200a;

        /* JADX INFO: renamed from: b */
        public Subscription f48201b;

        /* JADX INFO: compiled from: Proguard */
        public final class Cancellation implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public UnsubscribeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48200a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48201b, subscription)) {
                this.f48201b = subscription;
                this.f48200a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f48200a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48200a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.f48200a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f48201b.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new UnsubscribeSubscriber((FlowableSubscriber) subscriber));
    }
}
