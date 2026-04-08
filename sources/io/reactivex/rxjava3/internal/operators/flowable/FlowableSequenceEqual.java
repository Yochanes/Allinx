package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements EqualCoordinatorHelper {

        /* JADX INFO: renamed from: c */
        public final EqualSubscriber f49993c;

        /* JADX INFO: renamed from: d */
        public final EqualSubscriber f49994d;

        /* JADX INFO: renamed from: f */
        public final AtomicThrowable f49995f;

        /* JADX INFO: renamed from: g */
        public final AtomicInteger f49996g;

        /* JADX INFO: renamed from: i */
        public Object f49997i;

        /* JADX INFO: renamed from: j */
        public Object f49998j;

        public EqualCoordinator(FlowableSubscriber flowableSubscriber) {
            super(flowableSubscriber);
            this.f49996g = new AtomicInteger();
            this.f49993c = new EqualSubscriber(this);
            this.f49994d = new EqualSubscriber(this);
            this.f49995f = new AtomicThrowable();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* JADX INFO: renamed from: a */
        public final void mo18082a(Throwable th) {
            if (this.f49995f.m18231a(th)) {
                mo18083b();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* JADX INFO: renamed from: b */
        public final void mo18083b() {
            if (this.f49996g.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue simpleQueue = this.f49993c.f50000b;
                SimpleQueue simpleQueue2 = this.f49994d.f50000b;
                if (simpleQueue == null || simpleQueue2 == null) {
                    if (m18215h()) {
                        this.f49993c.m18085a();
                        this.f49994d.m18085a();
                        return;
                    } else if (this.f49995f.get() != null) {
                        m18084i();
                        this.f49995f.m18236f(this.f51202a);
                        return;
                    }
                } else {
                    if (m18215h()) {
                        this.f49993c.m18085a();
                        this.f49994d.m18085a();
                        return;
                    }
                    if (this.f49995f.get() != null) {
                        m18084i();
                        this.f49995f.m18236f(this.f51202a);
                        return;
                    }
                    boolean z2 = this.f49993c.f50001c;
                    Object objPoll = this.f49997i;
                    if (objPoll == null) {
                        try {
                            objPoll = simpleQueue.poll();
                            this.f49997i = objPoll;
                        } catch (Throwable th) {
                            Exceptions.m17950a(th);
                            m18084i();
                            this.f49995f.m18231a(th);
                            this.f49995f.m18236f(this.f51202a);
                            return;
                        }
                    }
                    boolean z3 = objPoll == null;
                    boolean z4 = this.f49994d.f50001c;
                    Object objPoll2 = this.f49998j;
                    if (objPoll2 == null) {
                        try {
                            objPoll2 = simpleQueue2.poll();
                            this.f49998j = objPoll2;
                        } catch (Throwable th2) {
                            Exceptions.m17950a(th2);
                            m18084i();
                            this.f49995f.m18231a(th2);
                            this.f49995f.m18236f(this.f51202a);
                            return;
                        }
                    }
                    boolean z5 = objPoll2 == null;
                    if (z2 && z4 && z3 && z5) {
                        m18214d(Boolean.TRUE);
                        return;
                    }
                    if (z2 && z4 && z3 != z5) {
                        m18084i();
                        m18214d(Boolean.FALSE);
                        return;
                    } else if (!z3 && !z5) {
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            Exceptions.m17950a(th3);
                            m18084i();
                            this.f49995f.m18231a(th3);
                            this.f49995f.m18236f(this.f51202a);
                            return;
                        }
                    }
                }
                iAddAndGet = this.f49996g.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            EqualSubscriber equalSubscriber = this.f49993c;
            equalSubscriber.getClass();
            SubscriptionHelper.m18221a(equalSubscriber);
            EqualSubscriber equalSubscriber2 = this.f49994d;
            equalSubscriber2.getClass();
            SubscriptionHelper.m18221a(equalSubscriber2);
            this.f49995f.m18232b();
            if (this.f49996g.getAndIncrement() == 0) {
                equalSubscriber.m18085a();
                equalSubscriber2.m18085a();
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m18084i() {
            EqualSubscriber equalSubscriber = this.f49993c;
            equalSubscriber.getClass();
            SubscriptionHelper.m18221a(equalSubscriber);
            equalSubscriber.m18085a();
            EqualSubscriber equalSubscriber2 = this.f49994d;
            equalSubscriber2.getClass();
            SubscriptionHelper.m18221a(equalSubscriber2);
            equalSubscriber2.m18085a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EqualCoordinatorHelper {
        /* JADX INFO: renamed from: a */
        void mo18082a(Throwable th);

        /* JADX INFO: renamed from: b */
        void mo18083b();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f49999a;

        /* JADX INFO: renamed from: b */
        public volatile SimpleQueue f50000b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f50001c;

        /* JADX INFO: renamed from: d */
        public int f50002d;

        /* JADX WARN: Multi-variable type inference failed */
        public EqualSubscriber(EqualCoordinatorHelper equalCoordinatorHelper) {
            this.f49999a = (AtomicInteger) equalCoordinatorHelper;
        }

        /* JADX INFO: renamed from: a */
        public final void m18085a() {
            SimpleQueue simpleQueue = this.f50000b;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18225e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(3);
                    if (iMo17962e == 1) {
                        this.f50002d = iMo17962e;
                        this.f50000b = queueSubscription;
                        this.f50001c = true;
                        this.f49999a.mo18083b();
                        return;
                    }
                    if (iMo17962e == 2) {
                        this.f50002d = iMo17962e;
                        this.f50000b = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.f50000b = new SpscArrayQueue(0);
                subscription.request(0);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50001c = true;
            this.f49999a.mo18083b();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49999a.mo18082a(th);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f50002d != 0 || this.f50000b.offer(obj)) {
                this.f49999a.mo18083b();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new EqualCoordinator((FlowableSubscriber) subscriber));
        throw null;
    }
}
