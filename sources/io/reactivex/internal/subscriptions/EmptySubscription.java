package io.reactivex.internal.subscriptions;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import org.reactivestreams.Subscriber;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptySubscription implements QueueSubscription<Object> {

    /* JADX INFO: renamed from: a */
    public static final EmptySubscription f49257a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EmptySubscription[] f49258b;

    static {
        EmptySubscription emptySubscription = new EmptySubscription("INSTANCE", 0);
        f49257a = emptySubscription;
        f49258b = new EmptySubscription[]{emptySubscription};
    }

    /* JADX INFO: renamed from: a */
    public static void m17862a(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.mo12367j(f49257a);
        flowableSubscriber.onComplete();
    }

    /* JADX INFO: renamed from: b */
    public static void m17863b(Throwable th, Subscriber subscriber) {
        subscriber.mo12367j(f49257a);
        subscriber.onError(th);
    }

    public static EmptySubscription valueOf(String str) {
        return (EmptySubscription) Enum.valueOf(EmptySubscription.class, str);
    }

    public static EmptySubscription[] values() {
        return (EmptySubscription[]) f49258b.clone();
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17626e(int i) {
        return 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.m17873h(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }
}
