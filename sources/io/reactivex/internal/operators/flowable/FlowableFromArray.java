package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromArray<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {

        /* JADX INFO: renamed from: a */
        public final ConditionalSubscriber f47842a;

        public ArrayConditionalSubscription(ConditionalSubscriber conditionalSubscriber) {
            this.f47842a = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: a */
        public final void mo17676a() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: b */
        public final void mo17677b(long j) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47843a;

        public ArraySubscription(FlowableSubscriber flowableSubscriber) {
            this.f47843a = flowableSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: a */
        public final void mo17676a() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: b */
        public final void mo17677b(long j) {
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.mo12367j(new ArrayConditionalSubscription((ConditionalSubscriber) subscriber));
        } else {
            subscriber.mo12367j(new ArraySubscription((FlowableSubscriber) subscriber));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        /* JADX INFO: renamed from: a */
        public abstract void mo17676a();

        /* JADX INFO: renamed from: b */
        public abstract void mo17677b(long j);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j) && BackpressureHelper.m17878a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo17676a();
                } else {
                    mo17677b(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }
    }
}
