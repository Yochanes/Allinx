package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeToFlowable<T> extends Flowable<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: b */
    public final MaybeSource f50274b;

    /* JADX INFO: compiled from: Proguard */
    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f50275c;

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50275c, disposable)) {
                this.f50275c = disposable;
                this.f51202a.mo12367j(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f50275c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f51202a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f51202a.onError(th);
        }
    }

    public MaybeToFlowable(MaybeSource maybeSource) {
        this.f50274b = maybeSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        this.f50274b.mo17924a(new MaybeToFlowableSubscriber(subscriber));
    }
}
