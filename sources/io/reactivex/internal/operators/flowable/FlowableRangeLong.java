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
public final class FlowableRangeLong extends Flowable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {

        /* JADX INFO: renamed from: a */
        public long f48019a = 0;

        /* JADX INFO: renamed from: b */
        public volatile boolean f48020b;

        /* JADX INFO: renamed from: a */
        public abstract void mo17717a();

        /* JADX INFO: renamed from: b */
        public abstract void mo17718b(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48020b = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f48019a = 0L;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f48019a == 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            long j = this.f48019a;
            if (j == 0) {
                return null;
            }
            this.f48019a = 1 + j;
            return Long.valueOf(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j) && BackpressureHelper.m17878a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo17717a();
                } else {
                    mo17718b(j);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RangeConditionalSubscription extends BaseRangeSubscription {

        /* JADX INFO: renamed from: c */
        public final ConditionalSubscriber f48021c;

        public RangeConditionalSubscription(ConditionalSubscriber conditionalSubscriber) {
            this.f48021c = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo17717a() {
            ConditionalSubscriber conditionalSubscriber = this.f48021c;
            for (long j = this.f48019a; j != 0; j++) {
                if (this.f48020b) {
                    return;
                }
                conditionalSubscriber.mo17630f(Long.valueOf(j));
            }
            if (this.f48020b) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        
            r10.f48019a = r0;
            r11 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo17718b(long j) {
            long j2 = this.f48019a;
            ConditionalSubscriber conditionalSubscriber = this.f48021c;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j || j2 == 0) {
                        if (j2 == 0) {
                            if (this.f48020b) {
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
                        if (this.f48020b) {
                            return;
                        }
                        if (conditionalSubscriber.mo17630f(Long.valueOf(j2))) {
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
        public final FlowableSubscriber f48022c;

        public RangeSubscription(FlowableSubscriber flowableSubscriber) {
            this.f48022c = flowableSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo17717a() {
            FlowableSubscriber flowableSubscriber = this.f48022c;
            for (long j = this.f48019a; j != 0; j++) {
                if (this.f48020b) {
                    return;
                }
                flowableSubscriber.onNext(Long.valueOf(j));
            }
            if (this.f48020b) {
                return;
            }
            flowableSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            r9.f48019a = r0;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo17718b(long j) {
            long j2 = this.f48019a;
            FlowableSubscriber flowableSubscriber = this.f48022c;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j || j2 == 0) {
                        if (j2 == 0) {
                            if (this.f48020b) {
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
                        if (this.f48020b) {
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
