package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: f */
        public final AtomicReference f49661f;

        public ConcatWithSubscriber(FlowableSubscriber flowableSubscriber) {
            super(flowableSubscriber);
            this.f49661f = new AtomicReference();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            DisposableHelper.m17955e(this.f49661f, disposable);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            DisposableHelper.m17952a(this.f49661f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f51193b = SubscriptionHelper.f51214a;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f51192a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f51195d++;
            this.f51192a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new ConcatWithSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
