package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableMergeWithMaybe<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49830a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f49831b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f49832c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f49833d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public final AtomicLong f49834f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final int f49835g;

        /* JADX INFO: renamed from: i */
        public final int f49836i;

        /* JADX INFO: renamed from: j */
        public volatile SpscArrayQueue f49837j;

        /* JADX INFO: renamed from: n */
        public Object f49838n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f49839o;

        /* JADX INFO: renamed from: p */
        public volatile boolean f49840p;

        /* JADX INFO: renamed from: q */
        public volatile int f49841q;

        /* JADX INFO: renamed from: r */
        public long f49842r;

        /* JADX INFO: renamed from: s */
        public int f49843s;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: a */
            public final MergeWithObserver f49844a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.f49844a = mergeWithObserver;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo12364c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.f49844a;
                mergeWithObserver.f49841q = 2;
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.m18043a();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.f49844a;
                if (mergeWithObserver.f49833d.m18231a(th)) {
                    SubscriptionHelper.m18221a(mergeWithObserver.f49831b);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.m18043a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                MergeWithObserver mergeWithObserver = this.f49844a;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    long j = mergeWithObserver.f49842r;
                    if (mergeWithObserver.f49834f.get() != j) {
                        mergeWithObserver.f49842r = j + 1;
                        mergeWithObserver.f49830a.onNext(obj);
                        mergeWithObserver.f49841q = 2;
                    } else {
                        mergeWithObserver.f49838n = obj;
                        mergeWithObserver.f49841q = 1;
                        if (mergeWithObserver.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    mergeWithObserver.f49838n = obj;
                    mergeWithObserver.f49841q = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m18043a();
            }
        }

        public MergeWithObserver(FlowableSubscriber flowableSubscriber) {
            this.f49830a = flowableSubscriber;
            int i = Flowable.f49359a;
            this.f49835g = i;
            this.f49836i = i - (i >> 2);
        }

        /* JADX INFO: renamed from: a */
        public final void m18043a() {
            FlowableSubscriber flowableSubscriber = this.f49830a;
            long j = this.f49842r;
            int i = this.f49843s;
            int i2 = this.f49836i;
            int i3 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f49834f.get();
                while (j != j2) {
                    if (this.f49839o) {
                        this.f49838n = null;
                        this.f49837j = null;
                        return;
                    }
                    if (this.f49833d.get() != null) {
                        this.f49838n = null;
                        this.f49837j = null;
                        this.f49833d.m18236f(this.f49830a);
                        return;
                    }
                    int i4 = this.f49841q;
                    if (i4 == i3) {
                        Object obj = this.f49838n;
                        this.f49838n = null;
                        this.f49841q = 2;
                        flowableSubscriber.onNext(obj);
                        j++;
                    } else {
                        boolean z2 = this.f49840p;
                        SpscArrayQueue spscArrayQueue = this.f49837j;
                        Object objPoll = spscArrayQueue != null ? spscArrayQueue.poll() : null;
                        boolean z3 = objPoll == null;
                        if (z2 && z3 && i4 == 2) {
                            this.f49837j = null;
                            flowableSubscriber.onComplete();
                            return;
                        } else {
                            if (z3) {
                                break;
                            }
                            flowableSubscriber.onNext(objPoll);
                            j++;
                            i++;
                            if (i == i2) {
                                ((Subscription) this.f49831b.get()).request(i2);
                                i = 0;
                            }
                            i3 = 1;
                        }
                    }
                }
                if (j == j2) {
                    if (this.f49839o) {
                        this.f49838n = null;
                        this.f49837j = null;
                        return;
                    }
                    if (this.f49833d.get() != null) {
                        this.f49838n = null;
                        this.f49837j = null;
                        this.f49833d.m18236f(this.f49830a);
                        return;
                    }
                    boolean z4 = this.f49840p;
                    SpscArrayQueue spscArrayQueue2 = this.f49837j;
                    boolean z5 = spscArrayQueue2 == null || spscArrayQueue2.isEmpty();
                    if (z4 && z5 && this.f49841q == 2) {
                        this.f49837j = null;
                        flowableSubscriber.onComplete();
                        return;
                    }
                }
                this.f49842r = j;
                this.f49843s = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i3 = 1;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49839o = true;
            SubscriptionHelper.m18221a(this.f49831b);
            DisposableHelper.m17952a(this.f49832c);
            this.f49833d.m18232b();
            if (getAndIncrement() == 0) {
                this.f49837j = null;
                this.f49838n = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18224d(this.f49831b, subscription, this.f49835g);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49840p = true;
            if (getAndIncrement() == 0) {
                m18043a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49833d.m18231a(th)) {
                DisposableHelper.m17952a(this.f49832c);
                if (getAndIncrement() == 0) {
                    m18043a();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (compareAndSet(0, 1)) {
                long j = this.f49842r;
                if (this.f49834f.get() != j) {
                    SpscArrayQueue spscArrayQueue = this.f49837j;
                    if (spscArrayQueue == null || spscArrayQueue.isEmpty()) {
                        this.f49842r = j + 1;
                        this.f49830a.onNext(obj);
                        int i = this.f49843s + 1;
                        if (i == this.f49836i) {
                            this.f49843s = 0;
                            ((Subscription) this.f49831b.get()).request(i);
                        } else {
                            this.f49843s = i;
                        }
                    } else {
                        spscArrayQueue.offer(obj);
                    }
                } else {
                    SpscArrayQueue spscArrayQueue2 = this.f49837j;
                    if (spscArrayQueue2 == null) {
                        spscArrayQueue2 = new SpscArrayQueue(Flowable.f49359a);
                        this.f49837j = spscArrayQueue2;
                    }
                    spscArrayQueue2.offer(obj);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscArrayQueue spscArrayQueue3 = this.f49837j;
                if (spscArrayQueue3 == null) {
                    spscArrayQueue3 = new SpscArrayQueue(Flowable.f49359a);
                    this.f49837j = spscArrayQueue3;
                }
                spscArrayQueue3.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m18043a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.m18237a(this.f49834f, j);
            if (getAndIncrement() == 0) {
                m18043a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new MergeWithObserver((FlowableSubscriber) subscriber));
        throw null;
    }
}
