package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
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
        public final FlowableSubscriber f48399a;

        /* JADX INFO: renamed from: b */
        public Disposable f48400b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f48401c = new AtomicLong();

        public AndThenPublisherSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48399a = flowableSubscriber;
        }

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48400b, disposable)) {
                this.f48400b = disposable;
                this.f48399a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48400b.dispose();
            SubscriptionHelper.m17867a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17869c(this, this.f48401c, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48399a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48399a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f48399a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m17868b(this, this.f48401c, j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new AndThenPublisherSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
