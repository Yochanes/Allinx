package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatWithSubscriber<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, CompletableObserver, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47718a;

        /* JADX INFO: renamed from: b */
        public Subscription f47719b;

        /* JADX INFO: renamed from: c */
        public boolean f47720c;

        public ConcatWithSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47718a = flowableSubscriber;
        }

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47719b.cancel();
            DisposableHelper.m17615a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47719b, subscription)) {
                this.f47719b = subscription;
                this.f47718a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47720c) {
                this.f47718a.onComplete();
            } else {
                this.f47720c = true;
                this.f47719b = SubscriptionHelper.f49266a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47718a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f47718a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f47719b.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new ConcatWithSubscriber((FlowableSubscriber) subscriber));
    }
}
