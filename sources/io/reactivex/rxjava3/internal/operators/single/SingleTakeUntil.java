package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleTakeUntil<T, U> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51057a;

        /* JADX INFO: renamed from: b */
        public final TakeUntilOtherSubscriber f51058b = new TakeUntilOtherSubscriber(this);

        public TakeUntilMainObserver(SingleObserver singleObserver) {
            this.f51057a = singleObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m18200a(Throwable th) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.f51057a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.f51058b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.m18221a(takeUntilOtherSubscriber);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.f51058b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.m18221a(takeUntilOtherSubscriber);
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f51057a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.f51058b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.m18221a(takeUntilOtherSubscriber);
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f51057a.onSuccess(obj);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilOtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: a */
        public final TakeUntilMainObserver f51059a;

        public TakeUntilOtherSubscriber(TakeUntilMainObserver takeUntilMainObserver) {
            this.f51059a = takeUntilMainObserver;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18224d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f51059a.m18200a(new CancellationException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f51059a.m18200a(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (SubscriptionHelper.m18221a(this)) {
                this.f51059a.m18200a(new CancellationException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        singleObserver.mo12366c(new TakeUntilMainObserver(singleObserver));
        throw null;
    }
}
