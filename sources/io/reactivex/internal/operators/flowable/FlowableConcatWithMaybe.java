package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatWithMaybe<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: f */
        public final AtomicReference f47721f;

        /* JADX INFO: renamed from: g */
        public boolean f47722g;

        public ConcatWithSubscriber(FlowableSubscriber flowableSubscriber) {
            super(flowableSubscriber);
            this.f47721f = new AtomicReference();
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            DisposableHelper.m17619f(this.f47721f, disposable);
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            DisposableHelper.m17615a(this.f47721f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47722g) {
                this.f49245a.onComplete();
            } else {
                this.f47722g = true;
                this.f49246b = SubscriptionHelper.f49266a;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49245a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49248d++;
            this.f49245a.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new ConcatWithSubscriber((FlowableSubscriber) subscriber));
    }
}
