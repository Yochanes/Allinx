package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import java.util.Iterator;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {

        /* JADX INFO: renamed from: a */
        public Iterator f49761a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f49762b;

        /* JADX INFO: renamed from: c */
        public boolean f49763c;

        public BaseRangeSubscription(Iterator it) {
            this.f49761a = it;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo18022a();

        /* JADX INFO: renamed from: b */
        public abstract void mo18023b(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49762b = true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49761a = null;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            Iterator it = this.f49761a;
            if (it == null) {
                return true;
            }
            if (!this.f49763c || it.hasNext()) {
                return false;
            }
            this.f49761a = null;
            return true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Iterator it = this.f49761a;
            if (it == null) {
                return null;
            }
            if (!this.f49763c) {
                this.f49763c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            Object next = this.f49761a.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j) && BackpressureHelper.m18237a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo18022a();
                } else {
                    mo18023b(j);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {

        /* JADX INFO: renamed from: d */
        public final ConditionalSubscriber f49764d;

        public IteratorConditionalSubscription(ConditionalSubscriber conditionalSubscriber, Iterator it) {
            super(it);
            this.f49764d = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo18022a() {
            Iterator it = this.f49761a;
            ConditionalSubscriber conditionalSubscriber = this.f49764d;
            while (!this.f49762b) {
                try {
                    Object next = it.next();
                    if (this.f49762b) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.mo17969f(next);
                    if (this.f49762b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f49762b) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.m17950a(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m17950a(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo18023b(long j) {
            Iterator it = this.f49761a;
            ConditionalSubscriber conditionalSubscriber = this.f49764d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f49762b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.f49762b) {
                                return;
                            }
                            if (next == null) {
                                conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zMo17969f = conditionalSubscriber.mo17969f(next);
                            if (this.f49762b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f49762b) {
                                        return;
                                    }
                                    conditionalSubscriber.onComplete();
                                    return;
                                } else if (zMo17969f) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                Exceptions.m17950a(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.m17950a(th2);
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
        public final FlowableSubscriber f49765d;

        public IteratorSubscription(FlowableSubscriber flowableSubscriber, Iterator it) {
            super(it);
            this.f49765d = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: a */
        public final void mo18022a() {
            Iterator it = this.f49761a;
            FlowableSubscriber flowableSubscriber = this.f49765d;
            while (!this.f49762b) {
                try {
                    Object next = it.next();
                    if (this.f49762b) {
                        return;
                    }
                    if (next == null) {
                        flowableSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    flowableSubscriber.onNext(next);
                    if (this.f49762b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f49762b) {
                                return;
                            }
                            flowableSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.m17950a(th);
                        flowableSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m17950a(th2);
                    flowableSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo18023b(long j) {
            Iterator it = this.f49761a;
            FlowableSubscriber flowableSubscriber = this.f49765d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f49762b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.f49762b) {
                                return;
                            }
                            if (next == null) {
                                flowableSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            flowableSubscriber.onNext(next);
                            if (this.f49762b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f49762b) {
                                        return;
                                    }
                                    flowableSubscriber.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                Exceptions.m17950a(th);
                                flowableSubscriber.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.m17950a(th2);
                            flowableSubscriber.onError(th2);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptySubscription.m18217b(th, subscriber);
        }
    }
}
