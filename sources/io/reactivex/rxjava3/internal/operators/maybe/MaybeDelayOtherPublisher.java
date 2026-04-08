package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DelayMaybeObserver<T, U> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final OtherSubscriber f50195a;

        /* JADX INFO: renamed from: b */
        public Disposable f50196b;

        public DelayMaybeObserver(MaybeObserver maybeObserver) {
            this.f50195a = new OtherSubscriber(maybeObserver);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50196b, disposable)) {
                this.f50196b = disposable;
                this.f50195a.f50197a.mo12364c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50195a.get() == SubscriptionHelper.f51214a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50196b.dispose();
            this.f50196b = DisposableHelper.f49380a;
            SubscriptionHelper.m18221a(this.f50195a);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50196b = DisposableHelper.f49380a;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50196b = DisposableHelper.f49380a;
            this.f50195a.f50199c = th;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50196b = DisposableHelper.f49380a;
            this.f50195a.f50198b = obj;
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OtherSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50197a;

        /* JADX INFO: renamed from: b */
        public Object f50198b;

        /* JADX INFO: renamed from: c */
        public Throwable f50199c;

        public OtherSubscriber(MaybeObserver maybeObserver) {
            this.f50197a = maybeObserver;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18224d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Throwable th = this.f50199c;
            MaybeObserver maybeObserver = this.f50197a;
            if (th != null) {
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.f50198b;
            if (obj != null) {
                maybeObserver.onSuccess(obj);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Throwable th2 = this.f50199c;
            MaybeObserver maybeObserver = this.f50197a;
            if (th2 == null) {
                maybeObserver.onError(th);
            } else {
                maybeObserver.onError(new CompositeException(th2, th));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        new DelayMaybeObserver(maybeObserver);
        throw null;
    }
}
