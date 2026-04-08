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
public final class FlowableRangeLong extends Flowable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {

        /* JADX INFO: renamed from: a */
        public long f49919a = 0;

        /* JADX INFO: renamed from: b */
        public volatile boolean f49920b;

        /* JADX INFO: renamed from: a */
        public abstract void mo18060a();

        /* JADX INFO: renamed from: b */
        public abstract void mo18061b(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49920b = true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49919a = 0L;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f49919a == 0;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            long j = this.f49919a;
            if (j == 0) {
                return null;
            }
            this.f49919a = 1 + j;
            return Long.valueOf(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j) && BackpressureHelper.m18237a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo18060a();
                } else {
                    mo18061b(j);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RangeConditionalSubscription extends BaseRangeSubscription {

        /* JADX INFO: renamed from: c */
        public final ConditionalSubscriber f49921c;

        public RangeConditionalSubscription(ConditionalSubscriber conditionalSubscriber) {
            this.f49921c = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo18060a() {
            ConditionalSubscriber conditionalSubscriber = this.f49921c;
            for (long j = this.f49919a; j != 0; j++) {
                if (this.f49920b) {
                    return;
                }
                conditionalSubscriber.mo17969f(Long.valueOf(j));
            }
            if (this.f49920b) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        
            r10.f49919a = r0;
            r11 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo18061b(long j) {
            long j2 = this.f49919a;
            ConditionalSubscriber conditionalSubscriber = this.f49921c;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j || j2 == 0) {
                        if (j2 == 0) {
                            if (this.f49920b) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j3 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f49920b) {
                            return;
                        }
                        if (conditionalSubscriber.mo17969f(Long.valueOf(j2))) {
                            j3++;
                        }
                        j2++;
                    }
                }
            } while (j != 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RangeSubscription extends BaseRangeSubscription {

        /* JADX INFO: renamed from: c */
        public final FlowableSubscriber f49922c;

        public RangeSubscription(FlowableSubscriber flowableSubscriber) {
            this.f49922c = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo18060a() {
            FlowableSubscriber flowableSubscriber = this.f49922c;
            for (long j = this.f49919a; j != 0; j++) {
                if (this.f49920b) {
                    return;
                }
                flowableSubscriber.onNext(Long.valueOf(j));
            }
            if (this.f49920b) {
                return;
            }
            flowableSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            r9.f49919a = r0;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo18061b(long j) {
            long j2 = this.f49919a;
            FlowableSubscriber flowableSubscriber = this.f49922c;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j || j2 == 0) {
                        if (j2 == 0) {
                            if (this.f49920b) {
                                return;
                            }
                            flowableSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j3 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f49920b) {
                            return;
                        }
                        flowableSubscriber.onNext(Long.valueOf(j2));
                        j3++;
                        j2++;
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
