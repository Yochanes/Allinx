package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureDrop<T> extends AbstractFlowableWithUpstream<T, T> implements Consumer<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49884a;

        /* JADX INFO: renamed from: b */
        public Subscription f49885b;

        /* JADX INFO: renamed from: c */
        public boolean f49886c;

        public BackpressureDropSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49884a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49885b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49885b, subscription)) {
                this.f49885b = subscription;
                this.f49884a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49886c) {
                return;
            }
            this.f49886c = true;
            this.f49884a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49886c) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49886c = true;
                this.f49884a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49886c) {
                return;
            }
            if (get() != 0) {
                this.f49884a.onNext(obj);
                BackpressureHelper.m18241e(this, 1L);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this, j);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new BackpressureDropSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
    }
}
