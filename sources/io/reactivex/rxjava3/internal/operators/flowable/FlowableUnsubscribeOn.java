package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50100a;

        /* JADX INFO: renamed from: b */
        public Subscription f50101b;

        /* JADX INFO: compiled from: Proguard */
        public final class Cancellation implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public UnsubscribeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50100a = flowableSubscriber;
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
            if (SubscriptionHelper.m18227h(this.f50101b, subscription)) {
                this.f50101b = subscription;
                this.f50100a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f50100a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50100a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.f50100a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f50101b.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new UnsubscribeSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
