package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
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
        public final EqualSubscriber f48092c;

        /* JADX INFO: renamed from: d */
        public final EqualSubscriber f48093d;

        /* JADX INFO: renamed from: f */
        public final AtomicThrowable f48094f;

        /* JADX INFO: renamed from: g */
        public final AtomicInteger f48095g;

        /* JADX INFO: renamed from: i */
        public Object f48096i;

        /* JADX INFO: renamed from: j */
        public Object f48097j;

        public EqualCoordinator(FlowableSubscriber flowableSubscriber) {
            super(flowableSubscriber);
            this.f48095g = new AtomicInteger();
            this.f48092c = new EqualSubscriber(this);
            this.f48093d = new EqualSubscriber(this);
            this.f48094f = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* JADX INFO: renamed from: a */
        public final void mo17738a(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48094f;
            atomicThrowable.getClass();
            if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                mo17739b();
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* JADX INFO: renamed from: b */
        public final void mo17739b() {
            if (this.f48095g.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue simpleQueue = this.f48092c.f48099b;
                SimpleQueue simpleQueue2 = this.f48093d.f48099b;
                if (simpleQueue == null || simpleQueue2 == null) {
                    if (get() == 4) {
                        this.f48092c.m17741a();
                        this.f48093d.m17741a();
                        return;
                    } else if (this.f48094f.get() != null) {
                        m17740h();
                        Subscriber subscriber = this.f49255a;
                        AtomicThrowable atomicThrowable = this.f48094f;
                        atomicThrowable.getClass();
                        subscriber.onError(ExceptionHelper.m17888b(atomicThrowable));
                        return;
                    }
                } else {
                    if (get() == 4) {
                        this.f48092c.m17741a();
                        this.f48093d.m17741a();
                        return;
                    }
                    if (this.f48094f.get() != null) {
                        m17740h();
                        Subscriber subscriber2 = this.f49255a;
                        AtomicThrowable atomicThrowable2 = this.f48094f;
                        atomicThrowable2.getClass();
                        subscriber2.onError(ExceptionHelper.m17888b(atomicThrowable2));
                        return;
                    }
                    boolean z2 = this.f48092c.f48100c;
                    Object objPoll = this.f48096i;
                    if (objPoll == null) {
                        try {
                            objPoll = simpleQueue.poll();
                            this.f48096i = objPoll;
                        } catch (Throwable th) {
                            Exceptions.m17612a(th);
                            m17740h();
                            AtomicThrowable atomicThrowable3 = this.f48094f;
                            atomicThrowable3.getClass();
                            ExceptionHelper.m17887a(atomicThrowable3, th);
                            Subscriber subscriber3 = this.f49255a;
                            AtomicThrowable atomicThrowable4 = this.f48094f;
                            atomicThrowable4.getClass();
                            subscriber3.onError(ExceptionHelper.m17888b(atomicThrowable4));
                            return;
                        }
                    }
                    boolean z3 = objPoll == null;
                    boolean z4 = this.f48093d.f48100c;
                    Object objPoll2 = this.f48097j;
                    if (objPoll2 == null) {
                        try {
                            objPoll2 = simpleQueue2.poll();
                            this.f48097j = objPoll2;
                        } catch (Throwable th2) {
                            Exceptions.m17612a(th2);
                            m17740h();
                            AtomicThrowable atomicThrowable5 = this.f48094f;
                            atomicThrowable5.getClass();
                            ExceptionHelper.m17887a(atomicThrowable5, th2);
                            Subscriber subscriber4 = this.f49255a;
                            AtomicThrowable atomicThrowable6 = this.f48094f;
                            atomicThrowable6.getClass();
                            subscriber4.onError(ExceptionHelper.m17888b(atomicThrowable6));
                            return;
                        }
                    }
                    boolean z5 = objPoll2 == null;
                    if (z2 && z4 && z3 && z5) {
                        m17861d(Boolean.TRUE);
                        return;
                    }
                    if (z2 && z4 && z3 != z5) {
                        m17740h();
                        m17861d(Boolean.FALSE);
                        return;
                    }
                    if (!z3 && !z5) {
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            Exceptions.m17612a(th3);
                            m17740h();
                            AtomicThrowable atomicThrowable7 = this.f48094f;
                            atomicThrowable7.getClass();
                            ExceptionHelper.m17887a(atomicThrowable7, th3);
                            Subscriber subscriber5 = this.f49255a;
                            AtomicThrowable atomicThrowable8 = this.f48094f;
                            atomicThrowable8.getClass();
                            subscriber5.onError(ExceptionHelper.m17888b(atomicThrowable8));
                            return;
                        }
                    }
                }
                iAddAndGet = this.f48095g.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            EqualSubscriber equalSubscriber = this.f48092c;
            equalSubscriber.getClass();
            SubscriptionHelper.m17867a(equalSubscriber);
            EqualSubscriber equalSubscriber2 = this.f48093d;
            equalSubscriber2.getClass();
            SubscriptionHelper.m17867a(equalSubscriber2);
            if (this.f48095g.getAndIncrement() == 0) {
                equalSubscriber.m17741a();
                equalSubscriber2.m17741a();
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m17740h() {
            EqualSubscriber equalSubscriber = this.f48092c;
            equalSubscriber.getClass();
            SubscriptionHelper.m17867a(equalSubscriber);
            equalSubscriber.m17741a();
            EqualSubscriber equalSubscriber2 = this.f48093d;
            equalSubscriber2.getClass();
            SubscriptionHelper.m17867a(equalSubscriber2);
            equalSubscriber2.m17741a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EqualCoordinatorHelper {
        /* JADX INFO: renamed from: a */
        void mo17738a(Throwable th);

        /* JADX INFO: renamed from: b */
        void mo17739b();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f48098a;

        /* JADX INFO: renamed from: b */
        public volatile SimpleQueue f48099b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f48100c;

        /* JADX INFO: renamed from: d */
        public int f48101d;

        /* JADX WARN: Multi-variable type inference failed */
        public EqualSubscriber(EqualCoordinatorHelper equalCoordinatorHelper) {
            this.f48098a = (AtomicInteger) equalCoordinatorHelper;
        }

        /* JADX INFO: renamed from: a */
        public final void m17741a() {
            SimpleQueue simpleQueue = this.f48099b;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17872f(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17626e = queueSubscription.mo17626e(3);
                    if (iMo17626e == 1) {
                        this.f48101d = iMo17626e;
                        this.f48099b = queueSubscription;
                        this.f48100c = true;
                        this.f48098a.mo17739b();
                        return;
                    }
                    if (iMo17626e == 2) {
                        this.f48101d = iMo17626e;
                        this.f48099b = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.f48099b = new SpscArrayQueue(0);
                subscription.request(0);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48100c = true;
            this.f48098a.mo17739b();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f48098a.mo17738a(th);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48101d != 0 || this.f48099b.offer(obj)) {
                this.f48098a.mo17739b();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new EqualCoordinator((FlowableSubscriber) subscriber));
        throw null;
    }
}
