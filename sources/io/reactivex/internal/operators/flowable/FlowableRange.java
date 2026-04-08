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
public final class FlowableRange extends Flowable<Integer> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {

        /* JADX INFO: renamed from: a */
        public int f48015a = 0;

        /* JADX INFO: renamed from: b */
        public volatile boolean f48016b;

        /* JADX INFO: renamed from: a */
        public abstract void mo17715a();

        /* JADX INFO: renamed from: b */
        public abstract void mo17716b(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48016b = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f48015a = 0;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f48015a == 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            int i = this.f48015a;
            if (i == 0) {
                return null;
            }
            this.f48015a = i + 1;
            return Integer.valueOf(i);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j) && BackpressureHelper.m17878a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo17715a();
                } else {
                    mo17716b(j);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RangeConditionalSubscription extends BaseRangeSubscription {

        /* JADX INFO: renamed from: c */
        public final ConditionalSubscriber f48017c;

        public RangeConditionalSubscription(ConditionalSubscriber conditionalSubscriber) {
            this.f48017c = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo17715a() {
            ConditionalSubscriber conditionalSubscriber = this.f48017c;
            for (int i = this.f48015a; i != 0; i++) {
                if (this.f48016b) {
                    return;
                }
                conditionalSubscriber.mo17630f(Integer.valueOf(i));
            }
            if (this.f48016b) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        
            r8.f48015a = r0;
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo17716b(long j) {
            int i = this.f48015a;
            ConditionalSubscriber conditionalSubscriber = this.f48017c;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == 0) {
                        if (i == 0) {
                            if (this.f48016b) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f48016b) {
                            return;
                        }
                        if (conditionalSubscriber.mo17630f(Integer.valueOf(i))) {
                            j2++;
                        }
                        i++;
                    }
                }
            } while (j != 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RangeSubscription extends BaseRangeSubscription {

        /* JADX INFO: renamed from: c */
        public final FlowableSubscriber f48018c;

        public RangeSubscription(FlowableSubscriber flowableSubscriber) {
            this.f48018c = flowableSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo17715a() {
            FlowableSubscriber flowableSubscriber = this.f48018c;
            for (int i = this.f48015a; i != 0; i++) {
                if (this.f48016b) {
                    return;
                }
                flowableSubscriber.onNext(Integer.valueOf(i));
            }
            if (this.f48016b) {
                return;
            }
            flowableSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        
            r8.f48015a = r0;
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo17716b(long j) {
            int i = this.f48015a;
            FlowableSubscriber flowableSubscriber = this.f48018c;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == 0) {
                        if (i == 0) {
                            if (this.f48016b) {
                                return;
                            }
                            flowableSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f48016b) {
                            return;
                        }
                        flowableSubscriber.onNext(Integer.valueOf(i));
                        j2++;
                        i++;
                    }
                }
            } while (j != 0);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.mo12367j(new RangeConditionalSubscription((ConditionalSubscriber) subscriber));
        } else {
            subscriber.mo12367j(new RangeSubscription((FlowableSubscriber) subscriber));
        }
    }
}
