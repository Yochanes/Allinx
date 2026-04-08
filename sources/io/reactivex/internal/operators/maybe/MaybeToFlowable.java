package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeToFlowable<T> extends Flowable<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: b */
    public final MaybeSource f48390b;

    /* JADX INFO: compiled from: Proguard */
    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f48391c;

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48391c, disposable)) {
                this.f48391c = disposable;
                this.f49255a.mo12367j(this);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f48391c.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f49255a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f49255a.onError(th);
        }
    }

    public MaybeToFlowable(MaybeSource maybeSource) {
        this.f48390b = maybeSource;
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f48390b.mo17584a(new MaybeToFlowableSubscriber(subscriber));
    }
}
