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
public final class FlowableRange extends Flowable<Integer> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {

        /* JADX INFO: renamed from: a */
        public int f49915a = 0;

        /* JADX INFO: renamed from: b */
        public volatile boolean f49916b;

        /* JADX INFO: renamed from: a */
        public abstract void mo18058a();

        /* JADX INFO: renamed from: b */
        public abstract void mo18059b(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49916b = true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49915a = 0;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f49915a == 0;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            int i = this.f49915a;
            if (i == 0) {
                return null;
            }
            this.f49915a = i + 1;
            return Integer.valueOf(i);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j) && BackpressureHelper.m18237a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo18058a();
                } else {
                    mo18059b(j);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RangeConditionalSubscription extends BaseRangeSubscription {

        /* JADX INFO: renamed from: c */
        public final ConditionalSubscriber f49917c;

        public RangeConditionalSubscription(ConditionalSubscriber conditionalSubscriber) {
            this.f49917c = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo18058a() {
            ConditionalSubscriber conditionalSubscriber = this.f49917c;
            for (int i = this.f49915a; i != 0; i++) {
                if (this.f49916b) {
                    return;
                }
                conditionalSubscriber.mo17969f(Integer.valueOf(i));
            }
            if (this.f49916b) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        
            r8.f49915a = r0;
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo18059b(long j) {
            int i = this.f49915a;
            ConditionalSubscriber conditionalSubscriber = this.f49917c;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == 0) {
                        if (i == 0) {
                            if (this.f49916b) {
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
                        if (this.f49916b) {
                            return;
                        }
                        if (conditionalSubscriber.mo17969f(Integer.valueOf(i))) {
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
        public final FlowableSubscriber f49918c;

        public RangeSubscription(FlowableSubscriber flowableSubscriber) {
            this.f49918c = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo18058a() {
            FlowableSubscriber flowableSubscriber = this.f49918c;
            for (int i = this.f49915a; i != 0; i++) {
                if (this.f49916b) {
                    return;
                }
                flowableSubscriber.onNext(Integer.valueOf(i));
            }
            if (this.f49916b) {
                return;
            }
            flowableSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        
            r8.f49915a = r0;
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo18059b(long j) {
            int i = this.f49915a;
            FlowableSubscriber flowableSubscriber = this.f49918c;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == 0) {
                        if (i == 0) {
                            if (this.f49916b) {
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
                        if (this.f49916b) {
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

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.mo12367j(new RangeConditionalSubscription((ConditionalSubscriber) subscriber));
        } else {
            subscriber.mo12367j(new RangeSubscription((FlowableSubscriber) subscriber));
        }
    }
}
