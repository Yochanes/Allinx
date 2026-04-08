package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleToFlowable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final SingleSource f49099b;

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f49100c;

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f49100c, disposable)) {
                this.f49100c = disposable;
                this.f49255a.mo12367j(this);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f49100c.dispose();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49255a.onError(th);
        }
    }

    public SingleToFlowable(SingleSource singleSource) {
        this.f49099b = singleSource;
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f49099b.mo17600a(new SingleToFlowableObserver(subscriber));
    }
}
