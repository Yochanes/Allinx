package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelCollector<T, A, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelCollectorInnerSubscriber<T, A, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public Object f49452a;

        /* JADX INFO: renamed from: b */
        public boolean f49453b;

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18224d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49453b) {
                return;
            }
            this.f49452a = null;
            this.f49453b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49453b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49452a = null;
                this.f49453b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49453b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                get().cancel();
                onError(th);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelCollectorSubscriber<T, A, R> extends DeferredScalarSubscription<R> {
        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SlotPair<T> extends AtomicInteger {
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptySubscription.m18217b(th, subscriber);
        }
    }
}
