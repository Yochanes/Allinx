package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
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
public final class FlowableMergeWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49845a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f49846b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f49847c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f49848d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public final AtomicLong f49849f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final int f49850g;

        /* JADX INFO: renamed from: i */
        public final int f49851i;

        /* JADX INFO: renamed from: j */
        public volatile SpscArrayQueue f49852j;

        /* JADX INFO: renamed from: n */
        public Object f49853n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f49854o;

        /* JADX INFO: renamed from: p */
        public volatile boolean f49855p;

        /* JADX INFO: renamed from: q */
        public volatile int f49856q;

        /* JADX INFO: renamed from: r */
        public long f49857r;

        /* JADX INFO: renamed from: s */
        public int f49858s;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* JADX INFO: renamed from: a */
            public final MergeWithObserver f49859a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.f49859a = mergeWithObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.f49859a;
                if (mergeWithObserver.f49848d.m18231a(th)) {
                    SubscriptionHelper.m18221a(mergeWithObserver.f49846b);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.m18044a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                MergeWithObserver mergeWithObserver = this.f49859a;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    long j = mergeWithObserver.f49857r;
                    if (mergeWithObserver.f49849f.get() != j) {
                        mergeWithObserver.f49857r = j + 1;
                        mergeWithObserver.f49845a.onNext(obj);
                        mergeWithObserver.f49856q = 2;
                    } else {
                        mergeWithObserver.f49853n = obj;
                        mergeWithObserver.f49856q = 1;
                        if (mergeWithObserver.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    mergeWithObserver.f49853n = obj;
                    mergeWithObserver.f49856q = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m18044a();
            }
        }

        public MergeWithObserver(FlowableSubscriber flowableSubscriber) {
            this.f49845a = flowableSubscriber;
            int i = Flowable.f49359a;
            this.f49850g = i;
            this.f49851i = i - (i >> 2);
        }

        /* JADX INFO: renamed from: a */
        public final void m18044a() {
            FlowableSubscriber flowableSubscriber = this.f49845a;
            long j = this.f49857r;
            int i = this.f49858s;
            int i2 = this.f49851i;
            int i3 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f49849f.get();
                while (j != j2) {
                    if (this.f49854o) {
                        this.f49853n = null;
                        this.f49852j = null;
                        return;
                    }
                    if (this.f49848d.get() != null) {
                        this.f49853n = null;
                        this.f49852j = null;
                        this.f49848d.m18236f(this.f49845a);
                        return;
                    }
                    int i4 = this.f49856q;
                    if (i4 == i3) {
                        Object obj = this.f49853n;
                        this.f49853n = null;
                        this.f49856q = 2;
                        flowableSubscriber.onNext(obj);
                        j++;
                    } else {
                        boolean z2 = this.f49855p;
                        SpscArrayQueue spscArrayQueue = this.f49852j;
                        Object objPoll = spscArrayQueue != null ? spscArrayQueue.poll() : null;
                        boolean z3 = objPoll == null;
                        if (z2 && z3 && i4 == 2) {
                            this.f49852j = null;
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
                                ((Subscription) this.f49846b.get()).request(i2);
                                i = 0;
                            }
                            i3 = 1;
                        }
                    }
                }
                if (j == j2) {
                    if (this.f49854o) {
                        this.f49853n = null;
                        this.f49852j = null;
                        return;
                    }
                    if (this.f49848d.get() != null) {
                        this.f49853n = null;
                        this.f49852j = null;
                        this.f49848d.m18236f(this.f49845a);
                        return;
                    }
                    boolean z4 = this.f49855p;
                    SpscArrayQueue spscArrayQueue2 = this.f49852j;
                    boolean z5 = spscArrayQueue2 == null || spscArrayQueue2.isEmpty();
                    if (z4 && z5 && this.f49856q == 2) {
                        this.f49852j = null;
                        flowableSubscriber.onComplete();
                        return;
                    }
                }
                this.f49857r = j;
                this.f49858s = i;
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
            this.f49854o = true;
            SubscriptionHelper.m18221a(this.f49846b);
            DisposableHelper.m17952a(this.f49847c);
            this.f49848d.m18232b();
            if (getAndIncrement() == 0) {
                this.f49852j = null;
                this.f49853n = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18224d(this.f49846b, subscription, this.f49850g);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49855p = true;
            if (getAndIncrement() == 0) {
                m18044a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49848d.m18231a(th)) {
                DisposableHelper.m17952a(this.f49847c);
                if (getAndIncrement() == 0) {
                    m18044a();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (compareAndSet(0, 1)) {
                long j = this.f49857r;
                if (this.f49849f.get() != j) {
                    SpscArrayQueue spscArrayQueue = this.f49852j;
                    if (spscArrayQueue == null || spscArrayQueue.isEmpty()) {
                        this.f49857r = j + 1;
                        this.f49845a.onNext(obj);
                        int i = this.f49858s + 1;
                        if (i == this.f49851i) {
                            this.f49858s = 0;
                            ((Subscription) this.f49846b.get()).request(i);
                        } else {
                            this.f49858s = i;
                        }
                    } else {
                        spscArrayQueue.offer(obj);
                    }
                } else {
                    SpscArrayQueue spscArrayQueue2 = this.f49852j;
                    if (spscArrayQueue2 == null) {
                        spscArrayQueue2 = new SpscArrayQueue(Flowable.f49359a);
                        this.f49852j = spscArrayQueue2;
                    }
                    spscArrayQueue2.offer(obj);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscArrayQueue spscArrayQueue3 = this.f49852j;
                if (spscArrayQueue3 == null) {
                    spscArrayQueue3 = new SpscArrayQueue(Flowable.f49359a);
                    this.f49852j = spscArrayQueue3;
                }
                spscArrayQueue3.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m18044a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.m18237a(this.f49849f, j);
            if (getAndIncrement() == 0) {
                m18044a();
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
