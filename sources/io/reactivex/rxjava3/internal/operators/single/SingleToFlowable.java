package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleToFlowable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final SingleSource f51065b;

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f51066c;

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f51066c, disposable)) {
                this.f51066c = disposable;
                this.f51202a.mo12367j(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f51066c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51202a.onError(th);
        }
    }

    public SingleToFlowable(SingleSource singleSource) {
        this.f51065b = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        this.f51065b.mo17939a(new SingleToFlowableObserver(subscriber));
    }
}
