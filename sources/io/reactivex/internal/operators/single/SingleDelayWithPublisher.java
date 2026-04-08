package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleDelayWithPublisher<T, U> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements FlowableSubscriber<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49051a;

        /* JADX INFO: renamed from: b */
        public boolean f49052b;

        /* JADX INFO: renamed from: c */
        public Subscription f49053c;

        public OtherSubscriber(SingleObserver singleObserver) {
            this.f49051a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f49053c.cancel();
            DisposableHelper.m17615a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f49053c, subscription)) {
                this.f49053c = subscription;
                this.f49051a.mo17602c(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49052b) {
                return;
            }
            this.f49052b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49052b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49052b = true;
                this.f49051a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49053c.cancel();
            onComplete();
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new OtherSubscriber(singleObserver);
        throw null;
    }
}
