package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableEmpty extends Flowable<Object> implements ScalarCallable<Object> {
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        EmptySubscription.m17862a((FlowableSubscriber) subscriber);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }
}
