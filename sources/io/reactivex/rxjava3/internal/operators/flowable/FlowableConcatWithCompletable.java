package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatWithSubscriber<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, CompletableObserver, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49656a;

        /* JADX INFO: renamed from: b */
        public Subscription f49657b;

        /* JADX INFO: renamed from: c */
        public boolean f49658c;

        public ConcatWithSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49656a = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49657b.cancel();
            DisposableHelper.m17952a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49657b, subscription)) {
                this.f49657b = subscription;
                this.f49656a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49658c) {
                this.f49656a.onComplete();
            } else {
                this.f49658c = true;
                this.f49657b = SubscriptionHelper.f51214a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49656a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49656a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49657b.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new ConcatWithSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
