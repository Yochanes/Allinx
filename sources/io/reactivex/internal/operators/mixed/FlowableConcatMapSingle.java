package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48425a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f48426b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final AtomicThrowable f48427c = new AtomicThrowable();

        /* JADX INFO: renamed from: d */
        public final ConcatMapSingleObserver f48428d = new ConcatMapSingleObserver(this);

        /* JADX INFO: renamed from: f */
        public final SpscArrayQueue f48429f = new SpscArrayQueue(0);

        /* JADX INFO: renamed from: g */
        public Subscription f48430g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48431i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f48432j;

        /* JADX INFO: renamed from: n */
        public long f48433n;

        /* JADX INFO: renamed from: o */
        public int f48434o;

        /* JADX INFO: renamed from: p */
        public Object f48435p;

        /* JADX INFO: renamed from: q */
        public volatile int f48436q;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final ConcatMapSingleSubscriber f48437a;

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber concatMapSingleSubscriber) {
                this.f48437a = concatMapSingleSubscriber;
            }

            @Override // io.reactivex.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo17602c(Disposable disposable) {
                DisposableHelper.m17617c(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.f48437a;
                AtomicThrowable atomicThrowable = concatMapSingleSubscriber.f48427c;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                    return;
                }
                concatMapSingleSubscriber.f48430g.cancel();
                concatMapSingleSubscriber.f48436q = 0;
                concatMapSingleSubscriber.m17766a();
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.f48437a;
                concatMapSingleSubscriber.f48435p = obj;
                concatMapSingleSubscriber.f48436q = 2;
                concatMapSingleSubscriber.m17766a();
            }
        }

        public ConcatMapSingleSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48425a = flowableSubscriber;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        
            r3 = r13.f48434o + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        
            if (r3 != 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        
            r13.f48434o = 0;
            r13.f48430g.request(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        
            r13.f48434o = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        
            io.reactivex.exceptions.Exceptions.m17612a(r3);
            r13.f48430g.cancel();
            r1.clear();
            io.reactivex.internal.util.ExceptionHelper.m17887a(r2, r3);
            r0.onError(io.reactivex.internal.util.ExceptionHelper.m17888b(r2));
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m17766a() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f48425a;
            SpscArrayQueue spscArrayQueue = this.f48429f;
            AtomicThrowable atomicThrowable = this.f48427c;
            AtomicLong atomicLong = this.f48426b;
            int iAddAndGet = 1;
            while (true) {
                if (this.f48432j) {
                    spscArrayQueue.clear();
                    this.f48435p = null;
                } else {
                    int i = this.f48436q;
                    atomicThrowable.get();
                    if (i == 0) {
                        boolean z2 = this.f48431i;
                        boolean z3 = spscArrayQueue.poll() == null;
                        if (!z2 || !z3) {
                            if (!z3) {
                                break;
                            }
                        } else {
                            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                            if (thM17888b == null) {
                                flowableSubscriber.onComplete();
                                return;
                            } else {
                                flowableSubscriber.onError(thM17888b);
                                return;
                            }
                        }
                    } else if (i == 2) {
                        long j = this.f48433n;
                        if (j != atomicLong.get()) {
                            Object obj = this.f48435p;
                            this.f48435p = null;
                            flowableSubscriber.onNext(obj);
                            this.f48433n = j + 1;
                            this.f48436q = 0;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48432j = true;
            this.f48430g.cancel();
            ConcatMapSingleObserver concatMapSingleObserver = this.f48428d;
            concatMapSingleObserver.getClass();
            DisposableHelper.m17615a(concatMapSingleObserver);
            if (getAndIncrement() == 0) {
                this.f48429f.clear();
                this.f48435p = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48430g, subscription)) {
                this.f48430g = subscription;
                this.f48425a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48431i = true;
            m17766a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48427c;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48431i = true;
                m17766a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48429f.offer(obj)) {
                m17766a();
            } else {
                this.f48430g.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.m17878a(this.f48426b, j);
            m17766a();
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new ConcatMapSingleSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
