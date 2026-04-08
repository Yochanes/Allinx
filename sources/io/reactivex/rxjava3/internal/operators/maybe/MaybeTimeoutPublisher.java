package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeTimeoutPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50269a;

        /* JADX INFO: renamed from: b */
        public final TimeoutOtherMaybeObserver f50270b = new TimeoutOtherMaybeObserver(this);

        /* JADX INFO: renamed from: c */
        public final TimeoutFallbackMaybeObserver f50271c = null;

        public TimeoutMainMaybeObserver(MaybeObserver maybeObserver) {
            this.f50269a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
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
            SubscriptionHelper.m18221a(this.f50270b);
            TimeoutFallbackMaybeObserver timeoutFallbackMaybeObserver = this.f50271c;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.m17952a(timeoutFallbackMaybeObserver);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            SubscriptionHelper.m18221a(this.f50270b);
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f50269a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            SubscriptionHelper.m18221a(this.f50270b);
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f50269a.onError(th);
            } else {
                RxJavaPlugins.m18275b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            SubscriptionHelper.m18221a(this.f50270b);
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f50269a.onSuccess(obj);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: a */
        public final TimeoutMainMaybeObserver f50272a;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver timeoutMainMaybeObserver) {
            this.f50272a = timeoutMainMaybeObserver;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18224d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.f50272a;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.m17952a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.f50269a.onError(new TimeoutException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.f50272a;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.m17952a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.f50269a.onError(th);
            } else {
                RxJavaPlugins.m18275b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            get().cancel();
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.f50272a;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.m17952a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.f50269a.onError(new TimeoutException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        maybeObserver.mo12364c(new TimeoutMainMaybeObserver(maybeObserver));
        throw null;
    }
}
