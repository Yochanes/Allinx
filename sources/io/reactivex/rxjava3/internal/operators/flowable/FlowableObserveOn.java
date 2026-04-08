package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {

        /* JADX INFO: renamed from: a */
        public Subscription f49860a;

        /* JADX INFO: renamed from: b */
        public SimpleQueue f49861b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f49862c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f49863d;

        /* JADX INFO: renamed from: f */
        public int f49864f;

        /* JADX INFO: renamed from: g */
        public long f49865g;

        /* JADX INFO: renamed from: i */
        public boolean f49866i;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49862c) {
                return;
            }
            this.f49862c = true;
            this.f49860a.cancel();
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49861b.clear();
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo18045d();

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            this.f49866i = true;
            return 2;
        }

        /* JADX INFO: renamed from: h */
        public abstract void mo18046h();

        /* JADX INFO: renamed from: i */
        public abstract void mo18047i();

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f49861b.isEmpty();
        }

        /* JADX INFO: renamed from: k */
        public final void m18048k() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49863d) {
                return;
            }
            this.f49863d = true;
            m18048k();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49863d) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49863d = true;
                m18048k();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49863d) {
                return;
            }
            if (this.f49864f == 2) {
                m18048k();
                return;
            }
            if (!this.f49861b.offer(obj)) {
                this.f49860a.cancel();
                new MissingBackpressureException("Queue is full?!");
                this.f49863d = true;
            }
            m18048k();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(null, j);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f49866i) {
                mo18046h();
            } else if (this.f49864f == 1) {
                mo18047i();
            } else {
                mo18045d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {

        /* JADX INFO: renamed from: j */
        public long f49867j;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo18045d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: h */
        public final void mo18046h() {
            if (!this.f49862c) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: i */
        public final void mo18047i() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49860a, subscription)) {
                this.f49860a = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(7);
                    if (iMo17962e == 1) {
                        this.f49864f = 1;
                        this.f49861b = queueSubscription;
                        this.f49863d = true;
                        throw null;
                    }
                    if (iMo17962e == 2) {
                        this.f49864f = 2;
                        this.f49861b = queueSubscription;
                        throw null;
                    }
                }
                this.f49861b = new SpscArrayQueue(0);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49861b.poll();
            if (objPoll != null && this.f49864f != 1) {
                long j = this.f49867j + 1;
                if (j == 0) {
                    this.f49867j = 0L;
                    this.f49860a.request(j);
                    return objPoll;
                }
                this.f49867j = j;
            }
            return objPoll;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo18045d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: h */
        public final void mo18046h() {
            if (!this.f49862c) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: i */
        public final void mo18047i() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49860a, subscription)) {
                this.f49860a = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(7);
                    if (iMo17962e == 1) {
                        this.f49864f = 1;
                        this.f49861b = queueSubscription;
                        this.f49863d = true;
                        throw null;
                    }
                    if (iMo17962e == 2) {
                        this.f49864f = 2;
                        this.f49861b = queueSubscription;
                        throw null;
                    }
                }
                this.f49861b = new SpscArrayQueue(0);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49861b.poll();
            if (objPoll != null && this.f49864f != 1) {
                long j = this.f49865g + 1;
                if (j == 0) {
                    this.f49865g = 0L;
                    this.f49860a.request(j);
                    return objPoll;
                }
                this.f49865g = j;
            }
            return objPoll;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
