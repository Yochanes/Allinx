package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlowablePublisher<T> implements Publisher<T> {
        @Override // org.reactivestreams.Publisher
        /* JADX INFO: renamed from: g */
        public final void mo15432g(Subscriber subscriber) {
            subscriber.mo12367j(new InnerSubscriber(subscriber));
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InnerSubscriber<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: a */
        public final Subscriber f47996a;

        public InnerSubscriber(Subscriber subscriber) {
            this.f47996a = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (get() != Long.MIN_VALUE) {
                getAndSet(Long.MIN_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17879b(this, j);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public volatile Serializable f47997a;

        /* JADX INFO: renamed from: b */
        public int f47998b;

        /* JADX INFO: renamed from: c */
        public volatile SimpleQueue f47999c;

        /* JADX INFO: renamed from: a */
        public final void m17710a() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17872f(null, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17626e = queueSubscription.mo17626e(3);
                    if (iMo17626e == 1) {
                        this.f47998b = iMo17626e;
                        this.f47999c = queueSubscription;
                        this.f47997a = NotificationLite.f49279a;
                        m17710a();
                        return;
                    }
                    if (iMo17626e == 2) {
                        this.f47998b = iMo17626e;
                        this.f47999c = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.f47999c = new SpscArrayQueue(0);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47997a == null) {
                this.f47997a = NotificationLite.f49279a;
                m17710a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47997a != null) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47997a = (Serializable) NotificationLite.m17900e(th);
                m17710a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47998b != 0 || this.f47999c.offer(obj)) {
                m17710a();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        throw null;
    }
}
