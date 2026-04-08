package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public static final Object[] f51274b = new Object[0];

    /* JADX INFO: compiled from: Proguard */
    public static final class Node<T> extends AtomicReference<Node<T>> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ReplayBuffer<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplaySubscription<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f51275a;

        /* JADX INFO: renamed from: b */
        public final ReplayProcessor f51276b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f51277c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public volatile boolean f51278d;

        public ReplaySubscription(FlowableSubscriber flowableSubscriber, ReplayProcessor replayProcessor) {
            this.f51275a = flowableSubscriber;
            this.f51276b = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f51278d) {
                return;
            }
            this.f51278d = true;
            this.f51276b.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f51277c, j);
                this.f51276b.getClass();
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

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
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
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        RxJavaPlugins.m18275b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }
}
