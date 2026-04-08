package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, InnerQueuedSubscriberSupport<R> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47710a;

        /* JADX INFO: renamed from: f */
        public Subscription f47714f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f47715g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f47716i;

        /* JADX INFO: renamed from: j */
        public volatile InnerQueuedSubscriber f47717j;

        /* JADX INFO: renamed from: d */
        public final SpscLinkedArrayQueue f47713d = new SpscLinkedArrayQueue(Math.min(0, 0));

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f47711b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f47712c = new AtomicLong();

        public ConcatMapEagerDelayErrorSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47710a = flowableSubscriber;
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: a */
        public final void mo17655a(InnerQueuedSubscriber innerQueuedSubscriber) {
            innerQueuedSubscriber.f49235b = true;
            mo17656b();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: b */
        public final void mo17656b() {
            InnerQueuedSubscriber innerQueuedSubscriber;
            boolean z2;
            long j;
            SimpleQueue simpleQueue;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber innerQueuedSubscriber2 = this.f47717j;
            FlowableSubscriber flowableSubscriber = this.f47710a;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f47712c.get();
                if (innerQueuedSubscriber2 != null) {
                    innerQueuedSubscriber = innerQueuedSubscriber2;
                } else {
                    if (this.f47711b.get() != null) {
                        m17659e();
                        AtomicThrowable atomicThrowable = this.f47711b;
                        atomicThrowable.getClass();
                        flowableSubscriber.onError(ExceptionHelper.m17888b(atomicThrowable));
                        return;
                    }
                    boolean z3 = this.f47716i;
                    innerQueuedSubscriber = (InnerQueuedSubscriber) this.f47713d.poll();
                    if (z3 && innerQueuedSubscriber == null) {
                        AtomicThrowable atomicThrowable2 = this.f47711b;
                        atomicThrowable2.getClass();
                        Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable2);
                        if (thM17888b != null) {
                            flowableSubscriber.onError(thM17888b);
                            return;
                        } else {
                            flowableSubscriber.onComplete();
                            return;
                        }
                    }
                    if (innerQueuedSubscriber != null) {
                        this.f47717j = innerQueuedSubscriber;
                    }
                }
                if (innerQueuedSubscriber == null || (simpleQueue = innerQueuedSubscriber.f49234a) == null) {
                    z2 = false;
                    j = 0;
                } else {
                    j = 0;
                    while (j != j2) {
                        if (this.f47715g) {
                            m17659e();
                            return;
                        }
                        boolean z4 = innerQueuedSubscriber.f49235b;
                        try {
                            Object objPoll = simpleQueue.poll();
                            boolean z5 = objPoll == null;
                            if (z4 && z5) {
                                this.f47717j = null;
                                this.f47714f.request(1L);
                                z2 = true;
                                innerQueuedSubscriber = null;
                                break;
                            }
                            if (z5) {
                                break;
                            }
                            flowableSubscriber.onNext(objPoll);
                            j++;
                            if (innerQueuedSubscriber.f49237d != 1) {
                                long j3 = innerQueuedSubscriber.f49236c + 1;
                                if (j3 == 0) {
                                    innerQueuedSubscriber.f49236c = 0L;
                                    innerQueuedSubscriber.get().request(j3);
                                } else {
                                    innerQueuedSubscriber.f49236c = j3;
                                }
                            }
                        } catch (Throwable th) {
                            Exceptions.m17612a(th);
                            this.f47717j = null;
                            SubscriptionHelper.m17867a(innerQueuedSubscriber);
                            m17659e();
                            flowableSubscriber.onError(th);
                            return;
                        }
                    }
                    z2 = false;
                    if (j == j2) {
                        if (this.f47715g) {
                            m17659e();
                            return;
                        }
                        boolean z6 = innerQueuedSubscriber.f49235b;
                        boolean zIsEmpty = simpleQueue.isEmpty();
                        if (z6 && zIsEmpty) {
                            this.f47717j = null;
                            this.f47714f.request(1L);
                            z2 = true;
                            innerQueuedSubscriber = null;
                        }
                    }
                }
                if (j != 0 && j2 != Long.MAX_VALUE) {
                    this.f47712c.addAndGet(-j);
                }
                if (!z2 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                } else {
                    innerQueuedSubscriber2 = innerQueuedSubscriber;
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: c */
        public final void mo17657c(InnerQueuedSubscriber innerQueuedSubscriber, Object obj) {
            if (innerQueuedSubscriber.f49234a.offer(obj)) {
                mo17656b();
            } else {
                SubscriptionHelper.m17867a(innerQueuedSubscriber);
                mo17658d(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f47715g) {
                return;
            }
            this.f47715g = true;
            this.f47714f.cancel();
            if (getAndIncrement() == 0) {
                do {
                    m17659e();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: d */
        public final void mo17658d(InnerQueuedSubscriber innerQueuedSubscriber, Throwable th) {
            AtomicThrowable atomicThrowable = this.f47711b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            innerQueuedSubscriber.f49235b = true;
            this.f47714f.cancel();
            mo17656b();
        }

        /* JADX INFO: renamed from: e */
        public final void m17659e() {
            while (true) {
                InnerQueuedSubscriber innerQueuedSubscriber = (InnerQueuedSubscriber) this.f47713d.poll();
                if (innerQueuedSubscriber == null) {
                    return;
                } else {
                    SubscriptionHelper.m17867a(innerQueuedSubscriber);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47714f, subscription)) {
                this.f47714f = subscription;
                this.f47710a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47716i = true;
            mo17656b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f47711b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47716i = true;
                mo17656b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f47714f.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f47712c, j);
                mo17656b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new ConcatMapEagerDelayErrorSubscriber((FlowableSubscriber) subscriber));
    }
}
