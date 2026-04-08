package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BehaviorProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: j */
    public static final Object[] f49300j = new Object[0];

    /* JADX INFO: renamed from: n */
    public static final BehaviorSubscription[] f49301n = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: o */
    public static final BehaviorSubscription[] f49302o = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: b */
    public final AtomicReference f49303b;

    /* JADX INFO: renamed from: c */
    public final Lock f49304c;

    /* JADX INFO: renamed from: d */
    public final Lock f49305d;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f49306f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    public final AtomicReference f49307g;

    /* JADX INFO: renamed from: i */
    public long f49308i;

    /* JADX INFO: compiled from: Proguard */
    public static final class BehaviorSubscription<T> extends AtomicLong implements Subscription, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49309a;

        /* JADX INFO: renamed from: b */
        public final BehaviorProcessor f49310b;

        /* JADX INFO: renamed from: c */
        public boolean f49311c;

        /* JADX INFO: renamed from: d */
        public boolean f49312d;

        /* JADX INFO: renamed from: f */
        public AppendOnlyLinkedArrayList f49313f;

        /* JADX INFO: renamed from: g */
        public boolean f49314g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f49315i;

        /* JADX INFO: renamed from: j */
        public long f49316j;

        public BehaviorSubscription(FlowableSubscriber flowableSubscriber, BehaviorProcessor behaviorProcessor) {
            this.f49309a = flowableSubscriber;
            this.f49310b = behaviorProcessor;
        }

        /* JADX INFO: renamed from: a */
        public final void m17913a(long j, Object obj) {
            if (this.f49315i) {
                return;
            }
            if (!this.f49314g) {
                synchronized (this) {
                    try {
                        if (this.f49315i) {
                            return;
                        }
                        if (this.f49316j == j) {
                            return;
                        }
                        if (this.f49312d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f49313f;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f49313f = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m17876b(obj);
                            return;
                        }
                        this.f49311c = true;
                        this.f49314g = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49315i) {
                return;
            }
            this.f49315i = true;
            this.f49310b.m17912h(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this, j);
            }
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            if (this.f49315i) {
                return true;
            }
            if (NotificationLite.m17902h(obj)) {
                this.f49309a.onComplete();
                return true;
            }
            if (NotificationLite.m17903i(obj)) {
                this.f49309a.onError(NotificationLite.m17901f(obj));
                return true;
            }
            long j = get();
            if (j == 0) {
                cancel();
                this.f49309a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f49309a.onNext(obj);
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public BehaviorProcessor() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f49304c = reentrantReadWriteLock.readLock();
        this.f49305d = reentrantReadWriteLock.writeLock();
        this.f49303b = new AtomicReference(f49301n);
        this.f49307g = new AtomicReference();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        BehaviorSubscription behaviorSubscription = new BehaviorSubscription((FlowableSubscriber) subscriber, this);
        subscriber.mo12367j(behaviorSubscription);
        while (true) {
            AtomicReference atomicReference = this.f49303b;
            BehaviorSubscription[] behaviorSubscriptionArr = (BehaviorSubscription[]) atomicReference.get();
            if (behaviorSubscriptionArr == f49302o) {
                Throwable th = (Throwable) this.f49307g.get();
                if (th == ExceptionHelper.f49276a) {
                    subscriber.onComplete();
                    return;
                } else {
                    subscriber.onError(th);
                    return;
                }
            }
            int length = behaviorSubscriptionArr.length;
            BehaviorSubscription[] behaviorSubscriptionArr2 = new BehaviorSubscription[length + 1];
            System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = behaviorSubscription;
            while (!atomicReference.compareAndSet(behaviorSubscriptionArr, behaviorSubscriptionArr2)) {
                if (atomicReference.get() != behaviorSubscriptionArr) {
                    break;
                }
            }
            if (behaviorSubscription.f49315i) {
                m17912h(behaviorSubscription);
                return;
            }
            if (behaviorSubscription.f49315i) {
                return;
            }
            synchronized (behaviorSubscription) {
                try {
                    if (behaviorSubscription.f49315i) {
                        return;
                    }
                    if (behaviorSubscription.f49311c) {
                        return;
                    }
                    BehaviorProcessor behaviorProcessor = behaviorSubscription.f49310b;
                    Lock lock = behaviorProcessor.f49304c;
                    lock.lock();
                    behaviorSubscription.f49316j = behaviorProcessor.f49308i;
                    Object obj = behaviorProcessor.f49306f.get();
                    lock.unlock();
                    behaviorSubscription.f49312d = obj != null;
                    behaviorSubscription.f49311c = true;
                    if (obj == null || behaviorSubscription.test(obj)) {
                        return;
                    }
                    while (!behaviorSubscription.f49315i) {
                        synchronized (behaviorSubscription) {
                            try {
                                appendOnlyLinkedArrayList = behaviorSubscription.f49313f;
                                if (appendOnlyLinkedArrayList == null) {
                                    behaviorSubscription.f49312d = false;
                                    return;
                                }
                                behaviorSubscription.f49313f = null;
                            } finally {
                            }
                        }
                        appendOnlyLinkedArrayList.m17877c(behaviorSubscription);
                    }
                    return;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m17912h(BehaviorSubscription behaviorSubscription) {
        BehaviorSubscription[] behaviorSubscriptionArr;
        while (true) {
            AtomicReference atomicReference = this.f49303b;
            BehaviorSubscription[] behaviorSubscriptionArr2 = (BehaviorSubscription[]) atomicReference.get();
            int length = behaviorSubscriptionArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorSubscriptionArr2[i] == behaviorSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr = f49301n;
            } else {
                BehaviorSubscription[] behaviorSubscriptionArr3 = new BehaviorSubscription[length - 1];
                System.arraycopy(behaviorSubscriptionArr2, 0, behaviorSubscriptionArr3, 0, i);
                System.arraycopy(behaviorSubscriptionArr2, i + 1, behaviorSubscriptionArr3, i, (length - i) - 1);
                behaviorSubscriptionArr = behaviorSubscriptionArr3;
            }
            while (!atomicReference.compareAndSet(behaviorSubscriptionArr2, behaviorSubscriptionArr)) {
                if (atomicReference.get() != behaviorSubscriptionArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (this.f49307g.get() != null) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        AtomicReference atomicReference = this.f49307g;
        Throwable th = ExceptionHelper.f49276a;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        NotificationLite notificationLite = NotificationLite.f49279a;
        AtomicReference atomicReference2 = this.f49303b;
        BehaviorSubscription[] behaviorSubscriptionArr = (BehaviorSubscription[]) atomicReference2.get();
        BehaviorSubscription[] behaviorSubscriptionArr2 = f49302o;
        if (behaviorSubscriptionArr != behaviorSubscriptionArr2 && (behaviorSubscriptionArr = (BehaviorSubscription[]) atomicReference2.getAndSet(behaviorSubscriptionArr2)) != behaviorSubscriptionArr2) {
            Lock lock = this.f49305d;
            lock.lock();
            this.f49308i++;
            this.f49306f.lazySet(notificationLite);
            lock.unlock();
        }
        for (BehaviorSubscription behaviorSubscription : behaviorSubscriptionArr) {
            behaviorSubscription.m17913a(this.f49308i, notificationLite);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f49307g;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                RxJavaPlugins.m17911b(th);
                return;
            }
        }
        Object objM17900e = NotificationLite.m17900e(th);
        Serializable serializable = (Serializable) objM17900e;
        AtomicReference atomicReference2 = this.f49303b;
        BehaviorSubscription[] behaviorSubscriptionArr = (BehaviorSubscription[]) atomicReference2.get();
        BehaviorSubscription[] behaviorSubscriptionArr2 = f49302o;
        if (behaviorSubscriptionArr != behaviorSubscriptionArr2 && (behaviorSubscriptionArr = (BehaviorSubscription[]) atomicReference2.getAndSet(behaviorSubscriptionArr2)) != behaviorSubscriptionArr2) {
            Lock lock = this.f49305d;
            lock.lock();
            this.f49308i++;
            this.f49306f.lazySet(serializable);
            lock.unlock();
        }
        for (BehaviorSubscription behaviorSubscription : behaviorSubscriptionArr) {
            behaviorSubscription.m17913a(this.f49308i, objM17900e);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f49307g.get() != null) {
            return;
        }
        Lock lock = this.f49305d;
        lock.lock();
        this.f49308i++;
        this.f49306f.lazySet(obj);
        lock.unlock();
        for (BehaviorSubscription behaviorSubscription : (BehaviorSubscription[]) this.f49303b.get()) {
            behaviorSubscription.m17913a(this.f49308i, obj);
        }
    }
}
