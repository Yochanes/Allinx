package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CompletableFuture;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class FlowableStageSubscriber<T> extends CompletableFuture<T> implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: a */
    public Object f49418a;

    /* JADX INFO: renamed from: a */
    public abstract void mo17965a(Subscription subscription);

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        SubscriptionHelper.m18221a(null);
        throw null;
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(Object obj) {
        SubscriptionHelper.m18221a(null);
        throw null;
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th) {
        SubscriptionHelper.m18221a(null);
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18225e(null, subscription)) {
            mo17965a(subscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f49418a = null;
        throw null;
    }
}
