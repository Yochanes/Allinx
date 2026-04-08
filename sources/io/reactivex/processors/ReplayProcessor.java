package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public static final Object[] f49326b = new Object[0];

    /* JADX INFO: compiled from: Proguard */
    public static final class Node<T> extends AtomicReference<Node<T>> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ReplayBuffer<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplaySubscription<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49327a;

        /* JADX INFO: renamed from: b */
        public final ReplayProcessor f49328b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f49329c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public volatile boolean f49330d;

        public ReplaySubscription(FlowableSubscriber flowableSubscriber, ReplayProcessor replayProcessor) {
            this.f49327a = flowableSubscriber;
            this.f49328b = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49330d) {
                return;
            }
            this.f49330d = true;
            this.f49328b.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f49329c, j);
                this.f49328b.getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SizeAndTimeBoundReplayBuffer<T> implements ReplayBuffer<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SizeBoundReplayBuffer<T> implements ReplayBuffer<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnboundedReplayBuffer<T> implements ReplayBuffer<T> {
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new ReplaySubscription((FlowableSubscriber) subscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        RxJavaPlugins.m17911b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }
}
