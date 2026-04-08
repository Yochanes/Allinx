package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelJoin<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class JoinInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17871e(this, subscription, 0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class JoinSubscription<T> extends JoinSubscriptionBase<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class JoinSubscriptionBase<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: a */
        public volatile boolean f49022a;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49022a) {
                return;
            }
            this.f49022a = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(null, j);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class JoinSubscriptionDelayError<T> extends JoinSubscriptionBase<T> {
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        throw null;
    }
}
