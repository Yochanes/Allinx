package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleTakeUntil<T, U> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49092a;

        /* JADX INFO: renamed from: b */
        public final TakeUntilOtherSubscriber f49093b = new TakeUntilOtherSubscriber(this);

        public TakeUntilMainObserver(SingleObserver singleObserver) {
            this.f49092a = singleObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17844a(Throwable th) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.f49092a.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.f49093b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.m17867a(takeUntilOtherSubscriber);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.f49093b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.m17867a(takeUntilOtherSubscriber);
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49092a.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.f49093b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.m17867a(takeUntilOtherSubscriber);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f49092a.onSuccess(obj);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilOtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: a */
        public final TakeUntilMainObserver f49094a;

        public TakeUntilOtherSubscriber(TakeUntilMainObserver takeUntilMainObserver) {
            this.f49094a = takeUntilMainObserver;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17871e(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f49094a.m17844a(new CancellationException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49094a.m17844a(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (SubscriptionHelper.m17867a(this)) {
                this.f49094a.m17844a(new CancellationException());
            }
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        singleObserver.mo17602c(new TakeUntilMainObserver(singleObserver));
        throw null;
    }
}
