package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
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
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InnerSubscriber<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public volatile boolean f47791a;

        /* JADX INFO: renamed from: b */
        public volatile SimpleQueue f47792b;

        /* JADX INFO: renamed from: c */
        public long f47793c;

        /* JADX INFO: renamed from: d */
        public int f47794d;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == SubscriptionHelper.f49266a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.m17867a(this);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17872f(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17626e = queueSubscription.mo17626e(7);
                    if (iMo17626e == 1) {
                        this.f47794d = iMo17626e;
                        this.f47792b = queueSubscription;
                        this.f47791a = true;
                        throw null;
                    }
                    if (iMo17626e == 2) {
                        this.f47794d = iMo17626e;
                        this.f47792b = queueSubscription;
                    }
                }
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47791a = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            lazySet(SubscriptionHelper.f49266a);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47794d == 2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: o */
        public static final InnerSubscriber[] f47795o = new InnerSubscriber[0];

        /* JADX INFO: renamed from: p */
        public static final InnerSubscriber[] f47796p = new InnerSubscriber[0];

        /* JADX INFO: renamed from: a */
        public final Subscriber f47797a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f47798b;

        /* JADX INFO: renamed from: c */
        public final AtomicThrowable f47799c = new AtomicThrowable();

        /* JADX INFO: renamed from: d */
        public volatile boolean f47800d;

        /* JADX INFO: renamed from: f */
        public final AtomicReference f47801f;

        /* JADX INFO: renamed from: g */
        public final AtomicLong f47802g;

        /* JADX INFO: renamed from: i */
        public Subscription f47803i;

        /* JADX INFO: renamed from: j */
        public long f47804j;

        /* JADX INFO: renamed from: n */
        public int f47805n;

        public MergeSubscriber(Subscriber subscriber) {
            AtomicReference atomicReference = new AtomicReference();
            this.f47801f = atomicReference;
            this.f47802g = new AtomicLong();
            this.f47797a = subscriber;
            Math.max(1, 0);
            atomicReference.lazySet(f47795o);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m17665a() {
            if (!this.f47800d) {
                if (this.f47799c.get() == null) {
                    return false;
                }
                AtomicThrowable atomicThrowable = this.f47799c;
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                if (thM17888b != ExceptionHelper.f49276a) {
                    this.f47797a.onError(thM17888b);
                }
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x0100, code lost:
        
            if (r12 == r25) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
        
            if (r17 != false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0104, code lost:
        
            r8 = r27.f47802g.addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x010c, code lost:
        
            r8 = Long.MAX_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0114, code lost:
        
            if (r10.f47794d == 1) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
        
            r14 = r10.f47793c + r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x011d, code lost:
        
            if (r14 < 0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x011f, code lost:
        
            r10.f47793c = 0;
            r10.get().request(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x012d, code lost:
        
            r10.f47793c = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0131, code lost:
        
            if (r8 == r25) goto L130;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0133, code lost:
        
            if (r21 != null) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0136, code lost:
        
            r14 = r25;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m17666b() {
            long j;
            long j2;
            boolean z2;
            long j3;
            if (getAndIncrement() == 0) {
                Subscriber subscriber = this.f47797a;
                int iAddAndGet = 1;
                while (!m17665a()) {
                    long j4 = this.f47802g.get();
                    boolean z3 = j4 == Long.MAX_VALUE;
                    long j5 = 0;
                    boolean z4 = this.f47798b;
                    InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.f47801f.get();
                    int length = innerSubscriberArr.length;
                    if (z4 && length == 0) {
                        AtomicThrowable atomicThrowable = this.f47799c;
                        atomicThrowable.getClass();
                        Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                        if (thM17888b != ExceptionHelper.f49276a) {
                            if (thM17888b == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(thM17888b);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        boolean z5 = z3;
                        long j6 = this.f47804j;
                        int i = this.f47805n;
                        if (length > i) {
                            innerSubscriberArr[i].getClass();
                            if (0 != j6) {
                                if (length <= i) {
                                    i = 0;
                                }
                                for (int i2 = 0; i2 < length; i2++) {
                                    innerSubscriberArr[i].getClass();
                                    if (0 == j6) {
                                        break;
                                    }
                                    i++;
                                    if (i == length) {
                                        i = 0;
                                    }
                                }
                                this.f47805n = i;
                                innerSubscriberArr[i].getClass();
                                this.f47804j = 0L;
                            }
                            long jAddAndGet = j4;
                            long j7 = 0;
                            int i3 = 0;
                            int i4 = i;
                            boolean z6 = false;
                            while (true) {
                                if (i3 >= length) {
                                    j = j5;
                                    break;
                                }
                                if (m17665a()) {
                                    return;
                                }
                                InnerSubscriber innerSubscriber = innerSubscriberArr[i4];
                                Object obj = null;
                                while (!m17665a()) {
                                    SimpleQueue simpleQueue = innerSubscriber.f47792b;
                                    if (simpleQueue != null) {
                                        long j8 = j5;
                                        j3 = 1;
                                        while (true) {
                                            if (jAddAndGet == j5) {
                                                j = j5;
                                                break;
                                            }
                                            j = j5;
                                            try {
                                                Object objPoll = simpleQueue.poll();
                                                if (objPoll == null) {
                                                    obj = objPoll;
                                                    break;
                                                }
                                                subscriber.onNext(objPoll);
                                                if (m17665a()) {
                                                    return;
                                                }
                                                jAddAndGet--;
                                                j8++;
                                                obj = objPoll;
                                                j5 = j;
                                            } catch (Throwable th) {
                                                Exceptions.m17612a(th);
                                                SubscriptionHelper.m17867a(innerSubscriber);
                                                AtomicThrowable atomicThrowable2 = this.f47799c;
                                                atomicThrowable2.getClass();
                                                ExceptionHelper.m17887a(atomicThrowable2, th);
                                                this.f47803i.cancel();
                                                if (m17665a()) {
                                                    return;
                                                }
                                                m17667c(innerSubscriber);
                                                i3++;
                                                z6 = true;
                                            }
                                        }
                                    } else {
                                        j = j5;
                                        j3 = 1;
                                    }
                                    boolean z7 = innerSubscriber.f47791a;
                                    SimpleQueue simpleQueue2 = innerSubscriber.f47792b;
                                    if (z7 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                        m17667c(innerSubscriber);
                                        if (m17665a()) {
                                            return;
                                        }
                                        j7 += j3;
                                        z6 = true;
                                    }
                                    if (jAddAndGet == j) {
                                        break;
                                    }
                                    i4++;
                                    if (i4 == length) {
                                        i4 = 0;
                                    }
                                    i3++;
                                    j5 = j;
                                }
                                return;
                            }
                            z2 = z6;
                            this.f47805n = i4;
                            innerSubscriberArr[i4].getClass();
                            this.f47804j = 0L;
                            j2 = j7;
                        }
                    } else {
                        j = 0;
                        j2 = 0;
                        z2 = false;
                    }
                    if (j2 != j && !this.f47800d) {
                        this.f47803i.request(j2);
                    }
                    if (!z2 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public final void m17667c(InnerSubscriber innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            while (true) {
                AtomicReference atomicReference = this.f47801f;
                InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.get();
                int length = innerSubscriberArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriberArr2[i] == innerSubscriber) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr = f47795o;
                } else {
                    InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i);
                    System.arraycopy(innerSubscriberArr2, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr = innerSubscriberArr3;
                }
                while (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                    if (atomicReference.get() != innerSubscriberArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            InnerSubscriber[] innerSubscriberArr;
            if (this.f47800d) {
                return;
            }
            this.f47800d = true;
            this.f47803i.cancel();
            AtomicReference atomicReference = this.f47801f;
            InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.get();
            InnerSubscriber[] innerSubscriberArr3 = f47796p;
            if (innerSubscriberArr2 != innerSubscriberArr3 && (innerSubscriberArr = (InnerSubscriber[]) atomicReference.getAndSet(innerSubscriberArr3)) != innerSubscriberArr3) {
                for (InnerSubscriber innerSubscriber : innerSubscriberArr) {
                    innerSubscriber.getClass();
                    SubscriptionHelper.m17867a(innerSubscriber);
                }
                AtomicThrowable atomicThrowable = this.f47799c;
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                if (thM17888b != null && thM17888b != ExceptionHelper.f49276a) {
                    RxJavaPlugins.m17911b(thM17888b);
                }
            }
            getAndIncrement();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47803i, subscription)) {
                this.f47803i = subscription;
                this.f47797a.mo12367j(this);
                if (this.f47800d) {
                    return;
                }
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47798b) {
                return;
            }
            this.f47798b = true;
            m17666b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47798b) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            AtomicThrowable atomicThrowable = this.f47799c;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47798b = true;
                m17666b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47798b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f47803i.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f47802g, j);
                m17666b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        Flowable flowable = this.f47628b;
        if (FlowableScalarXMap.m17736a(flowable, (FlowableSubscriber) subscriber)) {
            return;
        }
        flowable.m17582b(new MergeSubscriber(subscriber));
    }
}
