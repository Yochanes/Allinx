package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {

        /* JADX INFO: renamed from: a */
        public Subscription f47953a;

        /* JADX INFO: renamed from: b */
        public SimpleQueue f47954b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f47955c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f47956d;

        /* JADX INFO: renamed from: f */
        public Throwable f47957f;

        /* JADX INFO: renamed from: g */
        public int f47958g;

        /* JADX INFO: renamed from: i */
        public long f47959i;

        /* JADX INFO: renamed from: j */
        public boolean f47960j;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f47955c) {
                return;
            }
            this.f47955c = true;
            this.f47953a.cancel();
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f47954b.clear();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m17699d(boolean z2, boolean z3, Subscriber subscriber) {
            if (this.f47955c) {
                clear();
                return true;
            }
            if (!z2) {
                return false;
            }
            Throwable th = this.f47957f;
            if (th != null) {
                clear();
                subscriber.onError(th);
                throw null;
            }
            if (!z3) {
                return false;
            }
            subscriber.onComplete();
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            this.f47960j = true;
            return 2;
        }

        /* JADX INFO: renamed from: h */
        public abstract void mo17700h();

        /* JADX INFO: renamed from: i */
        public abstract void mo17701i();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f47954b.isEmpty();
        }

        /* JADX INFO: renamed from: k */
        public abstract void mo17702k();

        /* JADX INFO: renamed from: l */
        public final void m17703l() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47956d) {
                return;
            }
            this.f47956d = true;
            m17703l();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47956d) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f47957f = th;
            this.f47956d = true;
            m17703l();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47956d) {
                return;
            }
            if (this.f47958g == 2) {
                m17703l();
                return;
            }
            if (!this.f47954b.offer(obj)) {
                this.f47953a.cancel();
                this.f47957f = new MissingBackpressureException("Queue is full?!");
                this.f47956d = true;
            }
            m17703l();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(null, j);
                m17703l();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f47960j) {
                mo17701i();
            } else if (this.f47958g == 1) {
                mo17702k();
            } else {
                mo17700h();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {

        /* JADX INFO: renamed from: n */
        public long f47961n;

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: h */
        public final void mo17700h() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: i */
        public final void mo17701i() {
            if (!this.f47955c) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47953a, subscription)) {
                this.f47953a = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17626e = queueSubscription.mo17626e(7);
                    if (iMo17626e == 1) {
                        this.f47958g = 1;
                        this.f47954b = queueSubscription;
                        this.f47956d = true;
                        throw null;
                    }
                    if (iMo17626e == 2) {
                        this.f47958g = 2;
                        this.f47954b = queueSubscription;
                        throw null;
                    }
                }
                this.f47954b = new SpscArrayQueue(0);
                throw null;
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: k */
        public final void mo17702k() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f47954b.poll();
            if (objPoll != null && this.f47958g != 1) {
                long j = this.f47961n + 1;
                if (j == 0) {
                    this.f47961n = 0L;
                    this.f47953a.request(j);
                    return objPoll;
                }
                this.f47961n = j;
            }
            return objPoll;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: h */
        public final void mo17700h() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: i */
        public final void mo17701i() {
            if (!this.f47955c) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47953a, subscription)) {
                this.f47953a = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17626e = queueSubscription.mo17626e(7);
                    if (iMo17626e == 1) {
                        this.f47958g = 1;
                        this.f47954b = queueSubscription;
                        this.f47956d = true;
                        throw null;
                    }
                    if (iMo17626e == 2) {
                        this.f47958g = 2;
                        this.f47954b = queueSubscription;
                        throw null;
                    }
                }
                this.f47954b = new SpscArrayQueue(0);
                throw null;
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: k */
        public final void mo17702k() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f47954b.poll();
            if (objPoll != null && this.f47958g != 1) {
                long j = this.f47959i + 1;
                if (j == 0) {
                    this.f47959i = 0L;
                    this.f47953a.request(j);
                    return objPoll;
                }
                this.f47959i = j;
            }
            return objPoll;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        throw null;
    }
}
