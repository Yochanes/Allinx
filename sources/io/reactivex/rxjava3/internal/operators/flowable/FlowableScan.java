package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableScan<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ScanSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49987a;

        /* JADX INFO: renamed from: b */
        public Subscription f49988b;

        /* JADX INFO: renamed from: c */
        public Object f49989c;

        /* JADX INFO: renamed from: d */
        public boolean f49990d;

        public ScanSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49987a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49988b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49988b, subscription)) {
                this.f49988b = subscription;
                this.f49987a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49990d) {
                return;
            }
            this.f49990d = true;
            this.f49987a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49990d) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49990d = true;
                this.f49987a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49990d) {
                return;
            }
            if (this.f49989c == null) {
                this.f49989c = obj;
                this.f49987a.onNext(obj);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49988b.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49988b.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new ScanSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
