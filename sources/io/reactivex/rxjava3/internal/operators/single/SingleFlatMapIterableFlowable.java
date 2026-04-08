package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMapIterableFlowable<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f51028a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f51029b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public Disposable f51030c;

        /* JADX INFO: renamed from: d */
        public volatile Iterator f51031d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f51032f;

        /* JADX INFO: renamed from: g */
        public boolean f51033g;

        public FlatMapIterableObserver(FlowableSubscriber flowableSubscriber) {
            this.f51028a = flowableSubscriber;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f51030c, disposable)) {
                this.f51030c = disposable;
                this.f51028a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f51032f = true;
            this.f51030c.dispose();
            this.f51030c = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f51031d = null;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            this.f51033g = true;
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f51031d == null;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51030c = DisposableHelper.f49380a;
            this.f51028a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f51028a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Iterator it = this.f51031d;
            if (it == null) {
                return null;
            }
            Object next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f51031d = null;
            }
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (!SubscriptionHelper.m18226f(j)) {
                return;
            }
            BackpressureHelper.m18237a(this.f51029b, j);
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f51028a;
            Iterator it = this.f51031d;
            if (this.f51033g && it != null) {
                flowableSubscriber.onNext(null);
                flowableSubscriber.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j2 = this.f51029b.get();
                    if (j2 == Long.MAX_VALUE) {
                        while (!this.f51032f) {
                            try {
                                flowableSubscriber.onNext(it.next());
                                if (this.f51032f) {
                                    return;
                                }
                                try {
                                    if (!it.hasNext()) {
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
                        return;
                    }
                    long j3 = 0;
                    while (j3 != j2) {
                        if (this.f51032f) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            flowableSubscriber.onNext(next);
                            if (this.f51032f) {
                                return;
                            }
                            j3++;
                            try {
                                if (!it.hasNext()) {
                                    flowableSubscriber.onComplete();
                                    return;
                                }
                            } catch (Throwable th3) {
                                Exceptions.m17950a(th3);
                                flowableSubscriber.onError(th3);
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.m17950a(th4);
                            flowableSubscriber.onError(th4);
                            return;
                        }
                    }
                    if (j3 != 0) {
                        BackpressureHelper.m18241e(this.f51029b, j3);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f51031d;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new FlatMapIterableObserver((FlowableSubscriber) subscriber);
        throw null;
    }
}
