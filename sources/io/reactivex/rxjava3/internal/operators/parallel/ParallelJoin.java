package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
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
            SubscriptionHelper.m18224d(this, subscription, 0);
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
        public volatile boolean f50980a;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f50980a) {
                return;
            }
            this.f50980a = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(null, j);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class JoinSubscriptionDelayError<T> extends JoinSubscriptionBase<T> {
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
