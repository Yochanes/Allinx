package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements SingleObserver<S>, FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f51041a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f51042b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public Disposable f51043c;

        public SingleFlatMapPublisherObserver(FlowableSubscriber flowableSubscriber) {
            this.f51041a = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            this.f51043c = disposable;
            this.f51041a.mo12367j(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f51043c.dispose();
            SubscriptionHelper.m18221a(this.f51042b);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18223c(this.f51042b, this, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f51041a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51041a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f51041a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f51041a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m18222b(this.f51042b, this, j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new SingleFlatMapPublisherObserver((FlowableSubscriber) subscriber);
        throw null;
    }
}
