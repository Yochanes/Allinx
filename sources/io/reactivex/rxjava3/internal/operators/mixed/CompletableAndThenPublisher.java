package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<Subscription> implements FlowableSubscriber<R>, CompletableObserver, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50283a;

        /* JADX INFO: renamed from: b */
        public Disposable f50284b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f50285c = new AtomicLong();

        public AndThenPublisherSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50283a = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50284b, disposable)) {
                this.f50284b = disposable;
                this.f50283a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50284b.dispose();
            SubscriptionHelper.m18221a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18223c(this, this.f50285c, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50283a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f50283a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f50283a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m18222b(this, this.f50285c, j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new AndThenPublisherSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
