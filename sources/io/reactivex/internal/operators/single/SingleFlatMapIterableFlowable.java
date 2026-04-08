package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMapIterableFlowable<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49064a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f49065b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public Disposable f49066c;

        /* JADX INFO: renamed from: d */
        public volatile Iterator f49067d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f49068f;

        /* JADX INFO: renamed from: g */
        public boolean f49069g;

        public FlatMapIterableObserver(FlowableSubscriber flowableSubscriber) {
            this.f49064a = flowableSubscriber;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f49066c, disposable)) {
                this.f49066c = disposable;
                this.f49064a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49068f = true;
            this.f49066c.dispose();
            this.f49066c = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f49067d = null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            this.f49069g = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f49067d == null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49066c = DisposableHelper.f47552a;
            this.f49064a.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f49064a.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Iterator it = this.f49067d;
            if (it == null) {
                return null;
            }
            Object next = it.next();
            ObjectHelper.m17628b(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f49067d = null;
            }
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (!SubscriptionHelper.m17873h(j)) {
                return;
            }
            BackpressureHelper.m17878a(this.f49065b, j);
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f49064a;
            Iterator it = this.f49067d;
            if (this.f49069g && it != null) {
                flowableSubscriber.onNext(null);
                flowableSubscriber.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j2 = this.f49065b.get();
                    if (j2 == Long.MAX_VALUE) {
                        while (!this.f49068f) {
                            try {
                                flowableSubscriber.onNext(it.next());
                                if (this.f49068f) {
                                    return;
                                }
                                try {
                                    if (!it.hasNext()) {
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
                        return;
                    }
                    long j3 = 0;
                    while (j3 != j2) {
                        if (this.f49068f) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            ObjectHelper.m17628b(next, "The iterator returned a null value");
                            flowableSubscriber.onNext(next);
                            if (this.f49068f) {
                                return;
                            }
                            j3++;
                            try {
                                if (!it.hasNext()) {
                                    flowableSubscriber.onComplete();
                                    return;
                                }
                            } catch (Throwable th3) {
                                Exceptions.m17612a(th3);
                                flowableSubscriber.onError(th3);
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.m17612a(th4);
                            flowableSubscriber.onError(th4);
                            return;
                        }
                    }
                    if (j3 != 0) {
                        BackpressureHelper.m17882e(this.f49065b, j3);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f49067d;
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new FlatMapIterableObserver((FlowableSubscriber) subscriber);
        throw null;
    }
}
