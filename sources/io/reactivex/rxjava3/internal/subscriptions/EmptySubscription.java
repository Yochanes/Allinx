package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.operators.QueueSubscription;
import org.reactivestreams.Subscriber;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptySubscription implements QueueSubscription<Object> {

    /* JADX INFO: renamed from: a */
    public static final EmptySubscription f51204a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EmptySubscription[] f51205b;

    static {
        EmptySubscription emptySubscription = new EmptySubscription("INSTANCE", 0);
        f51204a = emptySubscription;
        f51205b = new EmptySubscription[]{emptySubscription};
    }

    /* JADX INFO: renamed from: a */
    public static void m18216a(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.mo12367j(f51204a);
        flowableSubscriber.onComplete();
    }

    /* JADX INFO: renamed from: b */
    public static void m18217b(Throwable th, Subscriber subscriber) {
        subscriber.mo12367j(f51204a);
        subscriber.onError(th);
    }

    public static EmptySubscription valueOf(String str) {
        return (EmptySubscription) Enum.valueOf(EmptySubscription.class, str);
    }

    public static EmptySubscription[] values() {
        return (EmptySubscription[]) f51205b.clone();
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17962e(int i) {
        return 2;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.m18226f(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
    }
}
