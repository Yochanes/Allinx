package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ConditionalSubscriber f49691a;

        /* JADX INFO: renamed from: b */
        public Subscription f49692b;

        /* JADX INFO: renamed from: c */
        public QueueSubscription f49693c;

        /* JADX INFO: renamed from: d */
        public boolean f49694d;

        public DoFinallyConditionalSubscriber(ConditionalSubscriber conditionalSubscriber) {
            this.f49691a = conditionalSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49692b.cancel();
            m18007d();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49693c.clear();
        }

        /* JADX INFO: renamed from: d */
        public final void m18007d() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    RxJavaPlugins.m18275b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            QueueSubscription queueSubscription = this.f49693c;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iMo17962e = queueSubscription.mo17962e(i);
            if (iMo17962e != 0) {
                this.f49694d = iMo17962e == 1;
            }
            return iMo17962e;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            return this.f49691a.mo17969f(obj);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f49693c.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49692b, subscription)) {
                this.f49692b = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f49693c = (QueueSubscription) subscription;
                }
                this.f49691a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49691a.onComplete();
            m18007d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49691a.onError(th);
            m18007d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49691a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49693c.poll();
            if (objPoll == null && this.f49694d) {
                m18007d();
            }
            return objPoll;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49692b.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49695a;

        /* JADX INFO: renamed from: b */
        public Subscription f49696b;

        /* JADX INFO: renamed from: c */
        public QueueSubscription f49697c;

        /* JADX INFO: renamed from: d */
        public boolean f49698d;

        public DoFinallySubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49695a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49696b.cancel();
            m18008d();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49697c.clear();
        }

        /* JADX INFO: renamed from: d */
        public final void m18008d() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    RxJavaPlugins.m18275b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            QueueSubscription queueSubscription = this.f49697c;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iMo17962e = queueSubscription.mo17962e(i);
            if (iMo17962e != 0) {
                this.f49698d = iMo17962e == 1;
            }
            return iMo17962e;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f49697c.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49696b, subscription)) {
                this.f49696b = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f49697c = (QueueSubscription) subscription;
                }
                this.f49695a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49695a.onComplete();
            m18008d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49695a.onError(th);
            m18008d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49695a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49697c.poll();
            if (objPoll == null && this.f49698d) {
                m18008d();
            }
            return objPoll;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49696b.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            new DoFinallyConditionalSubscriber((ConditionalSubscriber) subscriber);
            throw null;
        }
        new DoFinallySubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
