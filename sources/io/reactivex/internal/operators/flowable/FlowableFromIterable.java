package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {

        /* JADX INFO: renamed from: a */
        public Iterator f47844a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f47845b;

        /* JADX INFO: renamed from: c */
        public boolean f47846c;

        public BaseRangeSubscription(Iterator it) {
            this.f47844a = it;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo17678a();

        /* JADX INFO: renamed from: b */
        public abstract void mo17679b(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47845b = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f47844a = null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator it = this.f47844a;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Iterator it = this.f47844a;
            if (it == null) {
                return null;
            }
            if (!this.f47846c) {
                this.f47846c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            Object next = this.f47844a.next();
            ObjectHelper.m17628b(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j) && BackpressureHelper.m17878a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo17678a();
                } else {
                    mo17679b(j);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {

        /* JADX INFO: renamed from: d */
        public final ConditionalSubscriber f47847d;

        public IteratorConditionalSubscription(ConditionalSubscriber conditionalSubscriber, Iterator it) {
            super(it);
            this.f47847d = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo17678a() {
            Iterator it = this.f47844a;
            ConditionalSubscriber conditionalSubscriber = this.f47847d;
            while (!this.f47845b) {
                try {
                    Object next = it.next();
                    if (this.f47845b) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.mo17630f(next);
                    if (this.f47845b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f47845b) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.m17612a(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m17612a(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo17679b(long j) {
            Iterator it = this.f47844a;
            ConditionalSubscriber conditionalSubscriber = this.f47847d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f47845b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.f47845b) {
                                return;
                            }
                            if (next == null) {
                                conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zMo17630f = conditionalSubscriber.mo17630f(next);
                            if (this.f47845b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f47845b) {
                                        return;
                                    }
                                    conditionalSubscriber.onComplete();
                                    return;
                                } else if (zMo17630f) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                Exceptions.m17612a(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.m17612a(th2);
                            conditionalSubscriber.onError(th2);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {

        /* JADX INFO: renamed from: d */
        public final FlowableSubscriber f47848d;

        public IteratorSubscription(FlowableSubscriber flowableSubscriber, Iterator it) {
            super(it);
            this.f47848d = flowableSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo17678a() {
            Iterator it = this.f47844a;
            FlowableSubscriber flowableSubscriber = this.f47848d;
            while (!this.f47845b) {
                try {
                    Object next = it.next();
                    if (this.f47845b) {
                        return;
                    }
                    if (next == null) {
                        flowableSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    flowableSubscriber.onNext(next);
                    if (this.f47845b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f47845b) {
                                return;
                            }
                            flowableSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.m17612a(th);
                        flowableSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m17612a(th2);
                    flowableSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo17679b(long j) {
            Iterator it = this.f47844a;
            FlowableSubscriber flowableSubscriber = this.f47848d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f47845b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.f47845b) {
                                return;
                            }
                            if (next == null) {
                                flowableSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            flowableSubscriber.onNext(next);
                            if (this.f47845b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f47845b) {
                                        return;
                                    }
                                    flowableSubscriber.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                Exceptions.m17612a(th);
                                flowableSubscriber.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.m17612a(th2);
                            flowableSubscriber.onError(th2);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptySubscription.m17863b(th, subscriber);
        }
    }
}
