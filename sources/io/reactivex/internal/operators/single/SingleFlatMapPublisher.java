package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
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
        public final FlowableSubscriber f49075a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f49076b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public Disposable f49077c;

        public SingleFlatMapPublisherObserver(FlowableSubscriber flowableSubscriber) {
            this.f49075a = flowableSubscriber;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            this.f49077c = disposable;
            this.f49075a.mo12367j(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49077c.dispose();
            SubscriptionHelper.m17867a(this.f49076b);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17869c(this.f49076b, this, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49075a.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49075a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49075a.onNext(obj);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f49075a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m17868b(this.f49076b, this, j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new SingleFlatMapPublisherObserver((FlowableSubscriber) subscriber);
        throw null;
    }
}
