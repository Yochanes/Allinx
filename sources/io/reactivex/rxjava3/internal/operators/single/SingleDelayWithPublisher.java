package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleDelayWithPublisher<T, U> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements FlowableSubscriber<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51010a;

        /* JADX INFO: renamed from: b */
        public boolean f51011b;

        /* JADX INFO: renamed from: c */
        public Subscription f51012c;

        public OtherSubscriber(SingleObserver singleObserver) {
            this.f51010a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f51012c.cancel();
            DisposableHelper.m17952a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f51012c, subscription)) {
                this.f51012c = subscription;
                this.f51010a.mo12366c(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f51011b) {
                return;
            }
            this.f51011b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f51011b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f51011b = true;
                this.f51010a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f51012c.cancel();
            onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        new OtherSubscriber(singleObserver);
        throw null;
    }
}
