package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DelayMaybeObserver<T, U> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final OtherSubscriber f48298a;

        /* JADX INFO: renamed from: b */
        public Disposable f48299b;

        public DelayMaybeObserver(MaybeObserver maybeObserver) {
            this.f48298a = new OtherSubscriber(maybeObserver);
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48299b, disposable)) {
                this.f48299b = disposable;
                this.f48298a.f48300a.mo17586c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return SubscriptionHelper.m17870d(this.f48298a.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48299b.dispose();
            this.f48299b = DisposableHelper.f47552a;
            SubscriptionHelper.m17867a(this.f48298a);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48299b = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48299b = DisposableHelper.f47552a;
            this.f48298a.f48302c = th;
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48299b = DisposableHelper.f47552a;
            this.f48298a.f48301b = obj;
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OtherSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48300a;

        /* JADX INFO: renamed from: b */
        public Object f48301b;

        /* JADX INFO: renamed from: c */
        public Throwable f48302c;

        public OtherSubscriber(MaybeObserver maybeObserver) {
            this.f48300a = maybeObserver;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17871e(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Throwable th = this.f48302c;
            MaybeObserver maybeObserver = this.f48300a;
            if (th != null) {
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.f48301b;
            if (obj != null) {
                maybeObserver.onSuccess(obj);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Throwable th2 = this.f48302c;
            MaybeObserver maybeObserver = this.f48300a;
            if (th2 == null) {
                maybeObserver.onError(th);
            } else {
                maybeObserver.onError(new CompositeException(th2, th));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                onComplete();
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new DelayMaybeObserver(maybeObserver));
    }
}
