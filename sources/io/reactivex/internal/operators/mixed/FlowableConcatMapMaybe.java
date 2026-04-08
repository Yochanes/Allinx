package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
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
public final class FlowableConcatMapMaybe<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48412a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f48413b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final AtomicThrowable f48414c = new AtomicThrowable();

        /* JADX INFO: renamed from: d */
        public final ConcatMapMaybeObserver f48415d = new ConcatMapMaybeObserver(this);

        /* JADX INFO: renamed from: f */
        public final SpscArrayQueue f48416f = new SpscArrayQueue(0);

        /* JADX INFO: renamed from: g */
        public Subscription f48417g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48418i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f48419j;

        /* JADX INFO: renamed from: n */
        public long f48420n;

        /* JADX INFO: renamed from: o */
        public int f48421o;

        /* JADX INFO: renamed from: p */
        public Object f48422p;

        /* JADX INFO: renamed from: q */
        public volatile int f48423q;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: a */
            public final ConcatMapMaybeSubscriber f48424a;

            public ConcatMapMaybeObserver(ConcatMapMaybeSubscriber concatMapMaybeSubscriber) {
                this.f48424a = concatMapMaybeSubscriber;
            }

            @Override // io.reactivex.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo17586c(Disposable disposable) {
                DisposableHelper.m17617c(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                ConcatMapMaybeSubscriber concatMapMaybeSubscriber = this.f48424a;
                concatMapMaybeSubscriber.f48423q = 0;
                concatMapMaybeSubscriber.m17765a();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                ConcatMapMaybeSubscriber concatMapMaybeSubscriber = this.f48424a;
                AtomicThrowable atomicThrowable = concatMapMaybeSubscriber.f48414c;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                    return;
                }
                concatMapMaybeSubscriber.f48417g.cancel();
                concatMapMaybeSubscriber.f48423q = 0;
                concatMapMaybeSubscriber.m17765a();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                ConcatMapMaybeSubscriber concatMapMaybeSubscriber = this.f48424a;
                concatMapMaybeSubscriber.f48422p = obj;
                concatMapMaybeSubscriber.f48423q = 2;
                concatMapMaybeSubscriber.m17765a();
            }
        }

        public ConcatMapMaybeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48412a = flowableSubscriber;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        
            r3 = r13.f48421o + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        
            if (r3 != 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        
            r13.f48421o = 0;
            r13.f48417g.request(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        
            r13.f48421o = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        
            io.reactivex.exceptions.Exceptions.m17612a(r3);
            r13.f48417g.cancel();
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
        public final void m17765a() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f48412a;
            SpscArrayQueue spscArrayQueue = this.f48416f;
            AtomicThrowable atomicThrowable = this.f48414c;
            AtomicLong atomicLong = this.f48413b;
            int iAddAndGet = 1;
            while (true) {
                if (this.f48419j) {
                    spscArrayQueue.clear();
                    this.f48422p = null;
                } else {
                    int i = this.f48423q;
                    atomicThrowable.get();
                    if (i == 0) {
                        boolean z2 = this.f48418i;
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
                        long j = this.f48420n;
                        if (j != atomicLong.get()) {
                            Object obj = this.f48422p;
                            this.f48422p = null;
                            flowableSubscriber.onNext(obj);
                            this.f48420n = j + 1;
                            this.f48423q = 0;
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
            this.f48419j = true;
            this.f48417g.cancel();
            ConcatMapMaybeObserver concatMapMaybeObserver = this.f48415d;
            concatMapMaybeObserver.getClass();
            DisposableHelper.m17615a(concatMapMaybeObserver);
            if (getAndIncrement() == 0) {
                this.f48416f.clear();
                this.f48422p = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48417g, subscription)) {
                this.f48417g = subscription;
                this.f48412a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48418i = true;
            m17765a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48414c;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48418i = true;
                m17765a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48416f.offer(obj)) {
                m17765a();
            } else {
                this.f48417g.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.m17878a(this.f48413b, j);
            m17765a();
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new ConcatMapMaybeSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
