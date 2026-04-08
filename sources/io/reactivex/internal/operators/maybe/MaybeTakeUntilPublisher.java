package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeTakeUntilPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48378a;

        /* JADX INFO: renamed from: b */
        public final TakeUntilOtherMaybeObserver f48379b = new TakeUntilOtherMaybeObserver(this);

        /* JADX INFO: compiled from: Proguard */
        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<Subscription> implements FlowableSubscriber<U> {

            /* JADX INFO: renamed from: a */
            public final TakeUntilMainMaybeObserver f48380a;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver takeUntilMainMaybeObserver) {
                this.f48380a = takeUntilMainMaybeObserver;
            }

            @Override // org.reactivestreams.Subscriber
            /* JADX INFO: renamed from: j */
            public final void mo12367j(Subscription subscription) {
                SubscriptionHelper.m17871e(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.f48380a;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.m17615a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f48378a.onComplete();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.f48380a;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.m17615a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f48378a.onError(th);
                } else {
                    RxJavaPlugins.m17911b(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SubscriptionHelper.m17867a(this);
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.f48380a;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.m17615a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f48378a.onComplete();
                }
            }
        }

        public TakeUntilMainMaybeObserver(MaybeObserver maybeObserver) {
            this.f48378a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
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
            SubscriptionHelper.m17867a(this.f48379b);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            SubscriptionHelper.m17867a(this.f48379b);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f48378a.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            SubscriptionHelper.m17867a(this.f48379b);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f48378a.onError(th);
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            SubscriptionHelper.m17867a(this.f48379b);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f48378a.onSuccess(obj);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(new TakeUntilMainMaybeObserver(maybeObserver));
        throw null;
    }
}
