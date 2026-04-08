package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFlatMapPublisher<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapPublisherSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R>, MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48468a;

        /* JADX INFO: renamed from: b */
        public Disposable f48469b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f48470c = new AtomicLong();

        public FlatMapPublisherSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48468a = flowableSubscriber;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48469b, disposable)) {
                this.f48469b = disposable;
                this.f48468a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48469b.dispose();
            SubscriptionHelper.m17867a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17869c(this, this.f48470c, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48468a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48468a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f48468a.onNext(obj);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48468a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m17868b(this, this.f48470c, j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new FlatMapPublisherSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
