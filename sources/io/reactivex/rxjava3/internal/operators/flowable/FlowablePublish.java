package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InnerSubscription<T> extends AtomicLong implements Subscription {
        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18238b(this, j);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PublishConnection<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public volatile SimpleQueue f49896a;

        /* JADX INFO: renamed from: b */
        public int f49897b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f49898c;

        /* JADX INFO: renamed from: d */
        public int f49899d;

        /* JADX INFO: renamed from: a */
        public final void m18053a() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue simpleQueue = this.f49896a;
            int i = this.f49899d;
            int iAddAndGet = 1;
            while (simpleQueue == null) {
                this.f49899d = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue == null) {
                    simpleQueue = this.f49896a;
                }
            }
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18225e(null, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(7);
                    if (iMo17962e == 1) {
                        this.f49897b = iMo17962e;
                        this.f49896a = queueSubscription;
                        this.f49898c = true;
                        m18053a();
                        return;
                    }
                    if (iMo17962e == 2) {
                        this.f49897b = iMo17962e;
                        this.f49896a = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.f49896a = new SpscArrayQueue(0);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49898c = true;
            m18053a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49898c) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49898c = true;
                m18053a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49897b != 0 || this.f49896a.offer(obj)) {
                m18053a();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
