package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeTimeoutPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48385a;

        /* JADX INFO: renamed from: b */
        public final TimeoutOtherMaybeObserver f48386b = new TimeoutOtherMaybeObserver(this);

        /* JADX INFO: renamed from: c */
        public final TimeoutFallbackMaybeObserver f48387c = null;

        public TimeoutMainMaybeObserver(MaybeObserver maybeObserver) {
            this.f48385a = maybeObserver;
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
            SubscriptionHelper.m17867a(this.f48386b);
            TimeoutFallbackMaybeObserver timeoutFallbackMaybeObserver = this.f48387c;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.m17615a(timeoutFallbackMaybeObserver);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            SubscriptionHelper.m17867a(this.f48386b);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f48385a.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            SubscriptionHelper.m17867a(this.f48386b);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f48385a.onError(th);
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            SubscriptionHelper.m17867a(this.f48386b);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f48385a.onSuccess(obj);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: a */
        public final TimeoutMainMaybeObserver f48388a;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver timeoutMainMaybeObserver) {
            this.f48388a = timeoutMainMaybeObserver;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17871e(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.f48388a;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.m17615a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.f48385a.onError(new TimeoutException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.f48388a;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.m17615a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.f48385a.onError(th);
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            get().cancel();
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.f48388a;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.m17615a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.f48385a.onError(new TimeoutException());
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(new TimeoutMainMaybeObserver(maybeObserver));
        throw null;
    }
}
