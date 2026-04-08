package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromArray<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {

        /* JADX INFO: renamed from: a */
        public final ConditionalSubscriber f49758a;

        public ArrayConditionalSubscription(ConditionalSubscriber conditionalSubscriber) {
            this.f49758a = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: a */
        public final void mo18020a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: b */
        public final void mo18021b(long j) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49759a;

        public ArraySubscription(FlowableSubscriber flowableSubscriber) {
            this.f49759a = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: a */
        public final void mo18020a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: b */
        public final void mo18021b(long j) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.mo12367j(new ArrayConditionalSubscription((ConditionalSubscriber) subscriber));
        } else {
            subscriber.mo12367j(new ArraySubscription((FlowableSubscriber) subscriber));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        /* JADX INFO: renamed from: a */
        public abstract void mo18020a();

        /* JADX INFO: renamed from: b */
        public abstract void mo18021b(long j);

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j) && BackpressureHelper.m18237a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo18020a();
                } else {
                    mo18021b(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }
    }
}
