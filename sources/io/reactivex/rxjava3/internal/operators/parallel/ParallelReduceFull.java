package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelReduceFull<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelReduceFullInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public Object f50994a;

        /* JADX INFO: renamed from: b */
        public boolean f50995b;

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18224d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50995b) {
                return;
            }
            this.f50995b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50995b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50995b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50995b) {
                return;
            }
            if (this.f50994a == null) {
                this.f50994a = obj;
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
    public static final class ParallelReduceFullMainSubscriber<T> extends DeferredScalarSubscription<T> {
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
        throw null;
    }
}
