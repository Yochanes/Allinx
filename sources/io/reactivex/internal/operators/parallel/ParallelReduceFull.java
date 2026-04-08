package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
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
        public Object f49036a;

        /* JADX INFO: renamed from: b */
        public boolean f49037b;

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17871e(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49037b) {
                return;
            }
            this.f49037b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49037b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49037b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49037b) {
                return;
            }
            if (this.f49036a == null) {
                this.f49036a = obj;
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                get().cancel();
                onError(th);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelReduceFullMainSubscriber<T> extends DeferredScalarSubscription<T> {
        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SlotPair<T> extends AtomicInteger {
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        throw null;
    }
}
