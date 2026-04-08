package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Experimental;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ConditionalSubscriber f47763a;

        /* JADX INFO: renamed from: b */
        public Subscription f47764b;

        /* JADX INFO: renamed from: c */
        public QueueSubscription f47765c;

        /* JADX INFO: renamed from: d */
        public boolean f47766d;

        public DoFinallyConditionalSubscriber(ConditionalSubscriber conditionalSubscriber) {
            this.f47763a = conditionalSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47764b.cancel();
            m17663d();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f47765c.clear();
        }

        /* JADX INFO: renamed from: d */
        public final void m17663d() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    RxJavaPlugins.m17911b(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            QueueSubscription queueSubscription = this.f47765c;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iMo17626e = queueSubscription.mo17626e(i);
            if (iMo17626e != 0) {
                this.f47766d = iMo17626e == 1;
            }
            return iMo17626e;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            return this.f47763a.mo17630f(obj);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f47765c.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47764b, subscription)) {
                this.f47764b = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f47765c = (QueueSubscription) subscription;
                }
                this.f47763a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47763a.onComplete();
            m17663d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47763a.onError(th);
            m17663d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f47763a.onNext(obj);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f47765c.poll();
            if (objPoll == null && this.f47766d) {
                m17663d();
            }
            return objPoll;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f47764b.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47767a;

        /* JADX INFO: renamed from: b */
        public Subscription f47768b;

        /* JADX INFO: renamed from: c */
        public QueueSubscription f47769c;

        /* JADX INFO: renamed from: d */
        public boolean f47770d;

        public DoFinallySubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47767a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47768b.cancel();
            m17664d();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f47769c.clear();
        }

        /* JADX INFO: renamed from: d */
        public final void m17664d() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    RxJavaPlugins.m17911b(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            QueueSubscription queueSubscription = this.f47769c;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iMo17626e = queueSubscription.mo17626e(i);
            if (iMo17626e != 0) {
                this.f47770d = iMo17626e == 1;
            }
            return iMo17626e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f47769c.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47768b, subscription)) {
                this.f47768b = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f47769c = (QueueSubscription) subscription;
                }
                this.f47767a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47767a.onComplete();
            m17664d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47767a.onError(th);
            m17664d();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f47767a.onNext(obj);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f47769c.poll();
            if (objPoll == null && this.f47770d) {
                m17664d();
            }
            return objPoll;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f47768b.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        boolean z2 = subscriber instanceof ConditionalSubscriber;
        Flowable flowable = this.f47628b;
        if (z2) {
            flowable.m17582b(new DoFinallyConditionalSubscriber((ConditionalSubscriber) subscriber));
        } else {
            flowable.m17582b(new DoFinallySubscriber((FlowableSubscriber) subscriber));
        }
    }
}
